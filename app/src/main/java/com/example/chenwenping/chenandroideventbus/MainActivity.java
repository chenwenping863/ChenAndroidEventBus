package com.example.chenwenping.chenandroideventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        EventBus.getDefault().post(new MessageEvent("hello"));
    }

    @Subscribe
    public void onMsgEvent(MessageEvent event) {
        Toast.makeText(this, event.msg, Toast.LENGTH_LONG).show();
    }
}
