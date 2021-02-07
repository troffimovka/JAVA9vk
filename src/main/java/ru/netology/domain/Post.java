package ru.netology.domain;

public class Post {

    private int postId;
    private int ownerId;
    private int authorId;
    private boolean administratorAccess;
    private int administratorId;
    private long date;
    private long time;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String imageUrl;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private Views views;
    private RepostInfo repostInfo;
    private String link;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean markedAsAds;
    private boolean isFavourite;
    private int postponedId;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public boolean isAdministratorAccess() {
        return administratorAccess;
    }

    public void setAdministratorAccess(boolean administratorAccess) {
        this.administratorAccess = administratorAccess;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Views getViews() {
        return views;
    }

    public void setViews(Views views) {
        this.views = views;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setPostIsPinned(boolean postIsPinned) {
        this.postIsPinned = postIsPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }


}