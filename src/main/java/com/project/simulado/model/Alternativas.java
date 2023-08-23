package com.project.simulado.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Alternativas {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getA() {
        return "(A) " + a;
    }

    public String getB() {
        return "(B) " + b;
    }

    public String getC() {
        return "(C) " + c;
    }

    public String getD() {
        return "(D) " + d;
    }

    public String getE() {
        return "(E) " + e;
    }
}
