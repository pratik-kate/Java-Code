package com.pratikcodes.codejava.fragments;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pratikcodes.codejava.R;

import java.io.File;


public class ShareFragment extends Fragment {


    public ShareFragment() {
        // Required empty public constructor
    }

    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_share, container, false);
//        btn = view.findViewById(R.id.button);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.putExtra(Intent.EXTRA_TEXT, " text");
//                intent.setType("text/plain");
//                startActivity(Intent.createChooser(intent, "SHARE APP USING"));
//            }
//        });

        return view;
    }


}