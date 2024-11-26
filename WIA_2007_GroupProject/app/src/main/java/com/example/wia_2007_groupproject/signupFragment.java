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

public class signupFragment extends Fragment {

    private TextView signUpTextView;
    private EditText nameEditText;
    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button submitButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        // Initialize UI components
        signUpTextView = view.findViewById(R.id.SignUP);
        nameEditText = view.findViewById(R.id.NameBtn);
        usernameEditText = view.findViewById(R.id.UsernameBtn);
        emailEditText = view.findViewById(R.id.EmailAddressBtn);
        passwordEditText = view.findViewById(R.id.PasswordBtn);
        submitButton = view.findViewById(R.id.SubmitBtn);

        // Set up button click listener
        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString().trim();
            String username = usernameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "All fields are required!", Toast.LENGTH_SHORT).show();
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(getActivity(), "Enter a valid email address!", Toast.LENGTH_SHORT).show();
            } else {
                // Handle signup logic here
                Toast.makeText(getActivity(), "Sign up successful!", Toast.LENGTH_SHORT).show();
                // Navigate or perform other actions after successful signup
            }
        });

        return view;
    }
}
