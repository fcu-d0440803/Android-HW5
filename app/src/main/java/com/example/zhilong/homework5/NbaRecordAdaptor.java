package com.example.zhilong.homework5;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.IntRange;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ZhiLong on 2017/4/26.
 */

public class NbaRecordAdaptor extends ArrayAdapter<ContestRecord> {

    private  Context context;

    public NbaRecordAdaptor(Context context,  List objects) {
        super(context, 0, objects);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.nba_layout, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        ContestRecord record = (ContestRecord)getItem(position);

        ImageView ivHost = (ImageView)itemlayout.findViewById(R.id.img_hostImgid);
        ivHost.setImageResource(record.hostImgId);

        TextView tvHostName = (TextView)itemlayout.findViewById(R.id.tv_hostName);
        tvHostName.setText(record.hostName);

        TextView tvHostScore = (TextView)itemlayout.findViewById(R.id.tv_hostScore);
        tvHostScore.setText(record.hostScore);

        ImageView ivGuest = (ImageView)itemlayout.findViewById(R.id.img_guestImgid);
        ivGuest.setImageResource(record.guestImgId);

        TextView tvGuestName = (TextView)itemlayout.findViewById(R.id.tv_guestName);
        tvGuestName.setText(record.guestName);

        TextView tvGuestScore = (TextView)itemlayout.findViewById(R.id.tv_guestScore);
        tvGuestScore.setText(record.guestScore);


        if(Integer.parseInt(record.hostScore) > Integer.parseInt(record.guestScore)) {
            tvHostScore.setTextColor(Color.RED);
        }
        else {
            tvGuestScore.setTextColor(Color.RED);
        }


        return itemlayout;
    }
}
