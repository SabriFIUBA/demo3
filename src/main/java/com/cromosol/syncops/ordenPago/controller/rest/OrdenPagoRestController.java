package com.cromosol.syncops.ordenPago.controller.rest;

import com.cromosol.syncops.ordenPago.domain.OrdenPago;
import com.cromosol.syncops.ordenPago.service.OrdenPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/ordenPago"})
//@RequiredArgsConstructor
public class OrdenPagoRestController {
    @Autowired
    private OrdenPagoService ordenPagoService;

    public OrdenPagoRestController(){}

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrdenPago> findAll() {return ordenPagoService.buscarTodos();}

    @GetMapping({"/{id}"})
    public OrdenPago findById(@PathVariable Long id){
        return this.ordenPagoService.buscarPorId(id);
    }

    @PostMapping(
            value = "/altaOrdenPago",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void save(@RequestBody OrdenPago ordenPago) {
        ordenPagoService.guardar(ordenPago);

    }

    @PostMapping(value = "/altaOrdenesPago", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void saveAll(@RequestBody List<OrdenPago> ordenesPago){
        ordenPagoService.guardarTodos(ordenesPago);

    }

}
