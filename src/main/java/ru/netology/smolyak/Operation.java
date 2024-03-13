package ru.netology.smolyak;

public class Operation {

   private int id;

    private long amount;

    private String name;

    private String date;




    public Operation (int id, long amount, String name, String date){
        super();
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.date = date;
    } // конструктор со всеми аргументами

    public Operation (){
          } // конструктор пустой

    public String toString(){
       return "Employee [id операции:" + id
                + ", Размер операции:"+ amount
                + ", Название операции:" + name
                + ", Дата операции:" + date + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String name) {
        this.date = date;
    }




}
