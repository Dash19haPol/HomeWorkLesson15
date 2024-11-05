package app.service.impl;

import app.enumHelper.Day;
import app.service.Advisor;

public class DayAdvisor implements Advisor {

    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Сьогодні будній день, залишайтеся продуктивними!");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Ура вихідний! Рекомендую піти на прогулянку до парку.");
        }
    }
}
