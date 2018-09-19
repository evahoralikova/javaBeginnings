package com.example.evaho.snad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="SnadUzSeToPovede";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Wire up button to do stuff
        Button btn= (Button) findViewById(R.id.button);
        // see what happens when the user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Jsi moc šikovný");
                //appears as a "dialog"
                Toast.makeText(getApplicationContext(), "No umíš krásně číst ;).", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
