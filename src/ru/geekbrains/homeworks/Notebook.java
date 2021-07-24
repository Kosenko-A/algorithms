package ru.geekbrains.homeworks;

import java.util.Random;

public class Notebook {

    private int price;
    private int RAM;
    private String producer;
    private int p;

    String producer1 = "Lenuvo";
    String producer2 = "Asos";
    String producer3 = "MacNote";
    String producer4 = "Ecer";
    String producer5 = "Xamiou";

    public Notebook () {
        price = (5 + (byte)(Math.random() * ((10 - 5) + 1))) * 100;
        RAM = (1 + (byte)(Math.random() * ((3 - 1) + 1))) * 4;
        p = 1 + (byte)(Math.random() * ((5 - 1) + 1));
        switch (p){
            case 1 : producer = producer1;
            break;
            case 2 : producer = producer2;
            break;
            case 3 : producer = producer3;
            break;
            case 4 : producer = producer4;
            break;
            case 5 : producer = producer5;
            break;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getRAM() {
        return RAM;
    }

    public String getProducer() {
        return producer;
    }

    public int getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", RAM=" + RAM +
                ", producer='" + producer + '\'' +
                '}';
    }
}
