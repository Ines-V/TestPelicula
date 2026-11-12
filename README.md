1. PELICULA

Crea la clase Pelicula con los atributos privados titulo, director y duracionMinutos.

• Constructor con los tres atributos que use los setters. Así la validación se escribe una sola vez y nunca existe una película en estado inválido.

• Getters y setters de los tres atributos.

• setTitulo y setDirector no admiten valores nulos ni vacíos. setDuracionMinutos solo admite valores mayores que 0.

• Un valor inválido lanza IllegalArgumentException con un mensaje claro.

• toString() y un método mostrarInformacion().

Clase de prueba: TestPelicula. Crea una película, muéstrala, modifica sus atributos y comprueba que un valor inválido lanza la excepción (captúrala con trycatch y muestra el mensaje).
