package com.bolsadeideas.springboot.backend.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
