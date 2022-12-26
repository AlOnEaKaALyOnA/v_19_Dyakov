package com.example.v_19_dyakov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity2.this, MainActivity.class);
                MainActivity2.this.startActivity(a);
            }
        });
        ImageView poisk = findViewById(R.id.poisk);
        poisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity2.this, MainActivity3.class);
                MainActivity2.this.startActivity(z);
            }
        });
        Button Per_Maps = findViewById(R.id.Per_Maps);
        Per_Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://2gis.ru/novosibirsk"));
                MainActivity2.this.startActivity(maps);
            }
        });
    }
}