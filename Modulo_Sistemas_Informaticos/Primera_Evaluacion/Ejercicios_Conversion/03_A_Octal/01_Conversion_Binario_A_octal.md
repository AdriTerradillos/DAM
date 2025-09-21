/ Fecha: 17/09/2025 /

<br>

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

$ Teoría$

 * <code> Convertir de Binario a Octal --> Base 2 (0 1) > 8 </code>
 * Convertir de Decimal a Octal --> Base 10 > 8 
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

#### ¿De Binario a Octal?

- El sistema binario solo usa 0's y 1's. <br>

- El *sistema Octal*, agrupamos los dígitos de 3 en 3 desde la derecha. <br>

- Cada grupo se convierte en su equivalente decimal (que será un dígito octal) <br>

- Si faltan cifras para formar un grupo, se completan con ceros a la izquierda.

<br>


- $Ejemplo$: <br>

**$101110$**<sub>2</sub> ---> agrupar <code> 101 </code>   <code> 110 </code>

<code> 101 </code> = 5, <br>
<code> 110 </code> = 6 <br>
**[RESULTADO TOTAL]** = $101110$<sub>2</sub> = **[56<sub>8</sub>]**


<br>


$Práctica$:

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!


<br>


<b> Ejemplo 1: </b> Convertir $1101$<sub>2</sub> a octal

**Paso 1**: agrupar de 3 en 3 desde la derecha: <br>
--> $1101$ => <code> 001 </code> <code> 101 </code>

|  Grupo binario           |  Equivalente decimal      | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
| 001                      | 1                         | 1                         |
| 101                      | 5                         | 5                         |

**[RESULTADO TOTAL]** = $1101$<sub>2</sub> = **[15<sub>8</sub>]**


<br>


--


<b> Ejemplo 2: </b> Convertir $100110$<sub>2</sub> a octal

**Paso 1**: Agrupar de 3 en 3 desde la derecha:
--> $100110$ => <code> 100 </code> <code> 110 </code>

|  Grupo binario           |  Equivalente decimal      | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
| 100                      | 4                         | 4                         |
| 110                      | 6                         | 6                         |

**[RESULTADO TOTAL]** = $100110$<sub>2</sub> = **[46<sub>8</sub>]**


<br>


<b> Ejemplo 3: </b> Convertir $1110101$<sub>2</sub> a octal

**Paso 1**: agrupar de 3 en 3 desde la derecha: <br>
--> $1110101$ => <code> 001 </code> <code> 110 </code> <code> 101 </code>

|  Grupo binario           |  Equivalente decimal      | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
| 001                      | 1                         | 1                         |
| 110                      | 6                         | 6                         |
| 101                      | 5                         | 5                         |

**[RESULTADO TOTAL]** = $1110101$<sub>8</sub> = **[165<sub>8</sub>]**


<br>


--


$Conclusión$:

Para convertir de binario a *Octal*:

- 1. Agrupa los dígitos de 3 en 3 desde la *derecha*. <br>
- 2. Si falta algún dígito, **agrega ceros a la izquierda**.
- 3. Convierte cada grupo binario a su equivalente decimal (*0 a 7*).
- 4. Une los resultados en orden => ese es tu número octal. 




### TABLA DE APOYO 

|  Número                  |  Valor (en binario)       | 
|--------------------------|---------------------------|
| 0                        | 0 0 0                     |
| 1                        | 0 0 1                     | 
| 2                        | 0 1 0                     | 
| 3                        | 0 1 1                     |
| 4                        | 1 0 0                     |
| 5                        | 1 0 1                     |
| 6                        | 1 1 0                     |
| 7                        | 1 1 1                     |
| 8                        | 0 0 1                     |