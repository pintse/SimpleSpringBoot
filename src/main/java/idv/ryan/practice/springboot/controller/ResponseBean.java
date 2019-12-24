package idv.ryan.practice.springboot.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBean<T> {
    private T data;
    private String message;

    private ResponseBean(T data) {
        this.data = data;
        this.message = "SUCCESS";
    }

    public static ResponseBean newInstance(Object data) {
        return new ResponseBean<>(data);
    }

    public static ResponseBean newInstance(HttpStatus status) {
        return new ResponseBean<>(status);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

