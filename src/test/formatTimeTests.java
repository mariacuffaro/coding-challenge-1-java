package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static main.formatTimeMain.formatTime;
import static main.formatTimeMain.getTimeString;
import static main.formatTimeMain.replaceLast;


public class formatTimeTests {
    @Test

    public void replaceLastTests() {
        /* assert statements */
        String someString = "1, 2, 3, 4";
        assertEquals("1, 2, 3 and 4", replaceLast(", "," and ",someString));
    }

   @Test

    public void getTimeStringTests() {

        /* assert statements */

        assertEquals("2 seconds, ", getTimeString(2, "second"));
        assertEquals("1 second, ", getTimeString(1, "second"));
        assertEquals("59 seconds, ", getTimeString(59, "second"));
        assertEquals("", getTimeString(0, "second"));
        assertEquals("2 minutes, ", getTimeString(2, "minute"));
        assertEquals("1 minute, ", getTimeString(1, "minute"));
        assertEquals("2 hours, ", getTimeString(2, "hour"));
        assertEquals("1 hour, ", getTimeString(1, "hour"));

    }


    @Test
    
    public void formatTimeShouldReturnString() {

        /*
        1 year = 31536000
        1 day = 86400
        1 hours = 3600
        */

        /* assert statements */

        assertEquals("1 second",formatTime(1));
        assertEquals("none",formatTime(0));
        assertEquals("2 seconds",formatTime(2));
        assertEquals("1 minute and 2 seconds",formatTime(62));
        assertEquals("1 hour, 1 minute and 2 seconds",formatTime(3662));
        assertEquals("3 days, 2 hours and 20 seconds",formatTime(266420));
        assertEquals("1 year, 1 day, 1 hour and 59 seconds",formatTime(31626059));
        assertEquals("3 years and 24 minutes",formatTime(94609440));
        assertEquals("3 days, 4 hours and 1 minute",formatTime(273660));

    }




}
