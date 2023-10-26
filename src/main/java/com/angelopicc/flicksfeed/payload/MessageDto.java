package com.angelopicc.flicksfeed.payload;

public class MessageDto {
    
    private long id;
    private String message;

    public MessageDto() {
    }

    public MessageDto(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageDto [id=" + id + ", message=" + message + "]";
    }
}
