package com.example.popin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MyTicketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_tickets);

        View exploreContainer = findViewById(R.id.bottomNav).findViewById(R.id.nav_explore_container);
        exploreContainer.setOnClickListener(v -> {
            Intent intent = new Intent(MyTicketsActivity.this, EventsPageActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
