package com.cromosol.syncops.ordenPagoDetalle.service;

import com.cromosol.syncops.ordenPagoDetalle.domain.OrdenPagoDetalle;

import java.util.List;

public interface OrdenPagoDetalleService {
    List<OrdenPagoDetalle> buscarTodos();

    List<OrdenPagoDetalle> guardarTodos(List<OrdenPagoDetalle> ordenesPagoDetalle);

    OrdenPagoDetalle buscarPorId(Long id);

    OrdenPagoDetalle guardar(OrdenPagoDetalle ordenPagoDetalle);
}
