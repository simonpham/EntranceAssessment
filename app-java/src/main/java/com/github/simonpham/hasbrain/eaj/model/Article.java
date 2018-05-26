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

    public Article(String title, int idImage, String articleUrl) {
        this.title = title;
        this.idImage = idImage;
        this.articleUrl = articleUrl;
    }

    public Article(String title, String articleUrl) {
        this.title = title;
        this.idImage = NO_IMAGE;
        this.articleUrl = articleUrl;
    }

    public Article(String title) {
        this.title = title;
        this.idImage = NO_IMAGE;
        this.articleUrl = "about:blank";
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
}
