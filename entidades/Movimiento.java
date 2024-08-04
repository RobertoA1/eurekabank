package entidades;

import java.sql.Date;

public class Movimiento {
    private String cuencodigo;
    private int movinumero;
    private Date fecha;
    private String emplcodigo;
    private String tipoCodigo;
    private float importe;
    private String cuenReferencia;

    public Movimiento() {
    }

    public Movimiento(String cuencodigo, int movinumero, Date fecha, String emplcodigo, String tipoCodigo, float importe, String cuenReferencia) {
        this.cuencodigo = cuencodigo;
        this.movinumero = movinumero;
        this.fecha = fecha;
        this.emplcodigo = emplcodigo;
        this.tipoCodigo = tipoCodigo;
        this.importe = importe;
        this.cuenReferencia = cuenReferencia;
    }

    public String getCuencodigo() {
        return cuencodigo;
    }

    public void setCuencodigo(String cuencodigo) {
        this.cuencodigo = cuencodigo;
    }

    public int getMovinumero() {
        return movinumero;
    }

    public void setMovinumero(int movinumero) {
        this.movinumero = movinumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmplcodigo() {
        return emplcodigo;
    }

    public void setEmplcodigo(String emplcodigo) {
        this.emplcodigo = emplcodigo;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getCuenReferencia() {
        return cuenReferencia;
    }

    public void setCuenReferencia(String cuenreferencia) {
        this.cuenReferencia = cuenreferencia;
    }
}
