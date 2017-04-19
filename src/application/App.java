package application;

import javax.swing.plaf.synth.SynthSeparatorUI;

import singleton.Singleton;

public class App {

	public static void main(String[] args) {
		
		Singleton author = Singleton.getInstance();

		System.out.println(author.getAuthor());
		
		author.setAuthor("Slow Murder");
	
		System.out.println(author.getAuthor());
		
	}

}
