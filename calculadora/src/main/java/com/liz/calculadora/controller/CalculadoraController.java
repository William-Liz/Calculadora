package com.liz.calculadora.controller;

import com.liz.calculadora.dto.CalculadoraRequest;
import com.liz.calculadora.dto.CalculadoraResponse;
import com.liz.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController (CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/somar")
    public CalculadoraResponse somar(@RequestBody CalculadoraRequest request){
        return calculadoraService.somar(request);
    }

    @PostMapping("/subtrair")
    public CalculadoraResponse subtrair(@RequestBody CalculadoraRequest request){
        return calculadoraService.subtrair(request);
    }

    @PostMapping("/multiplicar")
    public CalculadoraResponse multiplicar(@RequestBody CalculadoraRequest request){
        return calculadoraService.multiplicar(request);
    }

    @PostMapping("/dividir")
    public CalculadoraResponse dividir(@RequestBody CalculadoraRequest request){
        return calculadoraService.dividir(request);
    }

}
