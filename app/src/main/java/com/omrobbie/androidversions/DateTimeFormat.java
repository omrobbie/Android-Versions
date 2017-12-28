package com.omrobbie.androidversions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by omrobbie on 29/12/2017.
 */

public class DateTimeFormat {

    public static String getDateString(String date) {
        String result = "";
        DateFormat old = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date oldDate = old.parse(date);
            DateFormat newFormat = new SimpleDateFormat("dd MMMM yyyy");
            result = newFormat.format(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }
}
