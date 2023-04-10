// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
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

public final class FormDownloadListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MaterialButton addButton;

  @NonNull
  public final LinearLayout buttonholder;

  @NonNull
  public final TextView empty;

  @NonNull
  public final ListView list;

  @NonNull
  public final MaterialButton refreshButton;

  @NonNull
  public final MaterialButton toggleButton;

  private FormDownloadListBinding(@NonNull RelativeLayout rootView,
      @NonNull MaterialButton addButton, @NonNull LinearLayout buttonholder,
      @NonNull TextView empty, @NonNull ListView list, @NonNull MaterialButton refreshButton,
      @NonNull MaterialButton toggleButton) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.buttonholder = buttonholder;
    this.empty = empty;
    this.list = list;
    this.refreshButton = refreshButton;
    this.toggleButton = toggleButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FormDownloadListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FormDownloadListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.form_download_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FormDownloadListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_button;
      MaterialButton addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.buttonholder;
      LinearLayout buttonholder = ViewBindings.findChildViewById(rootView, id);
      if (buttonholder == null) {
        break missingId;
      }

      id = android.R.id.empty;
      TextView empty = ViewBindings.findChildViewById(rootView, id);
      if (empty == null) {
        break missingId;
      }

      id = android.R.id.list;
      ListView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      id = R.id.refresh_button;
      MaterialButton refreshButton = ViewBindings.findChildViewById(rootView, id);
      if (refreshButton == null) {
        break missingId;
      }

      id = R.id.toggle_button;
      MaterialButton toggleButton = ViewBindings.findChildViewById(rootView, id);
      if (toggleButton == null) {
        break missingId;
      }

      return new FormDownloadListBinding((RelativeLayout) rootView, addButton, buttonholder, empty,
          list, refreshButton, toggleButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
