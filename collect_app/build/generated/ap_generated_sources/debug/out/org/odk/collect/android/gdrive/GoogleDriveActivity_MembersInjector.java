// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.gdrive;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.odk.collect.android.activities.AppListActivity_MembersInjector;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.androidshared.network.NetworkStateProvider;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.settings.SettingsProvider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GoogleDriveActivity_MembersInjector implements MembersInjector<GoogleDriveActivity> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<GoogleAccountsManager> accountsManagerProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<NetworkStateProvider> connectivityProvider;

  private final Provider<GoogleApiProvider> googleApiProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider2;

  public GoogleDriveActivity_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<GoogleAccountsManager> accountsManagerProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<GoogleApiProvider> googleApiProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider2) {
    this.settingsProvider = settingsProvider;
    this.accountsManagerProvider = accountsManagerProvider;
    this.storagePathProvider = storagePathProvider;
    this.connectivityProvider = connectivityProvider;
    this.googleApiProvider = googleApiProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider2 = settingsProvider2;
  }

  public static MembersInjector<GoogleDriveActivity> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<GoogleAccountsManager> accountsManagerProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<GoogleApiProvider> googleApiProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider2) {
    return new GoogleDriveActivity_MembersInjector(settingsProvider, accountsManagerProvider, storagePathProvider, connectivityProvider, googleApiProvider, formsRepositoryProvider, permissionsProvider, settingsProvider2);
  }

  @Override
  public void injectMembers(GoogleDriveActivity instance) {
    AppListActivity_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectAccountsManager(instance, accountsManagerProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
    injectConnectivityProvider(instance, connectivityProvider.get());
    injectGoogleApiProvider(instance, googleApiProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectSettingsProvider(instance, settingsProvider2.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.accountsManager")
  public static void injectAccountsManager(GoogleDriveActivity instance,
      GoogleAccountsManager accountsManager) {
    instance.accountsManager = accountsManager;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.storagePathProvider")
  public static void injectStoragePathProvider(GoogleDriveActivity instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.connectivityProvider")
  public static void injectConnectivityProvider(GoogleDriveActivity instance,
      NetworkStateProvider connectivityProvider) {
    instance.connectivityProvider = connectivityProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.googleApiProvider")
  public static void injectGoogleApiProvider(GoogleDriveActivity instance,
      GoogleApiProvider googleApiProvider) {
    instance.googleApiProvider = googleApiProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(GoogleDriveActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.permissionsProvider")
  public static void injectPermissionsProvider(GoogleDriveActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.gdrive.GoogleDriveActivity.settingsProvider")
  public static void injectSettingsProvider(GoogleDriveActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
