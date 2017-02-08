package com.example.satriowibowo.checkindomaret;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RegisActivity extends AppCompatActivity {

    private ImageView mPhotoView;
    private ImageButton mPhotoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        mPhotoView = (ImageView)findViewById(R.id.mfoto);
        mPhotoButton = (ImageButton)findViewById(R.id.bfoto);

    }
}
