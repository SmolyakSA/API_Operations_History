package ru.netology.smolyak;

import static ru.netology.smolyak.Main.scanner;

public class CashbackOperation extends Operation implements ConsolePrintable {
    private int cashbackAmount;


    @Override
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
}
