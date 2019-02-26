package com.example.ravi.datatrasaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1= (TextView) findViewById(R.id.textView);
        Bundle b= getIntent().getExtras();
        String a= b.getString("name_key");
        String p= b.getString("phone_key");
        t1.setText(a+"\n"+p);
    }
}
