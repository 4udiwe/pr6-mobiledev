package com.example.pr6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        TextView textView = new TextView(this);
        textView.setText(getString(R.string.string_ex));
        textView.setTextColor(getResources().getColor(R.color.text_background));
        textView.setTextSize(getResources().getDimension(R.dimen.text_size));
        textView.setPadding(
                (int) getResources().getDimension(R.dimen.horizontal_margin),
                (int) getResources().getDimension(R.dimen.vertical_margin),
                (int) getResources().getDimension(R.dimen.horizontal_margin),
                (int) getResources().getDimension(R.dimen.vertical_margin));

         */

        //textView.setTextSize(26);
        //layout.addView(textView);

        /*
        TextView textView1 = new TextView(this);
        String oneitem = getResources().getQuantityString(R.plurals.items, 1, 1);
        textView1.setText(oneitem);
        textView1.setTextSize(34);
        layout.addView(textView1);

        TextView textView2 = new TextView(this);
        String fouritems = getResources().getQuantityString(R.plurals.items, 4, 4);
        textView2.setText(fouritems);
        textView2.setTextSize(34);
        layout.addView(textView2);

        TextView textView3 = new TextView(this);
        String fiveitems = getResources().getQuantityString(R.plurals.items, 5, 5);
        textView3.setText(fiveitems);
        textView3.setTextSize(34);
        layout.addView(textView3);
        */

        /*
        String [] strings =
                getResources().getStringArray(R.array.strarray);
        TextView textView = new TextView(this);
        textView.setText(strings[0]);
        textView.setTextSize(34);
        layout.addView(textView);

        TextView textView1 = new TextView(this);
        textView1.setText(strings[1]);
        textView1.setTextSize(34);
        layout.addView(textView1);

        TextView textView2 = new TextView(this);
        textView2.setText(strings[2]);
        textView2.setTextSize(34);
        layout.addView(textView2);
        */

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.ic_launcher_foreground);
        imageView.setBackgroundColor(getResources().
                getColor(R.color.text_background));
        
        setContentView(imageView);


    }
}