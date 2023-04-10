// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeButton;

public final class DateWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView dateAnswerText;

  @NonNull
  public final MultiClickSafeButton dateButton;

  private DateWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView dateAnswerText, @NonNull MultiClickSafeButton dateButton) {
    this.rootView = rootView;
    this.dateAnswerText = dateAnswerText;
    this.dateButton = dateButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DateWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DateWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.date_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DateWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date_answer_text;
      MaterialTextView dateAnswerText = ViewBindings.findChildViewById(rootView, id);
      if (dateAnswerText == null) {
        break missingId;
      }

      id = R.id.date_button;
      MultiClickSafeButton dateButton = ViewBindings.findChildViewById(rootView, id);
      if (dateButton == null) {
        break missingId;
      }

      return new DateWidgetAnswerBinding((LinearLayout) rootView, dateAnswerText, dateButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}