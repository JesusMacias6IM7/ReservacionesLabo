package jesusmacias6im7.edu.mx.ipn.reservacioneslabo;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends Activity {

    String nombre = "", fecha = "", hora = "", servicio = "", coctel = "", decoracion = "";
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        String personasText;


        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");
        servicio = recibe.getString("servicio");
        coctel = recibe.getString("coctel");
        decoracion = recibe.getString("decoracion");

        if(personas == 1)
            personasText = "persona";
        else
            personasText = "personas";

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
                + " " + personasText + "\nFecha: " + fecha + "\nHora: " + hora + "\nTipo de servicio: " + servicio + "\n" +
                "Coctel de Bienvenida: " + coctel + "\nDecoración: " + decoracion);

    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, Main.class);
        finish();
        startActivity(envia);
    }

    public void siguiente(View v) {
        Intent envia = new Intent(this, Actividad3.class);
        finish();
        startActivity(envia);
    }
}
