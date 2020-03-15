package com.example.forresult;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

public class ProductList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        DataManager.clearData();
        RecyclerView recyclerView = findViewById(R.id.list);
        ProdactAdapter adapter = new ProdactAdapter(true , DataManager.getProductMap().keySet().toArray(new String[0]));
        recyclerView.setLayoutManager(new LinearLayoutManager(this , RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);
        Button finished = findViewById(R.id.button);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
    }
}
