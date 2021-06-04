package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto.TodoDTOResponse;

public interface TodoService {

    public TodoDTOResponse save(TodoDTO todo);
    public TodoDTOResponse getAll();
    public TodoDTOResponse  get(int id);
}
