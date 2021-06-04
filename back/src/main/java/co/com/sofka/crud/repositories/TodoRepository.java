package co.com.sofka.crud.repositories;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entities.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    String queryAll = "select new co.com.sofka.crud.dto.TodoDTO(t.id, t.name, t.completed, t.groupListId)"
            + " from Todo t"
            + " where 1=1";

    @Query(value = queryAll)
    public List<TodoDTO> getAll();

    @Query(value = queryAll + "and t.id=?1")
    public List<TodoDTO> getTodoById(int id);

}
