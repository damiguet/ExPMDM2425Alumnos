package dam.pmdm.exam20241t.sqlite

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Favorito(
    @PrimaryKey var id:Int,
    var nombre:String,
    var municipio: String,
    var suelo:String){
}