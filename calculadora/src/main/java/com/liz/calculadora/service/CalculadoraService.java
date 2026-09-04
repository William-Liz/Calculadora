package com.liz.calculadora.service;

import com.liz.calculadora.dto.CalculadoraRequest;
import com.liz.calculadora.dto.CalculadoraResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculadoraResponse somar(CalculadoraRequest request) {
        double result = request.getN1() + request.getN2();

        return new CalculadoraResponse(request.getN1(), request.getN2(), "soma", String.valueOf(result));
    }


    public CalculadoraResponse subtrair(CalculadoraRequest request) {
        double result = request.getN1() - request.getN2();

        return new CalculadoraResponse(request.getN1(), request.getN2(), "subtrair", String.valueOf(result));
    }

    public CalculadoraResponse multiplicar(CalculadoraRequest request) {
        double result = request.getN1() * request.getN2();

        return new CalculadoraResponse(request.getN1(), request.getN2(), "multiplicar", String.valueOf(result));
    }

    public CalculadoraResponse dividir(CalculadoraRequest request) {
       double result;
        if (request.getN2() == 0) {
            result = 0;
        }else {
            result = request.getN1() / request.getN2();
        }
        return new CalculadoraResponse(request.getN1(), request.getN2(), "dividir", String.valueOf(result));
    }

}
