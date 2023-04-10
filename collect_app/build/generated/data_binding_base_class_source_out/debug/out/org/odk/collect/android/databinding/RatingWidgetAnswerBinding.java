// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class RatingWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RatingBar ratingBar1;

  @NonNull
  public final RatingBar ratingBar2;

  private RatingWidgetAnswerBinding(@NonNull LinearLayout rootView, @NonNull RatingBar ratingBar1,
      @NonNull RatingBar ratingBar2) {
    this.rootView = rootView;
    this.ratingBar1 = ratingBar1;
    this.ratingBar2 = ratingBar2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RatingWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RatingWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rating_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RatingWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rating_bar1;
      RatingBar ratingBar1 = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar1 == null) {
        break missingId;
      }

      id = R.id.rating_bar2;
      RatingBar ratingBar2 = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar2 == null) {
        break missingId;
      }

      return new RatingWidgetAnswerBinding((LinearLayout) rootView, ratingBar1, ratingBar2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}