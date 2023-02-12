data class Archive(val name: String, val notes: MutableList<Note>){
    override fun toString(): String {
        return name
    }
}
