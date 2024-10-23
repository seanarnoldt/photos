package com.seanarnoldt.photos;

import jakarta.validation.constraints.NotEmpty;

public class Photo {

    @NotEmpty
     private String id; 

     @NotEmpty
     private String fileName;

    private byte[] data;

 

    public Photo(){

    }
    
    public Photo(String id, String fileName){
        this.id = id;
        this.fileName = fileName;
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
