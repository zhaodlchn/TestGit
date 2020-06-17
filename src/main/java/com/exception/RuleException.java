package com.exception;


public class RuleException extends Exception {

    private static final long serialVersionUID = -5928816667490047659L;


    private String errorCode;

    private String errorMessage;


    public RuleException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
