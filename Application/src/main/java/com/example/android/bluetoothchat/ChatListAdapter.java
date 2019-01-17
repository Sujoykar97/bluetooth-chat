package com.example.android.bluetoothchat;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> values;


    public ChatListAdapter(@NonNull Context context, ArrayList<String> values) {
        super(context, R.layout.chat_message,values);
        this.context = context;
        this.values = values;
    }

    /**
     * Here we go and get our rowlayout.xml file and set the textview text.
     * This happens for every row in your listview.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // First let's verify the convertView is not null
        if (convertView == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.chat_message, parent, false);
        }
        // Now we can fill the layout with the right values
        CardView cardView = (CardView)convertView.findViewById(R.id.myCardView);
        TextView textView = (TextView) convertView.findViewById(R.id.myText);
        int i;String res=values.get(position);
        for (i=0;i<res.length();i++){
            if(res.charAt(i)==':')
                break;}

        if(res.substring(0, i).equals("Me")) {
        cardView.setCardBackgroundColor(Color.parseColor("#f0f0f0"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);

            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_END);
            cardView.setLayoutParams(layoutParams);
            textView.setText(res.substring(i+1));
            textView.setTextColor(Color.BLACK);
        }
        else {
            cardView.setCardBackgroundColor(Color.parseColor("#7fb9fe"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);

            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_START);
            cardView.setLayoutParams(layoutParams);
            textView.setText(res.substring(i+1));
            textView.setTextColor(Color.WHITE);
        }
        return convertView;
    }
}


