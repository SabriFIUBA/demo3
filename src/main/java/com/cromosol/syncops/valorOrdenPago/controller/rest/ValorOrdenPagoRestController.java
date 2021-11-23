package com.cromosol.syncops.valorOrdenPago.controller.rest;

import com.cromosol.syncops.valorOrdenPago.domain.ValorOrdenPago;
import com.cromosol.syncops.valorOrdenPago.service.ValorOrdenPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/valorOrdenPago"})

public class ValorOrdenPagoRestController {
    @Autowired
    private ValorOrdenPagoService valorOrdenPagoService;

    public ValorOrdenPagoRestController(){}

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<ValorOrdenPago> findAll() {return valorOrdenPagoService.buscarTodos();}

    @GetMapping({"/{id}"})
    public ValorOrdenPago findById(@PathVariable Long id){
        return this.valorOrdenPagoService.buscarPorId(id);
    }

    @PostMapping(
            value = "/altaValorOrdenPago",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void save(@RequestBody ValorOrdenPago valorOrdenPago) {
        valorOrdenPagoService.guardar(valorOrdenPago);

    }

    @PostMapping(value = "/altaValoresOrdenPago", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void saveAll(@RequestBody List<ValorOrdenPago> valoresOrdenPago){
        valorOrdenPagoService.guardarTodos(valoresOrdenPago);

    }

}
