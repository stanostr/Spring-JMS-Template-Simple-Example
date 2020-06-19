package com.demo.receiver.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;

import com.demo.receiver.domain.Product;

@Configuration
public class AppConfig {

	@Bean
	public MessageConverter messageConverter() {
		MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
		messageConverter.setTypeIdPropertyName("_typeId");
		Map<String, Class<?>> mappings = new HashMap<>();
		mappings.put("product", Product.class);
		messageConverter.setTypeIdMappings(mappings);
		return messageConverter;
	}
}
