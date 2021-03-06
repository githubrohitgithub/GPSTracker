// Generated by Dagger (https://dagger.dev).
package com.rohit.gpstracker.di;

import com.rohit.gpstracker.network.RetroServiceInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetRetroServiceInstanceFactory implements Factory<RetroServiceInterface> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_GetRetroServiceInstanceFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RetroServiceInterface get() {
    return getRetroServiceInstance(module, retrofitProvider.get());
  }

  public static AppModule_GetRetroServiceInstanceFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_GetRetroServiceInstanceFactory(module, retrofitProvider);
  }

  public static RetroServiceInterface getRetroServiceInstance(AppModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.getRetroServiceInstance(retrofit));
  }
}
