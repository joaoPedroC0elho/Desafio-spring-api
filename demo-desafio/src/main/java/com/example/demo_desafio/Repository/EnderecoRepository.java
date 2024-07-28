package com.example.demo_desafio.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_desafio.Model.*;


@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}