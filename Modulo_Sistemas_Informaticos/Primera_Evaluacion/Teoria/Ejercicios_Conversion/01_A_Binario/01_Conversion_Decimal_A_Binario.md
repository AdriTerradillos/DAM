

### TABLA DE APOYO 1

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


### TABLA DE APOYO 2

|$2^7$|$2^6$|$2^5$|$2^4$|$2^3$|$2^2$|$2^1$|$2^0$|      
|------|----|-----|-----|-----|-----|-----|-----|
| 128  | 64 | 32  | 16  |  8  |  4  |  2  |  1  |
|  1   |    |     |     |     |     |     |     |
|  1   | 0  |  1  |     |     |     |     |     |
|  1   | 0  |  1  |  0  |  0  |  1  |     |     |
|  1   | 0  |  1  |  0  |  0  |  1  |  1  |     |
|  1   |  0 |  1  |  0  |  0  |  1  |  1  |  1  |              


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

Convertir **12<sub>10</sub> a binario**: 

|  Numero Decimal          |  Potencias (2)            | Valor (A binario)         |
|--------------------------|---------------------------|---------------------------|
| 12                       | $2^3$ + $2^2$             | <code>*1 1 0 0*</code>    |


**[LECTURA]** = [*1 1 0 1*]
**[RESULTADO TOTAL]** = 12<sub>10</sub> = **[*1 1 0 0*<sub>2</sub>]**



<br>


-- 


$Practica$: 

Vamos ahora a completar algunos ejemplos prácticos, echando mano de nuestros apuntes teóricos. ¡Adelante!

<br>


--


<b> Ejemplo 1: </b> Convertir $25$<sub>10</sub> a binario <br> <br>
<b> Ejemplo 2: </b> Convertir $58$<sub>10</sub> a binario <br><br>

|  Numero Decimal          |  Potencias (2)                    | Valor (A binario)             |
|--------------------------|-----------------------------------|-------------------------------|
| 25                       | $2^3$ + $2^2$                     | <code>*1 1 0 0*</code>        |
| 58                       | $2^5$ + $2^4$ + $2^3$ + $2^1$     | <code>*1 1 1 0 1 0*</code>    |

<br>

**[RESULTADO TOTAL - EJEMPLO 1]** = $25$<sub>10</sub> = **[*1 1 0 0 1*<sub>2</sub>]** <br>

**[RESULTADO TOTAL - EJEMPLO 2]** = $58$<sub>10</sub> = **[*1 1 1  0 1 0*<sub>2</sub>]**



<br>

<br>


--


$Conclusión$:

Para convertir de Decimal a **Binario**: <br>

1. Multiplica por la potencia de 2, hasta reducir a 0 el valor numérico del
ejercicio  <br>

2. Una vez obtienes el valor de la potencia de 2, guiate de la **TABLA DE APOYO 2** que aparece en la parte superior del archivo.

3. Escribe el valor numérico en binario de cada ejercicio.












