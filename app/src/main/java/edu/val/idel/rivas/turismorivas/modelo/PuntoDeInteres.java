package edu.val.idel.rivas.turismorivas.modelo;


import java.io.Serializable;

/**
 * @author Val (github-valexx55)
 * @since 30-6-2018
 * @version 1.0
 *
 * Clase que representa el modelo de los Puntos de interés.
 * Contiene todos los atributos necesarios para representar
 * un punto de interés
 *
 * Se decide por motivos didácticos (no se estudia en el temario BD)
 * y organizativos (para que cada alumno documente algún punto)
 * este modelado
 */
public class PuntoDeInteres {


    public enum CATEGORIA {HISTORICO, CULTURAL, MONUMENTAL, RELIGIOSO, TURISTICO, OTRA}


    protected String nombre;
    protected String fecha_inicio;//fundación, construcción
    protected int area;//en metros cuadrados
    protected String direccion;
    protected float latitud;
    protected float longitud;
    protected boolean accesibilidad;//true si puede discapacidad
    protected int[] fotos;
    protected String info_contacto;
    protected String enlace_web;
    protected String info_basica;
    protected String info_detallada;
    protected float puntuacion;
    protected String horario;
    protected float coste;
    protected CATEGORIA[] categorias;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public int[] getFotos() {
        return fotos;
    }

    public void setFotos(int[] fotos) {
        this.fotos = fotos;
    }

    public String getInfo_contacto() {
        return info_contacto;
    }

    public void setInfo_contacto(String info_contacto) {
        this.info_contacto = info_contacto;
    }

    public String getEnlace_web() {
        return enlace_web;
    }

    public void setEnlace_web(String enlace_web) {
        this.enlace_web = enlace_web;
    }

    public String getInfo_basica() {
        return info_basica;
    }

    public void setInfo_basica(String info_basica) {
        this.info_basica = info_basica;
    }

    public String getInfo_detallada() {
        return info_detallada;
    }

    public void setInfo_detallada(String info_detallada) {
        this.info_detallada = info_detallada;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public CATEGORIA[] getCategorias() {
        return categorias;
    }

    public void setCategorias(CATEGORIA[] categorias) {
        this.categorias = categorias;
    }
}
