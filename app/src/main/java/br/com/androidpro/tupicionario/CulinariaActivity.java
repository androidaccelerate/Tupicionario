package br.com.androidpro.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CulinariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] culinariaArray = getResources().getStringArray(R.array.culinaria);
        String[] culinariaDesc = getResources().getStringArray(R.array.culinaria_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = culinariaArray[i];
            String desc = culinariaDesc[i];

            Item item = new Item(titulo, desc, R.drawable.ic_culinaria);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.culinaria_categoria);

        ListView listView = (ListView) findViewById(R.id.rootCulinaria);
        listView.setAdapter(adapter);
    }
}
