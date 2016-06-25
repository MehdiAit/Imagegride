package com.example.mehdi.imagegride;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView imgGride = (GridView) findViewById(R.id.gridview);
        imgGride.setAdapter(new Myadapter(this, 1));

        imgGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Toast imgToast = new Toast(MainActivity.this);
                ImageView myImage = new ImageView(MainActivity.this);

                ImageView imgTmp = (ImageView) view;
                Drawable myDrawable = imgTmp.getDrawable();

                myImage.setImageDrawable(myDrawable);
                imgToast.setView(myImage);
                imgToast.setGravity(Gravity.FILL, 0, 0);
                imgToast.show();
            }
        });
    }
}
