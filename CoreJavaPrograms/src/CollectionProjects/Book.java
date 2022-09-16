package CollectionProjects;


 public  class Book implements Comparable<Book>  {
	private  int bid;
	private   String subject;
	private  String author;
	
	public  Book(int bid, String subject, String author) {
		this.bid=bid;
		this.author=author;
		this.subject=subject;
		
	}
	
	@Override 
public int	 compareTo(Book book){
	    return this.getbid()-book.getbid();
	}
	int getbid(){
	    return bid;
	}
	
@Override
public String toString() {
	return "Subject: "+subject+ "| Author: "+author+ "| Bid Amount: "+bid;
	
}
}