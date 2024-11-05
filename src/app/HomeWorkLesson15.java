package app;

import app.enumHelper.Day;
import app.service.Advisor;
import app.service.impl.DayAdvisor;

public class HomeWorkLesson15 {
    public static void main(String[] args) {

            Advisor advisor = new DayAdvisor();


            advisor.advise(Day.THURSDAY);
            advisor.advise(Day.FRIDAY);
            advisor.advise(Day.SATURDAY);

    }
}
