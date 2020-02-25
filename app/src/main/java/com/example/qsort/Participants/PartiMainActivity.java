package com.example.qsort.Participants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.qsort.R;

public class PartiMainActivity extends AppCompatActivity {

    TextView labelTextView;
    String categories, labels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parti_main);

        labelTextView = findViewById(R.id.partiLabel);

        Intent intent = getIntent();

        categories = intent.getExtras().getString("Categories");
        labels = intent.getExtras().getString("Labels");

        labelTextView.setText(labels);

    }


}
