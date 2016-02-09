package com.example.henry.favoritethings;

import java.util.ArrayList;

/**
 * Created by henry on 2016-02-03.
 */
public class Zoo {

    // Instans variabler
    private ArrayList<Animal> animals = new ArrayList<>();





    // Klassvariabler
    // konstruktorer
    // Instansmetoder
    // Klassmetoder


    public Zoo () {


        Animal panda = new Animal(R.drawable.panda, "Panda", "En Panda äter bambu");
        Animal redPanda = new Animal(R.drawable.redpanda, "Red Panda", "Red Panda ser mer ut som en räv");
        Animal fox = new Animal(R.drawable.rev, "Fox", "Vad säger räven? Ingen vet...");
        Animal elk = new Animal(R.drawable.elk, "Elk", "Älgen bor i Svenska skogen.");


        animals.add(panda);         // Index = 1
        animals.add(redPanda);
        animals.add(fox);
        animals.add(elk);
    }

        // Instansmetoder

        public Animal getAnimals(String whichAnimal) {
        int index = -1;

        // Hur kan vi hämta ett djur?

        switch (whichAnimal) {
            case "panda": index = 0;
                break;

            case "red Panda": index = 1;
                break;

            case "Fox": index = 2;
                break;

            case "Elk": index = 3;
                break;

        }

        if (index == -1) {

            return null;

        } else {

            return animals.get(index);
        }






    }

}
