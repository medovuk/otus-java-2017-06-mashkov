package ru.otus.models;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class DataSet {
    @Id
    long id;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
}
