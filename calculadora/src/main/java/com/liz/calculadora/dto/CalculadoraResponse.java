package com.liz.calculadora.dto;

public class CalculadoraResponse {
    private double n1 = 0;
    private double n2 = 0;
    private String operacao;
    private String resultado;

    public CalculadoraResponse(double n1, double n2, String operacao, String resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
        this.resultado = resultado;

    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getResultado() {
        return resultado;
    }
}
