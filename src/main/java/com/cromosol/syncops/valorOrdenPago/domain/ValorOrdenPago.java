package com.cromosol.syncops.valorOrdenPago.domain;

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
@Table(name = "ValorOrdenPago"/*, schema = "PUBLIC"*/)
//@NamedQuery(name="OrdenPago.findAll", query="SELECT op FROM OrdenPago op ")
public class ValorOrdenPago {
    public ValorOrdenPago() {}

    public ValorOrdenPago(Long valorOrdenPagoId, Long ordenPagoId, BigDecimal importe, String numero, Timestamp fecha, String tipo, String nota, String banco, String chequePropio, String cuit) {
        ValorOrdenPagoId = valorOrdenPagoId;
        OrdenPagoId = ordenPagoId;
        Importe = importe;
        Numero = numero;
        Fecha = fecha;
        Tipo = tipo;
        Nota = nota;
        Banco = banco;
        ChequePropio = chequePropio;
        Cuit = cuit;
    }

    @Id
    @Column(columnDefinition = "INTEGER")
    Long ValorOrdenPagoId;
    @Column(columnDefinition = "INTEGER")
    Long OrdenPagoId;
    BigDecimal Importe;
    @Column(columnDefinition = "NVARCHAR")
    String Numero;
    Timestamp Fecha;
    @Column(columnDefinition = "NVARCHAR")
    String Tipo;
    @Column(columnDefinition = "NVARCHAR")
    String Nota;
    @Column(columnDefinition = "NVARCHAR")
    String Banco;
    @Column(columnDefinition = "NVARCHAR")
    String ChequePropio;
    @Column(columnDefinition = "NVARCHAR")
    String Cuit;
}
