package com.pratikcodes.codejava.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pratikcodes.codejava.MainActivity;
import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.models.TopicsModel;
import com.pratikcodes.codejava.topics.HelloworldActivity;
import com.pratikcodes.codejava.topics.IntroActivity;
import com.pratikcodes.codejava.topics.SetupActivity;

import java.util.ArrayList;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.viewHolder> {

    ArrayList<TopicsModel> list;
    Context context;

    public TopicsAdapter(ArrayList<TopicsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.design_topics,
                parent,
                false
             );



        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        TopicsModel model = list.get(position);

        holder.image.setImageResource(model.getImage());
        holder.text.setText(model.getName());

        holder.image.setOnClickListener(v -> {

            final Intent intent;
            switch (position){
                case 0:

                    intent =  new Intent(context, IntroActivity.class);
                    break;
                case 1:
                    intent = new Intent(context, SetupActivity.class);
                    break;
                case 2:
                    intent = new Intent(context, HelloworldActivity.class);
                    break;
                default:
                    intent = new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);

        });


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

            image = itemView.findViewById(R.id.TopicImage);
            text = itemView.findViewById(R.id.topicname);
        }

    }
}
