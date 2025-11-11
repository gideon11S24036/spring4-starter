package org.delcom.todos.repositories;

import org.delcom.todos.entities.CashFlow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// Keajaiban Spring Data JPA: Cukup extends JpaRepository
public interface ICashFlowRepository extends JpaRepository<CashFlow, String> {
    
    // Spring akan otomatis membuat query untuk method ini:
    // SELECT * FROM cash_flows WHERE label LIKE '%search%' OR description LIKE '%search%'
    List<CashFlow> findByLabelContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String label, String description);
}