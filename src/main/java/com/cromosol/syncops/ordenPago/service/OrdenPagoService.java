package com.cromosol.syncops.ordenPago.service;

import com.cromosol.syncops.ordenPago.domain.OrdenPago;

import java.util.List;

public interface OrdenPagoService {
    List<OrdenPago> buscarTodos();

    List<OrdenPago> guardarTodos(List<OrdenPago> ordenesPago);

    OrdenPago buscarPorId(Long id);

    OrdenPago guardar(OrdenPago ordenPago);
}
