package com.discitex.nurtaniomobile.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.discitex.nurtaniomobile.R;
import com.discitex.nurtaniomobile.model.Data;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> lists;

    public Adapter(Activity activity, List<Data> lists){
        this.activity = activity;
        this.lists = lists;
    }
    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (inflater == null){
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null && inflater != null){
            view = inflater.inflate(R.layout.list_user, null);
        }
        if (view != null) {
            TextView name = view.findViewById(R.id.text_name);
            TextView email = view.findViewById(R.id.text_email);
            Data data = lists.get(position);
            name.setText(data.getName());
            email.setText(data.getEmail());
        }
        return view;
    }
}
