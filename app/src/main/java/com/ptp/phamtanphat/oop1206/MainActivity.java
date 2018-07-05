package com.ptp.phamtanphat.oop1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LopCha nguoicha = new LopCha();
        nguoicha.ten = "Ong Nguyen Van A";
        nguoicha.tuoi = 50;
        nguoicha.Tinhtuoi();

        Lopnguoicon nguoicon = new Lopnguoicon();
        nguoicon.ten = "Con Nguyen Van B";
        nguoicon.tuoi = 10;
        nguoicon.cannang = 30;
        nguoicon.Tinhtuoi();

        Log.d("BBBB",nguoicon.ten);
        Log.d("BBBB",nguoicon.tuoi + "");
        Log.d("BBBB",nguoicon.cannang + "");
    }
}
