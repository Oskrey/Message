package com.example.message;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v)
    {
        CheckBox apple = findViewById(R.id.checkBoxApples);
        CheckBox strawberry = findViewById(R.id.checkBoxStrawberry);
        CheckBox blueberry = findViewById(R.id.checkBoxBlueBerry);
        CheckBox potatoes = findViewById(R.id.checkBoxPotatoes);

        EditText textApples = findViewById(R.id.editTextApples);
        EditText textblueberry = findViewById(R.id.editTextBlueBerry);
        EditText textStrawberry = findViewById(R.id.editTextStrawberry);
        EditText textPotatoes = findViewById(R.id.editTextPotatoes);

        String cart = "";
        int price = 0;
        int templeCount;
        if (apple.isChecked())
        {
            templeCount = Integer.parseInt(String.valueOf(textApples.getText()));
            price += templeCount * 200;
            cart += "Яблоки\t\t\t\t" + templeCount + "кг\t\t" + "всего: " + (templeCount * 200) +"₽\n";
        }
        if (strawberry.isChecked())
        {
            templeCount = Integer.parseInt(String.valueOf(textStrawberry.getText()));
            price += templeCount * 800;
            cart += "Клубника\t\t" + templeCount + "кг\t\t" + "всего: " + (templeCount * 800) +"₽\n";
        }
        if (blueberry.isChecked())
        {
            templeCount = Integer.parseInt(String.valueOf(textblueberry.getText()));
            price += templeCount * 700;
            cart += "Голубика\t\t" + templeCount + "кг\t\t" + "всего: " + (templeCount * 700) +"₽\n";
        }
        if (potatoes.isChecked())
        {
            templeCount = Integer.parseInt(String.valueOf(textPotatoes.getText()));
            price += templeCount * 100;
            cart += "Картошка\t" + templeCount + "кг\t\t" + "всего: " + (templeCount * 100) +"₽\n";
        }


        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
        a_builder.setMessage(cart + "\nИтого:"+price + '₽').setTitle("Ваш заказ").setIcon(R.drawable.shop);
        a_builder.show();
    }
}