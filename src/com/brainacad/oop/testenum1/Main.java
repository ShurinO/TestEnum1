package com.brainacad.oop.testenum1;

import java.util.Scanner;

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

        System.out.println("--------------------------LabWork_2.13.3-----------------------");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        MyDayOfWeek dayOfWeek = MyDayOfWeek.valueOf(day.toUpperCase()); //day.toUpperCase() отсеивает ошибки связанные с регистром
        System.out.println(dayOfWeek.nextDay());
    }
}
