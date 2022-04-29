package com.kosmo.a32tabbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment4 extends Fragment {

    private static final String TAG = "kosmo123";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_4, container, false);

        Button button = rootView.findViewById(R.id.button4);
        button.setOnClickListener(v -> {
            Log.d(TAG, "Fragment4");
        });

        return rootView;
    }
}