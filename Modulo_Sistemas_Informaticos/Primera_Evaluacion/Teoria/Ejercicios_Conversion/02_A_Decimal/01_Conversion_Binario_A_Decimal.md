/ Fecha: 17/09/2025 /

<br>

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

$ Teoría$

 * <code> De Binario a Decimal --> Base 10 </code>
 *  De Octal a Binario --> Base 2 (0 1)
 *  De Hexadecimal a Binario --> Base 8


<br>

---


### Convirtiendo a Número Decimal

<br>

$Teoría$

<br>


**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)


<br>


## Tipos de Conversión a Decimal

### ¿De Binario a Decimal?

- Solo usa 0's y 1's. <br>

- Cada número equivale una potencia de 2, empezando desde la derecha. <br>
  
- $Ejemplo$: <br>
$1011$<sub>2</sub> = 1 * 4 + 0 * 2 + 1 * 1 =  **5** 


<br>
<br>



$Práctica:$

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!


<br>


<b> Ejemplo 1: </b> Convertir $1010$<sub>2</sub> a **decimal**

|  Posición (potencia)     |  Dígito Binario           | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 3                        | 1                         | 1 * $2^3$ = 8             |
| 2                        | 0                         | 0 * $2^0$ = 0             |
| 1                        | 1                         | 1 * $2^1$ = 2             |
| 0                        | 0                         | 0 * $2^0$ = 0             |


**SUMA TOTAL [RESULTADO]** = 8 + 0 + 2 + 0 = **[10]**

<br>

-- 


<b> Ejemplo 2: </b> Convertir $111$<sub>2</sub> a **decimal**

|  Posición (potencia)     |  Dígito Binario           | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 2                        | 1                         | 1 * $2^2$ = 4             |
| 1                        | 1                         | 1 * $2^1$ = 2             |
| 0                        | 1                         | 1 * $2^0$ = 1             |

**SUMA TOTAL [RESULTADO]** = 4 + 2 + 1 = **[7]**

<br>


--


<b> Ejemplo 3: </b> Convertir $10011$<sub>2</sub> a **decimal**

|  Posición (potencia)     |  Dígito Binario           | Cálculo                   |
|--------------------------|---------------------------|---------------------------|
| 4                        | 1                         | 1 * $2^4$ = 16            |
| 3                        | 0                         | 0 * $2^3$ = 0             |
| 2                        | 1                         | 0 * $2^2$ = 0             |
| 1                        | 1                         | 1 * $2^1$ = 2             |
| 0                        | 1                         | 1 * $2^0$ = 1             |

**SUMA TOTAM [RESULTADO]** = 16 + 2 + 1 = **[19]**


<br>

--


$Conclusión$:

 Para convertir de Binario a **DECIMAL**:

 1. Empieza por la derecha (posición 0)

 2. Multiplica cada dígito por  $2^n$ ( *n* = posición)

 3. Suma todos lo resultados.

