package ru.netology.domain;

public class Reposts {
    private int counter;
    private boolean repostedByUser;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isRepostedByUser() {
        return repostedByUser;
    }

    public void setRepostedByUser(boolean repostedByUser) {
        this.repostedByUser = repostedByUser;
    }
}
