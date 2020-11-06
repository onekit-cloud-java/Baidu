package com.baidu.openapi;

public abstract class BaiduOpenAPI {

    public static class smartapp$getunionid_body {
        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        private String openid;
    }
    public abstract smartapp$getunionid_response smartapp$getunionid(
            String access_token,
            smartapp$getunionid_body body
    );

    public static class smartapp$getunionid_response {
        public static class smartapp$getunionid_response_data {
            public String getUnionid() {
                return unionid;
            }

            public void setUnionid(String unionid) {
                this.unionid = unionid;
            }

            private String unionid;
        }

        private int errno;

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

        public smartapp$getunionid_response_data getData() {
            return data;
        }

        public void setData(smartapp$getunionid_response_data data) {
            this.data = data;
        }

        private String errmsg;
        private String request_id;
        private smartapp$getunionid_response_data data;
    }
    /////////////////////////////

}
