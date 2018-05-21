/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author CX
 */
public class Imagen implements Serializable{
    private int contImagen;
    private byte[] imagen;
    private Date fecha;

    public Imagen() {
    }

    public Imagen(int contImagen, byte[] imagen, Date fecha) {
        this.contImagen = contImagen;
        this.imagen = imagen;
        this.fecha = fecha;
    }
    

    /**
     * @return the contImagen
     */
    public int getContImagen() {
        return contImagen;
    }

    /**
     * @param contImagen the contImagen to set
     */
    public void setContImagen(int contImagen) {
        this.contImagen = contImagen;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

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

}
