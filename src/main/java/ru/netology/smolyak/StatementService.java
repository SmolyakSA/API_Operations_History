package ru.netology.smolyak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatementService <T>{

    public static final Map<Integer, List<Operation>> storage = new HashMap<>();

    public StatementService() {
    }

    public Map<Integer, List<Operation>> getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "StatementService{" +
                "storage=" + storage +
                '}';
    }
}
