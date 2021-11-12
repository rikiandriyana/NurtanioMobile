package com.discitex.nurtaniomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.discitex.nurtaniomobile.databinding.ActivityBottomNavigationBinding;

public class BottomNavigationActivity extends AppCompatActivity {

    private Button startButton;
//    private ActivityBottomNavigationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

//        binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_news, R.id.navigation_statistic, R.id.navigation_schedule, R.id.navigation_profile)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_bottom_navigation);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);


        startButton = findViewById(R.id.btn_start);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BottomNavigationActivity.this, ViewActivity.class);
                startActivity(intent);
            }
        });
    }

}