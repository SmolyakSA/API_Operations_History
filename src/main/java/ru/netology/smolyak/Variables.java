package ru.netology.smolyak;

import java.util.Arrays;
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

        int[] OperaNumber = new int[5]; // Номер операции

        int[] UserId = new int[5]; // Номер пользователя

        float[] MoneyAmount = new float[5];   // сумма по операции

        String[] OperaName = new String[5];  // Наименование операции

        short[] Region = new short[5];  // регион деятельности клиента

        Date[] date; // дата транзакции

        int[] FalseDate = new int[2]; // Todo  cделать тоже самое с датами

        int i = 0;

        while (true) {
            i += 1;

            System.out.print("Введите номер операции");


            OperaNumber[i-1] = scanner.nextInt();


            System.out.println("Введите Номер пользователя");

            UserId[i-1] = scanner.nextInt();


            System.out.println("Введите сумма по операции");


            MoneyAmount[i-1] = scanner.nextFloat();


            System.out.println(" Введите регион деятельности клиента");

            Region[i-1] = scanner.nextShort();

            System.out.println("Введите Название операции");

            OperaName[i-1] = scanner.nextLine();

            System.out.println(Arrays.toString(new int[]{OperaNumber[i-1], Region[i-1]}));

            if (i > 2) break;

        }

        System.out.println("Введите начальную дату операции");

        FalseDate[0] = scanner.nextInt();// Todo сделать ввод даты

        System.out.println("Введите конечную дату операции");

        FalseDate[1] = scanner.nextInt(); // Todo сделать ввод даты


        /* while (дата нач <= дата массива => дата конца)
        *
        *
        *
        *
        * */



    }

    }
