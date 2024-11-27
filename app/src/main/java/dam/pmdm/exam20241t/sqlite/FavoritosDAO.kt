package dam.pmdm.exam20241t.sqlite

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FavoritosDAO {
    @Query("Select * from Favorito")
    fun selectAll(): List<Favorito>

    @Query("Select * from Favorito WHERE id=:id")
    fun selectFavorito(id:Int): List<Favorito>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insert(fav: Favorito): Long
    @Delete
    fun delete(fav: Favorito)
}
