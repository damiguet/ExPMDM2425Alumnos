package dam.pmdm.exam20241t.sqlite

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Favorito::class], version = 1, exportSchema = false)
abstract class FavoritosBBDD: RoomDatabase(){
    abstract fun favoritosDAO(): FavoritosDAO
    companion object DatabaseBuilder{
        private var INSTANCE : FavoritosBBDD? = null
        fun getInstance (context: Context): FavoritosBBDD {
            if (INSTANCE == null) synchronized(Favorito::class) {
                INSTANCE = buildRoomDB(context)
            }
            return INSTANCE!!
        }
        private fun buildRoomDB (contexto : Context) =
            Room.databaseBuilder (
                contexto.applicationContext, FavoritosBBDD::class.java, "favoritos.db"
            ).build ()
    }
}