/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Castelo
 */
@Entity
@Table(name = "INSTREV")
public class InstREVSC implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRev")
    private long idRev;

    public InstREVSC() {
    }

    public long getIdRev() {
        return idRev;
    }

    public void setIdRev(long idRev) {
        this.idRev = idRev;
    }

    @Override
    public String toString() {
        return "InstRev{" + "idRev=" + idRev + '}';
    }
}
