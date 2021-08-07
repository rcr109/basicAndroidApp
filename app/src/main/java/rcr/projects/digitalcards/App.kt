package rcr.projects.digitalcards

import android.app.Application
import rcr.projects.digitalcards.data.AppDatabase
import rcr.projects.digitalcards.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}