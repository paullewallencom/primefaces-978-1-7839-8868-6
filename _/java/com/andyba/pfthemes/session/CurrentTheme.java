package com.andyba.pfthemes.session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andy_2
 */
@ManagedBean
@SessionScoped
public class CurrentTheme implements Serializable {

    /**
     * Creates a new instance of CurrentTheme
     */
    public CurrentTheme() {
    }

    private String theme = "aristo";

    /**
     * @return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

}
