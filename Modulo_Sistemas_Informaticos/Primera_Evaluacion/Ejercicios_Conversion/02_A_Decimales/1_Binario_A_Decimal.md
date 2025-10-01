# Conversión de Decimal a Binario

El sistema **decimal** utiliza base 10, con dígitos del 0 al 9.  
El sistema **binario** utiliza base 2, con dígitos 0 y 1.  

Para convertir de **decimal a binario**, se utiliza el método de **divisiones sucesivas entre 2**:  
1. Se divide el número decimal entre 2.  
2. Se registra el **cociente** y el **residuo**.  
3. El proceso se repite con el cociente hasta que sea 0.  
4. El número binario se obtiene leyendo los residuos **de abajo hacia arriba**.  

---

## Ejercicios prácticos

### Ejercicio 1: Decimal 18 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 18 ÷ 2   | 9        | 0        |
| 9 ÷ 2    | 4        | 1        |
| 4 ÷ 2    | 2        | 0        |
| 2 ÷ 2    | 1        | 0        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 18 en binario es `10010`

---

### Ejercicio 2: Decimal 45 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 45 ÷ 2   | 22       | 1        |
| 22 ÷ 2   | 11       | 0        |
| 11 ÷ 2   | 5        | 1        |
| 5 ÷ 2    | 2        | 1        |
| 2 ÷ 2    | 1        | 0        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 45 en binario es `101101`

---

### Ejercicio 3: Decimal 73 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 73 ÷ 2   | 36       | 1        |
| 36 ÷ 2   | 18       | 0        |
| 18 ÷ 2   | 9        | 0        |
| 9 ÷ 2    | 4        | 1        |
| 4 ÷ 2    | 2        | 0        |
| 2 ÷ 2    | 1        | 0        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 73 en binario es `1001001`


<br>
<br>


---


# Plantilla para Conversión Decimal a Binario

## Ejercicio: Decimal ___ a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |

**Resultado:** ___ en binario es `_____`