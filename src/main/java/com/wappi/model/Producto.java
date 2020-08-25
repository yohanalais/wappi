package com.wappi.model;

public class Producto {

    private String descripcion;
    private String fecha;
    private String precio;
    private String costoDeEnvio;
    private String comercio;
    private String direccion;
    //private String usoCupon;

    /*public Producto(String descripcion,String fecha,String precio,String costoDeEnvio,String comercio,String direccion,String usoCupon ){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio = precio;
        this.costoDeEnvio = costoDeEnvio;
        this.comercio = comercio;
        this.direccion = direccion;
        this.usoCupon= usoCupon;
    }*/

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCostoDeEnvio() {
        return costoDeEnvio;
    }

    public void setCostoDeEnvio(String costoDeEnvio) {
        this.costoDeEnvio = costoDeEnvio;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
