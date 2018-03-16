package com.raunak.android.trail2;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed()
    {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            builder = new AlertDialog.Builder(MainActivity.this);
        }
        else
        {
            builder = new AlertDialog.Builder(MainActivity.this, AlertDialog.BUTTON_NEUTRAL);
        }
        builder.setTitle("Thank You");
        builder.setMessage("Thank You For Using Our Application Please Give Us Your Suggestions and Feedback ");
        builder.setNegativeButton("RATE US",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        Intent intent = new Intent(MainActivity.this,RatingDemo.class);
                        startActivity(intent);
                    }
                });
        builder.setPositiveButton("QUIT",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,
                                        int which)
                    {
                        finish();
                    }
                });

        builder.show();
    }
}
