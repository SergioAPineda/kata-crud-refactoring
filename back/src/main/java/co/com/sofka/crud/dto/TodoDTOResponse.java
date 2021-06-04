package co.com.sofka.crud.dto;

import java.util.ArrayList;
import java.util.List;

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
}
