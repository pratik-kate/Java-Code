package com.pratikcodes.codejava.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.models.ProgramsModel;


import java.util.ArrayList;

public class ProgramsAdapter extends RecyclerView.Adapter<ProgramsAdapter.viewHolder> {

    ArrayList<ProgramsModel> list;
    Context context;

    public ProgramsAdapter(ArrayList<ProgramsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.design_programs,
                parent,
                false
        );



        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ProgramsModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;
        public viewHolder(@NonNull View itemView) {

            super(itemView);

            image = itemView.findViewById(R.id.programImage);
            text = itemView.findViewById(R.id.ProgramName);
        }

    }
}
