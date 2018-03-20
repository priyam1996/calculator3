package com.kuncham.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText male,female;
    TextView tv;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showResult(View v){
        male=(EditText)findViewById(R.id.editText);
        female=(EditText)findViewById(R.id.editText2);
        tv=(TextView)findViewById(R.id.textView);
        String m=male.getText().toString();
        String f=female.getText().toString();
        String sum=m+f;
        sum=sum.toLowerCase();
        int value=sum.hashCode();

        Random random=new Random(value);
        result=(random.nextInt(100)+1)+"%";
        if(f.equals("")||m.equals("")){
            Toast.makeText(this, "Enter names", Toast.LENGTH_SHORT).show();
        }
        tv.setText(result);

    }
}
