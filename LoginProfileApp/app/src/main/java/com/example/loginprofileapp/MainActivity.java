package com.example.loginprofileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername_116, edtPassword_116;
    private Button btnLogin_116;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ views
        edtUsername_116 = findViewById(R.id.edtUsername_116);
        edtPassword_116 = findViewById(R.id.edtPassword_116);
        btnLogin_116 = findViewById(R.id.btnLogin_116);

        // Xử lý sự kiện click button Login
        btnLogin_116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username_116 = edtUsername_116.getText().toString().trim();
                String password_116 = edtPassword_116.getText().toString().trim();

                // Kiểm tra đơn giản
                if (username_116.isEmpty() || password_116.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                } else {
                    // Chuyển sang ProfileActivity và truyền dữ liệu
                    Intent intent_116 = new Intent(MainActivity.this, ProfileActivity.class);
                    intent_116.putExtra("username", username_116);
                    intent_116.putExtra("password", password_116);
                    startActivity(intent_116);
                }
            }
        });
    }
}