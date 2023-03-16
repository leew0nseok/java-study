package com.example.exception.dto;

import java.util.List;

public class ErrorResponse {

    String statusCode;
    String requestUrl;
    String code;
    String resultCode;

    List<Error> errorlist;

    public String getStatusCode() {

        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public List<Error> getErrorlist() {
        return errorlist;
    }

    public void setErrorlist(List<Error> errorlist) {
        this.errorlist = errorlist;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "statusCode='" + statusCode + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                ", code='" + code + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", errorlist=" + errorlist +
                '}';
    }
}
