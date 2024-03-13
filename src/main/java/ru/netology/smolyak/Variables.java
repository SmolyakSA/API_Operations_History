package ru.netology.smolyak;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.time.LocalDate.parse;
//
//public class Variables {
//    public static void main(String[] args) throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//
//        char countryCode; // код страны операции
//        String Inn; // Инн пользователя
//
//        boolean operVector; // индикатор знака операции (приход-расход - ноль или единица).
//
//        String billingNumber; // номер счета
//
//        boolean operSucsess; // индикатор успешности операции (ноль или единица).
//
//        int[] OperaNumber = new int[5]; // Номер операции
//
//        int[] UserId = new int[5]; // Номер пользователя
//
//        float[] MoneyAmount = new float[5];   // сумма по операции
//
//        String[] OperaName = new String[5];  // Наименование операции
//
//        short[] Region = new short[5];  // регион деятельности клиента
//
//        int i = 0;
//
//        // дата транзакции
//        String[] StringDate = new String[5];
//
//        while (true) {
//            i += 1;
//
//            System.out.println("Введите дату операции");
//
//            StringDate[i-1] = scanner.nextLine();
//
//
//            System.out.println("Введите номер операции");
//
//            OperaNumber[i-1] = scanner.nextInt();
//
//            System.out.println("---------");
//
//            System.out.println("Введите Номер пользователя");
//
//            UserId[i-1] = scanner.nextInt();
//
//
//            System.out.println("Введите сумма по операции");
//
//
//            MoneyAmount[i-1] = scanner.nextFloat();
//
//
//            System.out.println(" Введите регион деятельности клиента");
//
//            Region[i-1] = scanner.nextShort();
//
//            System.out.println("Введите название операции");
//
//            OperaName[i-1] = scanner.nextLine();
//
//            if(i == 3){break;}
//        }
//        System.out.println("Задайте период поиска: Введите начальную дату");
//
//        String d1 = scanner.nextLine();
//
//        Date DateStart = new SimpleDateFormat("dd.MM.yyyy").parse(d1);
//
//        System.out.println("Введите конечную дату");
//
//        String d2= scanner.nextLine();
//
//        Date DateEnd = new SimpleDateFormat("dd.MM.yyyy").parse(d2);
//
//
//        for (int j = 0; j < OperaNumber.length; j++) {
//
//            if(OperaNumber[j] == 0){break;};
//
//            Date DateComp = new SimpleDateFormat("dd.MM.yyyy").parse(StringDate[j]);
//            boolean CheckDate = (DateStart.before(DateComp) || DateStart.equals(DateComp)) &&
//                    (DateEnd.after(DateComp) || DateEnd.equals(DateComp));
//
//
//            if (CheckDate == true){
//                System.out.println("----------------------------------------");
//                System.out.print("Номер операции:" + OperaNumber[j] + ",");
//                System.out.print("Идентификатор пользователя:" + UserId[j] + ",");
//                System.out.print("Дата операции:" + StringDate[j] + ",");
//                System.out.println("Сумма операции:" + MoneyAmount[j] + ".");
//                System.out.println("----------------------------------------");
//
//            }
//        }
//
//
//    }
//
//    }
