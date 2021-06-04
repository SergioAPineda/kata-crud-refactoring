package co.com.sofka.crud.dto;

import org.hibernate.validator.constraints.Range;

import java.util.ArrayList;
import java.util.List;

import static org.apache.catalina.security.SecurityUtil.remove;

public class TodoDTOResponse {
    List<TodoDTO> todoListDTO;

    public TodoDTOResponse() {
        super();
        todoListDTO = new ArrayList<TodoDTO>();
    }

    public List<TodoDTO> getListDTO() {
        return todoListDTO;
    }

    public void setListDTO(List<TodoDTO> todoListDTO) {
        this.todoListDTO = todoListDTO;
    }

    public void addListDTO(TodoDTO todoDTO) {
        this.todoListDTO.add(todoDTO);
    }

    public void delete(int id) {
        this.todoListDTO = todoListDTO;
    }
}
