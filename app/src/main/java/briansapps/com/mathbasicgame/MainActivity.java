package briansapps.com.mathbasicgame;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int buttonA = new Random().nextInt(15);
        int buttonB = new Random().nextInt(15);
        int buttonC;
        Button button1 = findViewById(R.id.button1);
        TextView TextView = findViewById(R.id.textView);

        buttonC = buttonA * buttonB;

        button1.setText(String.valueOf(buttonC));

        TextView.setText("What is "+buttonA+" x "+buttonB+"?");


        button1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                finish();
                startActivity(getIntent());
            }
        });




    }


}
