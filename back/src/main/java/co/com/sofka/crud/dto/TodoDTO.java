package co.com.sofka.crud.dto;

import java.io.Serializable;

public class TodoDTO implements _DTOEntity {
    private int id;
    private String name;
    private boolean completed;
    private String groupListId;

    public TodoDTO() {
    }

    public TodoDTO(int id, String name, boolean completed, String groupListId) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.groupListId = groupListId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(String groupListId) {
        this.groupListId = groupListId;
    }
}
