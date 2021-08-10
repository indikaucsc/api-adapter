
package com.adapter.apiadapter.controller;


import com.adapter.apiadapter.common.Constants;
import com.adapter.apiadapter.dto.WeeklySummaryDTO;
import com.adapter.apiadapter.dto.WeeklySummaryListResponseDTO;
import com.adapter.apiadapter.services.SummaryReport;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;



@RestController
@CrossOrigin
public class IssueController {
    final static Logger issueControllerLogger = Logger.getLogger("IssueController.class");
    @Autowired
    private SummaryReport summaryReport;


    @Value("classpath:data.json")
    Resource resourceFile;


    @RequestMapping(value = Constants.API_URL_SUMMARY_REPORT, method = RequestMethod.POST)
    public @ResponseBody
    WeeklySummaryListResponseDTO userLogin(@RequestBody WeeklySummaryDTO weeklySummaryDTO, HttpServletRequest httpServletRequest) throws Exception {
        return summaryReport.getSummary(weeklySummaryDTO);


    }

}

