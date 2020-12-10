package com.baidu.openapi.entity;

public class smartapp_getunionid_response {
    private int errno;
    private String errmsg;
    private String request_id;
    private smartapp_getunionid_response_data data;

        public static class smartapp_getunionid_response_data {
            private String unionid;
            public String getUnionid() {
                return unionid;
            }

            public void setUnionid(String unionid) {
                this.unionid = unionid;
            }


        }



        public int getErrno() {
            return errno;
        }

        public void setErrno(int errno) {
            this.errno = errno;
        }

        public String getErrmsg() {
            return errmsg;
        }

        public void setErrmsg(String errmsg) {
            this.errmsg = errmsg;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public smartapp_getunionid_response_data getData() {
            return data;
        }

        public void setData(smartapp_getunionid_response_data data) {
            this.data = data;
        }



    /////////////////////////////
}
