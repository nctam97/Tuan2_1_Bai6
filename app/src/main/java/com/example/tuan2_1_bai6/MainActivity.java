package com.example.tuan2_1_bai6;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstvw_ds;
    TextView tv_result;
    String[]lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstvw_ds=findViewById(R.id.lstvw_ds);
        tv_result=findViewById(R.id.tv_result);
        lst=getResources().getStringArray(R.array.ds);
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,lst);
        lstvw_ds.setAdapter(adapter);
        lstvw_ds.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv_result.setText("position:"+(position+1)+" value:"+lst[position]);
            }
        });
    }
}
