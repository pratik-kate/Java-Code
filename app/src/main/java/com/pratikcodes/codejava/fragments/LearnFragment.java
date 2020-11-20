package com.pratikcodes.codejava.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.adapters.ProgramsAdapter;
import com.pratikcodes.codejava.adapters.TopicsAdapter;
import com.pratikcodes.codejava.models.ProgramsModel;
import com.pratikcodes.codejava.models.TopicsModel;

import java.util.ArrayList;

public class LearnFragment extends Fragment {

    RecyclerView topics,programs;
    public LearnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_learn, container, false);


        topics = view.findViewById(R.id.listTopics);
        programs = view.findViewById(R.id.listPrograms);
        ArrayList<TopicsModel> list = new ArrayList<>();

        list.add(new TopicsModel(R.drawable.java,"topic1"));
        list.add(new TopicsModel(R.drawable.java,"topic1"));
        list.add(new TopicsModel(R.drawable.java,"topic1"));
        list.add(new TopicsModel(R.drawable.java,"topic1"));
        list.add(new TopicsModel(R.drawable.java,"topic1"));


        TopicsAdapter adapter = new TopicsAdapter(list,getContext());
        topics.setAdapter(adapter);

        LinearLayoutManager layout = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
       topics.setLayoutManager(layout);


        ArrayList<ProgramsModel> list2 = new ArrayList<>();

        list2.add(new ProgramsModel(R.drawable.java,"program1"));
        list2.add(new ProgramsModel(R.drawable.java,"program"));
        list2.add(new ProgramsModel(R.drawable.java,"program"));
        list2.add(new ProgramsModel(R.drawable.java,"program"));
        list2.add(new ProgramsModel(R.drawable.java,"program"));


        ProgramsAdapter adapter1 = new ProgramsAdapter(list2,getContext());
        programs.setAdapter(adapter1);

        LinearLayoutManager layout1 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        programs.setLayoutManager(layout1);


        return view;
    }
}