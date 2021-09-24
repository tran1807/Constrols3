package com.example.constrols3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView ketqua;
    private EditText NhapGt;
    private Button Tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NhapGt = (EditText) findViewById(R.id.NhapGiaiThua);
        Tinh = (Button) findViewById(R.id.TinhGiaiThua);
        ketqua = (TextView) findViewById(R.id.KetQua);
        Tinh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.TinhGiaiThua){
            int giaithua = Integer.parseInt(NhapGt.getText().toString());
            long s=1;
            for (int i=1;i<=giaithua ; i++){
                s=s+i;
            }
            ketqua.setText(String.valueOf(s));
        }
    }
}