package ru.netology.smolyak;

public class Customer {
    String customerName;

    int birthY;

    short region;


    public Customer (String customerName, int birthY, short region){
        super();
        this.customerName = customerName;
        this.birthY = birthY;
        this.region = region;
    }

    public String toString(){
        return "Клиент [ФИО клиента:" + customerName
                + ", Год рожденья:"+ birthY
                + ", Ргион проживания:" + region
                + "]";
    }

}