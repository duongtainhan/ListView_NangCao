package com.example.duongtainhan555.listview_nangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class EatingAdapter extends ArrayAdapter<EatingItem>{

    public EatingAdapter(Context context, int resource, List<EatingItem> items) {
        super(context, resource, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.layout_eating, null);
        }
        EatingItem p = getItem(position);
        if (p != null) {
            ImageView img = view.findViewById(R.id.imgEating);
            img.setImageResource(p.getImage());
            TextView txtName = view.findViewById(R.id.txtName);
            txtName.setText(p.getName()+"");
            TextView txtPrice = view.findViewById(R.id.txtPrice);
            txtPrice.setText(p.getPrice()+"");
        }
        return view;
    }
}
