package com.example.calcualtorconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String param1;
    String param2;
    double result=0.0;
    String op="";
    boolean isNewOperator=true;
    TextView ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(isNewOperator)
            ed1.setText("");
        isNewOperator=false;
        String number =ed1.getText().toString();
        switch (view.getId()){
            case R.id.button0:
                number+="0";
                break;
            case R.id.button1:
                number+="1";
                break;
            case R.id.button2:
                number+="2";
                break;
            case R.id.button3:
                number+="3";
                break;
            case R.id.button4:
                number+="4";
                break;
            case R.id.button5:
                number+="5";
                break;
            case R.id.button6:
                number+="6";
                break;
            case R.id.button7:
                number+="7";
                break;
            case R.id.button8:
                number+="8";
                break;
            case R.id.button9:
                number+="9";
                break;
        }
        ed1.setText(number);


    }

    public void operatorEvent(View view) {
        isNewOperator=true;
        param1=ed1.getText().toString();
        switch (view.getId()){
            case R.id.buttonPlus:
                op="+";
                break;
            case R.id.buttonMinus:
                op="-";
                break;
            case R.id.buttonMultiply:
                op="*";
                break;
            case R.id.buttonDevide:
                op="/";
                break;
        }

    }

    public void equalEvent(View view) {
        result=0.0;
        param2=ed1.getText().toString();
        switch (op){
            case "/":
                result = Integer.parseInt(param1)/ Integer.parseInt(param2);
                break;
            case "*":
                result = Integer.parseInt(param1)* Integer.parseInt(param2);
                break;
            case "-":
                result = Integer.parseInt(param1)- Integer.parseInt(param2);
                break;
            case "+":
                result = Integer.parseInt(param1)+ Integer.parseInt(param2);
                break;
        }
        isNewOperator=true;
        ed1.setText(String.valueOf(result));
    }

    public void ceButtonEvent(View view) {
        isNewOperator=true;
        param1="";
        param2="";
        op="";
        ed1.setText("");
    }

    public void cButtonEvent(View view) {
        if(op.equals("")){
            isNewOperator=true;
            param1="";
            ed1.setText("");
        }else {
            param2="";
            isNewOperator=true;
            ed1.setText("");
        }
        if(result!=0.0){
            param2="";
            param1="";
            result=0.0;
            isNewOperator=true;
            ed1.setText("");
        }

    }
}