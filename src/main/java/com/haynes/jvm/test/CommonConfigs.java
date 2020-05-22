package com.haynes.jvm.test;

/**
 * @author zhuanning
 * @project mglive-docking
 * @create 2019-12-12 18:39
 */
public class CommonConfigs {
    public static final String MIGUAUTHER = "http://api.migucloud.com/a0/user/auth";
    public static final String PUBLISHURL = "http://10.200.41.98:8296/api/docking/callBackPublish";
    public static final String RECURL = "http://10.200.41.98:8296/api/docking/callBackRec";
    public static final String COMBINEURL = "http://10.200.41.98:8296/api/docking/callBackCombine";
    public static final String MIGUREGISTERNOTIFY = "http://api.migucloud.com/l2/notify/reg";
    public static final String rand = "";
    public static final String MIGUCREATECHANNEL = "http://api.migucloud.com/l2/live/create_channel";
    public static final String MIGUUPDATECHANNEL = "http://api.migucloud.com/l2/live/updateChannel";
    public static final String MIGUDELETECHANNEL = "http://api.migucloud.com/l2/live/removeChannel";
    public static final String MIGUFORBIDCHANNEL = "http://api.migucloud.com/l2/ctrl/forbidChannel";
    public static final String MIGURESUMECHANNEL = "http://api.migucloud.com/l2/ctrl/resumeChannel";
    public static final String MIGUGETPUSHURL = "http://api.migucloud.com/l2/addr/get_push_addr";
    public static final String MIGUGETPULLURL = "http://api.migucloud.com/l2/addr/get_pull_addr";
    public static final String MIGUSENSITIVEWORD = "http://testapi.migucloud.com/mgsw/v1/filter/index";
    public static final String MIGUBEGINPULLLIVE = "http://api.migucloud.com/l2/ingest/startIngest";
    public static final String MIGUSTOPPULLLIVE = "http://api.migucloud.com/l2/ingest/stopIngest";
    public static final String MIGUVIDEOQUERY = "http://api.migucloud.com/vod2/v0/query_videolist";
    public static final String RTMP = "\"urlRtmp\":"+"\"rtmp://devlivepull.migucloud.com/live/";
    public static final String FLV = "\"urlFlv\":"+"\"http://devlivepull.migucloud.com/live/";
    public static final String HLS = "\"urlHls\":"+"\"http://wshls.live.migucloud.com/live/";
}
