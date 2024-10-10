package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class Vehiculo {

    private String id;
    private String marca;
    private String color;
    private String fechaEnsamblaje;
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    public Vehiculo(String id, String marca, String color, String fechaEnsamblaje, Chasis chasis, Motor motor, Cojineria cojineria) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", fechaEnsamblaje='" + fechaEnsamblaje + '\'' +
                ", chasis=" + chasis +
                ", motor=" + motor +
                ", cojineria=" + cojineria +
                '}';
    }
}
