¿Cuándo es conveniente usar acceso secuencial y cuándo acceso directo? 

El acceso secuencial es conveniente cuando se necesita recorrer la totalidad de un archivo o cuando los registros deben procesarse en el mismo orden en que están almacenados. Es ideal para tareas como conteo de registros, cálculo de promedios, generación de reportes o aplicación de algoritmos de ordenamiento externo. En este tipo de acceso, los datos se leen uno tras otro, desde el inicio hasta el final del archivo. 

En el contexto del taller de estudiantes, el acceso secuencial fue apropiado para: 

Contar estudiantes con determinada nota. 

Detectar corridas naturales. 

Calcular estadísticas generales. 

Por otro lado, el acceso directo (o aleatorio) es conveniente cuando se necesita consultar o modificar un registro específico sin recorrer todo el archivo. Este tipo de acceso se utiliza cuando se conoce la posición exacta del dato o se dispone de un índice que permite localizarlo rápidamente. 

En resumen: 

Se utiliza acceso secuencial cuando se procesan todos los datos. 

Se utiliza acceso directo cuando se necesita acceder rápidamente a un registro específico. 

  
---------------------------------------------------------------------------------------------

Diferencia entre mezcla directa y mezcla natural 

La mezcla directa es un algoritmo de ordenamiento externo que divide los datos en bloques de tamaño fijo y los va fusionando progresivamente hasta que el archivo completo queda ordenado. No tiene en cuenta si existen partes previamente ordenadas; siempre realiza la división de manera estructurada. 

En cambio, la mezcla natural (o corridas naturales) aprovecha los bloques de datos que ya se encuentran ordenados dentro del archivo. En lugar de dividir artificialmente en tamaños iguales, detecta secuencias crecientes naturales y las utiliza como base para la fusión. 

La principal diferencia radica en que: 

Mezcla directa: divide en bloques artificiales de tamaño fijo. 

Mezcla natural: utiliza los bloques ordenados que ya existen en los datos. 

La mezcla natural puede resultar más eficiente cuando el archivo no está completamente desordenado, ya que reduce la cantidad de pasadas necesarias. 

 
---------------------------------------------------------------------------------------------

Ventajas y limitaciones de usar recursividad en esta solución 

La recursividad consiste en que un método se llama a sí mismo para resolver un problema dividiéndolo en partes más pequeñas. En algoritmos como Merge Sort, la recursividad facilita la división del problema en subproblemas hasta alcanzar casos simples. 

Ventajas: 

Permite una implementación más clara y organizada del algoritmo. 

Facilita la aplicación del principio “divide y vencerás”. 

Reduce la complejidad del código en comparación con algunas soluciones iterativas. 

Limitaciones: 

Puede consumir más memoria debido al uso de la pila de llamadas. 

En archivos muy grandes puede provocar desbordamiento de pila (StackOverflowError). 

Puede ser menos eficiente que una versión iterativa en ciertos casos. 

En el contexto del taller, la recursividad es adecuada para la parte lógica del algoritmo de ordenamiento en memoria, pero en archivos muy grandes o en ordenamiento externo real, suele preferirse una implementación iterativa para optimizar recursos. 

 

 