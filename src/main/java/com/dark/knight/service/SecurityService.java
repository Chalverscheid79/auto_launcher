package com.dark.knight.service;

/*
 * Copyright (c) Dark Knight 2018.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;


public class SecurityService {

    private static final Logger LOG = LoggerFactory.getLogger(SecurityService.class);

//    use to skip test allowed intern IP address from the network
    public Boolean isAdminMode() {

        return System.getProperty(Constant.ADMIN_MODE).equals("true") ? true : false;
    }

    public Boolean isNetworkConnected(URL urlToServer) throws IOException {

        final HttpURLConnection urlConn = (HttpURLConnection) urlToServer.openConnection();
        urlConn.connect();
        if (urlConn.getResponseCode() < 500) {

            LOG.info("Network connection test was success.");
        } else {

            LOG.error("Network connecton test has an error: {}", urlConn.getResponseMessage());
        }

        return urlConn.getResponseCode() < 500;
    }
}
