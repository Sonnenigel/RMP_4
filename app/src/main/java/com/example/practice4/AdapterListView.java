package com.example.practice4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListView extends ArrayAdapter<Velociraptor> {
    private LayoutInflater inflater;
    private int layout;
    private List<Velociraptor> items;
    public AdapterListView(Context context, int resource,
                           List<Velociraptor> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        View view = inflater.inflate(R.layout.item, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        Velociraptor velociraptor = items.get(position);
        textView.setText(velociraptor.getName());
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.velociraptor);
        return view;
    }
}
