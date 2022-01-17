package com.rohit.room.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/rohit/room/network/RetroRepository;", "", "retroServiceInterface", "Lcom/rohit/room/network/RetroServiceInterface;", "appDao", "Lcom/rohit/room/db/AppDao;", "(Lcom/rohit/room/network/RetroServiceInterface;Lcom/rohit/room/db/AppDao;)V", "getAllRecords", "Landroidx/lifecycle/LiveData;", "", "Lcom/rohit/room/model/RepositoryData;", "insertRecord", "", "repositoryData", "makeApiCall", "query", "", "app_debug"})
public final class RetroRepository {
    private final com.rohit.room.network.RetroServiceInterface retroServiceInterface = null;
    private final com.rohit.room.db.AppDao appDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.rohit.room.model.RepositoryData>> getAllRecords() {
        return null;
    }
    
    public final void insertRecord(@org.jetbrains.annotations.NotNull()
    com.rohit.room.model.RepositoryData repositoryData) {
    }
    
    public final void makeApiCall(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @javax.inject.Inject()
    public RetroRepository(@org.jetbrains.annotations.NotNull()
    com.rohit.room.network.RetroServiceInterface retroServiceInterface, @org.jetbrains.annotations.NotNull()
    com.rohit.room.db.AppDao appDao) {
        super();
    }
}