package br.com.demo.aws.controller;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/s3")
public class AwsController {

    @Autowired
    private AmazonS3 amazonS3;

    @PostMapping("/notes")
    public void note(@RequestParam String name, @RequestParam String content) {
        amazonS3.putObject("bruna-personal-bucket", name + ".txt", content);
    }
}
