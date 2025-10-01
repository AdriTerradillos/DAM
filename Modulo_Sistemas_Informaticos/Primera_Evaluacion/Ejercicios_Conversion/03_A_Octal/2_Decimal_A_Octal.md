# Conversión de Decimal a Octal

El sistema **decimal** utiliza base 10, con dígitos del 0 al 9.  
El sistema **octal** utiliza base 8, con dígitos del 0 al 7.  

Para convertir de **decimal a octal**, se utiliza el método de **divisiones sucesivas entre 8**:  
1. Se divide el número decimal entre 8.  
2. Se registra el **cociente** y el **residuo**.  
3. El proceso se repite con el cociente hasta que sea 0.  
4. El número octal se obtiene leyendo los residuos **de abajo hacia arriba**.  

---

## Ejercicios prácticos

### Ejercicio 1: Decimal 34 a Octal

| División | Cociente | Residuo |
|----------|----------|----------|
| 34 ÷ 8   | 4        | 2        |
| 4 ÷ 8    | 0        | 4        |

**Resultado:** 34 en decimal es `42` en octal

---

### Ejercicio 2: Decimal 79 a Octal

| División | Cociente | Residuo |
|----------|----------|----------|
| 79 ÷ 8   | 9        | 7        |
| 9 ÷ 8    | 1        | 1        |
| 1 ÷ 8    | 0        | 1        |

**Resultado:** 79 en decimal es `117` en octal

---

### Ejercicio 3: Decimal 150 a Octal

| División | Cociente | Residuo |
|----------|----------|----------|
| 150 ÷ 8  | 18       | 6        |
| 18 ÷ 8   | 2        | 2        |
| 2 ÷ 8    | 0        | 2        |

**Resultado:** 150 en decimal es `226` en octal


<br><br>

---


**En esta estructura:**

- La primera columna indica la división por 8.

- La segunda columna indica el cociente de cada división.

- La tercera columna indica el residuo.

- El número octal final se lee de abajo hacia arriba.


<br><br>


---


# Plantilla para Conversión Decimal a Octal

## Ejercicio: Decimal ___ a Octal

| División | Cociente | Residuo |
|----------|----------|----------|
| ___ ÷ 8  | ___      | ___      |
| ___ ÷ 8  | ___      | ___      |
| ___ ÷ 8  | ___      | ___      |
| ___ ÷ 8  | ___      | ___      |
| ___ ÷ 8  | ___      | ___      |

**Resultado:** ___ en decimal es `_____` en octal