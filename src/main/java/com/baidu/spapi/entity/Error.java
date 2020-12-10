package com.baidu.spapi.entity;

@SuppressWarnings("unused")
public class Error extends Exception {

    private int errno;
    private String error;
    private String error_description;

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


}
