package com.ptp.phamtanphat.oop1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements QuangCao{

    //Override : Phuong thuc ghi de
    //OverLoad : Phuong thuc nap chong
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LopCha nguoicha = new LopCha();
//        nguoicha.ten = "Ong Nguyen Van A";
//        nguoicha.tuoi = 50;
//        nguoicha.Tinhtuoi();
//
//        Lopnguoicon nguoicon = new Lopnguoicon();
//        nguoicon.ten = "Con Nguyen Van B";
//        nguoicon.tuoi = 10;
//        nguoicon.cannang = 30;
//        nguoicon.Tinhtuoi();
//
//        Log.d("BBBB",nguoicon.ten);
//        Log.d("BBBB",nguoicon.tuoi + "");
//        Log.d("BBBB",nguoicon.cannang + "");
        //Phuong thuc nhap chong : Pham vi su dung chi ben trong thang tao ra ( A - A)
        //Phuong thuc ghi de : Pham vi su dung phai la noi khac cho no duoc sinh ra ( A - B)
//        LopCha lopCha = new LopCha();
//
//        lopCha.Tinhtuoi("20", MainActivity.this);
//
//        Lopnguoicon lopnguoicon = new Lopnguoicon();
//        lopnguoicon.Tinhtuoi("15",this,20);
        TextView textView = new TextView(this);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void ThoigianQuangcao() {

    }
}
