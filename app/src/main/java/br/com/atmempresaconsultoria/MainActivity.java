package br.com.atmempresaconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView btnEmpresa;
    private ImageView btnServico;
    private ImageView btnClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnEmpresa = (ImageView) findViewById(R.id.empresaId);
        this.btnServico = (ImageView) findViewById(R.id.servicoId);
        this.btnClientes = (ImageView) findViewById(R.id.clienteId);

        this.btnEmpresa.setOnClickListener((View v) -> {
            startActivity(new Intent(this, EmpresaActivity.class));
        });

        this.btnServico.setOnClickListener((View v) -> {
            startActivity(new Intent(this, ServicoActivity.class));
        });

        this.btnClientes.setOnClickListener((View v) -> {
            startActivity(new Intent(this, ClientesActivity.class));
        });
    }
}
