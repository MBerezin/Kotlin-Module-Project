import java.util.Scanner

class NotesMenu(notes: MutableList<Note>): Menu<Note>("заметка", notes) {
    override fun add(list: MutableList<Note>){
        println()
        println("=============================")
        println("Введите имя заметки:")
        val name = Scanner(System.`in`).nextLine()
        println("Введите текст заметки:")
        val text = Scanner(System.`in`).nextLine()
        list.add(Note(name, text))
        println("=============================")
    }

    override fun open(t: Note){
        println()
        println("=============================")
        println("Заметка: ${t.name}")
        println("Текст:")
        println(t.text)
        println("=============================")
        println()
    }
}