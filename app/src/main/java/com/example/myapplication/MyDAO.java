package com.example.myapplication;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDAO {

    @Insert
    public void inserirUsuario(Usuario usuario);

    @Delete
    public void deletarUsuario(Usuario usuario);

    @Query("select *from usuarios")
    public List<Usuario> listarUsuario();

    @Update
    public void alterarDadosUsuario(Usuario usuario);

}
