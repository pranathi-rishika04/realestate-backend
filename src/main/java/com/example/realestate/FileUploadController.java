package com.example.realestate;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class FileUploadController {

    @Autowired
    private Cloudinary cloudinary;

    @PostMapping("/api/upload")
    public ResponseEntity<Map> uploadImage(
            @RequestParam("file") MultipartFile file) {

        try {

            // Upload image to Cloudinary
            Map uploadResult =
                    cloudinary.uploader().upload(
                            file.getBytes(),
                            ObjectUtils.emptyMap());

            // Return uploaded image URL
            return ResponseEntity.ok(uploadResult);

        } catch (Exception e) {

            e.printStackTrace();

            return ResponseEntity.badRequest().build();
        }
    }
}