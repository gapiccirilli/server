package com.angelopicc.flicksfeed.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "post")
    private List<Conversation> conversations;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {

    }

    public Post(long id, String title, String genre, String director, String rated, LocalDate released,
            byte rottenScore, byte imdbScore, byte rating, String content, String image,
            List<Conversation> conversations, List<Comment> comments, List<Like> likes) {
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
        this.conversations = conversations;
        this.comments = comments;
        this.likes = likes;
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

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director + ", rated="
                + rated + ", released=" + released + ", rottenScore=" + rottenScore + ", imdbScore=" + imdbScore
                + ", rating=" + rating + ", content=" + content + ", image=" + image + ", conversations="
                + conversations + ", comments=" + comments + ", likes=" + likes + "]";
    }
}
