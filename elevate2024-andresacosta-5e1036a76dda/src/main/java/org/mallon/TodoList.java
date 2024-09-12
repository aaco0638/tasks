package org.mallon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private String name;

    private List<TodoItem> todos;

    public TodoList(String name) {
        this.name = name;
        this.todos = new ArrayList<>();
    }

    public Iterable<TodoItem> getTodos() {
        return this.getTodos(false);
    }

    public Iterable<TodoItem> getTodos(boolean complete) {
        return this.todos.stream().filter(i -> complete == i.isComplete()).collect(Collectors.toList());
    }

    public Iterable<TodoItem> getAllTodos() {
        return this.todos;
    }

    public boolean addTodo(TodoItem i) {
        this.todos.add(i);
        return true;
    }

    public int completeAll(){
        int count = 0;
//LOOP THROUGH THE LIST THEN DO IF
        for(TodoItem item : todos){ //loop through list of items
            if(!item.isComplete()){ //if item is not complete
                item.isComplete(); //make it complete
                count+=1; //add 1 to count

            }
        }

        return count; //print the count

    }


}
