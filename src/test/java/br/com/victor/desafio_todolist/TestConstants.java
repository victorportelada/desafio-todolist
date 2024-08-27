package br.com.victor.desafio_todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.victor.desafio_todolist.entity.Todo;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@v", "Curtir", false, 1));
            add(new Todo(9996L, "@v", "Comentar", false, 1));
            add(new Todo(9997L, "@v", "Compartilhar", false, 1));
            add(new Todo(9998L, "@v", "Se Inscrever", false, 1));
            add(new Todo(9999L, "@v", "Ativar as Notificações", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}