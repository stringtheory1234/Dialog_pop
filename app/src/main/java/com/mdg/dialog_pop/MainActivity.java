package com.mdg.dialog_pop;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button b1 , b2 , b3 , b4 , b5 , b6, b7 ;
    TextView textview ;
    EditText m ;
    float counter = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button1) ;
        b2 = (Button)findViewById(R.id.button2) ;
        b3 = (Button)findViewById(R.id.button3) ;
        b4 = (Button)findViewById(R.id.button4) ;
        b5 = (Button)findViewById(R.id.button5) ;
        b6 = (Button)findViewById(R.id.button6) ;
        b7 = (Button)findViewById(R.id.button7) ;
        textview=(TextView) findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter += (float)(k/76);
                    textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter +=(float)k/25;
                textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter +=(float)k/218;
                textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter +=(float)k/250;
                textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter +=(float)k/250;
                textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l = m.getText().toString();
                int k = Integer.parseInt(l);
                counter +=(float)k/100;
                textview.setText(""+counter);
                if (counter >=100&&counter<500) {
                    Toast.makeText(MainActivity.this, "TOO MUCH ALCOHOL", Toast.LENGTH_SHORT).show();
                }
                if(counter>=500)
                {
                    Toast.makeText(MainActivity.this, "This can be pretty dangerous", Toast.LENGTH_SHORT).show();
                }

            }
        });

     b7.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             counter=0;
             textview.setText(""+counter);
         }
     });

        Button mShowDialog= (Button) findViewById(R.id.buttonShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder=new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_popup, null);
                final EditText mEmail = (EditText) mView.findViewById(R.id.Email_ms);
                final EditText mPassword = (EditText) mView.findViewById(R.id.password_ms);
                Button mLogin = (Button) mView.findViewById(R.id.button_id);
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(mEmail.getText().toString().equals("AlcoDroid") && mPassword.getText().toString().equals("test123")){

                         Intent toyy=new Intent(MainActivity.this, second.class );
                         toyy.putExtra("counter", counter);
                         startActivity(toyy);

                        }
                        else{
                            Toast.makeText(MainActivity.this, "Unauthorised Access", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dailog = mBuilder.create();
                dailog.show();
            }
        });

    }

    }
