package br.ulbra.appenergia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtTempoUso, txtPotencia, txtPreco, txtConsumo, txtCusto;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtTempoUso = findViewById(R.id.txtTempoUso);
        txtPotencia = findViewById(R.id.txtPotencia);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtPreco = findViewById(R.id.txtPreco);
        txtConsumo = findViewById(R.id.txtConsumo);
        txtCusto = findViewById(R.id.txtCusto);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int horas;
            double potencia, preco, consumo,custo;
            horas = Integer.parseInt(txtTempoUso.getText().toString());
            potencia = Double.parseDouble(txtPotencia.getText().toString());
            preco = Double.parseDouble(txtPreco.getText().toString());
            consumo = (potencia*horas/1000);
            txtConsumo.setText(consumo + " kWh");
            custo = (consumo*preco);
            txtCusto.setText("R$ " +custo);


            }
        });

    }
}