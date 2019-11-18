package com.hrious.web.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@ComponentScan("com.hrious.web")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new FastJsonHttpMessageConverter());
	}
}
