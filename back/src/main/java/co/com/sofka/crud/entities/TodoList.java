package co.com.sofka.crud.entities;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto._DTOEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TodoList {
    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private Long id;
    private String todoListId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)


    private Set<Todo> todo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodoListId() {
        return todoListId;
    }

    public void setTodoListId(String todoListId) {
        this.todoListId = todoListId;
    }

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setTodo(Set<Todo> todo) {
        this.todo = todo;
    }
}
