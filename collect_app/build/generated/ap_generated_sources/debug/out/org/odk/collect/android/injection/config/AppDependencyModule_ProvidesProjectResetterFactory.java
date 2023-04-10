// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.ProjectResetter;
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
public final class AppDependencyModule_ProvidesProjectResetterFactory implements Factory<ProjectResetter> {
  private final AppDependencyModule module;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  public AppDependencyModule_ProvidesProjectResetterFactory(AppDependencyModule module,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider) {
    this.module = module;
    this.storagePathProvider = storagePathProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.settingsProvider = settingsProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
  }

  @Override
  public ProjectResetter get() {
    return providesProjectResetter(module, storagePathProvider.get(), propertyManagerProvider.get(), settingsProvider.get(), instancesRepositoryProvider.get(), formsRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectResetterFactory create(
      AppDependencyModule module, Provider<StoragePathProvider> storagePathProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider) {
    return new AppDependencyModule_ProvidesProjectResetterFactory(module, storagePathProvider, propertyManagerProvider, settingsProvider, instancesRepositoryProvider, formsRepositoryProvider);
  }

  public static ProjectResetter providesProjectResetter(AppDependencyModule instance,
      StoragePathProvider storagePathProvider, PropertyManager propertyManager,
      SettingsProvider settingsProvider, InstancesRepositoryProvider instancesRepositoryProvider,
      FormsRepositoryProvider formsRepositoryProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectResetter(storagePathProvider, propertyManager, settingsProvider, instancesRepositoryProvider, formsRepositoryProvider));
  }
}
