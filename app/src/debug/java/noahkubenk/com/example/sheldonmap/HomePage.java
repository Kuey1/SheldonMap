package noahkubenk.com.example.sheldonmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button button = (Button) findViewById(R.id.direction);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsideActivity4();
            }
        });
    }

    public void openInsideActivity4() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}