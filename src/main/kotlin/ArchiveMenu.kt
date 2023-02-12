import java.util.Scanner

class ArchiveMenu(archives: MutableList<Archive>): Menu<Archive>("архив", archives) {
    override fun add(list: MutableList<Archive>){
        println()
        println("=============================")
        println("Введите имя архива:")
        val name = Scanner(System.`in`).nextLine()
        list.add(Archive(name, mutableListOf()))
        println("=============================")
    }

    override fun open(t: Archive){
        NotesMenu(t.notes).show()
    }
}