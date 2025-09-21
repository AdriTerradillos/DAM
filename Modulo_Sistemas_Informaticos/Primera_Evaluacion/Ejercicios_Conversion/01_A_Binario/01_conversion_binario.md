/ Fecha: 17/09/2025 /

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

$ Teoría$

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)

<br>

 * <code> Convertir a Binario --> Base 2 (0 1)</code>
 * Convertir a Decimal --> Base 10 
 * Convertir a Octal --> Base 8
 * Convertir a Hexadecimal --> Base 16

<br>

---

### 1) Convirtiendo a número Binario

$Teoría$
<br><br>
*Paso a paso*

1. <code>Dividir </code> el **número decimal entre 2**
2. <code> Anota el resto </code> : Si es par o impar (0 o 1)
3. Divide el **coeficiente**: Toma el coeficiente entero de la división y vuelve a dividirlo *entre 2*.
4. **Repite** el proceso: Continúa dividiendo el coeficiente obtenido entre 2 y anotando el resto, hasta que el coeficiente sea mayor o igual a 0.
5. Forma el **número binario**: Lee todos los restos que anotaste, comenzando por el último que escribiste (el de abajo) y terminando por el primero (el de arriba).

<br>

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
















