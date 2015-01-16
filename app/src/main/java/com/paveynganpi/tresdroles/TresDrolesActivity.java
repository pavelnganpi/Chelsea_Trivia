package com.paveynganpi.tresdroles;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class TresDrolesActivity extends Activity {

    //Tag for loging
    public static final String TAG = TresDrolesActivity.class.getSimpleName();

    //create new instance of FactBook and ChelseaImages
    private FactBook mFactBook = new FactBook();
    private ChelseaImages mChelseaImages = new ChelseaImages();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_droles);

        //Declare our view variables and assign the views from the layout file

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the button was click so update the label with the right phrases

                //set the background color of the relative layout
                int colorDisplay = mChelseaImages.getColor();
                relativeLayout.setBackgroundColor(colorDisplay);

                //set the text of the label with getFact()
                factLabel.setText(mFactBook.getFact());

                //set the text color of button
                showFactButton.setTextColor(colorDisplay);

            }
        };

        showFactButton.setOnClickListener(listener);

        //create a toast message
        Toast.makeText(this, "Yay our app works", Toast.LENGTH_LONG).show();
        Log.d(TAG,"we are logging from our oncreate() method");//prints to console(logcat);


    }

}
