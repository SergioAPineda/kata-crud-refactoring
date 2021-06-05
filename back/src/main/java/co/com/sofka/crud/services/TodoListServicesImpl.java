package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.entities.TodoList;
import co.com.sofka.crud.repositories.TodoListRepository;
import co.com.sofka.crud.utils.TodoListMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListServicesImpl implements TodoListService {
    @Autowired
    private TodoListRepository repository;
    @Autowired
    private TodoListMap map;

    @Override
    public Iterable<TodoListDTO> list() {
        Iterable<TodoList> listsOfTodoList = repository.findAll();
        return map.toTodoListDTOS(listsOfTodoList);
    }

    @Override
    public TodoListDTO save(TodoListDTO todoListDTO) {
        TodoList ListTodo = map.toTodoList(todoListDTO);
        return map.toTodoListDTO(repository.save(ListTodo));
    }

    @Override
    public void delete(Long id) {
        repository.delete(map.toTodoList(get(id)));
    }

    @Override
    public TodoListDTO get(Long id) {
        return map.toTodoListDTO(repository.findById(id).orElseThrow());
    }
}
