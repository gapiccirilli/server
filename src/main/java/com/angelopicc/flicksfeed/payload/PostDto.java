package com.angelopicc.flicksfeed.payload;

import java.time.LocalDate;

public class PostDto {
    
    private long id;
    private String title;
    private String genre;
    private String director;
    private String rated;
    private LocalDate released;
    private byte rottenScore;
    private byte imdbScore;
    private byte rating;
    private String content;
    private String image;
    private long userId;
    
    public PostDto() {
    }

    public PostDto(long id, String title, String genre, String director, String rated, LocalDate released,
            byte rottenScore, byte imdbScore, byte rating, String content, String image, long userId) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.rated = rated;
        this.released = released;
        this.rottenScore = rottenScore;
        this.imdbScore = imdbScore;
        this.rating = rating;
        this.content = content;
        this.image = image;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public byte getRottenScore() {
        return rottenScore;
    }

    public void setRottenScore(byte rottenScore) {
        this.rottenScore = rottenScore;
    }

    public byte getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(byte imdbScore) {
        this.imdbScore = imdbScore;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PostDto [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director + ", rated="
                + rated + ", released=" + released + ", rottenScore=" + rottenScore + ", imdbScore=" + imdbScore
                + ", rating=" + rating + ", content=" + content + ", image=" + image + ", userId=" + userId + "]";
    }
}
