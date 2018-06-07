package com.vernon.complexlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    CustomAdapter adapter;
    ArrayList<Items> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.complex_list);
        data = new ArrayList<Items>();
        Items user1 = new Items("Michael Vernon","Michaelvernon81@gmail.com",89000,R.drawable.img_1);
        Items user2 = new Items("Pie Alpha","Piealpha@gmail.com",201230,R.drawable.img_2);
        Items user3 = new Items("Tonnia Wawe","Tonniawawe1@gmail.com",51200,R.drawable.img_3);
        Items user4 = new Items("Tweezie Xris","Tweezie@gmail.com",76034,R.drawable.img_4);
        Items user5 = new Items("Lisa Anangwe","Lisaanash@gmail.com",98450,R.drawable.img_5);
        Items user6 = new Items("G.G Sax","Gsax@gmail.com",250567,R.drawable.img_6);
        Items user7 = new Items("Frank Nzenze","Frank@gmail.com",56780,R.drawable.img_7);
        Items user8 = new Items("Sheryl Maiya","Sheryl@gmail.com",78900,R.drawable.img_8);
        Items user9 = new Items("Vaal Unknown","Vaal81@gmail.com",2000,R.drawable.img_9);
        data.add(user1);
        data.add(user2);
        data.add(user3);
        data.add(user4);
        data.add(user5);
        data.add(user6);
        data.add(user7);
        data.add(user8);
        data.add(user9);
        adapter = new CustomAdapter(this,data);
        list.setAdapter(adapter);
    }
}
