package br.com.etecia.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button Login;
Button cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Login = findViewById(R.id.textButton);
cadastrar = findViewById(R.id.textButtoncadas);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
}