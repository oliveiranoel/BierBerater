package io.vsia.bierberater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    Spinner colors;
    TextView brands;
    BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        //Casting not necessary
        colors = findViewById(R.id.spinner);
        brands = findViewById(R.id.textView);
    }

    public void onButtonClicked(View view) {
        String beerType = String.valueOf(colors.getSelectedItem());

        List<String> brandsList = expert.getBrand(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        brands.setText(brandsFormatted);
    }
}
