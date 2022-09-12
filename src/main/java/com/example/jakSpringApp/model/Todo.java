package com.example.jakSpringApp.model;

import com.example.jakSpringApp.entity.TodoEntity;

public class Todo {
    private Long id;
    private String title;
    private Boolean completed;

    public static Todo toModel(TodoEntity todo) {
        Todo model = new Todo();
        model.setId(todo.getId());
        model.setCompleted(todo.getCompleted());
        model.setId(todo.getId());
        model.setTitle(todo.getTitle());
        return model;
    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
