package com.github.simonpham.hasbrain.eaj.util;

import android.annotation.SuppressLint;

import static com.github.simonpham.hasbrain.eaj.util.Const.ONE_DAY;
import static com.github.simonpham.hasbrain.eaj.util.Const.ONE_HOUR;
import static com.github.simonpham.hasbrain.eaj.util.Const.ONE_MINUTE;
import static com.github.simonpham.hasbrain.eaj.util.Const.ONE_MONTH;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */
public class TimeAgo {

    @SuppressLint("SimpleDateFormat")
    public static String getDisplayTime(long time) {
        String displayTime = getTimeAgo(time);
        if (!(displayTime.startsWith("-") || displayTime.startsWith("0"))) {
            return displayTime;
        }

        return new java.text.SimpleDateFormat("HH:mm:ss dd/MM/yyyy ").format(new java.util.Date(time * 1000));
    }

    @SuppressLint("SimpleDateFormat")
    private static String getTimeAgo(long time) {
        long currentTime = System.currentTimeMillis() / 1000;
        long elapsedTime = currentTime - time;

        if (elapsedTime >= 0 && elapsedTime < ONE_MINUTE) {
            return "A few seconds ago";
        } else if (elapsedTime < ONE_HOUR) {
            return toMinutes(time) + "m ago";
        } else if (elapsedTime < ONE_DAY) {
            return toHours(time) + "h ago";
        } else if (elapsedTime < ONE_MONTH) {
            return toDays(time) + "d ago";
        }

        return new java.text.SimpleDateFormat("dd/MM/yy ").format(new java.util.Date(time * 1000));
    }

    @SuppressLint("SimpleDateFormat")
    private static int toMinutes(long time) {
        long currentTime = System.currentTimeMillis() / 1000;
        return Integer.parseInt(new java.text.SimpleDateFormat("m").format(new java.util.Date(currentTime * 1000)))
                - Integer.parseInt(new java.text.SimpleDateFormat("m").format(new java.util.Date(time * 1000)));
    }

    @SuppressLint("SimpleDateFormat")
    private static int toHours(long time) {
        long currentTime = System.currentTimeMillis() / 1000;
        return Integer.parseInt(new java.text.SimpleDateFormat("H").format(new java.util.Date(currentTime * 1000)))
                - Integer.parseInt(new java.text.SimpleDateFormat("H").format(new java.util.Date(time * 1000)));
    }

    @SuppressLint("SimpleDateFormat")
    private static int toDays(long time) {
        long currentTime = System.currentTimeMillis() / 1000;
        return Integer.parseInt(new java.text.SimpleDateFormat("D").format(new java.util.Date(currentTime * 1000)))
                - Integer.parseInt(new java.text.SimpleDateFormat("D").format(new java.util.Date(time * 1000)));
    }
}
