package com.example.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] btn = new Button[10];
    Button btnClr,btnBrack,btnMod,btnDiv,btnMul,
            btnMin,btnAdd,btnPlusMin,btnDot,btnEq;
    EditText txtNum,txtnum1;
    TextView lblMsg = null;
    Double num1,num2,result;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.button0);btn[1] = findViewById(R.id.button1);
        btn[2] = findViewById(R.id.button2);btn[3] = findViewById(R.id.button3);
        btn[4] = findViewById(R.id.button4);btn[5] = findViewById(R.id.button5);
        btn[6] = findViewById(R.id.button6);btn[7] = findViewById(R.id.button7);
        btn[8] = findViewById(R.id.button8);btn[9] = findViewById(R.id.button9);

        for (int i = 0; i<10; i++){
            btn[i].setOnClickListener(this);
        }

        btnClr = findViewById(R.id.buttonDel);     btnClr.setOnClickListener(this);
       // btnBrack = findViewById(R.id.btnBrack); btnBrack.setOnClickListener(this);
     //   btnMod = findViewById(R.id.btnMod);     btnMod.setOnClickListener(this);
        btnDiv = findViewById(R.id.buttondiv);     btnDiv.setOnClickListener(this);
        btnMul = findViewById(R.id.buttonmul);     btnMul.setOnClickListener(this);
        btnMin = findViewById(R.id.buttonsub);     btnMin.setOnClickListener(this);
        btnAdd = findViewById(R.id.buttonadd);     btnAdd.setOnClickListener(this);
      //  btnPlusMin = findViewById(R.id.btnPlusMin);btnPlusMin.setOnClickListener(this);
        btnDot = findViewById(R.id.buttonDot);     btnDot.setOnClickListener(this);
        btnEq = findViewById(R.id.buttoneql);       btnEq.setOnClickListener(this);

        txtNum = findViewById(R.id.et1);
        txtNum.setText("0");
        //txtNum.setEnabled(false);
        lblMsg = findViewById(R.id.display);
    }

    @Override
    public void onClick(View view) {
        String etText = txtNum.getText().toString();

        switch (view.getId()){
            case R.id.buttonDel:
                txtNum.setText("");
                lblMsg.setText("");
                break;
            //numbers
            case R.id.button0:
                if (etText.equals("0"))
                    txtNum.setText(btn[0].getText());
                else
                    txtNum.setText(etText + "" + btn[0].getText());
                break;
            case R.id.button1:
                if (etText.equals("0"))
                    txtNum.setText(btn[1].getText());
                else
                    txtNum.setText(etText + "" + btn[1].getText());
                break;
            case R.id.button2:
                if (etText.equals("0"))
                    txtNum.setText(btn[2].getText());
                else
                    txtNum.setText(etText + "" + btn[2].getText());
                break;
            case R.id.button3:
                if (etText.equals("0"))
                    txtNum.setText(btn[3].getText());
                else
                    txtNum.setText(etText + "" + btn[3].getText());
                break;
            case R.id.button4:
                if (etText.equals("0"))
                    txtNum.setText(btn[4].getText());
                else
                    txtNum.setText(etText + "" + btn[4].getText());
                break;
            case R.id.button5:
                if (etText.equals("0"))
                    txtNum.setText(btn[5].getText());
                else
                    txtNum.setText(etText + "" + btn[5].getText());
                break;
            case R.id.button6:
                if (etText.equals("0"))
                    txtNum.setText(btn[6].getText());
                else
                    txtNum.setText(etText + "" + btn[6].getText());
                break;
            case R.id.button7:
                if (etText.equals("0"))
                    txtNum.setText(btn[7].getText());
                else
                    txtNum.setText(etText + "" + btn[7].getText());
                break;
            case R.id.button8:
                if (etText.equals("0"))
                    txtNum.setText(btn[8].getText());
                else
                    txtNum.setText(etText + "" + btn[8].getText());
                break;
            case R.id.button9:
                if (etText.equals("0"))
                    txtNum.setText(btn[9].getText());
                else
                    txtNum.setText(etText + "" + btn[9].getText());
                break;

            //operations
            case R.id.buttonadd:
                num1 = Double.valueOf(etText);
                op = "+";
                txtNum.setText(etText + "+");
                break;
            case R.id.buttonsub:
                num1 = Double.valueOf(etText);
                op = "-";
                txtNum.setText(etText + "-");
                break;
            case R.id.buttonmul:
                num1 = Double.valueOf(etText);
                op = "*";
                txtNum.setText(etText + "*");
                break;
            case R.id.buttondiv:
                num1 = Double.valueOf(etText);
                op = "/";
                txtNum.setText(etText + "/");
                break;
//            case R.id.btnMod:
//                num1 = Double.valueOf(etText);
//                op = "%";
//                txtNum.setText("");
//                break;
            //main logic
            case R.id.buttoneql:

                if(op.equals("+"))
                    result = num1 + num2;
                else if(op.equals("-"))
                    result = num1 - num2;
                else if(op.equals("*"))
                    result = num1 * num2;
                else if(op.equals("/"))
                    result = num1 / num2;
                else if(op.equals("%"))
                    result = num1 % num2;
                else{

                }
               // lblMsg.setText(num1+" "+op+" "+num2+" = "+result);
                lblMsg.setText(result + "");
                num1 = result;
                txtNum.setText(String.valueOf(result));
                break;
        }//end view.getId() switch
        txtNum.setSelection(txtNum.getText().length());
    }//End of onClick

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
//    EditText et1;
//    TextView txtans;
//    Double num1,num2,result;
//    String op;
//    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
//    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
//            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        button0 = findViewById(R.id.button0);
//        button1 = findViewById(R.id.button1);
//        button2 = findViewById(R.id.button2);
//        button3 = findViewById(R.id.button3);
//        button4 = findViewById(R.id.button4);
//        button5 = findViewById(R.id.button5);
//        button6 = findViewById(R.id.button6);
//        button7 = findViewById(R.id.button7);
//        button8 = findViewById(R.id.button8);
//        button9 = findViewById(R.id.button9);
//        buttonDot = findViewById(R.id.buttonDot);
//        buttonAdd = findViewById(R.id.buttonadd);
//        buttonSub = findViewById(R.id.buttonsub);
//        buttonMul = findViewById(R.id.buttonmul);
//        buttonDivision = findViewById(R.id.buttondiv);
//        Remainder = findViewById(R.id.Remainder);
//        buttonDel = findViewById(R.id.buttonDel);
//        buttonEqual = findViewById(R.id.buttoneql);
//        et1 = findViewById(R.id.et1);
//        txtans = findViewById(R.id.display);
//
//        final String etText = txtans.getText().toString();
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button1.getText());
//                else
//                    et1.setText(etText + "" + button1.getText());
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button2.getText());
//                else
//                    et1.setText(etText + "" + button2.getText());
//
//            }
//        });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                if (etText.equals("0"))
//                    et1.setText(button3.getText());
//                else
//                    et1.setText(etText + "" + button3.getText());
//
//            }
//        });
//
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button4.getText());
//                else
//                    et1.setText(etText + "" + button4.getText());
//
//
//            }
//        });
//
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button5.getText());
//                else
//                    et1.setText(etText + "" + button5.getText());
//
//
//            }
//        });
//
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button6.getText());
//                else
//                    et1.setText(etText + "" + button6.getText());
//
//
//            }
//        });
//
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button7.getText());
//                else
//                    et1.setText(etText + "" + button7.getText());
//
//            }
//        });
//
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button8.getText());
//                else
//                    et1.setText(etText + "" + button8.getText());
//
//            }
//        });
//
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button9.getText());
//                else
//                    et1.setText(etText + "" + button9.getText());
//
//            }
//        });
//
//        button0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (etText.equals("0"))
//                    et1.setText(button0.getText());
//                else
//                    et1.setText(etText + "" + button0.getText());
//
//            }
//        });
//
//
//    }
//}
