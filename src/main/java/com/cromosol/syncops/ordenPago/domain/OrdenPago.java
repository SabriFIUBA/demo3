package com.cromosol.syncops.ordenPago.domain;

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
@Table(name = "OrdenPago"/*, schema = "PUBLIC"*/)
//@NamedQuery(name="OrdenPago.findAll", query="SELECT op FROM OrdenPago op ")
public class OrdenPago {
    public OrdenPago() {}

    public OrdenPago(Long ordenPagoId, Long clienteId, BigDecimal importeApagar, BigDecimal descuento, String nota, Long ordenPagoIdExterno, String estado, Timestamp fechaEnvio, String usuarioEnvio, String ordenPagoGuid, String estadoDescripcion, Long reciboID, String reciboNumero, Timestamp reciboFecha, Long rendicionID, String cliente, String razonSoc, Long reciboID_SYNC, String vendedor) {
        OrdenPagoId = ordenPagoId;
        ClienteId = clienteId;
        ImporteApagar = importeApagar;
        Descuento = descuento;
        Nota = nota;
        OrdenPagoIdExterno = ordenPagoIdExterno;
        Estado = estado;
        FechaEnvio = fechaEnvio;
        UsuarioEnvio = usuarioEnvio;
        OrdenPagoGuid = ordenPagoGuid;
        EstadoDescripcion = estadoDescripcion;
        ReciboID = reciboID;
        ReciboNumero = reciboNumero;
        ReciboFecha = reciboFecha;
        RendicionID = rendicionID;
        Cliente = cliente;
        RazonSoc = razonSoc;
        ReciboID_SYNC = reciboID_SYNC;
        Vendedor = vendedor;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(/*name = "OrdenPagoId", nullable = false,*/ columnDefinition = "INTEGER")
    private Long OrdenPagoId;
    @Column(columnDefinition = "INTEGER")
    private Long ClienteId;
    private BigDecimal ImporteApagar;
    private BigDecimal Descuento;
    @Column(columnDefinition = "NVARCHAR")
    private String Nota;
    @Column(columnDefinition = "INTEGER")
    private Long OrdenPagoIdExterno;
    @Column(columnDefinition = "NVARCHAR")
    private String Estado;
    private Timestamp FechaEnvio;
    @Column(columnDefinition = "NVARCHAR")
    private String UsuarioEnvio;
    @Column(columnDefinition = "UNIQUEIDENTIFIER")
    private String OrdenPagoGuid;
    @Column(columnDefinition = "NVARCHAR")
    private String EstadoDescripcion;
    @Column(columnDefinition = "INTEGER")
    private Long ReciboID;
    @Column(columnDefinition = "NVARCHAR")
    private String ReciboNumero;
    private Timestamp ReciboFecha;
    @Column(columnDefinition = "INTEGER")
    private Long RendicionID;
    @Column(columnDefinition = "NVARCHAR")
    private String Cliente;
    @Column(columnDefinition = "NVARCHAR")
    private String RazonSoc;
    @Column(columnDefinition = "INTEGER")
    private Long ReciboID_SYNC;
    @Column(columnDefinition = "NVARCHAR")
    private String Vendedor;



    /*public Long getOrdenPagoId() {
        return OrdenPagoId;
    }

    public void setOrdenPagoId(Long id) {
        this.OrdenPagoId = OrdenPagoId;
    }*/
}
