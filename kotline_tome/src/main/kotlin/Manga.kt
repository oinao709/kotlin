class Manga() {

    val mangaTitle: MangaTitle = MangaTitle()
    val mangaGenre: MangaGenre = MangaGenre()

    fun getManga() {
        println(mangaTitle.get())
        println(mangaGenre.get())
    }

}
