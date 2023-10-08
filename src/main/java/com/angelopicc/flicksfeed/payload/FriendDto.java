package com.angelopicc.flicksfeed.payload;

public class FriendDto {
    private long id;
    private UserDto friend;

    public FriendDto() {
    }

    public FriendDto(long id, UserDto friend) {
        this.id = id;
        this.friend = friend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDto getFriend() {
        return friend;
    }

    public void setFriend(UserDto friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "FriendDto [id=" + id + ", friend=" + friend + "]";
    }
}
