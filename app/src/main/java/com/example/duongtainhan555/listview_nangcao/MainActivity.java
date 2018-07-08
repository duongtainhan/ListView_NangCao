package com.example.duongtainhan555.listview_nangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<EatingItem> arrayEating;
    private EatingAdapter eatingAdapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        listView = findViewById(R.id.listView);
        arrayEating = new ArrayList<>();
        //
        arrayEating.add(new EatingItem("Bit tet",50000,R.drawable.ic_bittet));
        arrayEating.add(new EatingItem("Com chien",30000,R.drawable.ic_comchien));
        arrayEating.add(new EatingItem("Kim chi",20000,R.drawable.ic_kimchi));
        arrayEating.add(new EatingItem("Mi tuong den",20000,R.drawable.ic_mituongden));
        arrayEating.add(new EatingItem("Sushi",60000,R.drawable.ic_sushi));
        eatingAdapter = new EatingAdapter(MainActivity.this,R.layout.layout_eating,arrayEating);
        listView.setAdapter(eatingAdapter);
    }
}
