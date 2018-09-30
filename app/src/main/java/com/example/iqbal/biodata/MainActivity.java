package com.example.iqbal.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opTelp(View v){
        Intent it = new Intent(Intent.ACTION_DIAL);
        startActivity(it);
    }
    public  void opAlmt(View view){
        Uri almt = (Uri.parse("https://www.google.com/maps/place/Stockist+baju+branded/@-6.7993576,110.8197251,19z/data=!3m1!4b1!4m5!3m4!1s0x2e70c51fe436aa01:0x2f49a18135aff40f!8m2!3d-6.7993576!4d110.8202723"));
        Intent it = new Intent(Intent.ACTION_VIEW, almt);
        startActivity(it);
    }
    public void opEmail(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setData(Uri.parse("mailto: "));
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{"Recipent"});
        it.putExtra(Intent.EXTRA_SUBJECT, "Recipent");
        it.putExtra(Intent.EXTRA_TEXT, "Recipent");
        startActivity(it);
    }
}