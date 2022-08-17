package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    ListView lstGatos;

    //cria os dados
    String nomeGato[] = {"Tom", "Soneca", "Pudim", "Trovão"};
    String descricaoGato[] = {"Quero ser adotado", "Quero ser adotado", "Quero ser adotado", "Quero ser adotado"};
    String numGato[] = {"5.0", "7.0", "10.0", "9.5"};
    int imagemGato []={
            R.drawable.gato_lingua, R.drawable.gato_ciames,
            R.drawable.gato_cinza, R.drawable.gato_marrom
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstGatos = view.findViewById(R.id.lstGatos);

        //Instanciando a classe adaptadora
        AdpterGatos adpterGatos = new AdpterGatos();

        //Carregar Lista com adaptador
        lstGatos.setAdapter(adpterGatos);

        return view;
    }
    //Criando Inner Class
    public class AdpterGatos extends BaseAdapter{

        @Override
        public int getCount() {

            return nomeGato.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarando as Variaveis do modelo
            TextView txtNomeGato, txtDescricaoGato, txtNumGato;
            ImageView imgGato;


            //Intanciar a janela do modelo no adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_gatos, null);

            txtNomeGato = v.findViewById(R.id.txtNomeGato);
            txtDescricaoGato = v.findViewById(R.id.txtDescricaoGato);
            txtNumGato = v.findViewById(R.id.txtNumGato);

            imgGato = v.findViewById(R.id.imgModeloGato);

            //Inserindo valores nos objetos do modelo
            txtNomeGato.setText(nomeGato[i]);
            txtDescricaoGato.setText(descricaoGato[i]);
            txtNumGato.setText(numGato[i]);
            imgGato.setImageResource(imagemGato[i]);
            return v;
        }
    }
}