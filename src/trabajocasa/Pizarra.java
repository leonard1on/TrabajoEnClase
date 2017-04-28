/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajocasa;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Leonardo Borjas
 * @serial 203429429
 * @version 1.1
 */
public final class Pizarra {

    private int ancho;
    private int largo;
    private String textura;
    private Color color;
    private Date fecha;

    public Pizarra() {

    }

    public Pizarra(int ancho) {

    }

    /**
     * 
     * @param largo Define el largo del objeto pizarra
     * @param ancho Define el ancho del objeto pizarra
     * @param textura Define la textura del objeto pizarra
     * @param color Define el color del objeto pizarra
     * @param fecha Muestra la fecha de la pizarra
     * @see Pizarra()
     */
    
    public Pizarra(int largo, int ancho, String textura, Color color, Date fecha) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        this.textura = textura;
        this.fecha = fecha;

    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public String getTextura() {
        return textura;
    }

    public Color getColor() {
        return color;
    }

    public Date getFecha() {
        return fecha;
    }
    
    /**
     * 
     * @return Retorna la textura y fecha de la pizarra creada
     */
    @Override
    public String toString() {
        return "Pizarra{" + "textura=" + textura + ", fecha=" + fecha + '}';
    }

}
