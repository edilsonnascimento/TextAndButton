package br.utfpr;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextSobreNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextSobreNome = findViewById(R.id.editTextSobreNome);
    }

    public void limparCampos(View view){
        editTextNome.setText(null);
        editTextSobreNome.setText(null);
        editTextNome.requestFocus();

        Toast.makeText(this, R.string.mensagem_limpar, Toast.LENGTH_LONG).show();
    }

    public void mostrarNomeCompleto(View view){
        String nome = editTextNome.getText().toString();
        String sobreNome = editTextSobreNome.getText().toString();

        if(nome == null || nome.trim().isEmpty()) {
            Toast.makeText(this, R.string.erro_nome, Toast.LENGTH_LONG).show();
            editTextNome.requestFocus();
            return;
        }

        if(sobreNome == null || sobreNome.trim().isEmpty()) {
            Toast.makeText(this, R.string.erro_sobre_nome, Toast.LENGTH_LONG).show();
            editTextSobreNome.requestFocus();
            return;
        }

        Toast.makeText(this, nome + " " + sobreNome, Toast.LENGTH_SHORT).show();
    }
}