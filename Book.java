/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String ref = "";
    private int borrowed = 0;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber, boolean isTextBook){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        ref = refNumber;
        courseText = isTextBook;
    }

    // Add the methods here ...
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String getRef(){
        return ref;
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public boolean isCourseText(){
        return courseText;
    }
    
    public void printAuthor(){
        System.out.println(author);
    }
    
    public void printTitle(){
        System.out.println(title);
    }
    
    public void setBorrowed(){
        borrowed++;
    }
    
    public void setRef(String refNumber){
        if(refNumber.length() > 3){
            ref = refNumber;
        }else{
            System.out.println("Sorry An error has occurred. Reference number must be at least 3 characters long");
            System.out.println("Field was unchanged!");
        }
    }
    
    public void printDetails(){
        if(ref == ""){
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + " Reference Number: ZZZ" + ", Borrowed: " + borrowed + " Is this a course Textbook? " + courseText);
        }else{
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + " Reference Number: " + ref + ", Borrowed: " + borrowed+ " Is this a course Textbook? " + courseText);
        }
   }
    
    
    
}
