package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        getIntent().getExtras().get("city");
        String cityName = "";

        cityName = getIntent().getExtras().get("city").toString();

        ((TextView)findViewById(R.id.textView)).setText(cityName);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowActivity.this, MainActivity.class);
                intent.putStringArrayListExtra("cities", getIntent().getStringArrayListExtra("cities"));
                startActivity(intent);
            }
        });
    }
}
