
package com.adapter.apiadapter.services;


import com.adapter.apiadapter.dto.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.threeten.extra.YearWeek;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
//@PropertySource("classpath:sms.gateway.properties")
public class SummaryReportImpl implements SummaryReport {


    private static String sampleRespones = "{\n" +
            "  \"project_id\" : \"project1\",\n" +
            "  \"issues\" : [\n" +
            "    {\n" +
            "      \"issue_id\" : \"issue1\",\n" +
            "      \"type\" : \"bug\",\n" +
            "      \"current_state\" : \"deploy\",\n" +
            "      \"changelogs\" : [\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-01 12:00pm UTC\",\n" +
            "          \"from_state\" : \"open\",\n" +
            "          \"to_state\" : \"in_progress\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-03 12:00pm UTC\",\n" +
            "          \"from_state\" : \"in_progress\",\n" +
            "          \"to_state\" : \"testing\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-21 12:00pm UTC\",\n" +
            "          \"from_state\" : \"testing\",\n" +
            "          \"to_state\" : \"deploy\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "    ,{\n" +
            "      \"issue_id\" : \"issue2\",\n" +
            "      \"type\" : \"enhancement\",\n" +
            "      \"current_state\" : \"in_progress\",\n" +
            "      \"changelogs\" : [\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-01 12:00pm UTC\",\n" +
            "          \"from_state\" : \"open\",\n" +
            "          \"to_state\" : \"in_progress\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-03 12:00pm UTC\",\n" +
            "          \"from_state\" : \"in_progress\",\n" +
            "          \"to_state\" : \"testing\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"changed_on\" : \"2017-01-21 12:00pm UTC\",\n" +
            "          \"from_state\" : \"testing\",\n" +
            "          \"to_state\" : \"deploy\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "\n" +
            "  ]\n" +
            "}";


    @Override
    public WeeklySummaryListResponseDTO getSummary(WeeklySummaryDTO weeklySummaryDTO) {

        WeeklySummaryListResponseDTO weeklySummaryListResponseDTO = new WeeklySummaryListResponseDTO();

        JSONParser parser = new JSONParser();
        try {

            /**
             *
             *
             * Try using Springs Cache Abstraction, https://docs.spring.io/spring/docs/
             * current/spring-framework-reference/html/cache.html.
             *  can use this abstraction in the method which has the restTemplate call.
             * Any method calls response can be cached using this abstraction, with the method
             * parameters as the keys and the return type as the response.
             *
             *
             */

            JSONObject report = (JSONObject) parser.parse(sampleRespones);
            JSONArray issuesJson = (JSONArray) report.get("issues");

            List<WeeklySummaryResponseDTO> weekly_summaries = new ArrayList<WeeklySummaryResponseDTO>();
            WeeklySummaryResponseDTO weeklySummaryResponseDTO = new WeeklySummaryResponseDTO();

            List<StateSummaryResponseDTO> state_summaries = new ArrayList<StateSummaryResponseDTO>();


            for (int i = 0; i < issuesJson.size(); ++i) {
                //System.out.println(issues.get(i));
                JSONObject issue = (JSONObject) issuesJson.get(i);
                String currentStatus = issue.get("current_state").toString();
                String issueId = issue.get("issue_id").toString();
                String type = issue.get("type").toString();

                if (weeklySummaryDTO.getStates().contains(currentStatus)) {
                    if (weeklySummaryDTO.getTypes().contains(type)) {
                        JSONArray changelogs = (JSONArray) issue.get("changelogs");


                        List<IssueResponseDTO> issues = new ArrayList<IssueResponseDTO>();

                        for (int k = 0; k < changelogs.size(); ++k) {
                            JSONObject changelog = (JSONObject) changelogs.get(k);
                            String innerObjStatus = changelog.get("to_state").toString();

                            if (innerObjStatus.equals(currentStatus)) {

                                String yearWeek = this.dateConvertToYearWeek(changelog.get("changed_on").toString());
                                weeklySummaryResponseDTO.setWeek(yearWeek);
                                if (this.compareTwoYearWeek(this.weekConvertDate(weeklySummaryDTO.getFrom_week()), yearWeek) && this.compareTwoYearWeek(yearWeek, this.weekConvertDate(weeklySummaryDTO.getTo_week()))) {

                                    IssueResponseDTO issueResponseDTO = new IssueResponseDTO();
                                    issueResponseDTO.setIssue_id(issueId);
                                    issueResponseDTO.setType(type);
                                    issues.add(issueResponseDTO);

                                } else {
                                    System.out.println("compareTwoYearWeek failed ");
                                }
//
                            } else {
                                System.out.println("currentStatus failed ");
                            }

                        }
                        StateSummaryResponseDTO stateSummaryResponseDTO = new StateSummaryResponseDTO();
                        stateSummaryResponseDTO.setState(currentStatus);
                        stateSummaryResponseDTO.setCount(issues.size());
                        stateSummaryResponseDTO.setIssues(issues);
                        state_summaries.add(stateSummaryResponseDTO);
                    } else {
                        System.out.println("getTypes failed ");
                    }
                } else {
                    System.out.println("getStates failed ");
                }
            }

            weeklySummaryResponseDTO.setState_summaries(state_summaries);
            weekly_summaries.add(weeklySummaryResponseDTO);

            weeklySummaryListResponseDTO.setProject_id(report.get("project_id").toString());
            weeklySummaryListResponseDTO.setWeekly_summaries(weekly_summaries);

            //System.out.println(report);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return weeklySummaryListResponseDTO;
    }


    private String weekConvertDate(String firstYearWeek) {


        int year = 0;
        String yearWeek = "";
        int week = 0;
        try {
            String[] firstParts = firstYearWeek.split("W");
            if (firstParts.length >= 2) {
                year = Integer.parseInt(firstParts[0]);
                week = Integer.parseInt(firstParts[1]);
            }
            String weekFormat = (week < 10) ? "-W0" + week : "-W" + week;
            yearWeek = year + weekFormat;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return yearWeek;
    }

    private String dateConvertToYearWeek(String dateString1) {
        String yearWeek = "";
        try {
            String format = "yyyy-MM-dd";
            SimpleDateFormat df = new SimpleDateFormat(format);
            Date date = df.parse(dateString1);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int week = cal.get(Calendar.WEEK_OF_YEAR);
            String weekFormat = (week < 10) ? "-W0" + week : "-W" + week;
            int year = cal.get(Calendar.YEAR);
            System.out.println("dateString1 " + dateString1);
            System.out.println("week " + week);
            System.out.println("year " + year);
            System.out.println("year " + year + weekFormat);
            //report.put("weekYear", year+weekS); c"2017-W01"
            yearWeek = year + weekFormat;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("yearWeek " + yearWeek);
        return yearWeek;
    }

    private boolean compareTwoYearWeek(String firstYearWeek, String secondYearWeek) {
        String yearWeek = "";
        boolean status = false;
        int year = 0;
        int yearSeond = 0;
        int week = 0;
        int weekSecond = 0;
        try {

            YearWeek yw1 = YearWeek.parse(firstYearWeek);
            YearWeek yw2 = YearWeek.parse(secondYearWeek);


            if (yw1.isBefore(yw2) || yw1.equals(yw2)) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

}


