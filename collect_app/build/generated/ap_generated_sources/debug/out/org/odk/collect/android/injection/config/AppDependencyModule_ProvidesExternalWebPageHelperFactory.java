// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.odk.collect.android.utilities.ExternalWebPageHelper;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppDependencyModule_ProvidesExternalWebPageHelperFactory implements Factory<ExternalWebPageHelper> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesExternalWebPageHelperFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ExternalWebPageHelper get() {
    return providesExternalWebPageHelper(module);
  }

  public static AppDependencyModule_ProvidesExternalWebPageHelperFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesExternalWebPageHelperFactory(module);
  }

  public static ExternalWebPageHelper providesExternalWebPageHelper(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesExternalWebPageHelper());
  }
}
