package domain.manga

class Manga() {
    val mangaCode: MangaCode = MangaCode()
    val mangaTitle: MangaTitle = MangaTitle()
    val mangaGenre: MangaGenre = MangaGenre()

    fun getManga() {
        println(mangaCode.value)
        println(mangaTitle.mangaTitleName)
        println(mangaTitle.volume)
        println(mangaGenre.mangaGenreName)
    }
}
