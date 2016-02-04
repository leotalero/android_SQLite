package com.unir.leonardotalero.myapplicationlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class Pantalla4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);


        //textusuario.setText("Bienvenido: "+usuario+" with password finished in:"+password.substring(password.length()-3,password.length()-1));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pantalla4, menu);


        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.pantalla_principal:
                botonprincipalActividadClick();
                return true;
            case R.id.pantalla_registro:
                botonprimeraActividadClick();
                return true;
            case R.id.pantalla_login:
                botonsegundaActividadClick();
                return true;
            case R.id.pantalla3:
                botonPantalla3_ActividadClick();
                return true;
            case R.id.pantalla4:
                botonPantalla4_ActividadClick();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void botonprincipalActividadClick()
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void botonprimeraActividadClick()
    {
        Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(intent);
    }
    public void botonsegundaActividadClick()
    {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }
    public void botonPantalla3_ActividadClick()
    {
        Intent intent = new Intent(getApplicationContext(), Pantalla3_Activity.class);
        startActivity(intent);
    }
    public void botonPantalla4_ActividadClick()
    {
        Intent intent = new Intent(getApplicationContext(), Pantalla4_Activity.class);
        startActivity(intent);
    }
}
