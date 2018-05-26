package com.github.simonpham.hasbrain.eaj.ui.model;

/**
 * Created by Simon Pham on 5/26/18.
 * Email: simonpham.dn@gmail.com
 */
public class Article {

    private String title;
    private int idImage;
    private String articleUrl;

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
}
