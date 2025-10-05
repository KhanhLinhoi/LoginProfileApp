package com.example.loginprofileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvUsername_116, tvPassword_116, tvEmail_116;
    private ImageView imgSetting_116;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Ánh xạ views
        tvUsername_116 = findViewById(R.id.tvUsername_116);
        tvPassword_116 = findViewById(R.id.tvPassword_116);
        tvEmail_116 = findViewById(R.id.tvEmail_116);
        imgSetting_116 = findViewById(R.id.imgSetting_116);

        // Nhận dữ liệu từ MainActivity
        Intent intent_116 = getIntent();
        String username_116 = intent_116.getStringExtra("username");
        String password_116 = intent_116.getStringExtra("password");

        // Hiển thị thông tin
        tvUsername_116.setText("Username: " + username_116);
        tvPassword_116.setText("Password: " + password_116);
        tvEmail_116.setText("Email: " + username_116 + "@student.edu.vn");

        // Xử lý sự kiện click icon Setting
        imgSetting_116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về màn hình Login
                Intent backIntent_116 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(backIntent_116);
                finish(); // Đóng ProfileActivity
            }
        });
    }
}