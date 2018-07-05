package com.ptp.phamtanphat.oop1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Class : La mot tap cac doi tuong giong ve thuoc tinh hay hanh vi

        Lopdongvat concho = new Lopdongvat("Con cho" , 10);

        Toast.makeText(this, concho.getTen(), Toast.LENGTH_SHORT).show();

//        Lopdongvat conbo = new Lopdongvat();
//        conbo.ten = "con Bo";
//        conbo.tuoi = 5;
    }
}
