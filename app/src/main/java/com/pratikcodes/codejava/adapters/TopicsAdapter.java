package com.pratikcodes.codejava.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.SweepGradient;
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
import com.pratikcodes.codejava.topics.ArrayActivity;
import com.pratikcodes.codejava.topics.ClassesActivity;
import com.pratikcodes.codejava.topics.DatatypesActivity;
import com.pratikcodes.codejava.topics.HelloworldActivity;
import com.pratikcodes.codejava.topics.IOActivity;
import com.pratikcodes.codejava.topics.IfElseActivity;
import com.pratikcodes.codejava.topics.IntroActivity;
import com.pratikcodes.codejava.topics.LoopActivity;
import com.pratikcodes.codejava.topics.OperatorsActivity;
import com.pratikcodes.codejava.topics.SetupActivity;
import com.pratikcodes.codejava.topics.SwitchActivity;

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
                case 3:
                    intent = new Intent(context, DatatypesActivity.class);
                    break;
                case 4:
                    intent = new Intent(context, OperatorsActivity.class);
                    break;
                case 5:
                    intent = new Intent(context, ArrayActivity.class);
                    break;
                case 6:
                    intent = new Intent(context, IOActivity.class);
                    break;
                case 7:
                    intent = new Intent(context, IfElseActivity.class);
                    break;
                case 8:
                    intent = new Intent(context, SwitchActivity.class);
                    break;
                case 9:
                    intent = new Intent(context, LoopActivity.class);
                    break;
                case 10:
                    intent = new Intent(context, ClassesActivity.class);
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

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;
        public viewHolder(@NonNull View itemView) {

            super(itemView);

            image = itemView.findViewById(R.id.TopicImage);
            text = itemView.findViewById(R.id.topicname);
        }

    }
}
