package sg.edu.rp.c346.id20045524.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.buttonFriend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this , MainActivity3.class);
        startActivity(intent);
    }
}