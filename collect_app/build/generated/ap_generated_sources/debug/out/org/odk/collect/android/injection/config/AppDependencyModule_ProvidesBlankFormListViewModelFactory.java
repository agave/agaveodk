// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.odk.collect.android.formlists.blankformlist.BlankFormListViewModel;
import org.odk.collect.android.formmanagement.FormsUpdater;
import org.odk.collect.android.formmanagement.matchexactly.SyncStatusAppState;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.async.Scheduler;
import org.odk.collect.settings.SettingsProvider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppDependencyModule_ProvidesBlankFormListViewModelFactory implements Factory<BlankFormListViewModel.Factory> {
  private final AppDependencyModule module;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<SyncStatusAppState> syncStatusAppStateProvider;

  private final Provider<FormsUpdater> formsUpdaterProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public AppDependencyModule_ProvidesBlankFormListViewModelFactory(AppDependencyModule module,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Application> applicationProvider,
      Provider<SyncStatusAppState> syncStatusAppStateProvider,
      Provider<FormsUpdater> formsUpdaterProvider, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<ChangeLockProvider> changeLockProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.module = module;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.applicationProvider = applicationProvider;
    this.syncStatusAppStateProvider = syncStatusAppStateProvider;
    this.formsUpdaterProvider = formsUpdaterProvider;
    this.schedulerProvider = schedulerProvider;
    this.settingsProvider = settingsProvider;
    this.changeLockProvider = changeLockProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  @Override
  public BlankFormListViewModel.Factory get() {
    return providesBlankFormListViewModel(module, formsRepositoryProvider.get(), instancesRepositoryProvider.get(), applicationProvider.get(), syncStatusAppStateProvider.get(), formsUpdaterProvider.get(), schedulerProvider.get(), settingsProvider.get(), changeLockProvider.get(), currentProjectProvider.get());
  }

  public static AppDependencyModule_ProvidesBlankFormListViewModelFactory create(
      AppDependencyModule module, Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Application> applicationProvider,
      Provider<SyncStatusAppState> syncStatusAppStateProvider,
      Provider<FormsUpdater> formsUpdaterProvider, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<ChangeLockProvider> changeLockProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new AppDependencyModule_ProvidesBlankFormListViewModelFactory(module, formsRepositoryProvider, instancesRepositoryProvider, applicationProvider, syncStatusAppStateProvider, formsUpdaterProvider, schedulerProvider, settingsProvider, changeLockProvider, currentProjectProvider);
  }

  public static BlankFormListViewModel.Factory providesBlankFormListViewModel(
      AppDependencyModule instance, FormsRepositoryProvider formsRepositoryProvider,
      InstancesRepositoryProvider instancesRepositoryProvider, Application application,
      SyncStatusAppState syncStatusAppState, FormsUpdater formsUpdater, Scheduler scheduler,
      SettingsProvider settingsProvider, ChangeLockProvider changeLockProvider,
      CurrentProjectProvider currentProjectProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesBlankFormListViewModel(formsRepositoryProvider, instancesRepositoryProvider, application, syncStatusAppState, formsUpdater, scheduler, settingsProvider, changeLockProvider, currentProjectProvider));
  }
}