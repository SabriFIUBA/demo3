package com.cromosol.syncops.ordenPago.service.impl;

import com.cromosol.syncops.ordenPago.domain.OrdenPago;
import com.cromosol.syncops.ordenPago.repository.OrdenPagoRepository;
import com.cromosol.syncops.ordenPago.service.OrdenPagoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdenPagoServiceImpl implements OrdenPagoService {
    private OrdenPagoRepository ordenPagoRepository;

    public OrdenPagoServiceImpl(OrdenPagoRepository ordenPagoRepository) { this.ordenPagoRepository = ordenPagoRepository; }

    @Override
    public List<OrdenPago> buscarTodos() { return ordenPagoRepository.findAll(); }
}
