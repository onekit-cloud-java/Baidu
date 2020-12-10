package com.baidu.openapi;

import com.baidu.openapi.entity.*;

@SuppressWarnings("unused")
public abstract class BaiduOpenAPI {


    //public abstract smartapp_getunionid_response smartapp_getunionid(String access_token, smartapp_getunionid_body body);

    public abstract token_response token(String grant_type, String client_id, String client_secret, String scope);

    public abstract  byte[] smartapp_qrcode_get(String access_token, smartapp_qrcode_get_body body) throws BaiduError;

    public abstract  byte[] smartapp_qrcode_getunlimited(String access_token, smartapp_qrcode_getunlimited_body body) throws BaiduError;

    public abstract smartapp_message_custom_send_response smartapp_message_custom_send(String access_token, smartapp_message_custom_send_body body);



}
