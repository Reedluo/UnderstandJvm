package com.haynes.jvm.test;

/**
 * 2018/2/9 0009 16:43
 *
 * @author Liuwei
 */
public class WxaNoticeFieldDTO {

    private String value;
    private String color;

    public WxaNoticeFieldDTO() {
    }

    public WxaNoticeFieldDTO(String value) {
        this.value = value;
        this.color = "#173177";
    }

    public WxaNoticeFieldDTO(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
