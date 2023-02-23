En esta práctica, se simulará el Marca Fantasy sobre el que se ha trabajado en las últimas clases. En la edición inventada por el alumno, entrarán 3 usuarios con 11 jugadores y un entrenador, todos ellos pertenecientes a 5 equipos distintos. Recomiendo sacar del main la carga de datos a otro método estático.

Recordando la lógica, los usuarios tienen unos jugadores los cuales darán una puntuación en cada jornada. 

Los jugadores y entrenadores tiene un factor (del 1 al 10) con la calidad y los equipos tienen un factor de calidad (del 1 al 5).

Para calcular esta puntuación de cada jugador/entrenador, en cada jornada, es necesario aplicar la siguiente formula: numero_aleatorio(entre 0 y 1) * (factor_miembro + factor_equipo) 

Es necesario simular la lógica del concurso durante 5 jornadas de Liga.

Cada vez que se celebre una jornada (una vez a la semana), el factor de los jugadores y equipos será actualizada de forma aleatoria: +-3 jugadores y +-1 equipos. Los entrenadores no se actualiza su factor.


Para simular todo esto será necesario usar la clase Ramdom (https://docs.oracle.com/javase/8/docs/api/java/util/Random.html), o clase Math su método ramdom.

Es necesario por cada jornada, ir mostrando como evoluciona la clasificación de los usuarios, así como un desglose de los puntos de sus jugadores. La competición cierra jornada los lunes, siendo el primero el 27 de febrero de 2023 y finalizará pasadas 5 semanas.

Se pide:
- Realizar el diagrama de clases.
- Programar los casos de uso anterior descritos.

Especificaciones técnicas:
- Es recomendable usar la clase LocalDate/LocalDateTime e investigar como utilizarla en Internet. Para obtener diferencia de dias, se puede realizar mediante la clase Duration. *De cara al examen intercuatrimestral no hay que conocer estas clases, pero lo que si hay que saber es mirar la documentación JAVADOC*
- Hay que trabajar utilizando *enums* donde sea necesario.
- Crear expresamente un método void actualizarFactor() en Jugador y un void actualizarFactor() en Equipo.
- Instance of/downncasting
  Se trabajará con la nueva forma de hacer downcasting en un paso:
  ```java
  if(o instanceof Concursante concursante)
    return concursante.getNombre().equals(this.getNombre());
  else
    return false;
  ```

- Codicionales unarios

Se probará a trabajar con expresiones condicionales unarias en Java, muy parecidas a las que define Python:

##### Python

```python
>>> nombre = None
>>> nombreUpper = nombre.upper() if nombre != None else "UNNAMED"
>>> nombreUpper
'UNNAMED'
>>> nombre = "Luis"
>>> nombreUpper = nombre.upper() if nombre != None else "UNNAMED"
>>> nombreUpper
'LUIS'
```

##### Java
```java
String nombre = (nombre != null)?nombre.toUpperCase():"UNNAMED";

jshell> String nombre;
jshell> String nombreUpper = (nombre != null)?nombre.toUpperCase():"UNNAMED";
nombre ==> "UNNAMED"
jshell> nombre = "Luis";
jshell> String nombreUpper = (nombre != null)?nombre.toUpperCase():"UNNAMED";
nombre ==> "LUIS"
```

