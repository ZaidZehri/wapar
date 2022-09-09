package com.example.wapar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button btnCreateAccount;
    private EditText etUsernameInput, etPhoneInput, etPasswordInput;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnCreateAccount = (Button) findViewById(R.id.btnCreateAccount);
        etUsernameInput = (EditText) findViewById(R.id.etRegisterUsernameInput);
        etPhoneInput = (EditText) findViewById(R.id.etRegisterPhoneInput);
        etPasswordInput = (EditText) findViewById(R.id.etRegisterPasswordInput);
        loadingBar = new ProgressDialog(this);

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateAccount();
            }
        });
    }

    private void CreateAccount() {
        String name = etUsernameInput.getText().toString();
        String phone = etPhoneInput.getText().toString();
        String password = etPasswordInput.getText().toString();

        if(TextUtils.isEmpty(name))
        {
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(phone))
        {
            Toast.makeText(this, "Please Enter Your Phone Number", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait while we are checking the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();


        }
    }
}