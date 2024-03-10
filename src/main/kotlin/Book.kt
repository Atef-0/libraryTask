class Book(private val title : String
           , private val author : String
           , private val publicationYear : Int
           ) : LibraryItem {


    private var isCheckedOut : Boolean = false

    override fun checkOut(): Boolean {
        isCheckedOut = true
        return true
    }

    override fun returnItem(): Boolean {
        isCheckedOut = false
        return true
    }

    override fun isAvailable(): Boolean {
        if(isCheckedOut)
            return false
        else
            return true
    }

}