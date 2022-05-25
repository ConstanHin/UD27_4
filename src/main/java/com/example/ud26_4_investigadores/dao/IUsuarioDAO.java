package com.example.ud26_4_investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud26_4_investigadores.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}