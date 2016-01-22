package com.jack.smpleexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test();
    }

    private void test(){

        //fix bug version
//        Toast.makeText(this,"fix bug  fix bug  fix bug",Toast.LENGTH_SHORT).show();
        //bug version
        Toast.makeText(this,"bug bug bug bug bug ", Toast.LENGTH_SHORT).show();
    }

}
