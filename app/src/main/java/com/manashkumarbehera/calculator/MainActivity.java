package com.manashkumarbehera.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAC,btnclear,btnsqure,btnroot,btnfact,btnpi,btn7,btn8,btn9,btnmul,btn4,btn5,btn6,btnsub,btn1,btn2,btn3,btnadd,btn0,btndot,btnequal,btndiv,btnpower,btnmod;
    TextView tv2,tv3,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnAC = findViewById(R.id.btnAC);
        btnclear = findViewById(R.id.btnclear);
        btnpower=findViewById(R.id.btnpower);
        btnmod=findViewById(R.id.btnmod);
        btnsqure = findViewById(R.id.btnsqure);
        btnroot = findViewById(R.id.btnroot);
        btnfact = findViewById(R.id.btnfact);
        btnpi = findViewById(R.id.btnpi);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnmul = findViewById(R.id.btnmul);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnsub = findViewById(R.id.btnsub);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnadd = findViewById(R.id.btnadd);
        btn0 = findViewById(R.id.btn0);
        btndot = findViewById(R.id.btndot);
        btnequal = findViewById(R.id.btnequal);
        btndiv = findViewById(R.id.btndiv);

        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv1=findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + "0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(tv3.getText() + ".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText("");
                tv2.setText("");
                tv1.setText("");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tv3.getText().toString();
                if(value.length()!=0){
                    value = value.substring(0, value.length() - 1);
                }else{
                    //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                }
                tv3.setText(value);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("+");
                } else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                }else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                }else{

                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(tv3.getText()=="") {

            }else {
                String a = tv3.getText().toString();
                String b = tv1.getText().toString();
                double aa = Double.parseDouble(a);
                double bb = Double.parseDouble(b);

                tv2.setText(tv2.getText() + " " + aa);

                if (tv2.getText().toString().endsWith(".0")) {
                    String s = tv2.getText().toString();
                    String s1 = s.substring(0, s.length() - 2);
                    tv2.setText(s1);

                } else {

                }

                if (tv2.getText().toString().startsWith("+")) {
                    double sum = aa + bb;
                    tv3.setText("= " + sum);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else if (tv2.getText().toString().startsWith("-")) {
                    double sub = bb - aa;
                    tv3.setText("= " + sub);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else if (tv2.getText().toString().startsWith("x")) {
                    double mul = bb * aa;
                    tv3.setText("= " + mul);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else if (tv2.getText().toString().startsWith("÷")) {
                    double div = bb / aa;
                    tv3.setText("= " + div);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else if (tv2.getText().toString().startsWith("^")) {
                    double power = Math.pow(bb, aa);
                    tv3.setText("= " + power);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else if (tv2.getText().toString().startsWith("%")) {
                    double mod = (bb % aa);
                    tv3.setText("= " + mod);

                    if (tv3.getText().toString().endsWith(".0")) {
                        String s = tv3.getText().toString();
                        String s1 = s.substring(0, s.length() - 2);
                        tv3.setText(s1);

                    } else {

                    }

                } else {
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                }
            }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("-");
                } else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                }else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                }else{

                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("x");
                }else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                } else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                } else{

                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("÷");
                } else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                } else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                } else{

                }
            }
        });
        btnroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv3.getText().toString();
                if(val.length()!=0) {
                    double r = Math.sqrt(Double.parseDouble(val));
                    String so=String.valueOf(val);
                    String rr=String.valueOf(r);
                    tv1.setText(null);
                    if(so.endsWith(".0")){
                        String sp=so.substring(0,so.length()-2);
                        tv2.setText("√"+sp);
                    } else if(so.endsWith(".")){
                        String sp=so.substring(0,so.length()-1);
                        tv2.setText("√"+sp);
                    } else{
                        tv2.setText("√"+val);
                    }

                    if(rr.endsWith(".0")){
                        String sp=rr.substring(0,rr.length()-2);
                        tv3.setText(sp);
                    } else if(rr.endsWith(".")){
                        String sp=so.substring(0,rr.length()-1);
                        tv3.setText(sp);
                    } else{
                        tv3.setText(rr);
                    }

                }else{
                    //tv1.setText("Enter a number then press √");
                }
            }
        });
        btnfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv3.getText().toString();
                if(s.length()!=0) {
                    double c=Double.parseDouble(s);
                    double i;double fact=1;
                    for(i=1;i<=c;i++) {
                        fact=fact*i;
                    }
                    String ff=String.valueOf(fact);
                    String cc=String.valueOf(c);
                    if(cc.endsWith(".0")){
                        String sp=cc.substring(0,cc.length()-2);
                        tv2.setText(sp+" !");
                    } else if(cc.endsWith(".")){
                        String sp=cc.substring(0,cc.length()-1);
                        tv2.setText(sp+" !");
                    } else{
                        tv2.setText(cc+" !");
                    }

                    if(ff.endsWith(".0")){
                        String sp=ff.substring(0,ff.length()-2);
                        tv3.setText(sp);
                    } else if(ff.endsWith(".")){
                        String sp=ff.substring(0,ff.length()-1);
                        tv3.setText(sp);
                    } else{
                        tv3.setText(ff);
                    }
                    tv1.setText(null);
                }else {
                    //tv1.setText("Enter a number then press x !");
                }
            }
        });
        btnsqure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv3.getText().toString();
                if(s.length()!=0) {
                    double d=Double.parseDouble(s);
                    double square = d * d;
                    String ss=String.valueOf(square);
                    if(ss.endsWith(".0")) {
                        String sp=ss.substring(0,ss.length()-2);
                        tv3.setText(sp);
                    }else{

                    }
                    tv2.setText(d + " ²");
                    if(tv2.getText().toString().endsWith(".0 ²")){
                        String st=tv2.getText().toString();
                        String sp=st.substring(0,st.length()-4);
                        tv2.setText(sp+" ²");
                    } else{
                        tv3.setText(square+"");
                    }
                    tv1.setText(null);
                }else {
                    //tv1.setText("Enter a number then press x²");
                }
            }
        });
        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=tv3.getText().toString();

                if(s.length()!=0) {
                    Double d = Double.parseDouble(s);
                    double pi = 3.141592653589 * d;
                    tv3.setText(String.valueOf(pi));
                    String f = String.valueOf(d);
                    if(f.endsWith(".0")){
                        String sss=f.substring(0,f.length()-2);
                        tv2.setText(sss+"π");
                    }else{

                    }

                } else {

                }
            }
        });
        btnpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("^");
                } else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                } else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                } else{

                }
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv3.getText());
                if(tv1.getText()!=""){
                    tv2.setText("%");
                } else{

                }
                tv3.setText("");

                if(tv1.getText().toString().endsWith(".0")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-2);
                    tv1.setText(sp);
                } else if(tv1.getText().toString().endsWith(".")){
                    String st=tv1.getText().toString();
                    String sp=st.substring(0,st.length()-1);
                    tv1.setText(sp);
                } else{

                }
            }
        });
        //Coded by Manash Kumar Behera  -
        //Editor - Android Studio , Language - Java & xml -
        //Thank you
    }
}