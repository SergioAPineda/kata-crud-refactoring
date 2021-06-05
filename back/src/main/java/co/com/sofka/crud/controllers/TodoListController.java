package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoListController {

    @Autowired
    private TodoListService service;

    @GetMapping(value = "api/todoLists")
    public Iterable<TodoListDTO> list() {
        return service.list();
    }

    @PostMapping(value = "api/todoList")
    public TodoListDTO save(@RequestBody TodoListDTO todoListDTO) {
        return service.save(todoListDTO);
    }

    @PutMapping(value = "api/todoList")
    public TodoListDTO update(@RequestBody TodoListDTO todoListDTO) {
        if (todoListDTO.getId() != null) {
            return service.save(todoListDTO);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/todoList")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todoList")
    public TodoListDTO get(@PathVariable("id") Long id) {
        return service.get(id);
    }
}
