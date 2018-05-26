package com.github.simonpham.hasbrain.eaj.model;

import static com.github.simonpham.hasbrain.eaj.util.Const.NO_IMAGE;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */
public class Article {

    private String title;
    private int idImage;
    private String articleUrl;
    private long timestamp;

    public Article(String title, int idImage, String articleUrl, long timestamp) {
        this.title = title;
        this.idImage = idImage;
        this.articleUrl = articleUrl;
        this.timestamp = timestamp;
    }

    public Article(String title, String articleUrl, long timestamp) {
        this.title = title;
        this.idImage = NO_IMAGE;
        this.articleUrl = articleUrl;
        this.timestamp = timestamp;
    }

    public Article(String title, long timestamp) {
        this.title = title;
        this.idImage = NO_IMAGE;
        this.articleUrl = "about:blank";
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
}
