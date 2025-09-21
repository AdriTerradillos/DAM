/ Fecha: 17/09/2025 /

<br>

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

$ Teoría$

 *  <code> Convertir de hexaDecimal a Decimal --> Base 16 > 10 </code>
 *  Convertir de binario a Decimal --> Base 2 (0 1) > 10
 * Convertir a Octal a Decimal --> Base 8 > 10
 

<br>

---


### Convirtiendo a Número Decimal

<br>

$Teoría$

<br>


**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)


<br>


## Tipos de Conversión a Decimal

### ¿De Hexadecimal a Decimal?

- Usa dígitos del *0 al 9* y letras de la *A a la F* (donde A = 10, B = 11, ..., F = 15) <br>
- Cada símbolo equivale a una potencia de *16*, empezando desde la derecha. <br><br>

- $Ejemplo$: <br>

$2F$<sub>16</sub> = 2 * $16^1$ + 15 * $16^0$ = 32 + 15 = **47**


<br>


--


$Práctica$:

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!


<br>


<b> Ejemplo 1: </b> Convertir $1A$<sub>16</sub> a decimal

|  Posición (potencia)     |  Dígito Hexadecimal       | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 1                        | 1                         | 1 * $16^1$ = 16           |
| 0                        | A = 10                    | 10 * $16^0$ = 10          |

**SUMA TOTAL[RESULTADO]** = 16 + 10 = **[26]**


<br>




<b> Ejemplo 2: </b> Convertir $B3$<sub>16</sub> a decimal

|  Posición (potencia)     |  Dígito Hexadecimal       | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 1                        | B = 11                    | 11 * $16^1$ = 176         |
| 0                        | 3                         | 3 * $16^0$ = 3            |

**SUMA TOTAL[RESULTADO]** = 176 + 3 = **[179]**



<br>


<b> Ejemplo 3: </b> Convertir $2D7$<sub>16</sub> a decimal

|  Posición (potencia)     |  Dígito Hexadecimal       | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 2                        | 2                         | 2 * $16^2$ = 512          |
| 1                        | D = 13                    | 13 * $16^1$ = 208         |
| 0                        | 7                         | 7 * $16^0$ = 7            |

**SUMA TOTAL[RESULTADO]** = 512 + 208 + 7 = **[727]**


<br>


$Conclusión$:

Para convertir de HexaDecimal a *Decimal*:

1. Empieza por la derecha (posición 0)
2. Sustituye las letras (A-F) por sus equivalentes numéricos (A = 10, B = 11, ..., F = 15)
3. Multiplica cada símbolo por $16^n$ (*n* = posición)
4. Suma todos los resultados obtenidos.