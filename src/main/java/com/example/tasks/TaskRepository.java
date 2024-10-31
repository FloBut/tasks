package com.example.tasks;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TaskRepository {
    private  final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
    }
    public List<Task> findAll(){
        return  tasks;
    }
    public void create (Task task){
        tasks.add(task);

    }
    public boolean remove (String id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
    @PostConstruct
    private void init() {
        tasks.addAll(List.of(
                new Task("Complete project proposal"),
                new Task("Review code change")

        ));
    }

}
