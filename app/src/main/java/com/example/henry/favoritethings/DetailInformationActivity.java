package com.example.henry.favoritethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailInformationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_information);

        ImageView informationImage = (ImageView) findViewById(R.id.informationImage);
        TextView animalhedline = (TextView) findViewById(R.id.animalheadline);
        TextView description = (TextView) findViewById(R.id.description);


        // Vilken djur ska visas upp

        Intent intent = getIntent();
        String animalToDisplay = intent.getStringExtra("animal");
        Toast.makeText(this, animalToDisplay, Toast.LENGTH_LONG).show();


        // Skapa ett zoo (Som i sin tur skapar djur)
        Zoo theZoo = new Zoo();

        // Hämta ut ett djur
        Animal animal = theZoo.getAnimals(animalToDisplay);

        if (animal != null)  {

            animalhedline.setText(animal.getName());

            // Ändra animal description
            description.setText(animal.getDescription());

            // ändra animal bild
            informationImage.setImageResource(animal.getImageId());




        }










    }
}
