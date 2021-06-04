package co.com.sofka.crud.repositories;

import co.com.sofka.crud.entities.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends CrudRepository<TodoList, Long> {

}
