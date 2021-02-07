package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPostCurrentUser;
    private boolean canPostGroups;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPostCurrentUser() {
        return canPostCurrentUser;
    }

    public void setCanPostCurrentUser(boolean canPostCurrentUser) {
        this.canPostCurrentUser = canPostCurrentUser;
    }

    public boolean isCanPostGroups() {
        return canPostGroups;
    }

    public void setCanPostGroups(boolean canPostGroups) {
        this.canPostGroups = canPostGroups;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}