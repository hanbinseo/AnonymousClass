package android.studio.practice.anonymousclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mbutton1, mbutton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1 = findViewById(R.id.button1);
        mbutton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mbutton1.setOnClickListener(this);
        mbutton2.setOnClickListener(this);

            }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1 : mTextView1.setText("You clicked button 1");
                break;
            case R.id.button2 : mTextView1.setText("You clicked button 2");
                break;
            default: break;
    }}}