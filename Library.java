class Book{
  private String title,author,publisher;
  private int bNo;

  Book(String title,String author,String publisher,int bNo){
    setTitle(title);
    setAuthor(author);
    setPublisher(publisher);
    setBNo(bNo);
  }
  void setTitle(String title){
    this.title=title;
  }
  void setAuthor(String author){
    this.author=author;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  void setBNo(int bNo){
    this.bNo=bNo;
  }
  String getTitle(){
    return title;
  }
  String getAuthor(){
    return author;
  }
  String getPublisher(){
    return publisher;
  }
  String getbNo(){
    return bNo;
  }
}
public class Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Book>books=new ArrayList<Book>();

    for(int i=0;i<5;)
  }
}