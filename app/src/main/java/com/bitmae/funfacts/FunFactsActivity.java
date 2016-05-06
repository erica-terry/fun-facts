package com.bitmae.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactBook = new FactBook();

    // Declare our Variable variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mFactLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables
        mFactTextView = (TextView)findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mFactLayout = (RelativeLayout) findViewById(R.id.factLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                mFactLayout.setBackgroundColor(Color.RED);

                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);
            }
        };

        mShowFactButton.setOnClickListener(listener);

    }
}
