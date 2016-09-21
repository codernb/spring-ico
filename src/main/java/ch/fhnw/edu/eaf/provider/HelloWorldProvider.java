package ch.fhnw.edu.eaf.provider;

public class HelloWorldProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
