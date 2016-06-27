package com.pacuebra.petgram.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pacuebra.petgram.Adapter.ContactoAdaptador;
import com.pacuebra.petgram.Pojo.Perro;
import com.pacuebra.petgram.R;

import java.util.ArrayList;

/**
 * Created by Francisco on 25/06/2016.
 */
public class RecyclerView_Fragment extends Fragment {
   private RecyclerView listaPerros;
   ArrayList<Perro> contactos;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaPerros = (RecyclerView) v.findViewById(R.id.rvPerros);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);



        listaPerros.setLayoutManager(llm);
        contactos = new ArrayList<Perro>();

        contactos.add(new Perro(R.drawable.basset_hound, "Basset Hound",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.boxer, "Boxer",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.bulldog, "Bulldog",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.chihuahua, "Chihuahua",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.dalmata, "Dalmata",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.gran_danes, "Gran Danes",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.husky_siberiano, "Husky Siberiano",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.labrador, "Labrador",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.lakeland_terrier, "Lakeland Terrier",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.pastor_aleman, "Pastor Aleman",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.pitbull, "Pitbull",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.pomerania, "Pomerania",R.drawable.dog_bone_48));
        contactos.add(new Perro(R.drawable.r_pug2, "Pug",R.drawable.dog_bone_48));

        inciarAdaptador();

        return v;
    }

    public void inciarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,getActivity());
        listaPerros.setAdapter(adaptador);
    }


}
