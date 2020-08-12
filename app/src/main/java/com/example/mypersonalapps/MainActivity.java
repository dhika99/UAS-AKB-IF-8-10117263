package com.example.mypersonalapps;
/*
    Nama : Andhika Rizki Huda
    NIM  : 10117263
    Kelas : IF8
*/
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private int waktu_loading=3000;

    //4000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home = new Intent(MainActivity.this, ActivityPager.class);
                startActivity(home);
                finish();

            }
        }, waktu_loading);
    }
}