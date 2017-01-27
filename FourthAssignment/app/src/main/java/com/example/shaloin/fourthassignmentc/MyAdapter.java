package com.example.shaloin.fourthassignmentc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by shaloin on 21/1/17.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;

    public Integer[] thumb={R.drawable.ginger,R.drawable.honey,R.drawable.ice,
            R.drawable.jelly,R.drawable.kit,R.drawable.lolli};
    public MyAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return thumb.length;
    }

    @Override
    public Object getItem(int position) {
        return thumb[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(thumb[position]);
        //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setLayoutParams(new GridView.LayoutParams(70,70));
        return imageView;
    }
}
