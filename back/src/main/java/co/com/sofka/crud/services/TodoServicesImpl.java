package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repositories.TodoRepository;
import co.com.sofka.crud.utils.TodoMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServicesImpl implements TodoService {

    @Autowired
    private TodoRepository repository;
    @Autowired
    private TodoMap mapper;

    @Override
    public Iterable<TodoDTO> list() {
        Iterable<Todo> todos = repository.findAll();
        return mapper.toTodoDTOS(todos);
    }

    @Override
    public TodoDTO save(TodoDTO todoDto) {
        Todo todo = mapper.toTodo(todoDto);
        return mapper.toTodoDTO(repository.save(todo));
    }

    @Override
    public void delete(Long id) {
        repository.delete(mapper.toTodo(get(id)));
    }

    @Override
    public TodoDTO get(Long id) {
        return mapper.toTodoDTO(repository.findById(id).orElseThrow());
    }

}
