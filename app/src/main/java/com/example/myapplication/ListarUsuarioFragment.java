package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListarUsuarioFragment extends Fragment {

    TextView tvListaUsuarios;


    public ListarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listar_usuario, container, false);

        tvListaUsuarios = view.findViewById(R.id.tvUsuarios);

        List<Usuario> usuarioList = MainActivity.myAppDatabase.myDAO().listarUsuario();

        String info = "";
        for (Usuario usuario: usuarioList) {
            int id = usuario.getId();
            String nome = usuario.getNome();
            String email = usuario.getEmail();

            info = info + "\n\n" + "Id: " + id + "\n" + "Nome: " + nome
                    + "\n" + "e-mail: " + email;
        }
        tvListaUsuarios.setText(info);


        return view;
    }

}
