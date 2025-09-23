/ Fecha: 17/09/2025 /

<br>

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

$ Teoría$

 * <code> Convertir de Decimal a Octal --> Base 10 > 8 </code>
 * Convertir de Binario a Octal --> Base 2 (0 1) > 8 
 * Convertir de Hexadecimal a Octal --> Base 16 > 8


<br>

---


### Convirtiendo a número octal

$Teoría$
<br><br>

*Paso a paso*

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

### Tipos de Conversión

#### ¿De Decimal a Octal?

- El sistema decimal usa los dígitos del 0 al 9 <br>

- El sistema *octal* usa los dígitos *del0 al 7* <br>

- Para convertir de *decimal a Octal*, se divide el número decimal entre 8 **sucesivamente**, anotando el resto de cada división <br>

- El número *octal* se forma leyendo los restos (de las divisiones) de abajo hacia arriba

<br>


- $Ejemplo$: <br>

Convertir **45**<sub>10</sub> a octal: <br>

1. $\frac{45}{8}$ = 5, resto 5 <br>

2. $\frac{5}{8}$ = 0, resto 5

**[RESULTADO TOTAL]** = $45$<sub>10</sub> = **[55<sub>8</sub>]**


<br>


--

<br>

$Práctica$:

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!


<br>


<b> Ejemplo 1: </b> Convertir $93$<sub>10</sub> a octal

|  División                |  Resultado cociente       | Resto                     |
|--------------------------|---------------------------|---------------------------|
|  $\frac{93}{8}$          | 11                        | 5                         |
| $\frac{11}{8}$           | 1                         | 3                         |
| $\frac{1}{8}$            | 0                         | 1                         |


**LECTURA DE RESTOS (DE ABAJO HACIA ARRIBA)** --> 1 --> 3 --> 5

**[RESULTADO]** = $93$<sub>10</sub> = **[135<sub>8</sub>]**


<br>
<br>


<b> Ejemplo 2: </b> Convertir $39$<sub>10</sub> a **Octal**

|  División                |  Resultado cociente       | Resto                     |
|--------------------------|---------------------------|---------------------------|
|  $\frac{39}{8}$          | 4                         | 7                         |
| $\frac{4}{8}$            | 0                         | 4                         |


**LECTURA DE RESTOS (DE ABAJO HACIA ARRIBA)** --> 4 --> 7

**[RESULTADO]** = $39$<sub>10</sub> = **[47<sub>8</sub>]**


<br>


<b> Ejemplo 3: </b> Convertir $449$<sub>10</sub> a octal

|  División                |  Resultado cociente       | Resto                     |
|--------------------------|---------------------------|---------------------------|
|  $\frac{449}{8}$         | 56                        | 1                         |
| $\frac{56}{8}$           | 7                         | 0                         |
| $\frac{7}{8}$            | 0                         | 7                         |


**LECTURA DE RESTOS (DE ABAJO HACIA ARRIBA)** --> 7 --> 0 --> 1

**[RESULTADO]** = $449$<sub>10</sub> = **[701 <sub>8</sub>]**


<br>


--


$Conclusión$:

Para convertir de Decimal a *Octal*:

- 1. Divide el número decimal **sucesivamente entre 8** <br>

- 2. Anota el **resto** de cada división <br>

- 3. Detente cuando el cociente sea **0** <br>

- 4. Escribe los restos *de abajo hacia arriba* --> ese es tu número *octal*