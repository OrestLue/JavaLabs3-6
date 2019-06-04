import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void getKindOfCalendar() {
        Calendar calendar = new Calendar();
        calendar.setKindOfCalendar(CalendarType.WALL_CALENDARS);
        assertEquals(CalendarType.WALL_CALENDARS, calendar.getKindOfCalendar(),
                "Error in getKindOfCalendar");
    }

    @Test
    void setKindOfCalendar() {
        Calendar calendar = new Calendar();
        calendar.setKindOfCalendar(CalendarType.WALL_CALENDARS);
        assertEquals(CalendarType.WALL_CALENDARS, calendar.getKindOfCalendar(),
                "Error in setKindOfCalendar");
    }
}