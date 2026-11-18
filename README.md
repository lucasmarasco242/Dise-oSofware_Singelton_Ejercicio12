Ejercicio 2 - Registro Centralizado de Actividades de la Biblioteca

Explicación del programa

En este ejercicio se creó una clase llamada RegistroActividades que aplica el patrón Singleton para centralizar el registro de operaciones provenientes de los distintos sectores de la biblioteca sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Arreglos privados (fechas, horas, sectores y descripciones) y un contador (total) para almacenar las actividades de forma encapsulada.
- Un constructor privado para evitar la instanciación directa externa.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.
- Métodos públicos para registrar actividades, mostrar el historial completo en orden cronológico, filtrar por sector y consultar el total de eventos.

Luego, dentro del método main, se obtienen referencias desde diferentes módulos:
RegistroActividades r1 = RegistroActividades.getInstancia();
RegistroActividades r2 = RegistroActividades.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias apuntan al mismo objeto, registrar actividades desde diferentes sectores, consultar el total, ver el historial y realizar un filtrado.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la creación de objetos externos mediante un constructor privado.
- Controlar el acceso global a través de getInstancia() para asegurar que todos los sectores compartan exactamente el mismo registro.
- Almacenar los datos de forma secuencial en estructuras internas protegidas contra modificaciones directas externas.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true
Actividad registrada [Prestamos]: Préstamo de libro Java
Actividad registrada [Devoluciones]: Devolución de libro SQL
Actividad registrada [Socios]: Inscripción nuevo socio

Total de eventos registrados: 3

--- Historial Completo de Actividades ---
1. Fecha: 05/06/2026 - Hora: 10:00 - Sector: Prestamos - Descripción: Préstamo de libro Java
2. Fecha: 05/06/2026 - Hora: 11:30 - Sector: Devoluciones - Descripción: Devolución de libro SQL
3. Fecha: 05/06/2026 - Hora: 12:15 - Sector: Socios - Descripción: Inscripción nuevo socio

--- Filtrando por Sector: Prestamos ---
- [10:00] Préstamo de libro Java

Captura de pantalla


<img width="770" height="495" alt="image" src="https://github.com/user-attachments/assets/c4310c2d-0f44-4317-852c-00c55323cc7a" />
