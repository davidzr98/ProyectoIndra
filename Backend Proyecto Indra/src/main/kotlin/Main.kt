fun crearEvento(eventos: MutableList<Evento>, evento: Evento) {
    eventos.add(evento)
}

fun inscribirUsuarioAEvento(usuario: Usuario, evento: Evento) {
    usuario.eventosInscritos.add(evento)
}

fun cancelarInscripcionUsuario(usuario: Usuario, evento: Evento) {
    usuario.eventosInscritos.remove(evento)
}

fun crearOrganizador(organizadores: MutableList<Organizador>, organizador: Organizador) {
    organizadores.add(organizador)
}

fun main() {
    val eventos = mutableListOf<Evento>()
    val usuarios = mutableListOf<Usuario>()
    val organizadores = mutableListOf<Organizador>()

    // Crear eventos
    val evento1 = Evento("Conferencia de Sostenibilidad", "2025-03-25", 2, "Online", "Conferencia")
    crearEvento(eventos, evento1)

    // Crear usuarios
    val usuario1 = Usuario("Juan Perez", "juan.perez@example.com", "password123")
    usuarios.add(usuario1)

    // Inscribir usuario a evento
    inscribirUsuarioAEvento(usuario1, evento1)

    // Crear organizadores
    val organizador1 = Organizador("EcoCompany", "contacto@ecocompany.com", mutableListOf(evento1))
    crearOrganizador(organizadores, organizador1)

    // Mostrar datos
    println("Eventos: $eventos")
    println("Usuarios: $usuarios")
    println("Organizadores: $organizadores")
}