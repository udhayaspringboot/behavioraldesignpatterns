package designpatterniterator;

public class NamesIterator implements Container, Iterator {

	 public String names[] = {"Udhay" , "Kumar" ,"Soorya" , "Aravind"};

	 int index;

     @Override
     public boolean hasNext() {
     
        if(index < names.length){
           return true;
        }
        return false;
     }

     @Override
     public Object next() {
     
        if(this.hasNext()){
           return names[index++];
        }
        return null;
     }		

	@Override
	public Iterator getIterator() {
		
		return new NamesIterator();
	}

}
