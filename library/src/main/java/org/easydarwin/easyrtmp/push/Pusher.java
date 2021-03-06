package org.easydarwin.easyrtmp.push;

import android.content.Context;

/**
 * 推流器
 *
 * Created by john on 2017/5/6.
 */
public interface Pusher {

    public void stop() ;

    public  void initPush(final String serverIP, final String serverPort, final String streamName, final Context context, final InitCallback callback);
    public  void initPush(final String url, final Context context, final InitCallback callback, int pts);
    public  void initPush(final String url, final Context context, final InitCallback callback, int pts, int samplerate, int channelcount);
    public  void initPush(final String url, final Context context, final InitCallback callback);

    public  void push(byte[] data, int offset, int length, long timestamp, int type);
    public  void push(byte[] data, long timestamp, int type);
}
