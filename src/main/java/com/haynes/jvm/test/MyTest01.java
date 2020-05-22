package com.haynes.jvm.test;

import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyTest01 {
    public static void main(String[] args) throws IOException {
        WxaNoticeDTO dto = new WxaNoticeDTO();
        dto.setTouser("5acf68683faa49508c02feb493661104");
        dto.setTemplate_id("8foCWPzBDc1sfAMbJbcwOog_ZmsFOhQrX2yKoJ91NwU"); //Todo 需要更改模板id
        dto.setPage("/pages/home/index");
        Map<String, WxaNoticeFieldDTO> data = new HashMap<String, WxaNoticeFieldDTO>(5);
        data.put("amount01", new WxaNoticeFieldDTO("0.01" + "元")); //1个币种符号+10位以内纯数字，可带小数，结尾可带“元”
        data.put("thing01", new WxaNoticeFieldDTO("好丽友浪里个浪（烧烤味）四层脆40g")); //20个以内字符可汉字、数字、字母或符号组合
        data.put("time01", new WxaNoticeFieldDTO("2018-11-14T08:10:00.021Z"));  //24小时制时间格式（支持+年月日）
        data.put("number01", new WxaNoticeFieldDTO("201912270427"));  //32位以内数字	只能数字，可带小数
        data.put("thing02", new WxaNoticeFieldDTO("退款成功，退款金额将在1-2个工作日内到账，请注意查收。"));
        dto.setData(data);
        StringEntity stringEntity = new StringEntity(JsonUtils.toJson(dto), "UTF-8");
        System.out.println(stringEntity.getContent());
        System.out.println(JsonUtils.toJson(dto));

    }
}
