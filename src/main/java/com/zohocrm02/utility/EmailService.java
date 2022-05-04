package com.zohocrm02.utility;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
	 public void sendSimpleMessage(String to, String subject, String text);
}
