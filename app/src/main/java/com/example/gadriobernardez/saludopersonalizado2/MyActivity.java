package com.example.gadriobernardez.saludopersonalizado2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarTexto(view);

            }
        });
    }


    public void enviarTexto(View view) {
        EditText et = (EditText) findViewById(R.id.editText);
        TextView tv = (TextView) findViewById(R.id.textView);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        rg.getCheckedRadioButtonId();

        if (rg.getCheckedRadioButtonId() == R.id.radioButton3) {
            tv.setText(getResources().getString(R.string.bHola) + " Sr. " + et.getText());
        } else if (rg.getCheckedRadioButtonId() == R.id.radioButton4) {
            tv.setText(getResources().getString(R.string.bHola) + " Sra. " + et.getText());
        } else {
            tv.setText("Selecciona genero");
        }
        et.setText("");
        rg.setSelected(false);
    }
}
