package com.example.renpeng.frameworkinstruction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 该方法是Window添加完成setContent的布局后调用的,通知Activity
     * */
    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }
}
