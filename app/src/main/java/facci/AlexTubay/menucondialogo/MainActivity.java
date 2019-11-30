package facci.AlexTubay.menucondialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.opcion_login:

                Dialog dialogo = new Dialog(MainActivity.this);
                dialogo.setContentView(R.layout.xml_login);

                final EditText txt_usu = (EditText)dialogo.findViewById(R.id.txt_usu);
                final EditText txt_pw = (EditText)dialogo.findViewById(R.id.txt_pw);
                Button btn_aut = (Button)dialogo.findViewById(R.id.btn_aut);

                btn_aut.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),txt_usu.getText().toString() + " " + txt_pw.getText().toString(),Toast.LENGTH_LONG).show();
                    }
                });

                dialogo.show();
                break;
            case R.id.opcion_registrar:
                Dialog dialogo_1 = new Dialog(MainActivity.this);
                dialogo_1.setContentView(R.layout.activity_registro);
                final EditText txt_id =(EditText)dialogo_1.findViewById(R.id.id_reg);
                final EditText txt_nom = (EditText)dialogo_1.findViewById(R.id.nom_reg);
                final EditText tlf_reg = (EditText)dialogo_1.findViewById(R.id.tlf_reg);
                Button btn_reg = (Button)dialogo_1.findViewById(R.id.btn_reg);

                btn_reg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), txt_nom.getText().toString() + " fué registrado", Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_1.show();

                break;
        }
        return true;
    }
}
