package co.com.sofka.crud.dto;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class TodoListDTO {

    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "list")
    private List<TodoDTO> listOfTodoDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoDTO> getListOfTodoDTO() {
        return listOfTodoDTO;
    }

    public void setListOfTodoDTO(List<TodoDTO> listOfTodoDTO) {
        this.listOfTodoDTO = listOfTodoDTO;
    }
}
