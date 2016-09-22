package ch.fhnw.edu.eaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.fhnw.edu.eaf.renderer.MessageRenderer;

@SpringBootApplication
public class SpringIcoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringIcoApplication.class, args);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring/helloConfig.xml");
		
		MessageRenderer messageRenderer = (MessageRenderer) classPathXmlApplicationContext.getBean("renderer");
		classPathXmlApplicationContext.close();
		
		messageRenderer.render();
	}
}
