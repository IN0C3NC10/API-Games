package com.in0c3nc10.games.games.exceptions.models;

public class StandardError {
    // ..número de retorno do Htpp. momento do erro e a mensagem
    private Integer status;
    private Long timestamp;
    private String message;
    public StandardError() {
    }
    public StandardError(Integer status, Long timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
