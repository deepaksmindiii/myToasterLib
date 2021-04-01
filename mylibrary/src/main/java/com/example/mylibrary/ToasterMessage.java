package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,"Parent toast", Toast.LENGTH_SHORT).show();

    }
}
