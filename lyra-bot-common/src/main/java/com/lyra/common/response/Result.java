package com.lyra.common.response;

public class Result <T> {
    private Integer code;
    private String message;
    private Boolean success;
    private T data;


    public  Result(Integer code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", success=" + success +
                ", data=" + data +
                '}';
    }

    public Result(Integer code, String message, Boolean success, T data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(ResponseEnums.SUCCESS.getCode(), ResponseEnums.SUCCESS.getDesc(), ResponseEnums.SUCCESS.getSuccess());
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResponseEnums.SUCCESS.getCode(), ResponseEnums.SUCCESS.getDesc(), ResponseEnums.SUCCESS.getSuccess(), data);
    }

    public static <T> Result<T> filed() {
        return new Result<>(ResponseEnums.FILED.getCode(), ResponseEnums.FILED.getDesc(), ResponseEnums.FILED.getSuccess());
    }

    public static <T> Result<T> filed(T data) {
        return new Result<>(ResponseEnums.FILED.getCode(), ResponseEnums.FILED.getDesc(), ResponseEnums.FILED.getSuccess(), data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
