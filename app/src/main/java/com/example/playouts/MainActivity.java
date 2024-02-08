package com.example.playouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView myTextVar;
    private CheckBox chkBox;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myTextVar = findViewById(R.id.myText); //познакомили перемннную с компонентом
        chkBox = findViewById(R.id.checkBox);
        btn = findViewById(R.id.button);

        myTextVar.setText("New text in TextView"); //программно присвоили текст
        chkBox.setChecked(true);
        btn.setEnabled(false);
    }
}