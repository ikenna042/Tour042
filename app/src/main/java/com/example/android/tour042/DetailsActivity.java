package com.example.android.tour042;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    TextView tvTitle;
    TextView tvDesc;
    ImageView imgv;

    String titleStr,descStr;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_view);


        Bundle intentBundle = getIntent().getExtras();

        titleStr = intentBundle.getString("keyTitle");
        descStr = intentBundle.getString("keyDesc");
        img = intentBundle.getInt("keyImageResId");

        tvTitle = findViewById(R.id.header_text_view);
        tvDesc = findViewById(R.id.body_text_view);
        imgv = findViewById(R.id.image_view);



        //Toast.makeText(this,titleStr + " " + descStr,Toast.LENGTH_LONG).show();


        tvTitle.setText(titleStr);
        tvDesc.setText(descStr);
        imgv.setImageResource(img);





    }
}
