import domain.manga.Manga

fun main(args: Array<String>) {

    val mangaRegisterService = MangaRegisterService()

    val manga : Manga = mangaRegisterService.register()

    manga.getManga()

}