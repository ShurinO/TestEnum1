package com.brainacad.oop.testenum1;

public enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public MyDayOfWeek nextDay(){
        return MyDayOfWeek.values()[this==SATURDAY?0:ordinal()+1];
    }
}
