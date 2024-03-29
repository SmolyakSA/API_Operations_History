package ru.netology.smolyak;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

import static ru.netology.smolyak.Main.scanner;

public class AsyncInputOperationService {

    private Queue<Operation> queue = new LinkedList<>();


    public boolean offerOperation() throws InputMismatchException{

        int j = 0;

        while (true) {
            try {
                System.out.println("Введите данные по операциям клиентов через пробел: int id, long amount, String name, String date");
                Operation operation = new Operation(scanner.nextInt(), scanner.nextLong(), scanner.nextLine(), scanner.nextLine());
                queue.offer(operation);
                System.out.print("ведите в консоль 0, если хотите прервать заполнение данных, введите 1, если хотите продолжить");
                int proceed = scanner.nextInt();
                if (proceed == 0) {
                    break;
                }
                j = +1;
            }
            catch (InputMismatchException e) {System.out.println("Введенные данные не совпадают с объявленными типами");}
        }


        return false;
    }


    public void processQueue() {
        while (true) {
            Operation operation = queue.poll();
            if (operation == null) {
                try {
                    System.out.println("Waiting for next operation in queue");
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Processing operation:” + operation");
                OperationService.addOperation(operation);
            }
        }
    }


    public void startAsyncOperationProcessing() {
        Thread t = new Thread() {
            @Override
            public void run() {
                processQueue();
            }
        };
        t.start();
    }




}

