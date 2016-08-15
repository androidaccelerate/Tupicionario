package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] povosNativosArray = getResources().getStringArray(R.array.povos_nativos);
        List<String> povosNativosList = Arrays.asList(povosNativosArray);

        LinearLayout root = (LinearLayout) findViewById(R.id.rootPovosNativos);
        for (String povo : povosNativosList) {
            TextView textView = new TextView(this);
            textView.setText(povo);
            root.addView(textView);
        }
    }
}
