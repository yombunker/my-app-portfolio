package com.bunk3r.appportfolio.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.bunk3r.appportfolio.R;

public class ProjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
    }

    public void startSpotify(View view) {
        startExternalApp(R.string.project_message_spotify);
    }

    public void startScoreApp(View view) {
        startExternalApp(R.string.project_message_score);
    }

    public void startLibraryApp(View view) {
        startExternalApp(R.string.project_message_library);
    }

    public void startBuildBiggerApp(View view) {
        startExternalApp(R.string.project_message_build);
    }

    public void startReaderApp(View view) {
        startExternalApp(R.string.project_message_reader);
    }

    public void startCapstoneApp(View view) {
        startExternalApp(R.string.project_message_capstone);
    }

    private void startExternalApp(final int titleResId) {
        final String format = getString(R.string.project_message);
        final String appTitle = getString(titleResId);
        final String message = String.format(format, appTitle);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}