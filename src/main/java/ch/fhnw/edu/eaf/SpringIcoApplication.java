package ch.fhnw.edu.eaf;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import ch.fhnw.edu.eaf.renderer.MessageRenderer;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class SpringIcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIcoApplication.class, args);
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("/spring/helloConfig.xml"));
		
		MessageRenderer messageRenderer = (MessageRenderer) xmlBeanFactory.getBean("renderer");
		messageRenderer.render();
	}
}
