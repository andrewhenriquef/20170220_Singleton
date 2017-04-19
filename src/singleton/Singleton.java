package singleton;

public class Singleton {

	private String author; 
	private volatile static Singleton uniqueInstance;

	private Singleton(){
		this.author = "Andrew Oliveira";
	}

	public static Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized (Singleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
}

