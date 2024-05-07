/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokemon.entities;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Recibo {

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the atendidoPor
     */
    public String getAtendidoPor() {
        return atendidoPor;
    }

    /**
     * @param atendidoPor the atendidoPor to set
     */
    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    /**
     * @return the sucursal
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    private Date fecha;
    private String atendidoPor;
    private Sucursal sucursal;
    private Cliente cliente;
    private List<Articulo> articulos;
    
    public Recibo deserializar(String json){
        Recibo recibo = new Recibo();
        try{
            recibo = new Gson().fromJson(json, Recibo.class);
            
        } catch(Exception ex){
            System.err.println("Ocurrio un error al deserializar" + ex.getMessage());
        }
        return recibo;
}
}
