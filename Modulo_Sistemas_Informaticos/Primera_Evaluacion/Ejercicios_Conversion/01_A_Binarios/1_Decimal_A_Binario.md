# Conversión de Decimal a Binario

La conversión de números decimales a binarios se basa en el sistema de numeración binaria, el cual utiliza únicamente dos dígitos: **0** y **1**. A diferencia del sistema decimal, que se fundamenta en potencias de 10, el sistema binario se sustenta en potencias de 2. 

Para realizar la conversión de un número decimal a binario, se aplica el método de divisiones sucesivas entre 2, registrando el **residuo** de cada división. El proceso termina cuando el cociente llega a 0. La secuencia binaria final se obtiene leyendo los residuos de **abajo hacia arriba**.

---

## Ejercicios prácticos

### Ejercicio 1: Decimal 25 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 25 ÷ 2   | 12       | 1        |
| 12 ÷ 2   | 6        | 0        |
| 6 ÷ 2    | 3        | 0        |
| 3 ÷ 2    | 1        | 1        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 25 en binario es `11001`

---

### Ejercicio 2: Decimal 37 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 37 ÷ 2   | 18       | 1        |
| 18 ÷ 2   | 9        | 0        |
| 9 ÷ 2    | 4        | 1        |
| 4 ÷ 2    | 2        | 0        |
| 2 ÷ 2    | 1        | 0        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 37 en binario es `100101`

---

### Ejercicio 3: Decimal 50 a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| 50 ÷ 2   | 25       | 0        |
| 25 ÷ 2   | 12       | 1        |
| 12 ÷ 2   | 6        | 0        |
| 6 ÷ 2    | 3        | 0        |
| 3 ÷ 2    | 1        | 1        |
| 1 ÷ 2    | 0        | 1        |

**Resultado:** 50 en binario es `110010`

<br>

---


## Plantilla para Conversión Decimal a Binario

### Ejercicio: Decimal ___ a Binario

| División | Cociente | Residuo |
|----------|----------|----------|
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |
| ___ ÷ 2  | ___      | ___      |

**Resultado:** ___ en binario es `_____`