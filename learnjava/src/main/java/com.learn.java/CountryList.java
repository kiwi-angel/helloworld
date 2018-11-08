package com.learn.java;

import java.util.Locale;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/6/13
 */
public class CountryList {

    public static void main(String[] args) {
        CountryList obj = new CountryList();
        obj.run();
        //get a list of countries and display in FRENCH
        obj.getListOfCountries(Locale.FRENCH);
    }

    public void run() {
        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry());
        }
        System.out.println("Done");
    }

    public void getListOfCountries(Locale locale) {
        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry(locale));
        }
    }
}

