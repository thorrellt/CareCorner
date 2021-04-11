package com.carecorner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.carecorner.util.NetworkConnection;


public class LoginActivity extends AppCompatActivity {

    Button btnLogin, btnRegister, BtnForgotUsername, BtnForgotPassword;
    EditText usernameEntryBox, passwordEntryBox;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        initViews();
        Intent intent = new Intent(LoginActivity.this, MainMenuActivity.class);
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidNetworking.get("http://localstack:4566/api/resources")
                        .build()
                        .getAsJSONArray(new JSONArrayRequestListener() {
                            @Override
                            public void onResponse(JSONArray response) {
                                Log.d("NETWORK", "GooooOGooo");
                                Log.e("Made it to resources", "Habbab");
                            }

                            @Override
                            public void onError(ANError error) {
                                Log.e("Made it", error.getErrorDetail());
                            }
                        });
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        BtnForgotUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotUsernameActivity.class);
                startActivity(intent);
            }
        });
        BtnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initViews() {
        btnLogin = findViewById(R.id.btnLogin);
        usernameEntryBox = findViewById(R.id.usernameEntryBox);
        passwordEntryBox = findViewById(R.id.passwordEntryBox);
        btnRegister = findViewById(R.id.btnRegister);
        BtnForgotUsername = findViewById(R.id.btnForgotUsername);
        BtnForgotPassword = findViewById(R.id.btnForgotPassword);
    }

    /**
     * Overrides the Back Button functionality to return to the welcome screen.
     */
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
}