package com.hhz.hotfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.tv)).setText("我是更新补丁包");
        Toast.makeText(this,"这是个1.0.1版本补丁包",Toast.LENGTH_SHORT).show();
    }
}
