package com.example.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.modelo.TblMedico;


public interface IMedicoRepositorio extends CrudRepository<TblMedico,Integer> {

}
