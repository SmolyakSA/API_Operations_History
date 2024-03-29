package ru.netology.smolyak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static ru.netology.smolyak.AsyncInputOperationService.*;
import static ru.netology.smolyak.Main.scanner;
import static ru.netology.smolyak.StatementService.storage;

public class OperationService {


    public static ArrayList<Operation> operations = new ArrayList<Operation>();

    public static void addOperation(Operation operation){

        System.out.println("Введите Id клиента");

        int clientId = scanner.nextInt();

        storage.computeIfAbsent(clientId, k -> new ArrayList<>()).add(operation);

        System.out.println(storage);

    }





}

