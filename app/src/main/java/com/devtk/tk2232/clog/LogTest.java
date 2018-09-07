package com.devtk.tk2232.clog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_test);

        CLog.configuration().logWithConsole(true).logWithFirebase(true);

        CLog.e("Test", "Test");
    }
}
