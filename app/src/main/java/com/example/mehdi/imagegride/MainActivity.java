package com.example.mehdi.imagegride;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        imgGride.setAdapter(new Myadapter(this, ""));

        imgGride.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Toast tst = new Toast(MainActivity.this);
                ImageView test = new ImageView(MainActivity.this);

                ImageView img = (ImageView) view;
                Drawable myDrawable = img.getDrawable();

                test.setImageDrawable(myDrawable);
                tst.setView(test);
                tst.setGravity(Gravity.FILL, 0, 0);
                tst.show();
            }
        });
    }
}
