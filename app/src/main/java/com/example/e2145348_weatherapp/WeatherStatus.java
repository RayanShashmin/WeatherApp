package com.example.e2145348_weatherapp;

import java.util.List;

public class WeatherStatus {
    public Coord coord;
    public List<Weather> weather;
    public Main main;

    public Sys sys;

    public class Coord {
        public double lon;
        public double lat;
    }

    public class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    public class Main {
        public double temp;
        public int humidity;

    }




    public class Sys {
        public int type;
        public int id;
        public String country;

    }
}

