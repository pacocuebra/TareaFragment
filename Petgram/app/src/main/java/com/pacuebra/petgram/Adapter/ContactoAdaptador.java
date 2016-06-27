package com.pacuebra.petgram.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pacuebra.petgram.Main2Activity;
import com.pacuebra.petgram.Pojo.Perro;
import com.pacuebra.petgram.R;

import java.util.ArrayList;

import static android.app.ProgressDialog.show;

/**
 * Created by Francisco on 14/06/2016.
 */

public class ContactoAdaptador extends  RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {

    ArrayList<Perro> contactos;
    Activity activity;

    public ContactoAdaptador(ArrayList<Perro> contactos, Activity activity){
            this.contactos = contactos;
        this.activity = activity;
    }
    @Override //Inflara el layout y lo pasara al viewholder para que el obtenga los views

    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_perro, parent, false);
        ContactoViewHolder holder = new ContactoViewHolder(v);
        return holder;
    }
//asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder,/*final*/ int position) {
       final Perro contacto = contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.tvnombre.setText(contacto.getNombre());
        //contactoViewHolder.bthueso.setImageResource(contacto.getBthueso());
        contactoViewHolder.btlike.setImageResource(contacto.getBtlike());

        /*contactoViewHolder.bthueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, contacto.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity,Main2Activity.class);
                intent.putExtra("NOMBRE",contacto.getNombre());
                intent.putExtra("FOTO",contacto.getFoto());
                activity.startActivity(intent);
            }
        });*/

        contactoViewHolder.btlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste like a " + contacto.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {  //Cantidad de elementos que contiene la lista de contactos
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder /*implements View.OnClickListener*/ {

        private ImageView imgFoto;
        private TextView tvnombre;
        //private ImageButton bthueso;
        private ImageButton btlike;

        public ContactoViewHolder(final View itemView) {
            super(itemView);

            imgFoto  = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvnombre = (TextView)  itemView.findViewById(R.id.tvnombre);
           // bthueso = (ImageButton) itemView.findViewById(R.id.bthueso);
            btlike = (ImageButton) itemView.findViewById(R.id.btlike);
        }

    }
}
