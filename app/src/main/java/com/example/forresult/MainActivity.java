package com.example.forresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final int REQ_NO = 32957;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button productList = findViewById(R.id.button);
        productList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ProductList.class);
                startActivityForResult(intent , REQ_NO);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setViews();
                    }
                }, 2000);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void setViews(){
        RecyclerView recyclerView = findViewById(R.id.recycle_container);
        ProdactAdapter adapter = new ProdactAdapter(false, DataManager.getProductMap().keySet().toArray(new String[0]));
        recyclerView.setLayoutManager(new LinearLayoutManager(this , RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);
    }
}
