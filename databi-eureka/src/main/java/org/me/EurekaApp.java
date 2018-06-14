package org.me;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册
 * @author wl
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
	}

}
