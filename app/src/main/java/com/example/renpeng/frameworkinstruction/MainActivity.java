package com.example.renpeng.frameworkinstruction;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Activity实现了Window.CallBack接口,并且在attach方法中将自身作为Window对象传递给CallBack接口实现

    /**
     * WindowManagerImp类维护着三个数组
     * View[] 每个view对象
     * ViewRoot[] 每个View对象对应的ViewRoot
     * WindowManagerImp.LayoutParams[]
     * */

    private Dialog dialog;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);

        //当Dialog显示时的监听
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {

            }
        });



    }

    /**
     * 该方法是Window添加完成setContent的布局后的回调,通知Activity
     * */
    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

}
