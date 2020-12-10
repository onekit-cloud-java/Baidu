package com.baidu.spapi.entity;
@SuppressWarnings("unused")
public class oauth_jscode2sessionkey_body {
    private String code;
    private String client_id;
    private String sk;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }


}
