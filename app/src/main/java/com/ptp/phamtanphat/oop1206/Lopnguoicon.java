package com.ptp.phamtanphat.oop1206;

import android.content.Context;
import android.widget.Toast;

public class Lopnguoicon extends LopCha{
    public Integer cannang;

    public void Tinhtuoi(String tuoi, Context context , Integer num){
        Toast.makeText(context, "Tuoi cua phuong thuc con " + tuoi + num , Toast.LENGTH_SHORT).show();
    }
}
