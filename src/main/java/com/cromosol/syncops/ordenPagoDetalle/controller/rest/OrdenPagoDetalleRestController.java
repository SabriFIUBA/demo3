package com.cromosol.syncops.ordenPagoDetalle.controller.rest;

import com.cromosol.syncops.ordenPagoDetalle.domain.OrdenPagoDetalle;
import com.cromosol.syncops.ordenPagoDetalle.service.OrdenPagoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/ordenPagoDetalle"})

public class OrdenPagoDetalleRestController {
    @Autowired
    private OrdenPagoDetalleService ordenPagoDetalleService;

    public OrdenPagoDetalleRestController(){}

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrdenPagoDetalle> findAll() {return ordenPagoDetalleService.buscarTodos();}

    @GetMapping({"/{id}"})
    public OrdenPagoDetalle findById(@PathVariable Long id){
        return this.ordenPagoDetalleService.buscarPorId(id);
    }

    @PostMapping(
            value = "/altaOrdenPagoDetalle",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void save(@RequestBody OrdenPagoDetalle ordenPagoDetalle) {
        ordenPagoDetalleService.guardar(ordenPagoDetalle);

    }

    @PostMapping(value = "/altaOrdenesPagoDetalle", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void saveAll(@RequestBody List<OrdenPagoDetalle> ordenesPagoDetalle){
        ordenPagoDetalleService.guardarTodos(ordenesPagoDetalle);

    }

}
