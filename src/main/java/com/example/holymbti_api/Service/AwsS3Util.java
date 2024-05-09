package com.example.holymbti_api.Service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Component
@Service
@RequiredArgsConstructor
public class AwsS3Util {

    @Value("${application.bucket.name}")
    private String bucketName;

    private final AmazonS3 s3Client;


    public byte[] downloadFile(String image) {

        String filename = image.substring(image.lastIndexOf('/') + 1);

        S3Object s3Object = s3Client.getObject(bucketName, filename);
        S3ObjectInputStream inputStream = s3Object.getObjectContent();
        try {
            byte[] content = IOUtils.toByteArray(inputStream);
            return content;
        } catch (IOException e) {
            // e.printStackTrace();
            throw new IllegalStateException("aws s3 다운로드 error");
        }
    }


}
