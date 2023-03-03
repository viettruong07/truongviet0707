package Session10;

 class Book {
     private String name;
     private int BookID;
     Book(String name, int BookID){
         this.name = name;
         this.BookID = BookID;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public int getBookID(){
         return BookID;
     }
     public void setBookID(int BookID){
         this.BookID = BookID;
     }
}
