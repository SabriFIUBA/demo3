package com.cromosol.syncops.valorOrdenPago.service;

import com.cromosol.syncops.valorOrdenPago.domain.ValorOrdenPago;

import java.util.List;

public interface ValorOrdenPagoService {
    List<ValorOrdenPago> buscarTodos();

    List<ValorOrdenPago> guardarTodos(List<ValorOrdenPago> valoresOrdenPago);

    ValorOrdenPago buscarPorId(Long id);

    ValorOrdenPago guardar(ValorOrdenPago valorOrdenPago);
}
