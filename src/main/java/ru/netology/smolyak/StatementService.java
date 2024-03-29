package ru.netology.smolyak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatementService {

    private final Map<Integer, List<Operation>> storage = new HashMap<>();

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
