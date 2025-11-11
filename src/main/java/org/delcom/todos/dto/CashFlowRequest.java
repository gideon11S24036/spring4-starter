package org.delcom.todos.dto;

// Kelas ini mewakili body JSON untuk request POST dan PUT
public class CashFlowRequest {
    private String type;
    private String source;
    private String label;
    private String description;
    private long amount;

    // Getters dan Setters diperlukan agar Spring bisa mengisi data dari JSON
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public long getAmount() { return amount; }
    public void setAmount(long amount) { this.amount = amount; }
}