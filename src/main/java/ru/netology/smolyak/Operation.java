package ru.netology.smolyak;

public class Operation {

    int id;

    long amount;

    String name;

    String date;

    public Operation (int id, long amount, String name, String date){
        super();
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.date = date;
    }

    public String toString(){
       return "Employee [id операции:" + id
                + ", Размер операции:"+ amount
                + ", Название операции:" + name
                + ", Дата операции:" + date + "]";
    }
}
