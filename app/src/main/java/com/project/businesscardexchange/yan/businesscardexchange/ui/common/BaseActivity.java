package com.project.businesscardexchange.yan.businesscardexchange.ui.common;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


/**
 * Created by CrazyCoder on 2015/9/26.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
