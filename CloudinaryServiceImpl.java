package org.softuni.onlinegrocery.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.softuni.onlinegrocery.util.constants.AppConstants.TEMP_FILE;
import static org.softuni.onlinegrocery.util.constants.AppConstants.URL_TO_LOWERCASE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    private final Cloudinary cloudinary;

    @Autowired
    public CloudinaryServiceImpl(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    @Override
    public String uploadImage(MultipartFile multipartFile) throws IOException {
        File file = File
                .createTempFile(TEMP_FILE, multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);

        return this.cloudinary.uploader()
                .upload(file, new HashMap())
                .get(URL_TO_LOWERCASE).toString();
    }

    @Override
    public MultipartFile findImageByUrl(String imageUrl) {
        return null;
    }
}
