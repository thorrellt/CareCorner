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

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseListener;

import org.json.JSONObject;

import okhttp3.Response;

public class SafeWalkMenuActivity extends AppCompatActivity {
    Button btnStartWalk;
    EditText destinationEntryBox, etaEntryBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safe_walk_menu_activity);
        initViews();

        btnStartWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String journeyUrl = CareCornerApplication.getApiRoute("journey");

                String location = destinationEntryBox.getText().toString();
                String eta = etaEntryBox.getText().toString();
                JSONObject destination = new JSONObject();
                try {
                    String userId = CareCornerApplication.getSession().getUserId();
                    destination.put("user-id", userId);
                    destination.put("event", "begin");
                    destination.put("location", location);
                    destination.put("eta", eta);
                } catch(Exception error) {
                    Log.e("Login:", "Issue creating credentaion Json");
                }

                AndroidNetworking.post(journeyUrl)
                        .addHeaders("Content-Type", "application/json")
                        .addJSONObjectBody(destination)
                        .build()
                        .getAsOkHttpResponse(new OkHttpResponseListener() {
                            @Override
                            public void onResponse(Response response) {
                                if (response.isSuccessful()) {
                                    // successful login
//                                    startActivity(intent);
                                } else {
                                    // unsuccessful login
                                    //                                   Toast.makeText(LoginActivity.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                                }
                            }

                            @Override
                            public void onError(ANError error) {
                                Log.e("Issue with Connection:", error.getResponse().toString());
                            }
                        });
            }
        });

    }

    private void initViews() {
        btnStartWalk = findViewById(R.id.btnStartWalk);
        destinationEntryBox = findViewById(R.id.destinationEntryBox);
        etaEntryBox = findViewById(R.id.etaEntryBox);
    }

    /**
     * Overrides the Back Button functionality to return to the welcome screen.
     */
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = new Intent(SafeWalkMenuActivity.this, MainMenuActivity.class);
        startActivity(intent);
    }
}