package ru.netology.smolyak;

import java.util.Scanner;

import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char countryCode; // код страны операции
        String Inn; // Инн пользователя

        boolean operVector; // индикатор знака операции (приход-расход - ноль или единица).

        String billingNumber; // номер счета

        boolean operSucsess; // индикатор успешности операции (ноль или единица).

        int OperaNumber; // Номер операции

        int UserId; // Номер пользователя

        float MoneyAmount;   // сумма по операции

        String OperaName;  // Наименование операции

        short Region;  // регион деятельности клиента

        Date date = new Date(); // дата транзакции

        int i = 0;

        while (true) {
            i += 1;

            System.out.print("Введите номер операции");


            OperaNumber = scanner.nextInt();


            System.out.println("Введите Номер пользователя");

            UserId = scanner.nextInt();


            System.out.println("Введите сумма по операции");


            MoneyAmount = scanner.nextFloat();


            System.out.println(" Введите регион деятельности клиента");

            Region = scanner.nextShort();

            System.out.println("Введите Название операции");

            OperaName = scanner.nextLine();

            System.out.printf("%d %d %f %d %s", OperaNumber, UserId, MoneyAmount, Region, OperaName);

            if (i > 3) break;

        }

    }

    }
