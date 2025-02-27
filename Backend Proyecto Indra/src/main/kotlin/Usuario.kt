data class Usuario(
    val nombre: String,
    val correo: String,
    val contrasena: String,
    val eventosInscritos: MutableList<Evento> = mutableListOf()
)