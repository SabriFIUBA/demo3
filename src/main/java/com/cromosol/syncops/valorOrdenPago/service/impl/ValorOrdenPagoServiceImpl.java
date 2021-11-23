package com.cromosol.syncops.valorOrdenPago.service.impl;

import com.cromosol.syncops.valorOrdenPago.domain.ValorOrdenPago;
import com.cromosol.syncops.valorOrdenPago.repository.ValorOrdenPagoRepository;
import com.cromosol.syncops.valorOrdenPago.service.ValorOrdenPagoService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ValorOrdenPagoServiceImpl implements ValorOrdenPagoService {
    private ValorOrdenPagoRepository valorOrdenPagoRepository;

    public ValorOrdenPagoServiceImpl(ValorOrdenPagoRepository valorOrdenPagoRepository) { this.valorOrdenPagoRepository = valorOrdenPagoRepository; }

    @Override
    public List<ValorOrdenPago> buscarTodos() { return valorOrdenPagoRepository.findAll(); }

    @Override
    // no sobreescribe
    public List<ValorOrdenPago> guardarTodos(List<ValorOrdenPago> valoresOrdenPago) {

        for(ValorOrdenPago opd : valoresOrdenPago){
            if (this.buscarPorId(opd.getValorOrdenPagoId()) == null) { valorOrdenPagoRepository.save(opd); };
        }
        // ver de cambiar a void
        return valoresOrdenPago;
    }

    @Override
    public ValorOrdenPago buscarPorId(Long id) {
        return valorOrdenPagoRepository.findById(id).orElse(null);
    }

    @Override
    // sobreescribe
    public ValorOrdenPago guardar(ValorOrdenPago valorOrdenPago) {
        return valorOrdenPagoRepository.save(valorOrdenPago);
    }
}
