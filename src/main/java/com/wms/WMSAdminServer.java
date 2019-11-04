package com.wms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class WMSAdminServer{
	private static Logger logger = LogManager.getLogger(WMSAdminServer.class);
	public static void main(String[] args) {
		new SpringApplicationBuilder(WMSAdminServer.class)
		.web(WebApplicationType.REACTIVE)
		.run(args);
		logger.info("---- WMS-Admin-Server-UP-------------------");
	}
	
}



