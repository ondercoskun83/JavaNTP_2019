
public enum Whois {
	Gokhan("www.gokhanaltan.com"), ISTE("www.iste.edu.tr"), Aramamotoru("www.google.com");
	
	private String url;
	Whois(String url){
		this.url=url;
	}
	
	public String urLGoster() {
		return url;
	}
	
}
