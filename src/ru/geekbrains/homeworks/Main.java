package ru.geekbrains.homeworks;


public class Main {

    public static void main(String[] args) {

        Notebook [] notebooks = new Notebook[5000];

        for (int i = 0; i < 5000; i++) {
            notebooks [i] = new Notebook();
        }

        sort(notebooks);
        for (int i = 0; i < 5000; i++ ) {
            System.out.println(notebooks[i].toString());
        }

    }

    public static Notebook[] sort (Notebook[] notebooks) {
        int gap = notebooks.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int)(gap / 1.25);
            int i = 0;
            swapped = false;
            while (i + gap < notebooks.length) {
                if (notebooks[i].getPrice() > notebooks[i + gap].getPrice()) {
                    Notebook t = notebooks[i];
                    notebooks[i] = notebooks[i + gap];
                    notebooks[i + gap] = t;
                    swapped = true;
                } else if (notebooks[i].getPrice() == notebooks[i + gap].getPrice()) {
                    if (notebooks[i].getRAM() > notebooks[i + gap].getRAM()) {
                        Notebook t = notebooks[i];
                        notebooks[i] = notebooks[i + gap];
                        notebooks[i + gap] = t;
                        swapped = true;
                    } else if (notebooks[i].getRAM() == notebooks[i + gap].getRAM()) {
                        if (notebooks[i].getP() > notebooks[i + gap].getP()) {
                            Notebook t = notebooks[i];
                            notebooks[i] = notebooks[i + gap];
                            notebooks[i + gap] = t;
                            swapped = true;
                        }
                    }
                }
                i++;
            }
        }
        return notebooks;
    }
}

