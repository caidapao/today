package com.caidapao.today.common.pojo;

/**
 * Created by caidapao on 2019/7/14
 * Time 12:37
 * address http://today.caidapao.com
 */
public enum ErrorCode {

    SYS_OBJECT_IS_NOT_NULL("SYS_OBJECT_IS_NOT_NULL", "%s不能为空"),
    SYS_USER_NOT_LOGIN("SYS_USER_NOT_LOGIN","您未登录");

    private String code;

    private String errorMsg;

    ErrorCode(String code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public String getCode() {
        return code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
