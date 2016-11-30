package com.example.user1.testrecyclebaseadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user1 on 30.11.2016.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {

    Context myContext;
    LayoutInflater myInflater;
    ArrayList<MyObject> myObjectArrayList;

    MyRecycleViewAdapter(Context context, ArrayList<MyObject> myObjectArrayList) {
        this.myContext = context;
        this.myObjectArrayList = myObjectArrayList;
        myInflater = LayoutInflater.from(myContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.item_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyObject myObject = myObjectArrayList.get(position);

        holder.name.setText(myObject.getName());
        holder.surname.setText(myObject.getSurname());
        holder.check.setChecked(myObject.getCheck());
    }

    @Override
    public int getItemCount() {
        return myObjectArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView surname;
        CheckBox check;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textName);
            surname = (TextView) itemView.findViewById(R.id.textSurname);
            check = (CheckBox) itemView.findViewById(R.id.checkBox);
        }
    }
}
