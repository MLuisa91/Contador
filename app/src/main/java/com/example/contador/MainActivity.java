package com.example.contador;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.contador.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;

    }

    public void incrementaContador(View vista){
        contador++;

        mostrarResultado();
    }

    public void restaContador(View vista){
        contador--;
        mostrarResultado();
    }

    public void reseteaContador(View vista){
        contador=0;
        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado=(TextView)findViewById(R.id.contadorPulsaciones);
        textoResultado.setText("Contador: " + contador);

    }

}