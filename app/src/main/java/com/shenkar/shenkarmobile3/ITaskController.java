package com.shenkar.shenkarmobile3;

import java.util.List;

/**
 * Created by david on 10/11/2015.
 */
public interface ITaskController {
    List<Task> GetTasks();
    void addTask(String newTask);
}
