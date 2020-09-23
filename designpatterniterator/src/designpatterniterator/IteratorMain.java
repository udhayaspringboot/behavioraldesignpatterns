package designpatterniterator;

public class IteratorMain {

	
	  public static void main(String[] args) {
	      NamesIterator namesRepository = new NamesIterator();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
