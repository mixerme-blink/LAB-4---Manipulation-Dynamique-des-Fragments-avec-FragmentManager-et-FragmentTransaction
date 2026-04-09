package com.example.fragmentslab;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    private static final String TAG = "FragmentOne";
    private TextView tv;
    private Button btnHello;

    public FragmentOne() {
        // constructeur vide obligatoire
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflation explicite du layout — remplace super(R.layout.fragment_one)
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv       = view.findViewById(R.id.textOne);
        btnHello = view.findViewById(R.id.btnHello);

        btnHello.setOnClickListener(v ->
                tv.setText("Bonjour depuis Fragment 1 !")
        );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }
}