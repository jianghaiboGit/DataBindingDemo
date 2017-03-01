package com.uvoice.jhb.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.uvoice.jhb.databindingdemo.bean.User;
import com.uvoice.jhb.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setUser(new User("jiang",24,"123456","file:///android_asset/test.gif"));
        binding.setSimpleClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"单击事件",Toast.LENGTH_SHORT).show();
            }
        });
        binding.btnLong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this,"长按事件",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
