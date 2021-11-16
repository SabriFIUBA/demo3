package com.cromosol.syncops.ordenPago.controller.rest;

import com.cromosol.syncops.ordenPago.domain.OrdenPago;
import com.cromosol.syncops.ordenPago.service.OrdenPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/api/ordenPago"})
public class OrdenPagoRestController {
    @Autowired
    private OrdenPagoService ordenPagoService;

    public OrdenPagoRestController(){}

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<OrdenPago> findAll(Pageable pageable) {return ordenPagoService.buscarTodos();}
}
