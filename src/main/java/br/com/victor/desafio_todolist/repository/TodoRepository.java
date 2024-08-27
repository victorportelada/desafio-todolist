package br.com.victor.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victor.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}