package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoListDTO;

public interface TodoListService {
    public Iterable<TodoListDTO> list();
    public TodoListDTO save(TodoListDTO todoListDTO);
    public void delete(Long id);
    public TodoListDTO get(Long id);
}
