/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication.dato;

import aplication.modelo.Imagen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author CX
 */
public class ListaImagen implements Serializable{
    private byte[] img;
    private int contImagen;
    private Date fecha;
    private ArrayList<Imagen> listaImagenes;

    public ListaImagen() {
        listaImagenes=new ArrayList();
    }

    public ListaImagen(byte[] img, int contImagen, Date fecha, ArrayList<Imagen> listaImagenes) {
        this.img = img;
        this.contImagen = contImagen;
        this.fecha = fecha;
        this.listaImagenes = listaImagenes;
    }
    
    public void llenarListado(Date unaFecha,byte[] unaImagen){
        if(listaImagenes.isEmpty()){
            contImagen=0;
        }
        else{
            contImagen=listaImagenes.size();
        }
        listaImagenes.add(new Imagen(contImagen,unaImagen,unaFecha));
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
     * @return the listaImagenes
     */
    public ArrayList<Imagen> getListaImagenes() {
        return listaImagenes;
    }

    /**
     * @param listaImagenes the listaImagenes to set
     */
    public void setListaImagenes(ArrayList<Imagen> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    /**
     * @return the img
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

}
