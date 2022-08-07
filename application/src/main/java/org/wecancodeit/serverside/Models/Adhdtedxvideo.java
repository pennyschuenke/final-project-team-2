package org.wecancodeit.serverside.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adhdtedxvideo {

    @Id
    @GeneratedValue
    public Long id;
    public String title;
    public String url;

    public Adhdtedxvideo() {
    }

    public Adhdtedxvideo(Long id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getUrl() {return url;}
}