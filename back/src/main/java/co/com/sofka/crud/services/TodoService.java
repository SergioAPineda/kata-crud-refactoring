package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDTO;

public interface TodoService {

    public Iterable<TodoDTO> list();
    public TodoDTO save(TodoDTO toDoDTO);
    public void delete(Long id);
    public TodoDTO get(Long id);

}
