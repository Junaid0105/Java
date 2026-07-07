package classesAndObjects;

class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static { // class initializer
        totalBooks = 0;
    }
    {// object initializer
        totalBooks++;
    }
    Book(String isbn, String title, String author){ // constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalBook(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println(this.title + " Book is already borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy the " + this.title + " book");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review about "+ this.title+ " book");
        }
    }

    static void main() {
        Book java = new Book("1", "Java Programming","James Gosling");
        Book python = new Book("2", "Python Programming","Guido Van Rossum");
        System.out.println("Total number of book available in the library: "+getTotalBook());
        java.borrowBook(); // borrow java book
        python.borrowBook(); // borrow python book
        java.borrowBook(); // again borrow java book , but not available
        python.returnBook(); // return python book
        java.returnBook(); //return java book
        python.returnBook();// again return python book , but book already present in the library
    }

}
