package com.shahadathossain.mathmatics;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edName,edEmail,edVoter,edPassport,edStudent;
    Button ButtonSave,ButtonGo;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edVoter =findViewById(R.id.edVoter);
        edPassport = findViewById(R.id.edPassport);
        edStudent = findViewById(R.id.edStudent);
        ButtonSave = findViewById(R.id.ButtonSave);
        ButtonGo = findViewById(R.id.ButtonGo);

        sharedPreferences = getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);
        editor = sharedPreferences.edit();

        ButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edName.length()>0&&edEmail.length()>0&&edVoter.length()>0&&edPassport.length()>0&&
                        edStudent.length()>0){



                    String name = edName.getText().toString();
                    String email =edEmail.getText().toString();
                    String voter =edVoter.getText().toString();
                    String passport =edPassport.getText().toString();
                    String student =edStudent.getText().toString();

                    editor.putString("name",""+name);
                    editor.putString("email",""+email);
                    editor.putString("voter",""+voter);
                    editor.putString("passport",""+passport);
                    editor.putString("student",""+student);
                    editor.apply();

                }else {
                    edName.setError("empty");
                    edEmail.setError("empty");
                    edVoter.setError("empty");
                    edPassport.setError("empty");
                    edStudent.setError("empty");
                }






            }
        });

        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent myIntent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(myIntent);













            }
        });












    }
}