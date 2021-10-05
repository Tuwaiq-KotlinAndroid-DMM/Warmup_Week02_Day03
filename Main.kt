//warmup-week2-day3


class book (var bookName:String,   // creating class by using primary constructor
            var author:String,
            var published: String,
            var language:String,
            var pages: Int,
            var bookMark: MutableMap<Int,String> = mutableMapOf()) {
            //all the functions should be inside the class
    fun addBookMark(pageNumber: Int, bookMarkNote: String) {  // to add bookmark
        bookMark.put(pageNumber, bookMarkNote)   //put is for map function

    }

    fun displayAllBookMark() { // to display all bookmark
        println(bookMark)

    }

    fun displayBookDetails() { // to display book details
        println("bookName:$bookName, author: $author,published: $published, language: $language, pages: $pages")
    }
}

fun main(){
    var book= book("Harry potter", "J. K. Rowling", "1997-2007", "English", 4224)
    book.addBookMark(77, " Ron Weasley When in doubt, go to the library")
    book.displayBookDetails()
    book.displayAllBookMark()
}
