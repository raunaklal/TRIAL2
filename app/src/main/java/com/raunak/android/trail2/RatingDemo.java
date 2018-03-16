package com.raunak.android.trail2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingDemo extends AppCompatActivity {

    RatingBar rb;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_demo);
        rb=findViewById(R.id.rb);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=String.valueOf(rb.getRating());
                Toast.makeText(getApplicationContext(),""+s,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Thank you for rating us",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
