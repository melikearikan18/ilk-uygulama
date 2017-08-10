package com.kodlab.buton_tasarimi;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface font=Typeface.createFromAsset(getAssets(),"fonts/GLARESOME Bold.otf");
        TextView tv= (TextView) findViewById(R.id.textView);
        tv.setTypeface(font);
    }
}
