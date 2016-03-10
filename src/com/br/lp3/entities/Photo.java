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
public class Photo implements Serializable {
    private String href;

    public Photo() {
    }

    public Photo(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Links{" + "href=" + href + '}';
    }
}