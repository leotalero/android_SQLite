package com.unir.leonardotalero.myapplicationlogin;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button,buttonSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/




        FloatingActionButton next = (FloatingActionButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                botonprimeraActividadClick(view);
            }
        });

        button = (Button) findViewById(R.id.buttonToast);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
               toastMessage("Prueba");

            }
        });




        buttonSalir = (Button) findViewById(R.id.buttonSalri);

        buttonSalir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                botonDialogoSalirClick();


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


            // Handle item selection
        switch (item.getItemId()) {
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

    public void botonprimeraActividadClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(intent);
    }
    public void botonsegundaActividadClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
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
    public void botonDialogoClick(View v)
    {

        FragmentManager fragmentManager=getFragmentManager();
        DialogoAlerta dialogo=new DialogoAlerta("Información","Esto es un mensaje de alerta");
        dialogo.show(fragmentManager,"tagAlerta");



        //Intent intent = new Intent(getApplicationContext(), SegundaActividad.class);
        //startActivity(intent);
    }

    public void toastMessage(String texto) {

        Context context = getApplicationContext();
        CharSequence text = texto;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    public void botonDialogoSalirClick()
    {

        FragmentManager fragmentManager=getFragmentManager();
        DialogoSalir dialogo=new DialogoSalir("Salir","Desea salir de la aplicación");
        dialogo.show(fragmentManager,"tagAlerta");



        //Intent intent = new Intent(getApplicationContext(), SegundaActividad.class);
        //startActivity(intent);
    }
}
