class Manga() {

    val mangaTitle: MangaTitle = MangaTitle()
    val mangaGanre: String = "ジャンル"

    fun getManga() {
        println(mangaTitle.get())
        println(mangaGanre)
    }

}
