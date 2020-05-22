package com.haynes.jvm.test;


/**
 * 通过拉流地址生成playUrl播放地址
 * @author zhuanning
 * @project enterpriseLive
 * @create 2020-01-04 16:13
 */
public class PlayUrlUtils {

    public static String getPlayUrl(String inputUrl){
        String playUrl = null;
        String[] split = inputUrl.split("/");
        playUrl = split[0];
        switch (split[0]){
            case "rtmp:":
            {String codeRtmp = split[split.length - 1];
                //进行拼接
                playUrl = "{\"transType\":\"0\"," +CommonConfigs.RTMP +codeRtmp+"\","+CommonConfigs.FLV+codeRtmp+".flv\","+CommonConfigs.HLS+codeRtmp+"/playlist.m3u8\"}";
                return playUrl;}
            case "http:":
            {
                String[] strig2 = inputUrl.split("\\.");
                if (strig2[strig2.length -1].equals("flv")){
                    //获取串流码，进行拼接
                    String flvStr = strig2[strig2.length - 2];
                    String[] str2 = flvStr.split("/");
                    String codeFlv = str2[str2.length - 1];
                    playUrl = "{\"transType\":\"0\"," +CommonConfigs.RTMP +codeFlv+"\","+CommonConfigs.FLV+codeFlv+".flv\","+CommonConfigs.HLS+codeFlv+"/playlist.m3u8\"}";
                    return playUrl;
                }
                if (strig2[strig2.length -1].equals("m3u8")){
                    //获取串流码，进行拼接
                    String m3u8Str = strig2[strig2.length - 2];
                    String[] str2 = m3u8Str.split("/");
                    String codeM3u8 = str2[str2.length - 1];
                    playUrl = "{\"transType\":\"0\"," +CommonConfigs.RTMP +codeM3u8+"\","+CommonConfigs.FLV+codeM3u8+".flv\","+CommonConfigs.HLS+codeM3u8+"/playlist.m3u8\"}";
                    return playUrl;
                }
            }
            return playUrl;
        }
        return null;
    }
}
