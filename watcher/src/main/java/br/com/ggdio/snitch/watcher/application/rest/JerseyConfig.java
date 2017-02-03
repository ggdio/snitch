package br.com.ggdio.snitch.watcher.application.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api/v1")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() throws ClassNotFoundException {
		packages(JerseyConfig.class.getPackage().getName());
		
		registerResources();
	}

	private void registerResources() {
//		register(RegisterService.class);
	}

}