package com.dark.knight;

import com.dark.knight.service.Constant;
import com.dark.knight.service.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;

public class Main {

	private static final Logger LOG  = LoggerFactory.getLogger(Main.class);

	/**
	 *
	 */
	public static void init() {
		// TODO create and check everything what we need for use RemoteService

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		SecurityService securityService = new SecurityService();
		try {
			securityService.isNetworkConnected(new URL(Constant.launcherServer));
		} catch (IOException e) {
			LOG.error(e.toString());
		}
	}

}
