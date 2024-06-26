package org.odk.collect.android.formentry;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;

import org.odk.collect.android.R;
import org.odk.collect.android.listeners.SwipeHandler;
import org.odk.collect.android.utilities.FormNameUtils;

public class FormEndView extends SwipeHandler.View {

    private final Listener listener;
    private final String formTitle;
    private final String defaultInstanceName;

    public FormEndView(Context context, String formTitle, String defaultInstanceName, boolean instanceComplete, Listener listener) {
        super(context);
        this.formTitle = formTitle;
        this.defaultInstanceName = defaultInstanceName;
        this.listener = listener;
        init(context, instanceComplete);
    }

    private void init(Context context, boolean instanceComplete) {
        inflate(context, R.layout.form_entry_end, this);

        ((TextView) findViewById(R.id.description)).setText(context.getString(R.string.save_enter_data_description, formTitle));

        EditText saveAs = findViewById(R.id.save_name);
        saveAs.setOnFocusChangeListener((view, isFocused) -> {
            if (isFocused) {
                findViewById(R.id.manual_name_warning).setVisibility(View.VISIBLE);
            }
        });

        // disallow carriage returns in the name
        InputFilter returnFilter = (source, start, end, dest, dstart, dend) -> FormNameUtils.normalizeFormName(source.toString().substring(start, end), true);
        saveAs.setFilters(new InputFilter[]{returnFilter});

        saveAs.setText(defaultInstanceName);
        saveAs.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                listener.onSaveAsChanged(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        final CheckBox markAsFinalized = findViewById(R.id.mark_finished);
        markAsFinalized.setChecked(instanceComplete);

        findViewById(R.id.save_exit_button).setOnClickListener(v -> {
            listener.onSaveClicked(markAsFinalized.isChecked());
        });

        findViewById(R.id.instance_name_learn_more).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("https://forum.getodk.org/t/collect-manual-instance-naming-will-be-removed-in-v2023-2/40313"));
            context.startActivity(intent);
        });
    }

    @Override
    public boolean shouldSuppressFlingGesture() {
        return false;
    }

    @Nullable
    @Override
    public NestedScrollView getVerticalScrollView() {
        return findViewById(R.id.scroll_view);
    }

    public interface Listener {
        void onSaveAsChanged(String string);

        void onSaveClicked(boolean markAsFinalized);
    }
}
