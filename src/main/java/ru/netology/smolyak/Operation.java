package ru.netology.smolyak;

import java.util.Arrays;

import static ru.netology.smolyak.Main.scanner;
import static ru.netology.smolyak.Main.statement;

public class Operation implements ConsolePrintable{

   private int id;

    private long amount;

    private String name;

    private String date;


    public Operation[] operations = new Operation[1000];

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

    public void print(){
        while (true) {
            System.out.println("Введите сквозной номер операции для вывода информации о ней");
            int number = scanner.nextInt();
            System.out.println(operations[number]);
            System.out.print("ведите в консоль 0, если хотите прервать процесс вывода, введите 1, если хотите продолжить");
            int proceed = scanner.nextInt();
            if (proceed == 0) {
                break;
            }
        }
    }

    public static void getOperations(){
System.out.println("Для поиска операций клиента ввидете его Id");

        int clientId = scanner.nextInt();

System.out.println("Операции для клиента" + clientId+"следующие:");

int k=0;


while (statement[clientId][k] == 0){

    System.out.print(k + " "); System.out.print(Main.statement[clientId][k]);

    k++;

}


    }


}
