package com.example.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlterarDadosUsuarioFragment extends Fragment {

    EditText edId, edNovoNome, edNovoEmail;
    Button btAlterar;

    public AlterarDadosUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alterar_dados_usuario, container, false);

        edId = view.findViewById(R.id.editTextIdAlterarFragAlterar);
        edNovoEmail = view.findViewById(R.id.editTextEmailAlterarFragAlterar);
        edNovoNome = view.findViewById(R.id.editTextNomeAlterarFragAlterar);
        btAlterar = view.findViewById(R.id.buttonAlterarFragAlterar);

        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edId.getText().toString());
                String nome = edNovoNome.getText().toString();
                String email = edNovoEmail.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setId(id);
                usuario.setNome(nome);
                usuario.setEmail(email);

                MainActivity.myAppDatabase.myDAO().alterarDadosUsuario(usuario);


            }
        });

        return view;
    }

}
