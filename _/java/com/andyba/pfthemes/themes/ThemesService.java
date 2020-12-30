/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andyba.pfthemes.themes;

import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Andy_2
 */
@ManagedBean
@ApplicationScoped
public class ThemesService {

    private static final Logger logger = Logger.getLogger(ThemesService.class.getName());

    private final String[] themes = {"afterdark",
        "afternoon",
        "afterwork",
        "aristo",
        "black-tie",
        "blitzer",
        "bluesky",
        "bootstrap",
        "casablanca",
        "cupertino",
        "cruze",
        "dark-hive",
        "delta",
        "dot-luv",
        "eggplant",
        "excite-bike",
        "flick",
        "glass-x",
        "home",
        "hot-sneaks",
        "humanity",
        "le-frog",
        "midnight",
        "mint-choc",
        "moodyblue2",
        "overcast",
        "pepper-grinder",
        "redmond",
        "rocket",
        "sam",
        "smoothness",
        "south-street",
        "start",
        "sunny",
        "swanky-purse",
        "trontastic",
        "ui-darkness",
        "ui-lightness",
        "vader"};

    /**
     * Creates a new instance of ThemesService
     */
    public ThemesService() {
    }

    /**
     * @return the themes
     */
    public String[] getThemes() {
        return themes;
    }

}
