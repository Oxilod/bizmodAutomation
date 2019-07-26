package com.bizmod.models.enums;

public enum CompanyType {
    SRL("SRL"),
    SRLD("SRL-D"),
    PFA("PFA");

    private String value;

    private CompanyType(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
