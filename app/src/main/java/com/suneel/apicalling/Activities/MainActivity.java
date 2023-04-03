package com.suneel.apicalling.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.suneel.apicalling.ModelResponse.Api;
import com.suneel.apicalling.ModelResponse.ClassRRes;
import com.suneel.apicalling.ModelResponse.ResRegistration;
import com.suneel.apicalling.ModelResponse.RetrofitClient;
import com.suneel.apicalling.R;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Loginlink;
    EditText name,email,password;
    Button register;
    private ProgressBar loadingPB;
    Api apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RetrofitClient retrofitClient=new RetrofitClient();
        apiInterface = retrofitClient.getMyApi();

        name = findViewById(R.id.etname);
        email = findViewById(R.id.etemail);
        password=findViewById(R.id.etpassword);
        register=findViewById(R.id.registerbtn);
        Loginlink=findViewById(R.id.Loginlink);
        loadingPB = findViewById(R.id.idLoadingPB);
        Loginlink.setOnClickListener(this);
        register.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.registerbtn:
                Toast.makeText(this,"register",Toast.LENGTH_SHORT).show();
                registerUser(name.getText().toString(),email.getText().toString(), (password.getText().toString()));
                break;
            case R.id.Loginlink:
                switchOnLogin();
                break;
        }


    }

    private void registerUser(String name, String email, String password) {
        loadingPB.setVisibility(View.VISIBLE);
        Call<ClassRRes> call1 = apiInterface.register("Developserss","dsesvsk@gmail.com","54552");
        call1.enqueue(new Callback<ClassRRes>() {
            @Override
            public void onResponse(Call<ClassRRes> call, Response<ClassRRes> response) {
                loadingPB.setVisibility(View.GONE);
                Log.d("Resposne", "=1=" + response);
                Log.d("Resposne","req"+call.request());
                if (response==null){
                    Log.d("Resposne", "=2=" + response);

                }else {
                    Log.d("Resposne", "=3=" + response.errorBody());

                }
                if(response.isSuccessful()) {
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK );
                    startActivity(intent);
//                    Log.d("Resposne", "==" + response.body().getMessage());
//                    Log.d("Resposne", "==" + response.body().getData());
//                    Log.d("Resposne", "==" + response.body().getData().getEmail());
                    Toast.makeText(MainActivity.this, "Su=="+response, Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Failurre=="+response, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ClassRRes> call, Throwable t) {
                loadingPB.setVisibility(View.GONE);
            Log.e("Resposne error","=="+t.getMessage());
            }
        });



    }

    public void switchOnLogin() {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }
}