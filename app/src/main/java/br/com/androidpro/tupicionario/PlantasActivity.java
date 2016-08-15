package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class PlantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        String[] plantasArray = getResources().getStringArray(R.array.plantas);
        List<String> plantasList = Arrays.asList(plantasArray);
    }
}
