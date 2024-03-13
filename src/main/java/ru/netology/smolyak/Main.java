package ru.netology.smolyak;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int[][] statement = new int[1000][2];
    public Operation[] operations;
    public Customer[] customers = new Customer[1000];
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наше приложение!");
        int i = 0;
        while (true) {
            System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
            Customer customers[] = {new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort())};
            System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
            int proceed = scanner.nextInt();
            if (proceed == 0) {
                break;
            }
            i = +1;
        }

        int j = 0;
        while (true) {
            System.out.print("Введите id пользователя");
            int y = scanner.nextInt();
            {
                System.out.println("Пльзователь отсутвует, пожалуйста создайте его");
                System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
                Customer customers[] = {new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort())};
                            };
            System.out.print("Введите порядковый номер операции");
            int x = scanner.nextInt();
            System.out.println("Введите данные по операциям клиентов через пробел: int id, long amount, String name, String date");
            Operation operations[] = {new Operation(scanner.nextInt(), scanner.nextLong(), scanner.nextLine(), scanner.nextLine())};
            statement[y][x] = operations[j].getId();
            System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
            int proceed = scanner.nextInt();
            if (proceed == 0) {
                break;
            }
            j = +1;
        }

//     Operation operation1 = new Operation(1, 234534, "поступление ЗП", "13.03.2024");
//     Operation operation2 = new Operation(1, 434, "Перевод онлайн", "13.03.2024");
//     Operation operation3 = new Operation(2, -132564, "Покупка онлайн", "15.03.2024");
//
//     Operation operations[] = {new Operation()};
//
//        System.out.print(operation1);


        //Customer customer1  = new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort())

    }
}

