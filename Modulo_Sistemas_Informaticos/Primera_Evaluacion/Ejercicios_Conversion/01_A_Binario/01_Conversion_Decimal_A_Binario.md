

### TABLA DE APOYO 

|  Número                  |  Valor (en binario)       | 
|--------------------------|---------------------------|
| 0                        | *0 0 0*                   |
| 1                        | *0 0 1*                   | 
| 2                        | *0 1 0*                   | 
| 3                        | *0 1 1*                   |
| 4                        | *1 0 0*                   |
| 5                        | *1 0 1*                   |
| 6                        | *1 1 0*                   |
| 7                        | *1 1 1*                   |
| 8                        | *0 0 1*                   |


<br>


<br>


$Teoría$

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)

<br>

 * <code> Convertir de Decimal a Binario --> Base 10 > 2</code>
 * Convertir de Octal a Binario --> Base 8 > 2 
 * Convertir de Hexadecimal a Binario --> Base 16 > 2

<br>

---

### 1) Convirtiendo a número Binario


<br>


$Teoría$

### Tipos de Conversión 

#### ¿De Decimal a Binario?

- El sistema decimal usa los dígitos del 0 al 9 <br>

- El sistema **binario** solo usa los dígitos **0 y 1** <br>

- Para convertir de decimal a **binario**, se divide el número decimal **sucesivamente entre 2**, anotando el resto de cada división <br>

- El número binario se forma leyendo los restos **de abajo hacia arriba**


<br>


- $Ejemplo$: <br>

Convertir **13<sub>10</sub> a binario**: 

|  División                |  Cociente                 | Resto                     |
|--------------------------|---------------------------|---------------------------|
| $\frac{13}{2}$           | 6                         | 1                         |
| $\frac{6}{2}$            | 3                         | 0                         |
| $\frac{3}{2}$            | 1                         | 1                         |
| $\frac{1}{2}$            | 0                         | 1                         |

**[LECTURA DE RESTOS] (de abajo hacia arriba)** = *1 1 0 1*
**[RESULTADO TOTAL]** = 13<sub>10</sub> = **[*1 1 0 1*<sub>2</sub>]**



<br>


-- 


$Practica$: 

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!

<br>


--


<b> Ejemplo 1: </b> Convertir $25$<sub>10</sub> a binario

|  División                |  Cociente                 | Resto                     |
|--------------------------|---------------------------|---------------------------|
| $\frac{25}{2}$           | 12                        | 1                         |
| $\frac{12}{2}$           | 6                         | 0                         |
| $\frac{6}{2}$            | 3                         | 0                         |
| $\frac{3}{2}$            | 1                         | 1                         |
| $\frac{1}{2}$            | 0                         | 1                         |   


**[LECTURA DE RESTOS] (de abajo hacia arriba)** = *1 1 0 0 1*

**[RESULTADO TOTAL]** = $25$<sub>10</sub> = **[*1 1 0 0 1*<sub>2</sub>]**



<br>



<b> Ejemplo 2: </b> Convertir $39$<sub>10</sub> a binario

|  División                |  Cociente                 | Resto                     |
|--------------------------|---------------------------|---------------------------|
| $\frac{39}{2}$           | 19                        | 1                         |
| $\frac{19}{2}$           | 9                         | 1                         |
| $\frac{9}{2}$            | 4                         | 1                         |
| $\frac{4}{2}$            | 2                         | 0                         |
| $\frac{2}{2}$            | 1                         | 0                         | 
| $\frac{1}{2}$            | 0                         | 1                         |

**[LECTURA DE RESTOS] (de abajo hacia arriba)** = [*1 0 0 1 1 1*]

**[RESULTADO TOTAL]** = $39$<sub>10</sub> = **[*1 0 0 1 1 1* <sub>2</sub>]**



<br>



<b> Ejemplo 3: </b> Convertir $93$<sub>10</sub> a binario

|  División                |  Cociente                 | Resto                     |
|--------------------------|---------------------------|---------------------------|
| $\frac{93}{2}$           | 46                        | 1                         |
| $\frac{46}{2}$           | 23                        | 0                         |
| $\frac{23}{2}$           | 11                        | 1                         |
| $\frac{11}{2}$           | 5                         | 1                         |
| $\frac{5}{2}$            | 2                         | 1                         | 
| $\frac{2}{2}$            | 1                         | 0                         |
| $\frac{1}{2}$            | 0                         | 1                         |

**[LECTURA DE RESTOS] (de abajo hacia arriba)** = [*1 0 1 1 1 0 1*]

**[RESULTADO TOTAL]** = $93$<sub>10</sub> = **[*1 0 1 1 1 0 1* <sub>2</sub>]**


<br>


--


$Conclusión$:

Para convertir de Decimal a **Binario**: <br>

1. Divide el número decimal **sucesivamente entre 2** <br>

2. Anota el **resto** en cada división <br>

3. Detente cuando el cociente sea  **0** <br>

4. Lee los restos *de abajo hacia arriba* --> ese es tu **número binario**




















1. 

--> Esta secuencia de 0's y 1's es el **número binario**.
<br><br>


$Práctica: $

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!

<br>

<b>EJEMPLO 1:</b>

: : :) Traducir **a Binario** el número **178**

Objetivo: Reducir al máximo el número **178** igual o próximo a 0.

1. Buscamos potencias de 2 cercanas al número **178**

$2^7$ = 128 ----------> 178 - 128 =  *50* =   
$2^5$ = 32  ------------> 50 - 32 = *18* = <br>
$2^4$ = 16  --------------> 18 - 16 = *2* <br>
$2^1$ = 2    -----------------> 2 - 2 = **0**


[Proceso-Fraccionado]

$\frac{1}{7}$   $\frac{0}{6}$    $\frac{1}{5}$  $\frac{1}{4}$   $\frac{0}{3}$   $\frac{0}{2}$   $\frac{1}{1}$   $\frac{0}{0}$

<br>

--

<b>EJEMPLO 2:</b>

: : :) Traducir **a Binario** el número **104**

$2^6$ = 64  -----------> 104 - 64 = 40  
$2^5$ = 32   ------------> 40 - 32 = 8 <br>
$2^3$ = 8     -------------> 8 - 8 = **0** <br>

[Proceso-Fraccionado]

$\frac{0}{7}$   $\frac{1}{6}$    $\frac{1}{5}$  $\frac{0}{4}$   $\frac{1}{3}$   $\frac{0}{2}$   $\frac{0}{1}$   $\frac{0}{0}$

<br>

--

<b>EJEMPLO 3:</b>

: : :) Traducir **a Binario** el número **1 1 1 0 0 1 1 0**

$2^7$ = 128  <br>
$2^6$ = 64 <br>
$2^5$ = 32 <br>
~~$0^4$~~ <br>
~~$0^3$~~ <br>
$2^2$ = 4 <br>
$2^1$ = 2 <br>
~~$0^0$~~ <br>

128 + 64 + 32 + 4 + 2 = <br>
**230**

[Proceso-Fraccionado]

$\frac{1}{7}$   $\frac{1}{6}$    $\frac{1}{5}$  $\frac{0}{4}$   $\frac{0}{3}$   $\frac{1}{2}$   $\frac{1}{1}$   $\frac{0}{0}$
















