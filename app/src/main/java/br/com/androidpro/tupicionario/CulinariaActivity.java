package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class CulinariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] culinariaArray = getResources().getStringArray(R.array.culinaria);
        List<String> culinariaList = Arrays.asList(culinariaArray);

        LinearLayout root = (LinearLayout) findViewById(R.id.rootCulinaria);
        for (String culinaria : culinariaList) {
            TextView textView = new TextView(this);
            textView.setText(culinaria);
            root.addView(textView);
        }
    }
}
