data class Organizador(
    val nombre: String,
    val contacto: String,
    val eventosCreados: MutableList<Evento> = mutableListOf()
)