package com.hrious.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

	public IndexController() {
		System.out.println("com.hrious.weblearn.controller.IndexController.IndexController");
	}

	@GetMapping("/index.do")
	@ResponseBody
	public String index() throws IOException {
		System.out.println("com.hrious.weblearn.controller.IndexController.index");
		return "@controller";
	}

	@GetMapping("/map.do")
	public Map<String, String> map() {
		System.out.println("com.hrious.weblearn.controller.IndexController.map");
		Map<String, String> map = new HashMap<>();
		map.put("123", "xxx");
		return map;
	}
}
