package com.github.simonpham.hasbrain.eaj.model;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */
public class Article {

    private String title;
    private int idImage;
    private String articleUrl;
    private String author;
    private int idAvatar;
    private long timestamp;

    public Article(String title, int idImage, String articleUrl, String author, int idAvatar, long timestamp) {
        this.title = title;
        this.idImage = idImage;
        this.articleUrl = articleUrl;
        this.author = author;
        this.idAvatar = idAvatar;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIdAvatar() {
        return idAvatar;
    }

    public void setIdAvatar(int idAvatar) {
        this.idAvatar = idAvatar;
    }
}
