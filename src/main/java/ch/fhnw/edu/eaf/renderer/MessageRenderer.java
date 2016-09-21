package ch.fhnw.edu.eaf.renderer;

import ch.fhnw.edu.eaf.provider.MessageProvider;

public interface MessageRenderer {
	
	void render();
	
	void setMessageProvider(MessageProvider messageProvider);

}
