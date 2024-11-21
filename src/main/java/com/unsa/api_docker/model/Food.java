package com.unsa.api_docker.model;

//import jakarta.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String categoria;

    @NotNull
    private Double proteina;

    @NotNull
    private Double grasa;

    @NotNull
    private Double carbohidrato;

    @NotNull
    private Double energia;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getProteina() {
        return proteina;
    }

    public void setProteina(Double proteina) {
        this.proteina = proteina;
    }

    public Double getGrasa() {
        return grasa;
    }

    public void setGrasa(Double grasa) {
        this.grasa = grasa;
    }

    public Double getCarbohidrato() {
        return carbohidrato;
    }

    public void setCarbohidrato(Double carbohidrato) {
        this.carbohidrato = carbohidrato;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }
}
