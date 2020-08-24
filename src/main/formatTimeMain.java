package main;

import java.lang.Math;

public class formatTimeMain {

    public static void main(String[] args) {
        // write your code here
    }

    public static String replaceLast(String find, String replace, String string) {

        int lastIndex = string.lastIndexOf(find);

        if (lastIndex == -1) {
            return string;
        }

        String beginString = string.substring(0, lastIndex);
        String endString = string.substring(lastIndex + find.length());

        return beginString + replace + endString;
    }
    public static String getTimeString(int amount,String unit){
        /*
        Given an amount and unit, returns the correct, comma delimeted,  timeString with either plural or singular unit
        eg unit = day and amount = 1 will return timeString = "1 day," but if unit = 2 timeString = "2 days,".
         */
        String timeString = "";

        if (amount == 1){
            timeString = amount + " " + unit + ", ";
        }
        else if (amount == 0){
            timeString = "";
        }
        else {
            timeString = amount + " " + unit + "s, ";
        }

        return timeString;
    }


    public static String formatTime(int seconds) {

        System.out.println("seconds input = " + seconds);

        int noOfSecsInMin = 60;
        int noOfSecsInHour = noOfSecsInMin * 60;
        int noOfSecsInDay = noOfSecsInHour * 24;
        int noOfSecsInYear = noOfSecsInDay * 365;

        int numberOfYears = Math.floorDiv(seconds,noOfSecsInYear);
        int numberOfDays = Math.floorDiv((seconds - (numberOfYears * noOfSecsInYear)),noOfSecsInDay);
        int numberOfHours = Math.floorDiv((seconds - (numberOfYears * noOfSecsInYear) - (numberOfDays * noOfSecsInDay)),noOfSecsInHour);
        int numberOfMinutes = Math.floorDiv(seconds - (numberOfYears * noOfSecsInYear) - (numberOfDays * noOfSecsInDay) - (numberOfHours * noOfSecsInHour),noOfSecsInMin);
        int numberOfSeconds = seconds % 60;

        String formattedTime = "";

        if (seconds == 0) {
            formattedTime = "none";
        }
        else {
            String secondsText = getTimeString(numberOfSeconds, "second");
            String minutesText = getTimeString(numberOfMinutes, "minute");
            String hoursText = getTimeString(numberOfHours, "hour");
            String daysText = getTimeString(numberOfDays, "day");
            String yearsText = getTimeString(numberOfYears, "year");

            formattedTime = yearsText + daysText + hoursText + minutesText + secondsText;

            // Use replaceLast to remove the trailing ',' and then to replace the last ',' with "and"
            formattedTime = replaceLast(", ","",formattedTime);
            formattedTime = replaceLast(", "," and ",formattedTime);

        }

        System.out.println("formattedTime = " + formattedTime);

        return formattedTime;
    }

}