import java.util.*

abstract class Menu<T>(private val objectName : String, private val list : MutableList<T>) {
    fun show(){
        var listSize: Int
        while (true){
            listSize = list.size
            println()
            println("Список объектов \"$objectName\"")
            println("=============================")
            println("0. Создать объект \"$objectName\"")
            list.forEachIndexed { index, element -> println("${index+1}. $element")}
            println("${listSize+1}. Выход")
            println("=============================")
            println("Выберите пункт меню:")
            when ( val action: Int? = Scanner(System.`in`).nextLine().toIntOrNull()){
                0 -> add(list)
                in 1..listSize -> if (action != null) {
                    open(list[action-1])
                }
                listSize+1 -> break
                else -> println("Недопустимое значение. Введите значение от 0 до ${listSize+1}")
            }
        }
    }

    abstract fun add(list: MutableList<T>)
    abstract fun open(t: T)
}