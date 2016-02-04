package com.unir.leonardotalero.myapplicationlogin;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;



/**
 * Created by leonardotalero on 12/13/15.
 */
public class DialogoSalir extends DialogFragment {


    public static  String TITULO="";
    public static  String MENSAJE="";


    public DialogoSalir() {
    }

    public DialogoSalir(String titulo, String mensaje) {
        TITULO=titulo;
        MENSAJE=mensaje;



    }

    @Override
    public Dialog onCreateDialog(Bundle saveInstaceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setMessage(MENSAJE)
                .setTitle(TITULO)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // do something...
                                salir();

                                Log.i("Dialogos", "salir App:" + TITULO + " mensaje:" + MENSAJE);
                            }
                        }
                )
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                dialog.cancel();
                                Log.i("Dialogos", "Usuario cancela salir:" + TITULO + " mensaje:" + MENSAJE);
                            }
                        }
                );
        return builder.create();
    };


    public void salir() {

        System.exit(0);

    }
}
