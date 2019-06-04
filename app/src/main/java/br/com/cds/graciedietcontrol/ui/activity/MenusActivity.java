package br.com.cds.graciedietcontrol.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.cds.graciedietcontrol.R;

public class MenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GracieDiet - Control");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cadastro_grupo:
                Toast.makeText(this,
                        "Tela de Grupos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.cadastro_sub_grupo:
                Toast.makeText(this,
                        "Tela de Sub Grupos",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.cadastro_alimento:
                Toast.makeText(this,
                        "Tela de Alimentos",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
