package com.example.chattingroomserver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_connect;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = this.getIntent();
        if (it != null) {
            Bundle bundle = it.getExtras();
            if (bundle != null) {
                String errMsg = bundle.getString("errMsg");
                if (errMsg != null && !errMsg.equals("")) {
                    Toast.makeText(this, errMsg, Toast.LENGTH_SHORT).show();
                }
            }
        }

        initViewElement();
        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("name", name.getText().toString());
                Intent it = new Intent();
                it.putExtras(bundle);
                it.setClass(MainActivity.this, ChattingPage.class);
                startActivity(it);
            }
        });


    }

    private void initViewElement() {
        name = (EditText) findViewById(R.id.et_connect_page_name);
        btn_connect = (Button) findViewById(R.id.btn_connect_page_connect);
    }


}

