package com.example.mehdi.imagegride;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by antonin on 16-06-23.
 */
public class Myadapter extends BaseAdapter {
    Context currentcontext;

    public Myadapter (Context context){
        currentcontext = context;
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img;
        img = new ImageView(currentcontext);
        img.setLayoutParams(new GridView.LayoutParams(250, 250));
        img.setImageResource(R.drawable.jpg_chrome);
        return img;
    }
}
