package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment implements View.OnClickListener {


    Button btAdicionar, btListar, btExcluir, btAlterar;


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btAdicionar = view.findViewById(R.id.buttonCadUsuario);
        btAlterar= view.findViewById(R.id.buttonAlterarUsuario);
        btExcluir = view.findViewById(R.id.buttonDeletarUsuario);
        btListar = view.findViewById(R.id.buttonListarUsuario);

        btAdicionar.setOnClickListener(this);
        btListar.setOnClickListener(this);
        btExcluir.setOnClickListener(this);
        btAlterar.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCadUsuario:

                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameContainer, new AdicionarUsuarioFragment()).
                        addToBackStack(null).
                        commit();
                break;
            case R.id.buttonDeletarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameContainer, new DeletarUsuarioFragment()).
                        addToBackStack(null).
                        commit();
                break;
            case R.id.buttonListarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameContainer, new ListarUsuarioFragment()).
                        addToBackStack(null).
                        commit();
                break;

            case R.id.buttonAlterarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameContainer, new AlterarDadosUsuarioFragment()).
                        addToBackStack(null).
                        commit();
                break;


        }
    }
}
