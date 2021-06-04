package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto.TodoDTOResponse;
import co.com.sofka.crud.services.TodoService;
import co.com.sofka.crud.services.TodoServicesImpl;
import co.com.sofka.crud.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    TodoService service;

    @PostMapping (value = "api/todo")
    public TodoDTOResponse save(@RequestBody TodoDTO todoDTO){
        return service.save(todoDTO);
    }

    @GetMapping(value = "api/todos")
    public TodoDTOResponse getAll() {
        return service.getAll();
    }

    @GetMapping(value = "api/{id}/todo")
    public TodoDTOResponse getId(@PathVariable("id") int id) {
        return service.get(id);
    }

/*    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }*/

/*    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }*/

}
