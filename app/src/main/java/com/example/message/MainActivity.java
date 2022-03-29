package com.example.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(MainActivity.this);

        // Установите заголовок
        dialog.setTitle("Заголовок диалога");
        // Передайте ссылку на разметку
        dialog.setContentView(R.layout.dialog_view);
        // Найдите элемент TextView внутри вашей разметки
        // и установите ему соответствующий текст
        TextView text = (TextView) dialog.findViewById(R.id.textView);
        text.setText("Текст в диалоговом окне. Вы любите котов?");
    }

    public void onClick(View v)
    {
        // Выводим диалоговое окно на экран
        dialog.show();
    }
}