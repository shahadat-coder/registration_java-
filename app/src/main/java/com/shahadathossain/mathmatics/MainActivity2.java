package com.shahadathossain.mathmatics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);


        sharedPreferences = getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);

        String nan = sharedPreferences.getString("name","");
        String email = sharedPreferences.getString("email","");
        String voter = sharedPreferences.getString("voter","");
        String passport = sharedPreferences.getString("passport","");
        String student = sharedPreferences.getString("student","");


        textView.setText("\n name= "+nan+"\n email ="+email+"\n voter ="+voter+"\n passport ="+passport+
                "\n student="+student);














    }
}