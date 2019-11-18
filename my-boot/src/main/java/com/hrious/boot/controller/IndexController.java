package com.hrious.boot.controller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping("/index.do")
    public String index() {
        return "index controller";
    }

    @GetMapping("/map.do")
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

    @GetMapping("/index.html")
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html;charset=utf-8");

		String sourcePath = this.getClass().getResource("/").getPath();
		String filePath = sourcePath + "/index.html";
		try {
			IOUtils.write(FileUtils.readFileToByteArray(new File(filePath)), response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/upload")
	public String upload(@RequestPart("file") MultipartFile multipartFile) {

    	return "上传成功";
	}
}
