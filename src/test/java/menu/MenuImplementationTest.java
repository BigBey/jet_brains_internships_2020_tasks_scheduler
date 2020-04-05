package menu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonNull;
import json_utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;

import static org.junit.Assert.*;

public class MenuImplementationTest {

    @Test
    public void emptyFile_CreateList() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        int actual = menu.createList("New list");
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_DeleteList() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.deleteList("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_AddTaskToList() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.addTaskToList("Somebody's list", "some task");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_DeleteTask() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.deleteTask("Somebody's list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_MarkTask() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.markTask("Somebody's list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_ShowLists() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showLists();
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_ShowTasks() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showTasks("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyFile_ShowOnlyNotCompletedTasks() {

        JsonUtils.writeToJson(null);

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showOnlyNotCompletedTasks("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_CreateList() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        int actual = menu.createList("New list");
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_DeleteList() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.deleteList("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_AddTaskToList() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.addTaskToList("Somebody's list", "some task");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_DeleteTask() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.deleteTask("Somebody's list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_MarkTask() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.markTask("Somebody's list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_ShowLists() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showLists();
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_ShowTasks() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showTasks("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void emptyHashMapOfLists_ShowOnlyNotCompletedTasks() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.showOnlyNotCompletedTasks("Somebody's list");
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_AddTaskToList() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.addTaskToList("New list", "some task");
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_DeleteTask() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.deleteTask("New list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_MarkTask() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.markTask("New list", 0);
        menu.writeToJson();
        Assert.assertEquals(0, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_ShowLists() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.showLists();
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_ShowTasks() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.showTasks("New list");
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewEmptyList_ShowOnlyNotCompletedTasks() {

        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();
        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);
        actual = menu.showOnlyNotCompletedTasks("New list");
        menu.writeToJson();
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void addManyTasks() {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.createList("New list");

        int numberOfTasks = 100_000;

        int countOfMarkedTasks = (int) (Math.random() * numberOfTasks);
        int countOfDeletedTasks = (int) (Math.random() * numberOfTasks);
        int tasksCount = numberOfTasks;

        for (int i = 0; i < numberOfTasks; i++) {
            int actual = menu.addTaskToList("New list", "Task" + i);
            Assert.assertEquals(1, actual);
        }

        while (countOfMarkedTasks > 0) {
            int index = (int) (Math.random() * numberOfTasks);
            int actual = menu.markTask("New list", index);
            Assert.assertEquals(1, actual);
            countOfMarkedTasks--;
        }

        while (countOfDeletedTasks > 0) {
            int index = (int) (Math.random() * tasksCount);
            int actual = menu.markTask("New list", index);
            Assert.assertEquals(1, actual);
            tasksCount--;
            countOfDeletedTasks--;
        }

        menu.writeToJson();

        menu.readFromJson();
        int actual = menu.showTasks("New list");
        Assert.assertEquals(1, actual);
        actual = menu.showOnlyNotCompletedTasks("New list");
        Assert.assertEquals(1, actual);

        JsonUtils.writeToJson(new HashMap<>());
    }

    @Test
    public void oneNewList_indexOfTaskOutOfBound() {
        JsonUtils.writeToJson(new HashMap<>());

        MenuImplementation menu = new MenuImplementation();

        menu.readFromJson();

        int actual = menu.createList("New list");
        Assert.assertEquals(1, actual);

        int size = (int) (Math.random() * 100_000);
        int index_out_of_bound = size + ((int) (Math.random() * 1_000));

        for (int i = 0; i < size; i++) {
            actual = menu.addTaskToList("New list", "Task" + i);
            Assert.assertEquals(1, actual);
        }

        actual = menu.deleteTask("New list", index_out_of_bound);
        Assert.assertEquals(0, actual);

        actual = menu.markTask("New list", index_out_of_bound);
        Assert.assertEquals(0, actual);

        menu.writeToJson();


        JsonUtils.writeToJson(new HashMap<>());
    }
}