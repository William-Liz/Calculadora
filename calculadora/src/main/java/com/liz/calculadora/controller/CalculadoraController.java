package com.liz.calculadora.controller;

import com.liz.calculadora.dto.CalculadoraRequest;
import com.liz.calculadora.dto.CalculadoraResponse;
import com.liz.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController (CalculadoraController calculadoraController) {
        this.calculadoraService = calculadoraController.calculadoraService;
    }

    @PostMapping("/somar")
    public CalculadoraResponse somar(@RequestBody CalculadoraRequest request){
        return CalculadoraService.somar(request);
    }

    @PostMapping("/subtrair")
    public CalculadoraResponse subtrair(@RequestBody CalculadoraRequest request){
        return CalculadoraService.subtrair(request);
    }

    @PostMapping("/multiplicar")
    public CalculadoraResponse multiplicar(@RequestBody CalculadoraRequest request){
        return CalculadoraService.multiplicar(request);
    }

    @PostMapping("/dividir")
    public CalculadoraResponse dividir(@RequestBody CalculadoraRequest request){
        return CalculadoraService.dividir(request);
    }

}
