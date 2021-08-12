package ru.netology.domain;

public class Comments {
    private int counter;
    private boolean commentedByUser;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isCommentByUser() {
        return commentedByUser;
    }

    public void setCommentByUser(boolean commentedByUser) {
        this.commentedByUser = commentedByUser;
    }
}
