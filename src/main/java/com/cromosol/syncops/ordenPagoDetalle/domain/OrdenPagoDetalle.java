package com.cromosol.syncops.ordenPagoDetalle.domain;

import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
//import java.math.BigInteger;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "OrdenPagoDetalle"/*, schema = "PUBLIC"*/)
//@NamedQuery(name="OrdenPago.findAll", query="SELECT op FROM OrdenPago op ")
public class OrdenPagoDetalle {
    public OrdenPagoDetalle() {}

    public OrdenPagoDetalle(Long ordenPagoDetalleId, Long ordenPagoId, BigDecimal importe, String numero, String tipoComprobante, String codigoComprobante, Timestamp fecha, BigDecimal totalComprobante, BigDecimal descuento) {
        OrdenPagoDetalleId = ordenPagoDetalleId;
        OrdenPagoId = ordenPagoId;
        Importe = importe;
        Numero = numero;
        TipoComprobante = tipoComprobante;
        CodigoComprobante = codigoComprobante;
        Fecha = fecha;
        TotalComprobante = totalComprobante;
        Descuento = descuento;
    }

    @Id
    @Column(columnDefinition = "INTEGER")
    Long OrdenPagoDetalleId;
    @Column(columnDefinition = "INTEGER")
    Long OrdenPagoId;
    BigDecimal Importe;
    @Column(columnDefinition = "NVARCHAR")
    String Numero;
    @Column(columnDefinition = "NVARCHAR")
    String TipoComprobante;
    @Column(columnDefinition = "NVARCHAR")
    String CodigoComprobante;
    Timestamp Fecha;
    BigDecimal TotalComprobante;
    BigDecimal Descuento;
}
