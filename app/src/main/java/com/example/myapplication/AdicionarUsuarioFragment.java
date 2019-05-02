package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdicionarUsuarioFragment extends Fragment {

    EditText edId, edNome, edEmail;
    Button btInserir;


    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adicionar_usuario, container, false);

        edId = view.findViewById(R.id.editTextIdInserir);
        edEmail = view.findViewById(R.id.editTextEmailInserir);
        edNome = view.findViewById(R.id.editTextNomeInserir);
        btInserir = view.findViewById(R.id.buttonInserir);


        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edId.getText().toString());
                String nome= edNome.getText().toString();
                String email = edEmail.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setEmail(email);
                usuario.setId(id);
                usuario.setNome(nome);

                MainActivity.myAppDatabase.myDAO().inserirUsuario(usuario);

            }
        });

        return view;
    }

}
