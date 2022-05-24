package homework;

public class BookDTO {
  private String isbn;
  private String title;
  private String author;
  private String publisher;
  private String price;
  
 
  
  @Override
  public String toString() {
    return  isbn + title +   author +  publisher  + price ;
  }
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String _isbn) {
    isbn = _isbn;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String _title) {
    this.title = _title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String _author) {
    this.author = _author;
  }
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String _publisher) {
    this.publisher = _publisher;
  }
  public String getPrice() {
    return price;
  }
  public void setPrice(String _price) {
    this.price = _price;
  }

    
 
  
 
  
}
  
  
