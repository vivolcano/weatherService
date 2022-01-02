package com.example.weatherservice.services.dateService;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class DateServiceImpl implements DateService {

    public Date fromUnixToDate(int unixTime) {

        return new Date(unixTime * 1000L);
    }

    public boolean dateEquals(Date current, Date date) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(current);
        cal2.setTime(date);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }

    @Override
    public String getFormatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
        return dateFormat.format(date);
    }
}

