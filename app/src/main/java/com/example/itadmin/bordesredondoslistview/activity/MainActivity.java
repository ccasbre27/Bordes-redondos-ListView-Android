package com.example.itadmin.bordesredondoslistview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.itadmin.bordesredondoslistview.R;
import com.example.itadmin.bordesredondoslistview.adapter.OptionAdapter;
import com.example.itadmin.bordesredondoslistview.model.Option;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Option> optionsCollection = new ArrayList<Option>();

        // se agregan objetos al arraylist
        for (int i = 0; i < 10; i++) {
            optionsCollection.add(new Option("Título #" + i,R.drawable.option));
        }

        // se crea el adapter para convertir los objetos en vistas
        OptionAdapter adapter = new OptionAdapter(this, optionsCollection);

        // obtenemos el listview
        ListView listView = (ListView) findViewById(R.id.lstvOptionsList);

        // se establece el adapter
        listView.setAdapter(adapter);

    }
}
