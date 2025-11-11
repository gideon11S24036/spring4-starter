package org.delcom.todos.services;

import org.delcom.todos.entities.CashFlow;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public interface ICashFlowService {
    ArrayList<CashFlow> getAll(String search);
    Optional<CashFlow> getById(String id);
    CashFlow addCashFlow(String type, String source, String label, String description, long amount);
    boolean removeCashFlow(String id);
    boolean updateCashFlow(String id, String type, String source, String label, String description, long amount);
    Set<String> getAllLabels();
}