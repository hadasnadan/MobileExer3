package com.shenkar.shenkarmobile3;

import java.util.List;

/**
 * Created by david on 12/11/2015.
 */
public class TaskController implements ITaskController {

    private IDataAccess dao;

    TaskController() {
        dao = MockDAO.getInstance();
    }

    @Override
    public List<Task> GetTasks() {
        return dao.getTasks();
    }

    @Override
    public void addTask(String newTask) {
        dao.addTask(newTask);
    }
}
