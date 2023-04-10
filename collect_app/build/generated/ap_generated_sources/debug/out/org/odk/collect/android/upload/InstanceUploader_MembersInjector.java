// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.upload;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.InstancesAppState;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class InstanceUploader_MembersInjector implements MembersInjector<InstanceUploader> {
  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<InstancesAppState> instancesAppStateProvider;

  public InstanceUploader_MembersInjector(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<InstancesAppState> instancesAppStateProvider) {
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.instancesAppStateProvider = instancesAppStateProvider;
  }

  public static MembersInjector<InstanceUploader> create(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<InstancesAppState> instancesAppStateProvider) {
    return new InstanceUploader_MembersInjector(instancesRepositoryProvider, instancesAppStateProvider);
  }

  @Override
  public void injectMembers(InstanceUploader instance) {
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectInstancesAppState(instance, instancesAppStateProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.upload.InstanceUploader.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(InstanceUploader instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.upload.InstanceUploader.instancesAppState")
  public static void injectInstancesAppState(InstanceUploader instance,
      InstancesAppState instancesAppState) {
    instance.instancesAppState = instancesAppState;
  }
}
