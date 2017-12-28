package com.omrobbie.androidversions;

/**
 * Created by omrobbie on 29/12/2017.
 */

public class AndroidPojo {

    private String codename;
    private String version;
    private String initialRelease;
    private String description;

    public AndroidPojo(String codename, String version, String initialRelease, String description) {
        this.codename = codename;
        this.version = version;
        this.initialRelease = initialRelease;
        this.description = description;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInitialRelease() {
        return initialRelease;
    }

    public void setInitialRelease(String initialRelease) {
        this.initialRelease = initialRelease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
