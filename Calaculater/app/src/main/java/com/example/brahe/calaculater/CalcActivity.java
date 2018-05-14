package com.example.brahe.calaculater;

import android.app.Activity;
import android.graphics.Path;
import android.os.Bundle;
import android.os.OperationCanceledException;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import java.security.PublicKey;

public class CalcActivity extends Activity {

    String LeftValue ="";
    String RightValue="";

     String runningNumber = "";
     TextView resultview;
    int result = 0;

    public  enum Operation{
          add, substract , multiply , divide , equal


    }

    Operation CurrentOperation ;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calc);


        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);

        Button calcbtn = (Button)findViewById(R.id.calcbtn);
        resultview = (TextView)findViewById(R.id.resulttxt);
        Button clearbtn = (Button)findViewById(R.id.clearbtn);


        Button addbtn = (Button)findViewById(R.id.addbtn);
        Button subtractbtn = (Button)findViewById(R.id.subtractbtn);
        Button multiplybtn = (Button)findViewById(R.id.multiplybtn);
        Button dividebtn = (Button)findViewById(R.id.dividebtn);

        // clear text

         resultview.setText("");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberPressed(0);
                }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(9);
            }
        });


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.add);
            }
        });
        subtractbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {processOperation(Operation.substract);
            }
        });
        multiplybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {processOperation(Operation.multiply);
            }
        });
        dividebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { processOperation(Operation.divide);
            }
        });

        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  processOperation(Operation.equal);
            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RightValue="";
                LeftValue="";
                result=0;
                runningNumber="";
                CurrentOperation=null;
                 resultview.setText("0");
            }
        });
    }

    void  processOperation(Operation operation){
          if ( CurrentOperation != null )
                {
                    if (runningNumber != "")
                        {
                            RightValue = runningNumber ;
                            runningNumber = "";
                            switch (CurrentOperation)
                            {
                                case add:
                                    result = Integer.parseInt(LeftValue) + Integer.parseInt(RightValue);
                                    break;
                                case multiply:
                                    result = Integer.parseInt(LeftValue) * Integer.parseInt(RightValue);
                                    break;
                                case divide:
                                    result = Integer.parseInt(LeftValue) / Integer.parseInt(RightValue);
                                    break;
                                case substract:
                                    result = Integer.parseInt(LeftValue) - Integer.parseInt(RightValue);
                                    break;


                            }
                            LeftValue = String.valueOf(result);
                            resultview.setText(LeftValue);
                        }
                    CurrentOperation = operation;
                }else {
                        LeftValue = runningNumber;
                        runningNumber="";
                      }
                 CurrentOperation = operation;

    }


    // Store pressed Number
     void numberPressed(int number) {
           runningNumber += String.valueOf(number);
           resultview.setText(runningNumber);
            }
}