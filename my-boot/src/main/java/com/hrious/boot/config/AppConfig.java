package com.hrious.boot.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("com.hrious.boot")
public class AppConfig implements WebMvcConfigurer {

	/**
	 * 配置JSON解析器
	 */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new FastJsonHttpMessageConverter());
    }

	/**
	 * 文件上传解析器
	 */
	@Bean("multipartResolver")
	public StandardServletMultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
}
