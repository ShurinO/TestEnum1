package com.brainacad.oop.testenum1;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek:MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek);
        }

        System.out.println("--------------------------LabWork_2.13.2-----------------------");
        for (MyDayOfWeek myDayOfWeek:MyDayOfWeek.values()) {
            switch (myDayOfWeek){
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println(myDayOfWeek);
            }
        }
    }
}
