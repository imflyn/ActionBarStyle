package com.flyn.customactionbarstyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_actionbar = (Button) findViewById(R.id.btn_actionbar);
        Button btn_toolbar = (Button) findViewById(R.id.btn_toolbar);

        btn_actionbar.setOnClickListener(this);
        btn_toolbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_actionbar:
                intent.setClass(this, ActionBarActivity.class);
                break;
            case R.id.btn_toolbar:
                intent.setClass(this, ToolBarActivity.class);
                break;
        }
        startActivity(intent);
    }
}
