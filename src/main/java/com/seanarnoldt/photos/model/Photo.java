package com.seanarnoldt.photos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

public class Photo {

    @NotEmpty
     private String id; 

    @NotEmpty
    private String fileName;


    @JsonIgnore
    private byte[] data;

    private String contentType;


    public Photo(){

    }
    
    public Photo(String id, String fileName){
        this.id = id;
        this.fileName = fileName;
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

     public String getId() {
        return id;
     }

     public void setId(String id){
        this.id = id;
     }

     public String getFileName(){
        return fileName;
     }

     public void setFileName(String fileName){
        this.fileName = fileName;
     }
}
