package ru.netology.smolyak;

import java.util.InputMismatchException;

import static ru.netology.smolyak.Customer.customers;
import static ru.netology.smolyak.Main.customer;
import static ru.netology.smolyak.Main.scanner;

public class Operation implements ConsolePrintable{

   private int id;

    private long amount;

    private String name;

    private String date;

    public static int indexCustomerNumber;

    public static int indexOperationNumber;


    public static Operation[] operations = new Operation[1000];
    public static int[][] statement = new int[1000][1000];

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

    System.out.print(k + " "); System.out.print(statement[clientId][k]);

    k++;

}


    }

    public static void saveStatement() throws CustomerOperationOutOfBoundException {
    int j = 0;

        while (true) {
            try {
                System.out.print("Введите id пользователя");
                indexCustomerNumber = scanner.nextInt();
                {
                    System.out.println("Пльзователь отсутвует, пожалуйста создайте его");
                    System.out.println("Введите данные по клиентам через пробел: customerId, String customerName, int birthY, short region");
                    Customer customers[] = {new Customer(scanner.nextInt(), scanner.nextLine(), scanner.nextInt(), scanner.nextShort())};
                }
                ;
                System.out.print("Введите порядковый номер операции");
                indexOperationNumber = scanner.nextInt();
                System.out.println("Введите данные по операциям клиентов через пробел: int id, long amount, String name, String date");
                Operation operations[] = {new Operation(scanner.nextInt(), scanner.nextLong(), scanner.nextLine(), scanner.nextLine())};
                statement[indexCustomerNumber][indexOperationNumber] = operations[j].getId();
                System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
                int proceed = scanner.nextInt();
                if (proceed == 0) {
                    break;
                }
                j = +1;
            }
            catch (InputMismatchException e) {System.out.println("Введите неотрицательные числа");}
            catch (ArrayIndexOutOfBoundsException e) {throw new CustomerOperationOutOfBoundException(indexCustomerNumber, indexOperationNumber);}
        }
    }


}
