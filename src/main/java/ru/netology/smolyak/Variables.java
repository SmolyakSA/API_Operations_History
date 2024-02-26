package ru.netology.smolyak;

import java.util.Scanner;

import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var OperNumber = scanner.nextInt();
        // Номер операции
        int UserId = scanner.nextInt();
        // Номер пользователя
        float MoneyAmount = scanner.nextFloat();
        // сумма по операции
        short Region = scanner.nextShort(); // регион деятельности клиента

        String OperName = scanner.nextLine(); // Наименование операции

        char countryCode; // код страны операции
        String Inn; // Инн пользователя

        boolean operVector; // индикатор знака операции (приход-расход - ноль или единица).

        String billingNumber; // номер счета

        boolean operSucsess; // индикатор успешности операции (ноль или единица).


        Date date = new Date(); // дата транзакции
    }
}
