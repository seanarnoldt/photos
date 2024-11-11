package com.seanarnoldt.photos.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.seanarnoldt.photos.model.Photo;
import com.seanarnoldt.photos.repository.PhotosRepository;

import jakarta.websocket.server.ServerEndpoint;

//@Component
@Service
public class PhotoService {

    @Autowired
    private final PhotosRepository photosRepository;

    public PhotoService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    // private Map<String, Photo> db = new HashMap<>(){{
    //     put("1", new Photo("1", "hello.jpg"));
    // }};

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Long id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Long id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
