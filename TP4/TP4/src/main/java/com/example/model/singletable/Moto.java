package com.example.model.singletable;

import org.jetbrains.annotations.NotNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("MOTO")
public class Moto extends Vehicule {

    @Min(value = 50, message = "La cylindrée minimum est de 50cc")
    @Max(value = 2000, message = "La cylindrée maximum est de 2000cc")
    private Integer cylindree;

    private String typeTransmission;

    // UN Constructeur par défaut requis par JPA
    public Moto() {

    }

    public Moto(String marque, String modele, LocalDate anneeFabrication, Double prix,
                Integer cylindree, String typeTransmission) {
        super(marque, modele, anneeFabrication, prix);
        this.cylindree = cylindree;
        this.typeTransmission = typeTransmission;
    }

    // Getters et Setters
    public Integer getCylindree() {
        return cylindree;
    }

    public void setCylindree(Integer cylindree) {
        this.cylindree = cylindree;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "id=" + getId() +
                ", marque='" + getMarque() + '\'' +
                ", modele='" + getModele() + '\'' +
                ", anneeFabrication=" + getAnneeFabrication() +
                ", prix=" + getPrix() +
                ", cylindree=" + cylindree +
                ", typeTransmission='" + typeTransmission + '\'' +
                '}';
    }
}