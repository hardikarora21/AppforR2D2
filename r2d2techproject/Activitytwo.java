package com.example.r2d2techproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activitytwo extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        EditText e1;
        Button b2;
        e1=findViewById(R.id.e1);

        s=e1.getText().toString();
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b=new Bundle();
                b.putString("key",s);
                Intent i2=new Intent(getApplicationContext(),web.class);
                i2.putExtras(b);
                startActivity(i2);

            }
        });

    }
}
