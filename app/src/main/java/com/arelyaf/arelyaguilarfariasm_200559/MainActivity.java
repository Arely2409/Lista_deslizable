package com.arelyaf.arelyaguilarfariasm_200559;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Configuracion> listaConfiguacion;
    private ConfiguracionAdapter configuracionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaConfiguacion = new ArrayList<>();

        listaConfiguacion.add(new Configuracion(R.drawable.ic_wifi, "Wifi", "Wi-fi, Bluetooth, Perfil fuera de linea, Uso de datos"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_volumen, "Sonidos y vibracion", "Modo de sonido, Tono de llamadas"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_notificaciones, "Notificaciones", "Notificaciones de aplicaciones, Barra de estado"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_pantalla, "Pantalla", "Brillo, Filtro de luz, Pantalla de inicio"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_fondopan, "Fondo de pantalla", "Fondos de pantalla, Fondos de pantalla animados"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_temas, "Temas", "Temas, Fondos de pantalla, Fondo de pantalla"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_seguridad, "Batos biométricos y seguridad", "Reconocimiento facial, Huellas digitales, Localización"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_ubicacion, "Ubicación", "Ajustes de ubicación, Solicitud de ubicación"));
        listaConfiguacion.add(new Configuracion(R.drawable.ic_actualizacion, "Actualización de software", "Descargar actualizaciones, Últimas actualizaciones"));

        configuracionAdapter = new ConfiguracionAdapter(getApplicationContext(), 0, listaConfiguacion);
        ListView listView = findViewById(R.id.listviewConfiguracion);
        listView.setAdapter(configuracionAdapter);
    }
}