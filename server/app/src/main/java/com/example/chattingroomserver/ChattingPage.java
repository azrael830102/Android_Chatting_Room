package com.example.chattingroomserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ChattingPage extends AppCompatActivity {
    static final int SocketServerPORT = 20001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting_page);
    }
}