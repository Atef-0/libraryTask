fun main(args: Array<String>) {
    val library : Library = Library()
    val patron = Patron("Burger")
    val book1 = Book("book1", "auth1", 2019)
    val book2 = Book("book2", "auth2", 2018)
    val book3 = Book("book3", "auth3", 1010)
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)
    library.checkOutBook(patron,book1)
    library.removeBook(book2)
    library.returnBook(patron,book1)
    library.checkOutBook(patron,book3)
    println(book1.isAvailable())
    println(book2.isAvailable())
    println(book3.isAvailable())


}