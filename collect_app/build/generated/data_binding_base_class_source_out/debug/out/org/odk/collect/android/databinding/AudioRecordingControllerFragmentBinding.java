// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.audio.VolumeBar;

public final class AudioRecordingControllerFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout controls;

  @NonNull
  public final ImageView help;

  @NonNull
  public final MaterialButton pauseRecording;

  @NonNull
  public final ImageView recordingIcon;

  @NonNull
  public final LinearLayout recordingStatus;

  @NonNull
  public final MaterialButton stopRecording;

  @NonNull
  public final TextView timeCode;

  @NonNull
  public final VolumeBar volumeBar;

  private AudioRecordingControllerFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout controls, @NonNull ImageView help,
      @NonNull MaterialButton pauseRecording, @NonNull ImageView recordingIcon,
      @NonNull LinearLayout recordingStatus, @NonNull MaterialButton stopRecording,
      @NonNull TextView timeCode, @NonNull VolumeBar volumeBar) {
    this.rootView = rootView;
    this.controls = controls;
    this.help = help;
    this.pauseRecording = pauseRecording;
    this.recordingIcon = recordingIcon;
    this.recordingStatus = recordingStatus;
    this.stopRecording = stopRecording;
    this.timeCode = timeCode;
    this.volumeBar = volumeBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AudioRecordingControllerFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AudioRecordingControllerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.audio_recording_controller_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AudioRecordingControllerFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.controls;
      LinearLayout controls = ViewBindings.findChildViewById(rootView, id);
      if (controls == null) {
        break missingId;
      }

      id = R.id.help;
      ImageView help = ViewBindings.findChildViewById(rootView, id);
      if (help == null) {
        break missingId;
      }

      id = R.id.pause_recording;
      MaterialButton pauseRecording = ViewBindings.findChildViewById(rootView, id);
      if (pauseRecording == null) {
        break missingId;
      }

      id = R.id.recording_icon;
      ImageView recordingIcon = ViewBindings.findChildViewById(rootView, id);
      if (recordingIcon == null) {
        break missingId;
      }

      id = R.id.recording_status;
      LinearLayout recordingStatus = ViewBindings.findChildViewById(rootView, id);
      if (recordingStatus == null) {
        break missingId;
      }

      id = R.id.stop_recording;
      MaterialButton stopRecording = ViewBindings.findChildViewById(rootView, id);
      if (stopRecording == null) {
        break missingId;
      }

      id = R.id.time_code;
      TextView timeCode = ViewBindings.findChildViewById(rootView, id);
      if (timeCode == null) {
        break missingId;
      }

      id = R.id.volume_bar;
      VolumeBar volumeBar = ViewBindings.findChildViewById(rootView, id);
      if (volumeBar == null) {
        break missingId;
      }

      return new AudioRecordingControllerFragmentBinding((LinearLayout) rootView, controls, help,
          pauseRecording, recordingIcon, recordingStatus, stopRecording, timeCode, volumeBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
