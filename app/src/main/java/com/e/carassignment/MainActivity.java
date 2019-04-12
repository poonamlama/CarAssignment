package com.e.carassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    EditText etmake, etyear, etcolor, etprice, etenginesize;
    Button btncar, btndisel;
    TextView finalreview;
    int vehicleCount = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etmake=findViewById(R.id.etmake);
        etyear=findViewById(R.id.etyear);
        etcolor=findViewById(R.id.etcolor);
        etprice=findViewById(R.id.etprice);
        etenginesize=findViewById(R.id.etenginesize);
        btncar=findViewById(R.id.btncar);
        btndisel=findViewById(R.id.btndisel);
        finalreview=findViewById(R.id.review);

        finalreview.setMovementMethod(new ScrollingMovementMethod());


        btncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String make=etmake.getText().toString();
                String year=etyear.getText().toString();
                String color=etcolor.getText().toString();
                String price=etprice.getText().toString();
                String enginesize=etenginesize.getText().toString();
                vehicleCount++;

                finalreview.append("This is vehicle no." + vehicleCount + "\n");
                finalreview.append(make+" "+year+" "+color+" "+price+" "+enginesize+"\n\n");
            }
        });
    }
}
