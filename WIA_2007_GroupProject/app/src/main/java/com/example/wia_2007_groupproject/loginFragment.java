package com.example.hungo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class loginFragment extends Fragment {

    private TextView log;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Initialize UI components
        log = view.findViewById(R.id.log);
        usernameEditText = view.findViewById(R.id.Username);
        passwordEditText = view.findViewById(R.id.PasswordButton);
        loginButton = view.findViewById(R.id.lgnBtn);

        // Set up button click listener
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "Please enter username and password", Toast.LENGTH_SHORT).show();
            } else {
                // Handle login logic here
                Toast.makeText(getActivity(), "Login clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
