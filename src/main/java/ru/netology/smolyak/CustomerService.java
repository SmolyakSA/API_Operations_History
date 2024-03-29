package ru.netology.smolyak;

import java.util.ArrayList;
import java.util.InputMismatchException;

import static ru.netology.smolyak.Main.scanner;

public class CustomerService {

    public ArrayList<Customer> customers = new ArrayList<Customer>();

    public void saveCustomer() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
                customers.add(new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort()));
                System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
                int proceed = scanner.nextInt();
                if (proceed == 0) {
                    break;
                }
                i = +1;
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }
    }



}
