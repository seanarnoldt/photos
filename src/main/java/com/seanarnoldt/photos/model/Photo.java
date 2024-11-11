package com.seanarnoldt.photos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

@Table("PHOTOS")
public class Photo {

    @Id
    private Long id; 

    @NotEmpty
    private String fileName;


    @JsonIgnore
    private byte[] data;

    private String contentType;


    public Photo(){

    }
    
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

     public Long getId() {
        return id;
     }

     public void setId(Long id){
        this.id = id;
     }

     public String getFileName(){
        return fileName;
     }

     public void setFileName(String fileName){
        this.fileName = fileName;
     }
}
