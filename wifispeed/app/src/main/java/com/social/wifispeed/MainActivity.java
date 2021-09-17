package com.social.wifispeed;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
@RequiresApi(api= Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        WifiManager wifiManager= (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfow=wifiManager.getConnectionInfo();
        textView.setText(""+wifiInfow.getLinkSpeed());
    }
    @Override
    protected  void onStop(){
        super.onStop();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
}