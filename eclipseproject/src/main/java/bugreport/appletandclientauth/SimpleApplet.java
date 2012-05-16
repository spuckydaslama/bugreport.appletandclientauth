package bugreport.appletandclientauth;

import java.applet.Applet;

public class SimpleApplet extends Applet {

	private static final long serialVersionUID = 1L;

	@Override
	public void start() {
		super.start();
		System.out.println("I'm OK");
	}
}
