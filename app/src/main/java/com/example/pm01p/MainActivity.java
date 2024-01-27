package com.example.pm01p;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombres, apellidos, telefono;
    Button btnproceso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres= (EditText) findViewById(R.id.nombres);
        apellidos= (EditText) findViewById(R.id.apellidos);
        telefono= (EditText) findViewById(R.id.telefono);
        btnproceso= (Button) findViewById(R.id.btn_procesar);

        btnproceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AddPerson();
            }
        });
    }

    private void AddPerson()
    {
        SQLiteConexion conexion = SQLiteConexion( this, Transacciones.DBName, null, 1);
        SQLiteDatabase db = conexion.getReadableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres, nombres.getText().toString());
    }


}