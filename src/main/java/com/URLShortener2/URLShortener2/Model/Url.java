package com.URLShortener2.URLShortener2.Model;

import javax.persistence.*;

@Entity
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String LongUrl;
    @Column
    private String ShortUrl;

    public int getId() {
        return id;
    }

    public String getLongUrl() {
        return LongUrl;
    }

    public void setLongUrl(String longUrl) {
        LongUrl = longUrl;
    }

    public String getShortUrl() {
        return ShortUrl;
    }

    public void setShortUrl(String shortUrl) {
        ShortUrl = shortUrl;
    }

}
