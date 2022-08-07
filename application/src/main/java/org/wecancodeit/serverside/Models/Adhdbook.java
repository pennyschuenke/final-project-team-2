package org.wecancodeit.serverside.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adhdbook {

    @Id
    @GeneratedValue
    public Long id;
    public String title;
    public String author;

    public Adhdbook(){
    }

    public Adhdbook(Long id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}

