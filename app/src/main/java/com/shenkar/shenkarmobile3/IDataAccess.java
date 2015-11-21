package com.shenkar.shenkarmobile3;

import java.util.List;

/**
 * Created by david on 16/11/2015.
 */
public interface IDataAccess {
    List<Task> getTasks();

    void addTask(String newTAsk);
}
