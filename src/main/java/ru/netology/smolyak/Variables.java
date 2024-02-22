package ru.netology.smolyak;

import java.util.Scanner;

import java.util.Date;

public class Variables {

    Scanner scanner = new Scanner(System.in);
    public int OperNumber = scanner.nextInt();
    // Номер операции
    public static int UserId;
    // Номер пользователя
    public static float MoneyAmount;
    // сумма по операции
    public static short Region; // регион деятельности клиента

    String OperName; // Наименование операции

    public static char countryCode; // код страны оерации
    String Inn; // Инн пользователя

    public static boolean operVector; // индикатор знака операции (приход-расход - ноль или единица).

    String billingNumber; // номер счета

    public static boolean operSucsess; // индикатор успешности операции (ноль или единица).


    Date date = new java.util.Date(); // дата транзакции

}
