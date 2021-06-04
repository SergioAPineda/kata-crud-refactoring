package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto.TodoDTOResponse;
import co.com.sofka.crud.services.TodoService;
import co.com.sofka.crud.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.sql.Types.NULL;

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

    @DeleteMapping(value = "api/{id}/todo")
    public TodoDTOResponse delete(@PathVariable("id")int id){
        return service.delete(id);
    }

    @PutMapping(value = "api/todo")
    public TodoDTOResponse update(@RequestBody TodoDTO todoDTO){
        if(todoDTO.getId() != NULL){
            return service.save(todoDTO);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

}
