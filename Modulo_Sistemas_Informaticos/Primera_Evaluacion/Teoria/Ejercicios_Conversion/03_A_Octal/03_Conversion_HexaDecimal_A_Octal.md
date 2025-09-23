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

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

$ Teoría$

 * <code> Convertir de Hexadecimal a Octal --> Base 16 > 8 </code>
 * Convertir de Decimal a Octal --> Base 10 > 8 
 * Convertir de Binario a Octal --> Base 2 (0 1) > 8 


<br>

---


### Convirtiendo a número octal

$Teoría$
<br><br>

*Paso a paso*

**Paso Previo:** En cualquier ejercicio, pasaremos en primer lugar ese mismo número a binario (0's y 1's)
<br>

### Tipos de Conversión

#### ¿De Hexadecimal a Octal?

- El sistema Hexadecimal usa los dígitos del 0 al 9 y las letras de la (donde A = 10, B = 11, ..., F = 15) <br>

- El *sistema Octal* usa los dígitos del *0 al 7* <br>

- Para convertir de hexadecimal *a octal*, se sigue este camino:
*Hexadecimal* --> *Binario* --> **Octal** <br>

- Cada dígito hexadecimal se convierte a su equivalente binario de *4 bits* <br>

- Luego, se agrupan los bits binarios en grupos de *3 en 3* desde la derecha para convertir a **octal**

<br>


- $Ejemplo$:  <br>

Convertir **2F**<sub>16</sub> a **octal**: <br>

1)   **2** = *0 0 1 0* (mirar tabla de apoyo) <br>

**F** = *1 1 1 1* <br>


--> $2F$<sub>16</sub> = *00101111*<sub>2</sub>    
<br>

2) Agrupar en ternas: <br>
<code> *0 0 0* </code> <code> *1 0 1* </code> <code> *1 1 1* </code> <br>

--> *0 0 0* = 0,101 = 5, 111 = **7**

**[RESULTADO TOTAL]** = $2F$<sub>16</sub> = [**057<sub>8</sub>**]


<br>


--

<br>


$Práctica$:

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!

<br>


<b> Ejemplo 1: </b> Convertir $1A$<sub>16</sub> a octal


**Paso 1**: Convertir a binario (4 bits por dígito): 

|  Digito Hexadecimal      |  Binario (4 bits)         |
|--------------------------|---------------------------|
|  1                       | *0 0 0 1*                 | 
| A = 10                   | *1 0 1 0*                 | 

**[BINARIO TOTAL]** = *[ 0 0 0 1 1 0 1 0 ]* 

<br>


**Paso 2**: agrupar en ternas desde la derecha:

--> <code>*0 0 0* </code> <code> *1 1 0* </code> <code> *0 1 0* </code>

|  Grupo Binario           |  Decimal                  | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
|  *0 0 0*                 | 0                         | 0                         |
|  *1 1 0*                 | 6                         | 6                         |
|  *0 1 0*                 | 2                         | 2                         |

**[RESULTADO TOTAL]** = $1A$<sub>16</sub> = [**062<sub>8</sub>**]

<br>


--

<br>

<b> Ejemplo 2: </b> Convertir $B3$<sub>16</sub> a octal


**Paso 1**: Convertir a binario (4 bits por dígito): 

|  Digito Hexadecimal      |  Binario (4 bits)               |
|--------------------------|-------------------------------- |
|  B = 11                  | *1 0 1 1*                       | 
|  3                       | *0 0 1 1* (Añado 0 de la izqda) | 

--> [**BINARIO TOTAL**] = *[1 0 1 1 0 0 1 1]*

<br>


**Paso 2**: agrupar en ternas desde la derecha:

--> <code> *0 1 0* </code> <code> *1 1 0* </code> <code> *0 1 1* </code>

|  Grupo Binario           |  Decimal                  | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
|  *0 1 0*                 | 2                         | 2                         |
|  *1 1 0*                 | 6                         | 6                         |
|  *0 1 1*                 | 3                         | 3                         |

**[RESULTADO TOTAL]** = $B3$<sub>16</sub> = **[263<sub>8</sub>]**


<br>


--

<br>


<b> Ejemplo 3: </b> Convertir $2D7$<sub>16</sub> a octal  
(mirar tabla de apoyo arriba)


**Paso 1**: Convertir a binario (4 bits por dígito): 

|  Digito Hexadecimal      |  Binario (4 bits)         |
|--------------------------|---------------------------|
|  2                       | *0 0 1 0*                 | 
|  D = 13                  | *1 1 0 1*                 | 
|  7                       | *0 1 1 1*                 |

**[BINARIO TOTAL**] = *[0 0 1 0 1 1 0 1 0 1 1 1]*


<br>


**Paso 2**: agrupar en ternas desde la derecha:

--> <code> *0 0 1* </code> <code> *0 1 1* </code> <code> *0 1 0* </code> <code> *1 1 1* </code>

|  Grupo Binario           |  Decimal                  | Dígito Octal              |
|--------------------------|---------------------------|---------------------------|
|  *0 0 1*                 | 1                         | 1                         |
|  *0 1 1*                 | 3                         | 3                         |
|  *0 1 0*                 | 2                         | 2                         |
|  *1 1 1*                 | 7                         | 7                         |

**[RESULTADO TOTAL]** = $2D7$<sub>16</sub> = **[1327<sub>8</sub>]**


<br>


--

<br>

$Conclusión$:

Para convertir de Hexadecimal a **Octal**: <br>

1. Convierte cada dígito hexadecimal a *4 bits binarios* <br>

2. Une los bits y agrúpalos *de 3 en 3* desde la derecha <br>

3. Convierte cada grupo binario a su equivalente decimal (*0 - 7*) <br>

4. Une los dígitos resultantes --> ese es tu **número Octal**