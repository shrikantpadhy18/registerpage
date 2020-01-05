package com.example.createacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt,log;
    EditText name,email,pass1,pass2;
    RadioGroup  rge;
    RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bt=findViewById(R.id.btn);

         name= findViewById(R.id.ename);
         email= findViewById(R.id.emailfield);
         pass1= findViewById(R.id.pass1);
         pass2=findViewById(R.id.pass2);
         rge= findViewById(R.id.rg);
         int i=rge.getCheckedRadioButtonId();
         r1= rge.findViewById(i);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pass1.getText().toString().equals(pass2.getText().toString()) && pass2.getText().toString().length()>0) {

                    Toast.makeText(MainActivity.this, "Email=" + email.getText().toString() + "\nName=" + name.getText().toString() + "\nPassword=" + pass1.getText().toString(), Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(MainActivity.this,"Password Unmatched",Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
