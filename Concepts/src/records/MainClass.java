package records;


public class MainClass {
	
	public static void main(String[] args) {
		String name = "myName";
		
		Articles art = new Articles(name);
		ArticlesRecord artR = new ArticlesRecord(name);
		
	    System.out.println("Hello, World!");
	    System.out.println(art.getName());
	    System.out.println(artR.name());

	}

}
