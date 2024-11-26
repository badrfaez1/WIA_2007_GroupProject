package com.example.hungo;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class homeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState); // Ensures proper initialization

        // Set up navigation to the Sign-Up fragment
        Button signUpButton = view.findViewById(R.id.SignUpBtn);
        signUpButton.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.NextToSignUp)
        );

        // Set up navigation to the Login fragment
        Button loginButton = view.findViewById(R.id.LoginBtn);
        loginButton.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.NexttoLogin)
        );
    }
}
