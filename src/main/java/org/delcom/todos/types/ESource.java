package org.delcom.todos.types;

public enum ESource {

    TABUNGAN("Tabungan"),
    GAJI("Gaji"),
    CASH("Cash"),
    FREELANCE("Freelance Project"), // Ditambahkan untuk request PUT
    
    INVESTMENT("Investment"),
    LOANS("Loans"),
    SAVINGS("Savings"), // "Savings" tetap dipertahankan untuk fleksibilitas
    OTHERS("Others");

    private final String value;

    ESource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ESource fromString(String v) {
        if (v == null) {
            return null;
        }
        for (ESource s : ESource.values()) {
            if (s.name().equalsIgnoreCase(v) || s.value.equalsIgnoreCase(v)) {
                return s;
            }
        }
        return null;
    }
}