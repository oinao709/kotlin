package domain.manga

class Manga() {
    val mangaCode: MangaCode = MangaCode()
    val mangaTitle: MangaTitle = MangaTitle()
    val mangaGenre: MangaGenre = MangaGenre()

    fun getManga() {
        println(mangaCode.get())
        println(mangaTitle.get())
        println(mangaGenre.get())
    }

}
