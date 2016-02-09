package com.example.henry.favoritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ListOfAnimals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);

    }

    // vad som händer när man klickar på explore knappen
    public  void exploreAnimal(View view) {

        // Vilken knapp klickade vi på??
        String tag = (String) view.getTag();


        Toast.makeText(this,"Knappens tag är " + tag, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, DetailInformationActivity.class);
        intent.putExtra("animal", tag);

        startActivity(intent);

    }



    public void shareInformation(View view) {
// Visa upp en "Toast" med att vi klickat på knappen...
        Toast.makeText(this, "Klickade på knappen!", Toast.LENGTH_LONG).show();

        // Skapa en implicit intent
        // D.v.s. skicka information som kan tas emot av en annan app
        Intent intent = new Intent();
        // Vad vill vi göra? Skicka text
        intent.setAction(Intent.ACTION_SEND);
        // Vilken text vill vi skicka?
        intent.putExtra(Intent.EXTRA_TEXT, "Red Panda är en björn");
        // Vad är det för något vi skickar?
        intent.setType("text/plain");

        // Skicka!
        //startActivity(intent);


        //skicka!

        Zoo myZoo = new Zoo();
        Animal elk = myZoo.getAnimals("elk");

        if (elk != null) {

            String elkName = elk.getName();
            Toast.makeText(this, "Älg heter" + elkName, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "jgggj bla bla bla", Toast.LENGTH_SHORT).show();

        }


    }


}
