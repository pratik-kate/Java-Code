package com.pratikcodes.codejava.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pratikcodes.codejava.R;


public class AboutFragment extends Fragment {

    Button btn;
    TextView web;
    public AboutFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        btn = view.findViewById(R.id.btncontact);
        web = view.findViewById(R.id.web);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:?subject="+""+ "&body="+""+"&to="+"codes.pratik@gmail.com");
                mail.setData(data);
                startActivity(Intent.createChooser(mail,"Send Email to us.."));
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pratik-softwares.business.site/"));
                startActivity(browserIntent);
            }
        });

        return view;
    }
}