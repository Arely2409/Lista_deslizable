package com.arelyaf.arelyaguilarfariasm_200559;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracionAdapter extends ArrayAdapter<Configuracion> {

    ArrayList<Configuracion> listaConfiguracion;

    public ConfiguracionAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Configuracion> objects) {
        super(context, resource, objects);

        listaConfiguracion = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View elem = convertView;

        Configuracion configuracionActual = listaConfiguracion.get(position);

        if (elem == null) {
            elem = LayoutInflater.from(getContext()).inflate(R.layout.layout_elementos, parent, false);
        }

        ImageView imagenicono = elem.findViewById(R.id.imgIcono);
        imagenicono.setImageResource(configuracionActual.getImagen());

        TextView tituloicono = elem.findViewById(R.id.txtTitulo);
        tituloicono.setText(configuracionActual.getTitulo());

        TextView descripcionicono = elem.findViewById(R.id.txtDescripcion);
        descripcionicono.setText(configuracionActual.getDescripcion());


        return elem;
    }
}
