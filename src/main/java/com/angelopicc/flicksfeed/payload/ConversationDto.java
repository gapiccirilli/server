package com.angelopicc.flicksfeed.payload;

public class ConversationDto {
    private long id;

    public ConversationDto() {
    }

    public ConversationDto(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConversationDto [id=" + id + "]";
    }
}
