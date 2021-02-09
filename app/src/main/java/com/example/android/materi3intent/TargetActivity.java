package com.example.android.materi3intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class TargetActivity extends AppCompatActivity {
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult =
                (TextView)findViewById(R.id.textView);

        if (getIntent().getExtras() != null){
            String data =
                    getIntent().getExtras().getString(MainActivity.EXTRA_DATA)
                    ; txtResult.setText(data);
        }
    }
}
