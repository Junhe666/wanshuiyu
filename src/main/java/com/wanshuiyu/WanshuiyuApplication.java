package com.wanshuiyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
@SpringBootApplication
public class WanshuiyuApplication {
	private SimpMessagingTemplate messagingTemplate;
	public static void main(String[] args) {
		SpringApplication.run(WanshuiyuApplication.class, args);
	}
}
