package com.haynes.jvm.test;

import java.util.Map;

/**
 * 2018/2/9 0009 16:41
 * 微信小程序消息模版请求参数
 * @author Liuwei
 */
public class WxaNoticeDTO {

    private String touser;
    private String template_id;
    private String page;
    private String form_id;
    private Map<String, WxaNoticeFieldDTO> data;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public Map<String, WxaNoticeFieldDTO> getData() {
        return data;
    }

    public void setData(Map<String, WxaNoticeFieldDTO> data) {
        this.data = data;
    }
}
