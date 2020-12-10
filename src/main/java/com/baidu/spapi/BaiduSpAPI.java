package com.baidu.spapi;


import com.baidu.spapi.entity.oauth_jscode2sessionkey_body;
import com.baidu.spapi.entity.oauth_jscode2sessionkey_response;
@SuppressWarnings("unused")
public abstract class BaiduSpAPI {

/////////////////////////


    public abstract oauth_jscode2sessionkey_response oauth_jscode2sessionkey(oauth_jscode2sessionkey_body body) throws Error;


}
