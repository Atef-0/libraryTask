class Library() {


    val books = mutableListOf<Book>()


    fun addBook(book : Book){
        books.add((book))
    }
    fun removeBook(book: Book){
        if(books.contains(book)){
            books.remove(book)
            book.checkOut()
        }
    }
    fun checkOutBook(patron: Patron, book: Book): Boolean{
        if(book.isAvailable()){
            book.checkOut()
            patron.checkedOutBooks.add(book)
            return true
        }else
            return false

    }
    fun returnBook(patron: Patron, book: Book): Boolean{
        if(patron.checkedOutBooks.contains(book)){
        patron.checkedOutBooks.remove(book)
        return book.returnItem()
        }else
            return false
    }
}