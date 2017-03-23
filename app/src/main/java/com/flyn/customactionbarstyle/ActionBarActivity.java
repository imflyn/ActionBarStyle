package com.flyn.customactionbarstyle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ActionBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("我是标题");

//        int id1 = getResources().getIdentifier("action_bar_container", "id", getPackageName());
//        View view1 = findViewById(id1);
//        view1.setBackgroundResource(0);
//        ViewCompat.setElevation(view1, 0);
//        int id2 = getResources().getIdentifier("decor_content_parent", "id", getPackageName());
//        View view2 = findViewById(id2);
//        ViewCompat.setElevation(view2, 0);
//        view2.setBackgroundResource(0);
//        getSupportActionBar().setBackgroundDrawable(null);
//        getSupportActionBar().setElevation(0);
//        getSupportActionBar().setSplitBackgroundDrawable(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
