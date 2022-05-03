package com.rohit.gpstracker.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.rohit.gpstracker.model.TypeConverterOwner.class})
@androidx.room.Database(entities = {com.rohit.gpstracker.model.RepositoryData.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rohit/gpstracker/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getAppDao", "Lcom/rohit/gpstracker/db/AppDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.rohit.gpstracker.db.AppDatabase.Companion Companion = null;
    private static com.rohit.gpstracker.db.AppDatabase DB_INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rohit.gpstracker.db.AppDao getAppDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rohit/gpstracker/db/AppDatabase$Companion;", "", "()V", "DB_INSTANCE", "Lcom/rohit/gpstracker/db/AppDatabase;", "getAppDBInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.rohit.gpstracker.db.AppDatabase getAppDBInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}