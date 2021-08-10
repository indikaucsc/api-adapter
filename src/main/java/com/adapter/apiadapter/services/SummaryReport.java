
package com.adapter.apiadapter.services;

import com.adapter.apiadapter.dto.WeeklySummaryDTO;
import com.adapter.apiadapter.dto.WeeklySummaryListResponseDTO;

public interface SummaryReport {

    public WeeklySummaryListResponseDTO getSummary(WeeklySummaryDTO weeklySummaryDTO);
}
