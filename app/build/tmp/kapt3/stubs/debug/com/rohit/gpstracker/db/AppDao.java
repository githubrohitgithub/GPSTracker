package com.rohit.gpstracker.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lcom/rohit/gpstracker/db/AppDao;", "", "deleteAllRecords", "", "getAllRecords", "Landroidx/lifecycle/LiveData;", "", "Lcom/rohit/gpstracker/model/RepositoryData;", "insertRecords", "repositoryData", "app_debug"})
public abstract interface AppDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM repositories")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.rohit.gpstracker.model.RepositoryData>> getAllRecords();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertRecords(@org.jetbrains.annotations.NotNull()
    com.rohit.gpstracker.model.RepositoryData repositoryData);
    
    @androidx.room.Query(value = "DELETE FROM repositories")
    public abstract void deleteAllRecords();
}