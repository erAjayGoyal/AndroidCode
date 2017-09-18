package oceanhntt.carnival.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.carnival.oceanhntt_tablet.ui.activity.DisplayCrewListActivity;
import com.carnival.oceanhntt_tablet.ui.activity.StartActivity;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLaunch = (Button) findViewById(R.id.btn_launch);
        btnLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartActivity.Call(MainActivity.this);

            }
        });
    }
}
