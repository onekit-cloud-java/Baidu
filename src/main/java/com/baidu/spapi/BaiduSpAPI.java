package com.baidu.spapi;

import com.baidu.spapi.entity.oauth$jscode2sessionkey_body;
import com.baidu.spapi.entity.oauth$jscode2sessionkey_response;

public abstract class BaiduSpAPI {

/////////////////////////


    public abstract oauth$jscode2sessionkey_response oauth$jscode2sessionkey(oauth$jscode2sessionkey_body body) throws Error;


}
