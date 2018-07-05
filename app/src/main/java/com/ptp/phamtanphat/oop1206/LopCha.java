package com.ptp.phamtanphat.oop1206;

import android.content.Context;
import android.widget.Toast;

public class LopCha {
    public String ten;
    public Integer tuoi;

    public void Tinhtuoi(String tuoi, Context context){
        Toast.makeText(context, "Tuoi cua phuong thuc cha " + tuoi , Toast.LENGTH_SHORT).show();
    }
}
