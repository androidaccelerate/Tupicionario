package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] povosNativosArray = getResources().getStringArray(R.array.povos_nativos);
        String[] povosNativosDesc = getResources().getStringArray(R.array.povos_nativos_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = povosNativosArray[i];
            String desc = povosNativosDesc[i];

            Item item = new Item(titulo, desc, R.drawable.ic_povos_nativos);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.povos_nativos_categoria);

        ListView listView = (ListView) findViewById(R.id.rootPovosNativos);
        listView.setAdapter(adapter);
    }
}
