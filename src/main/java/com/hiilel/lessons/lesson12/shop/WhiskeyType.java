package com.hiilel.lessons.lesson12.shop;

import java.util.Objects;

public class WhiskeyType {

    private String country;

    private String solodType;


    public WhiskeyType(String country, String solodType) {
        this.country = country;
        this.solodType = solodType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSolodType() {
        return solodType;
    }

    public void setSolodType(String solodType) {
        this.solodType = solodType;
    }

    @Override
    public String toString() {
        return "WhiskeyType{" +
                "country='" + country + '\'' +
                ", solodType='" + solodType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhiskeyType that = (WhiskeyType) o;
        return Objects.equals(country, that.country) && Objects.equals(solodType, that.solodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, solodType);
    }
}
