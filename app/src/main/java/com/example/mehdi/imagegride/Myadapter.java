package com.example.mehdi.imagegride;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Created by Mehdi on 16-06-23.
 */
public class Myadapter extends BaseAdapter {
    private Context currentContext;

    /*
    0 for jpg (default)
    1 for jpgOpt
    2 for png
     */
    private int imageBoot = 0;

    private int[] jpgImage = {R.drawable.jpg_bb,R.drawable.jpg_chrome,R.drawable.jpg_droid,R.drawable.jpg_droid_icon,
                                R.drawable.jpg_ffox, R.drawable.jpg_fos, R.drawable.jpg_hang, R.drawable.jpg_ios, R.drawable.jpg_opera, R.drawable.jpg_safari,
                                R.drawable.jpg_slack, R.drawable.jpg_windows};

    private int[] jpgOptImage = {R.drawable.jpgopt_bb,R.drawable.jpgopt_chrome,R.drawable.jpgopt_droid,R.drawable.jpgopt_droid_icon,
                                R.drawable.jpgopt_ffox,R.drawable.jpgopt_fos,R.drawable.jpgopt_hang,R.drawable.jpgopt_ios,R.drawable.jpgopt_opera,R.drawable.jpgopt_safari,
                                R.drawable.jpgopt_slack, R.drawable.jpgopt_windows};

    private int[] pngImage = {R.drawable.png_bb,R.drawable.png_chrome,R.drawable.png_droid,R.drawable.png_droid_icon,
                                R.drawable.png_ffox,R.drawable.png_fos,R.drawable.png_hang,R.drawable.png_ios,R.drawable.png_opera,R.drawable.png_safari,
                                R.drawable.png_slack,R.drawable.png_windows};

    public Myadapter (Context context, int load){

        imageBoot = load;
        currentContext = context;
    }

    public int[] imageFill(){
        //int a = (R.drawable.class).getFields().length;
        //Log.d("A length : ", "--" + a);
        return null;
    }

    @Override
    public int getCount() {
        return 12;
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
        ImageView imageLoad = new ImageView(currentContext);
        imageLoad.setLayoutParams(new GridView.LayoutParams(260, 290));
        switch (imageBoot){
            case 1: imageLoad.setImageResource(jpgOptImage[position]);
                break;
            case 2: imageLoad.setImageResource(pngImage[position]);
                break;
            default: imageLoad.setImageResource(jpgImage[position]);
                break;
        }
        return imageLoad;
    }
}
