package com.angelopicc.flicksfeed.payload;

public class CommentDto {
    
    private long id;
    private String content;

    public CommentDto() {
    }

    public CommentDto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentDto [id=" + id + ", content=" + content + "]";
    }
}
