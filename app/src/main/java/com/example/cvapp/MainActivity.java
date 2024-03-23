package com.example.cvapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_cv;
    private TextView txt_cv;
    private ImageView img_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btn_cv = findViewById(R.id.btn_cv);
        txt_cv = findViewById(R.id.txt_cv);
        img_cv = findViewById(R.id.img_cv);


        btn_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_cv.getText().equals("undo")) {
                    img_cv.setBackground(getResources().getDrawable(R.drawable.android));
                    txt_cv.setText("cv_for_siavash");
                    btn_cv.setText("accept_cv");
                } else {
                    img_cv.setBackground(getResources().getDrawable(R.drawable.sucsses));
                    txt_cv.setText("CV accepted");
                    btn_cv.setText("undo");

                }


            }
        });

        // this is new commit
        //rgrgrgrhrh


        //ggggggggggggggggggggg


        // add this for error

    }
}
