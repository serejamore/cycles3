package com.company;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        while (num <= 10) {
            num++;
            if (num == 10) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");

        }
        num = 10;
        while (num >= 1) {
            System.out.print(num + " ");
            if (num == 0) {
                System.out.println(num);
                break;
            }
            num--;

        }

        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday = currentFriday + 7) {
            System.out.println("Сегодня пятница " + currentFriday);

        }

        int currentYear = 2021;
        for (int year = currentYear - 200; year < currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println("Комета пролетает " + year);

            }
        }

    }
}
