package com.cromosol.syncops.ordenPago.service.impl;

import com.cromosol.syncops.ordenPago.domain.OrdenPago;
import com.cromosol.syncops.ordenPago.repository.OrdenPagoRepository;
import com.cromosol.syncops.ordenPago.service.OrdenPagoService;
import com.cromosol.syncops.ordenPagoDetalle.domain.OrdenPagoDetalle;
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

    @Override
    public List<OrdenPago> guardarTodos(List<OrdenPago> ordenesPago) {
        for(OrdenPago op : ordenesPago){
            if (this.buscarPorId(op.getOrdenPagoId()) == null) { ordenPagoRepository.save(op); };
        }
        // ver de cambiar a void
        return ordenesPago;
    }

    @Override
    public OrdenPago buscarPorId(Long id) {
        return ordenPagoRepository.findById(id).orElse(null);
    }

    @Override
    public OrdenPago guardar(OrdenPago ordenPago) {
        return ordenPagoRepository.save(ordenPago);
    }
}
