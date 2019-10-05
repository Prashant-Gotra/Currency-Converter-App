package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText amountInDollar = (EditText)findViewById(R.id.currencyEditText);
        String amountInDollarString = amountInDollar.getText().toString();
        Double amountInDollarDouble = Double.parseDouble(amountInDollarString);
        Double amountInRupeesDouble = amountInDollarDouble * 69.98;
        //String amountInRupeesString = Double.toString(amountInRupeesDouble);
        String amountInRupeesString = String.format("%.2f", amountInRupeesDouble);

        //Log.i("Currency in Rupees", amountInRupeesString);
        Toast.makeText(this, "$" + amountInDollarString + " is ₹" + amountInRupeesString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
