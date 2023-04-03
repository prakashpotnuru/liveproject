package com.suneel.apicalling.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.suneel.apicalling.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email, password;
    Button login;
    TextView registerlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        email =findViewById(R.id.etemail);
        password = findViewById(R.id.etpassword);
        login = findViewById(R.id.Loginbtn);
        registerlink = findViewById(R.id.Registerlink);
        registerlink.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Loginbtn:
                startActivity(new Intent( LoginActivity.this, HomeActivity.class));
                break;
            case R.id.Registerlink:
                switchOnRegister();
        }

    }

    private void switchOnRegister() {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }
}
