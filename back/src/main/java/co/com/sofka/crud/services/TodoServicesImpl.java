package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto.TodoDTOResponse;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repositories.TodoRepository;
import co.com.sofka.crud.utils.Map;
import com.sun.xml.bind.v2.TODO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServicesImpl implements TodoService {

    @Autowired
    private TodoRepository repository;

    @Autowired
    private Map maper;

    public TodoDTOResponse save(TodoDTO todoDTO){
        Todo obj = new Todo();
        TodoDTOResponse response = new TodoDTOResponse();

        try {
            obj = (Todo)maper.convertToEntity(todoDTO, obj);
            obj = repository.save(obj);

            response.setListDTO(repository.getTodoById(obj.getId()));
        } catch (Exception e) {
            System.out.println("No se pudo crear la tarea");
        }
        return response;
    }

    public TodoDTOResponse getAll() {
        TodoDTOResponse response = new TodoDTOResponse();

        try {
            response.setListDTO(repository.getAll());
        } catch (Exception e){
            System.out.println("No se obtuvo datos");
        }
        return response;
    }

    public TodoDTOResponse get(int id) {
        TodoDTOResponse response = new TodoDTOResponse();

        try {
            response.setListDTO(repository.getTodoById(id));
        } catch (Exception e) {
            System.out.println("No existe");
        }
        return response;
    }

    public TodoDTOResponse delete(int id) {
        TodoDTOResponse response = new TodoDTOResponse();

        try {
            repository.deleteById(id);
            response.delete(id);
        } catch (Exception e) {
            System.out.println("No se puede eliminar, porque no existe");
        }
        return response;
    }

}
