// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.geo;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.odk.collect.location.LocationClient;
import org.odk.collect.maps.layers.ReferenceLayerRepository;
import org.odk.collect.settings.SettingsProvider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GoogleMapFragment_MembersInjector implements MembersInjector<GoogleMapFragment> {
  private final Provider<ReferenceLayerRepository> referenceLayerRepositoryProvider;

  private final Provider<LocationClient> locationClientProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public GoogleMapFragment_MembersInjector(
      Provider<ReferenceLayerRepository> referenceLayerRepositoryProvider,
      Provider<LocationClient> locationClientProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.referenceLayerRepositoryProvider = referenceLayerRepositoryProvider;
    this.locationClientProvider = locationClientProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<GoogleMapFragment> create(
      Provider<ReferenceLayerRepository> referenceLayerRepositoryProvider,
      Provider<LocationClient> locationClientProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new GoogleMapFragment_MembersInjector(referenceLayerRepositoryProvider, locationClientProvider, settingsProvider);
  }

  @Override
  public void injectMembers(GoogleMapFragment instance) {
    injectReferenceLayerRepository(instance, referenceLayerRepositoryProvider.get());
    injectLocationClient(instance, locationClientProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.GoogleMapFragment.referenceLayerRepository")
  public static void injectReferenceLayerRepository(GoogleMapFragment instance,
      ReferenceLayerRepository referenceLayerRepository) {
    instance.referenceLayerRepository = referenceLayerRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.GoogleMapFragment.locationClient")
  public static void injectLocationClient(GoogleMapFragment instance,
      LocationClient locationClient) {
    instance.locationClient = locationClient;
  }

  @InjectedFieldSignature("org.odk.collect.android.geo.GoogleMapFragment.settingsProvider")
  public static void injectSettingsProvider(GoogleMapFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
