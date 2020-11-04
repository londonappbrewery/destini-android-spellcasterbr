package com.londonappbrewery.destini;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop, mButtonBottom;
    int histPos;
    String[] mStory;

    private void updateStory(int pos){
        if (pos==1){
            mStoryTextView.setText(R.string.T1_Story);
            mButtonTop.setText(R.string.T1_Ans1);
            mButtonBottom.setText(R.string.T1_Ans2);
        } else if (pos==2){
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        } else if (pos==3){
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if (pos==4){
            mStoryTextView.setText(R.string.T4_End);
            mButtonTop.setText("end t4 - Recomeçar");
            mButtonBottom.setText("fechar");
        } else if (pos==5){
            mStoryTextView.setText(R.string.T5_End);
            mButtonTop.setText("end t5 - Recomeçar");
            mButtonBottom.setText("fechar");
        } else if (pos== 6){
            mStoryTextView.setText(R.string.T6_End);
            mButtonTop.setText("end t6 - Recomeçar");
            mButtonBottom.setText("fechar");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        histPos = 1;
        updateStory(1);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (histPos==1){
                    histPos=3;
                } else if (histPos==2){
                    histPos=3;
                } else if (histPos==3){
                    histPos=6;
                } else{ //rotinas de recomeçar ou fechar...
                    histPos=1;
                }
                updateStory(histPos);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (histPos==1){
                    histPos=2;
                } else if (histPos==2){
                    histPos=4;
                } else if (histPos==3){
                    histPos=5;
                } else{ //rotinas de recomeçar ou fechar...
                    finish();
                }
                updateStory(histPos);
            }
        });


    }
}
