package com.rohit.gpstracker.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/rohit/gpstracker/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/rohit/gpstracker/network/RetroRepository;", "(Lcom/rohit/gpstracker/network/RetroRepository;)V", "getAllRepositoryList", "Landroidx/lifecycle/LiveData;", "", "Lcom/rohit/gpstracker/model/RepositoryData;", "makeApiCall", "", "query", "", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.rohit.gpstracker.network.RetroRepository repository = null;
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.rohit.gpstracker.network.RetroRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.rohit.gpstracker.model.RepositoryData>> getAllRepositoryList() {
        return null;
    }
    
    public final void makeApiCall(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
}