    package com.example.henry.favoritethings;

    import java.lang.annotation.AnnotationTypeMismatchException;

    /**
     * Created by henry on 2016-02-02.
     */
    public class Animal {

        // Instansvariabler
        // bild på djuret

        // ID i XML:
        // @drawable/image_of_panda


        // ID i Java
        // R.drawable.image_of_panda

        private int imageId;
        private String name;
        private String description;
      // Klasvariabler
      // Konstruktorer

        public Animal(int i, String s) {
            // kod för ett "Standar djur"

        }

        public Animal (int imageId, String name, String description) {

            this.imageId = imageId;
            this.name = name;
            this.description = description;

        }

        //Instansmetoder

        public String getDescription() {
            return description;
        }

        public int getImageId() {

            return imageId;
        }

        public String getName() {

            return name;
        }

    }
