package com.example.duongtainhan555.listview_nangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EatingAdapter extends BaseAdapter{

    Context context;
    int layout;
    ArrayList<EatingItem> arrayEating;


    public EatingAdapter(Context context, int layout, ArrayList<EatingItem> arrayEating) {
        this.context = context;
        this.layout = layout;
        this.arrayEating = arrayEating;
    }

    @Override
    public int getCount() {
        return arrayEating.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayEating.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.layout_eating);
        }
        //EatingItem e = getItem(i);
        if(e != null)
        {
            TextView img = view.findViewById(R.id.imgEating);
            TextView txtName = view.findViewById(R.id.txtName);
            TextView txtPrice = view.findViewById(R.id.txtPrice);
        }
        return view;
    }
}
