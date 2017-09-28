package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(MainActivity.this);

        for (i=1;i<=3;i++)
        {
            Button btn = new Button(MainActivity.this); //button 寫法
            btn.setText("Hello Click!");
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT, 1); //權重 weight 寫法
            btn.setLayoutParams(params);
            final String str = String.valueOf(i);
            btn.setOnClickListener(new View.OnClickListener() {@Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();//按按鈕有氣泡提示
                }
            });
            ll.addView(btn);
        }

        setContentView(ll);
    }
}
