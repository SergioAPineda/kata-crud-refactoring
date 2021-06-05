package co.com.sofka.crud.utils;

import co.com.sofka.crud.dto.TodoListDTO;
import co.com.sofka.crud.entities.TodoList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TodoMap.class})
public interface TodoListMap {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "todos", target = "listOfTodoDTO"),
    })
    TodoListDTO toTodoListDTO(TodoList todoList);

    Iterable<TodoListDTO> toTodoListDTOS(Iterable<TodoList> todoLists);

    @InheritInverseConfiguration
    TodoList toTodoList(TodoListDTO todoListDTO);
}
