package ru.netology.smolyak;

import java.util.InputMismatchException;

import static ru.netology.smolyak.Main.scanner;

public class Customer {
    private String customerName;

    private int birthY;

    private short region;

    private int customerId;

    public static Customer[] customers = new Customer[1000];



    public Customer (int customerId, String customerName, int birthY, short region){
        super();
        this.customerName = customerName;
        this.birthY = birthY;
        this.region = region;
        this.customerId = customerId;
} // конструктор с аргументами

    public Customer (){
        super();
    } // конструктор пустой

    public String toString(){
        return "Клиент [ Id клиента:" + customerId + "ФИО клиента:" + customerName
                + ", Год рожденья:"+ birthY
                + ", Ргион проживания:" + region
                + "]";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBirthY() {
        return birthY;
    }

    public void setBirthY(int BirthY) {
        this.birthY = birthY;
    }

    public short getRegion() {
        return region;
    }

    public void setRegion(short name) {
        this.region = region;
    }

    public int getCustomerId () {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public void saveCustomer() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
                Customer customers[] =

                        {new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort())};
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

