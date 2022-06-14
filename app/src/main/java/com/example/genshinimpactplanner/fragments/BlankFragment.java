package com.example.genshinimpactplanner.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.genshinimpactplanner.R;
import com.example.genshinimpactplanner.fragments.classes.Hero;

public class BlankFragment extends Fragment {

    Hero hero;
    ControllerInterface fragmentController;

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        fragmentController = (ControllerInterface) context;
    }

    interface ControllerInterface {
        void setHero(Hero hero);
    }
}