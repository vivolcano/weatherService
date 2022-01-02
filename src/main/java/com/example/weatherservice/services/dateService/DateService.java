package com.example.weatherservice.services.dateService;

import java.util.Date;

public interface DateService {
    Date fromUnixToDate(int unixTime);
    boolean dateEquals(Date current, Date date);
    String getFormatDate(Date date);
}
