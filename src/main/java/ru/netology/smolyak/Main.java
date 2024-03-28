package ru.netology.smolyak;


import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Customer customer = new Customer();

    public static Operation operation = new Operation();

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наше приложение!");

        customer.saveCustomer(); // вводим информацию о пользователях

        operation.saveStatement(); // сохраняем операцию и привязываем ее к Id пользователя;

        operation.getOperations(); // получаем все операции клиента по его Id.
    }

    }


