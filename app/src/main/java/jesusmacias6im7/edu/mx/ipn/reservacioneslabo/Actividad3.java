package jesusmacias6im7.edu.mx.ipn.reservacioneslabo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Profesor on 07/02/2019.
 */

public class Actividad3 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3);

    }

    public void volver(View v) {
        Intent envia = new Intent(this, Main.class);
        finish();
        startActivity(envia);
    }

}
