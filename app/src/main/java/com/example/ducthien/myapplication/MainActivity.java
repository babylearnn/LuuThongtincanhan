package com.example.ducthien.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Bat dau khai bao bien
    EditText edtName, edtTuoi, edtGioitinh;
    Button btnEnter, btnRandom;
    TextView txtvName, txtvTuoi, txtvGioitinh;

    ArrayList<ArrayList<String> > thongtincanhan = new ArrayList<>();//mang chua cac thong tin ca nhan
    //Ket thuc khai bao bien
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bat dau lap trinh

        edtName = (EditText)findViewById(R.id.editTextName);
        edtTuoi = (EditText)findViewById(R.id.editTextTuoi);
        edtGioitinh = (EditText)findViewById(R.id.editTextGioitinh);

        txtvName = (TextView)findViewById(R.id.textViewName);
        txtvTuoi = (TextView)findViewById(R.id.textViewTuoi);
        txtvGioitinh = (TextView)findViewById(R.id.textViewGioitinh);

        btnEnter = (Button)findViewById(R.id.buttonEnter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = edtName.getText().toString();//String inputName = edtName.getText().toString();
                String inputTuoi = edtTuoi.getText().toString();//String inputTuoi = edtTuoi.getText().toString();
                String inputGioitinh = edtGioitinh.getText().toString();//String inputGioitinh = edtGioitinh.getText().toString();
                ArrayList<String> thongtin = new ArrayList<String>();//thongtin.length;
                thongtin.add(inputName);
                thongtin.add(inputTuoi);
                thongtin.add(inputGioitinh);
                //ArrayList<String> thongtincanhan = new ArrayList<>();//mang chua cac thong tin ca nhan
                thongtincanhan.add(thongtin);//DANG VUONG CHO NAY
             }
        });
        btnRandom = (Button)findViewById(R.id.buttonRandom);
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int rRandom = r.nextInt(thongtincanhan.size());//So Random trong pham vi tu 0 den kich thuoc mang thongtincanhan
                thongtincanhan.get(rRandom);
                txtvName.setText(thongtincanhan.get(rRandom).get(0));
                txtvTuoi.setText(thongtincanhan.get(rRandom).get(1));
                txtvGioitinh.setText(thongtincanhan.get(rRandom).get(2));
            }
        });
        //Ket thuc lap trinh
    }
}
