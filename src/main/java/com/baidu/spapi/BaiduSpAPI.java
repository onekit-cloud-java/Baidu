package com.baidu.spapi;

public abstract class BaiduSpAPI {
    public static class Error extends Exception {
        public int getErrno() {
            return errno;
        }

        public void setErrno(int errno) {
            this.errno = errno;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getError_description() {
            return error_description;
        }

        public void setError_description(String error_description) {
            this.error_description = error_description;
        }

        private int errno;
        private String error;
        private String error_description;
    }

    public static class oauth$jscode2sessionkey_body {
        private String code;

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

        private String client_id;
        private String sk;
    }

    public abstract oauth$jscode2sessionkey_response oauth$jscode2sessionkey(
            String Content_Type,
            oauth$jscode2sessionkey_body body
    ) throws Error;

    public static class oauth$jscode2sessionkey_response {

    }
}
