import domain.manga.Manga
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

class MangaRegisterService {

    fun register(): Manga {

        // 参照
        val manga = Manga()

        // ファイル出力
        val items = listOf(
                manga.mangaCode.value,
                manga.mangaTitle.mangaTitleName,
                manga.mangaTitle.volume,
                manga.mangaGenre.mangaGenreName)

        val fil = FileWriter("mangaList.csv")
        val pw = PrintWriter(BufferedWriter(fil))
        pw.println(items.joinToString(separator = ","))
        pw.close()

        return manga
    }

}