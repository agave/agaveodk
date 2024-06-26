package org.odk.collect.android.activities;

import android.os.Build;
import android.os.Bundle;
import org.odk.collect.android.R;
import org.odk.collect.strings.localization.LocalizedActivity;
import android.content.Intent;
import android.os.Handler;

public class LaunchActivity extends LocalizedActivity {

    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        /*
          We don't need the `installSplashScreen` call on Android 12+ (the system handles the
          splash screen for us) and it causes problems if we later switch between dark/light themes
          with the ThemeUtils#setDarkModeForCurrentProject call.
         */
        if (Build.VERSION.SDK_INT < 31) {
            setTheme(R.style.Theme_AppCompat);
            openLogin();
        } else {
            setTheme(R.style.Theme_Collect);
            setContentView(R.layout.launch_activity_layout);
            getAuthentication();
        }
    }
    private void getAuthentication() {
        handler.postDelayed(() -> openLogin(), 3000);
    }

    private void openLogin() {
        startActivity(new Intent(LaunchActivity.this, LoginActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.push_right_in);
        finishAffinity();
    }
}
