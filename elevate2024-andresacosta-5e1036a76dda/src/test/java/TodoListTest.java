import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mallon.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TodoListTest {

    @Mock
    TodoItem todoItem;

    TodoList todoList;

    @BeforeEach
    public void setup() {
        todoList = new TodoList("Me");
        todoItem = mock(TodoItem.class);
    }

    @Test
    public void testAddTodo() {

        when(todoItem.getTitle()).thenReturn("ItemTitle");
        todoList.addTodo(todoItem);
        // get todo item out of list
        // verify that call getTitle returns the value ItemTitle
        Iterable <TodoItem> items = todoList.getTodos(); //items contains all the todos from todoList
        for(TodoItem item : items){// using for loop to go through all the todos in items
            assertEquals("ItemTitle", item.getTitle()); // checking if expected is in item that now contains the todos

        }










//        TodoItem item = new TodoItem("Test Item");
//        TodoList list = new TodoList("Test List");
//        boolean result = list.addTodo(item);
//        assertTrue(result, "Should return true, when item is added");
    }

    @Test
    public void testGetAllTodos() {

        when(todoItem.getTitle()).thenReturn("ItemTitle");
        todoList.addTodo(todoItem);


        Iterable <TodoItem> items = todoList.getAllTodos();
        for(TodoItem item : items){
            assertEquals("ItemTitle", item.getTitle());

        }



//        TodoList list = new TodoList("Test List");
//        TodoItem item1 = new TodoItem("Test Item1");
//        TodoItem item2 = new TodoItem("Test Item2");
//
//        list.addTodo(item1);
//        list.addTodo(item2);
//
//        Iterable<TodoItem> allTodosInTheList = list.getAllTodos();
//        List<TodoItem> todoListItems = new ArrayList<>();
//        for (TodoItem item: allTodosInTheList) {
//            todoListItems.add(item);
//        }
//        assertEquals(2, todoListItems.size(), "getAllTodos size should be 2");
//        assertTrue(todoListItems.contains(item1), "The list should contain item1");
//        assertTrue(todoListItems.contains(item2), "The list should contain item2");
    }


    @Test
    public void testGetTodosThatAreComplete() {

        when(todoItem.getTitle()).thenReturn("ItemTitle");
        todoList.addTodo(todoItem);


        Iterable<TodoItem> items = todoList.getTodos();
        for(TodoItem item : items){
            assertEquals("ItemTitle", item);

        }




//        TodoList list = new TodoList("Test List");
//        TodoItem item1 = new TodoItem("Test Item1");
//        TodoItem item2 = new TodoItem("Test Item2");
//
//        list.addTodo(item1);
//        list.addTodo(item2);
//        item1.setComplete();
//
//        Iterable<TodoItem> completedList = list.getTodos(true);
//        List<TodoItem> completedItems = new ArrayList<>();
//        for (TodoItem item: completedList) {
//            completedItems.add(item);
//        }
//        assertEquals(1, completedItems.size(), "getTodos(true) should return all complete todos");
//        assertTrue(completedItems.contains(item1), "The list should contain the complete item1");

    }

    @Test
    public void testcompleteAll(){
        when(todoItem.isComplete()).thenReturn(false);
        todoList.addTodo(todoItem);
//        todoList.completeAll()
       assertEquals(1, todoList.completeAll());


    }

    @Test
    public void testGetTodosThatAreIncomplete() {
        TodoList list = new TodoList("Test List");
        TodoItem item1 = new TodoItem("Test Item1");
        TodoItem item2 = new TodoItem("Test Item2");

        list.addTodo(item1);
        list.addTodo(item2);
        item1.setComplete();

        Iterable<TodoItem> incompleteList = list.getTodos(false);
        List<TodoItem> incompleteItems = new ArrayList<>();
        for (TodoItem item: incompleteList) {
            incompleteItems.add(item);
        }
        assertEquals(1, incompleteItems.size(), "getTodos(false) should return all incomplete todos");
        assertTrue(incompleteItems.contains(item2), "The list should contain the complete item2");
    }


    @Test
    public void testGetTodosIncompleteWithZeroArgument() {
        TodoList list = new TodoList("Test List");
        TodoItem item1 = new TodoItem("Test Item1");
        TodoItem item2 = new TodoItem("Test Item2");

        list.addTodo(item1);
        list.addTodo(item2);
        item1.setComplete();

        Iterable<TodoItem> incompleteList = list.getTodos();
        List<TodoItem> incompleteItems = new ArrayList<>();
        for (TodoItem item: incompleteList) {
            incompleteItems.add(item);
        }
        assertEquals(1, incompleteItems.size(), "getTodos() should return all incomplete todos");
        assertTrue(incompleteItems.contains(item2), "The list should contain the complete item2");
    }

}