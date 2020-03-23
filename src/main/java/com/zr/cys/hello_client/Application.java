package com.zr.cys.hello_client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zeroc.IceBox.Server;
import com.zr.cys.hello_client.config.Messages;

@SpringBootApplication
//@EnableCaching
@EnableJpaRepositories(basePackages = "com.zr.app.repository")
//@EnableScheduling
//@EnableAsync
@EnableConfigurationProperties(Messages.class)
//@ComponentScan(basePackages = {"com.zr.commons.utils", "com.zr.commons.job", "com.zr.app", "com.zr.commons.config", "com.zr.commons.filter", "com.zr.commons.exception"})
//@EntityScan(basePackages = {"com.department.entities","come.employee.entities"})
public class Application {
	
    public static void main(String[] args) {
    	
    	try {
    		EmbeddedWebApplicationContext applicationContext = (EmbeddedWebApplicationContext)SpringApplication.run(Application.class, args);
    		Server.main(new String[]{"--Ice.Config=config-dev.properties"});
    	
    	} catch(Exception e) {
    		e.printStackTrace();
    		System.exit(1);
    	}
    }
}