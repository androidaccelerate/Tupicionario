package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BichosActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);

        String[] bichosArray = getResources().getStringArray(R.array.bichos);
        String[] bichosDescArray = getResources().getStringArray(R.array.bichos_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = bichosArray[i];
            String desc = bichosDescArray[i];

            Item item = new Item(titulo, desc, R.drawable.ic_bichos);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.bichos_categoria);

        ListView listView = (ListView) findViewById(R.id.rootBichos);
        listView.setAdapter(adapter);
    }
}
