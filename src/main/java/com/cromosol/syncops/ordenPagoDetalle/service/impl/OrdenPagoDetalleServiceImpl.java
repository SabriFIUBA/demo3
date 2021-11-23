package com.cromosol.syncops.ordenPagoDetalle.service.impl;

import com.cromosol.syncops.ordenPagoDetalle.domain.OrdenPagoDetalle;
import com.cromosol.syncops.ordenPagoDetalle.repository.OrdenPagoDetalleRepository;
import com.cromosol.syncops.ordenPagoDetalle.service.OrdenPagoDetalleService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdenPagoDetalleServiceImpl implements OrdenPagoDetalleService {
    private OrdenPagoDetalleRepository ordenPagoDetalleRepository;

    public OrdenPagoDetalleServiceImpl(OrdenPagoDetalleRepository ordenPagoDetalleRepository) { this.ordenPagoDetalleRepository = ordenPagoDetalleRepository; }

    @Override
    public List<OrdenPagoDetalle> buscarTodos() { return ordenPagoDetalleRepository.findAll(); }

    @Override
    // no sobreescribe
    public List<OrdenPagoDetalle> guardarTodos(List<OrdenPagoDetalle> ordenesPagoDetalle) {

        for(OrdenPagoDetalle opd : ordenesPagoDetalle){
            if (this.buscarPorId(opd.getOrdenPagoDetalleId()) == null) { ordenPagoDetalleRepository.save(opd); };
        }
        // ver de cambiar a void
        return ordenesPagoDetalle;
    }

    @Override
    public OrdenPagoDetalle buscarPorId(Long id) {
        return ordenPagoDetalleRepository.findById(id).orElse(null);
    }

    @Override
    // sobreescribe
    public OrdenPagoDetalle guardar(OrdenPagoDetalle ordenPagoDetalle) {
        return ordenPagoDetalleRepository.save(ordenPagoDetalle);
    }
}
