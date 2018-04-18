package com.sruly.stu.shopinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(123,352345);
        sparseIntArray.append(234,667);
        System.out.println("AAA " + sparseIntArray);
    }
}
