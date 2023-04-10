// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.settings.importing.SettingsChangeHandler;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class BasePreferencesFragment_MembersInjector implements MembersInjector<BasePreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public BasePreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  public static MembersInjector<BasePreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new BasePreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, currentProjectProvider);
  }

  @Override
  public void injectMembers(BasePreferencesFragment instance) {
    injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.settingsChangeHandler")
  public static void injectSettingsChangeHandler(BasePreferencesFragment instance,
      SettingsChangeHandler settingsChangeHandler) {
    instance.settingsChangeHandler = settingsChangeHandler;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.settingsProvider")
  public static void injectSettingsProvider(BasePreferencesFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.currentProjectProvider")
  public static void injectCurrentProjectProvider(BasePreferencesFragment instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }
}
