package ru.netology.domain;

public class Post {
    private int postId;
    private String postMessage;
    private int dateOfPost;
    private String authorName;
    private int ownerId;
    private Likes likes;
    private Comments comments;
    private Views views;
    private Reposts reposts;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(int dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }




}
