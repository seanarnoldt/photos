package com.seanarnoldt.photos.repository;
import org.springframework.data.repository.CrudRepository;

import com.seanarnoldt.photos.model.Photo;

public interface PhotosRepository extends CrudRepository<Photo, Long>{

}
