package br.com.etecia.netflix;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {
    EditText usuario;
    EditText senhas;
    Button cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);
        usuario = (EditText) findViewById(R.id.email);
        senhas = (EditText) findViewById(R.id.password);
        cadastrar = (Button) findViewById(R.id.textButtoncadas);

        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (!usuario.getText().toString().isEmpty()&& !senhas.getText().toString().isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Usuário Cadastrado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CadastroActivity.this, "Usuário não Cadastrado", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}