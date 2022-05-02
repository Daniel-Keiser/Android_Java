package com.example.homeproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    static String[] nomes = new String[] {"valmor", "antonio", "ricardo", "reginaldo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView lv = findViewById(R.id.listUser);
        lv.setAdapter(new BaseAdapter() {
                @Override
                public int getCount() {
                    return nomes.length;
                }

                @Override
                public Object getItem(int i) {
                    return nomes[i];
                }

                @Override
                public long getItemId(int i) {
                    return i;
                }

                @Override
                public View getView(int i, View view, ViewGroup viewGroup) {
                    if(view == null) {
                        view = getLayoutInflater().inflate(R.layout.layout_linha, viewGroup, false);
                    }
                    TextView temp = view.findViewById(R.id.txtPrincipal);
                    temp.setText(nomes[i]);

                    return view;
                }
            });
        }
    }
