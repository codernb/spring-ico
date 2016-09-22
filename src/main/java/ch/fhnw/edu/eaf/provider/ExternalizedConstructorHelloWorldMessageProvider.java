package ch.fhnw.edu.eaf.provider;

public class ExternalizedConstructorHelloWorldMessageProvider implements MessageProvider {

	private final String message;
	
	public ExternalizedConstructorHelloWorldMessageProvider(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
