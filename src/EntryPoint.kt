import MenuManager.*

fun main(Args : Array<String>) {
    val mm = MenuManager("Sm3PTools")
    val funcs = CFuncs()
    mm.run {
        AddMenu(CMenu("1", "Tools list", funcs::ListOfTools))
        Interpreter()
    }
}

class CFuncs {
    private val m_ListOfTools = listOf("MenuManager")
    fun ListOfTools() {
        m_ListOfTools.forEach {
            println(it)
        }
    }
}