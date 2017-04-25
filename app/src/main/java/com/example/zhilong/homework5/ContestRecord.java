package com.example.zhilong.homework5;

/**
 * Created by ZhiLong on 2017/4/26.
 */

public class ContestRecord {

    int hostImgId;
    String hostName;
    String hostScore;
    int guestImgId;
    String guestName;
    String guestScore;

    public ContestRecord(int hostImgId, String hostName, String hostScore,
                         int guestImgId, String guestName, String guestScore) {

        this.hostImgId = hostImgId;
        this.hostName = hostName;
        this.hostScore = hostScore;
        this.guestImgId = guestImgId;
        this.guestName = guestName;
        this.guestScore = guestScore;
    }

}
