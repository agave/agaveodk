// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsUpdater;
import org.odk.collect.android.formmanagement.matchexactly.SyncStatusAppState;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppDependencyModule_ProvidesFormsUpdaterFactory implements Factory<FormsUpdater> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<Notifier> notifierProvider;

  private final Provider<SyncStatusAppState> syncStatusAppStateProvider;

  private final Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider;

  public AppDependencyModule_ProvidesFormsUpdaterFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<Notifier> notifierProvider,
      Provider<SyncStatusAppState> syncStatusAppStateProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.notifierProvider = notifierProvider;
    this.syncStatusAppStateProvider = syncStatusAppStateProvider;
    this.projectDependencyProviderFactoryProvider = projectDependencyProviderFactoryProvider;
  }

  @Override
  public FormsUpdater get() {
    return providesFormsUpdater(module, contextProvider.get(), notifierProvider.get(), syncStatusAppStateProvider.get(), projectDependencyProviderFactoryProvider.get());
  }

  public static AppDependencyModule_ProvidesFormsUpdaterFactory create(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<Notifier> notifierProvider,
      Provider<SyncStatusAppState> syncStatusAppStateProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    return new AppDependencyModule_ProvidesFormsUpdaterFactory(module, contextProvider, notifierProvider, syncStatusAppStateProvider, projectDependencyProviderFactoryProvider);
  }

  public static FormsUpdater providesFormsUpdater(AppDependencyModule instance, Context context,
      Notifier notifier, SyncStatusAppState syncStatusAppState,
      ProjectDependencyProviderFactory projectDependencyProviderFactory) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormsUpdater(context, notifier, syncStatusAppState, projectDependencyProviderFactory));
  }
}
