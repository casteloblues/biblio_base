/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

import java.io.Serializable;

/**
 *
 * @author Castelo
 */
//@Entity
//@Table(name = "INSTREV")
public class InstREVSC implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idRev")
    private int idRev;
    private String photo;
    private String make;
    private String model;
    private String finish;
    private String year;
    private String title;
    private String description;
   

    public InstREVSC() {
    }
    
    public InstREVSC(int id, Photo photo, String make, String model, String finish, String year, String title, String description) {
        this.idRev = id;
        this.photo = photo.getHref();
        this.make = make;
        this.model = model;
        this.finish = finish;
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public int getIdRev() {
        return idRev;
    }

    public void setIdRev(int idRev) {
        this.idRev = idRev;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "InstREVSC{" + "idRev=" + idRev + ", photo=" + photo + ", make=" + make + ", model=" + model + ", finish=" + finish + ", year=" + year + ", title=" + title + ", description=" + description + '}';
    }

}
