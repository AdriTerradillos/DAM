

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



<b> Ejemplo 2: </b> Convertir $167$<sub>10</sub> a binario

|  Numero Decimal    |  Potencias (2)                        | Valor (A binario)             |
|--------------------|---------------------------------------|-------------------------------|
| 167                | $2^7$ + $2^5$ + $2^2$ + $2^1$ + $2^0$ | <code>*1 0 1 0 0 1 1 1*</code>|


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










