package com.demo;

import java.util.Objects;

final public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    // equals method to compare 2 software
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Software)) {
            return false;
        }
        Software software = (Software) o;
        return Objects.equals(programmer, software.programmer);
    }

    public String toString(){
        return "Software written by " + programmer + "on "+ platform + os;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
