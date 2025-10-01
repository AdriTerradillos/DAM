# Conversión de Decimal a Hexadecimal

El sistema **decimal** utiliza base 10, con dígitos del 0 al 9.  
El sistema **hexadecimal** utiliza base 16, con dígitos del 0–9 y letras A–F.  

Para convertir de **decimal a hexadecimal**, se utiliza el método de **divisiones sucesivas entre 16**:  
1. Se divide el número decimal entre 16.  
2. Se registra el **cociente** y el **residuo**.  
3. Si el residuo es mayor que 9, se representa con letras (10=A, 11=B, ..., 15=F).  
4. Se repite el proceso con el cociente hasta que sea 0.  
5. El número hexadecimal se obtiene leyendo los residuos **de abajo hacia arriba**.  

---

## Ejercicios prácticos

### Ejercicio 1: Decimal 47 a Hexadecimal

| División | Cociente | Residuo |
|----------|----------|----------|
| 47 ÷ 16  | 2        | 15       |
| 2 ÷ 16   | 0        | 2        |

**Resultado:** 47 en decimal es `2F` en hexadecimal

---

### Ejercicio 2: Decimal 123 a Hexadecimal

| División | Cociente | Residuo |
|----------|----------|----------|
| 123 ÷ 16 | 7        | 11       |
| 7 ÷ 16   | 0        | 7        |

**Resultado:** 123 en decimal es `7B` en hexadecimal

---

### Ejercicio 3: Decimal 250 a Hexadecimal

| División | Cociente | Residuo |
|----------|----------|----------|
| 250 ÷ 16 | 15       | 10       |
| 15 ÷ 16  | 0        | 15       |

**Resultado:** 250 en decimal es `FA` en hexadecimal


<br><br>


---


**En esta estructura:**

- La primera columna indica la división entre 16.

- La segunda columna indica el cociente de cada división.

- La tercera columna indica el residuo (usando letras A–F si es mayor que 9).

- El número hexadecimal final se lee de abajo hacia arriba.


<br><br>


---


# Plantilla para Conversión Decimal a Hexadecimal

## Ejercicio: Decimal ___ a Hexadecimal

| División | Cociente | Residuo |
|----------|----------|----------|
| ___ ÷ 16 | ___      | ___      |
| ___ ÷ 16 | ___      | ___      |
| ___ ÷ 16 | ___      | ___      |
| ___ ÷ 16 | ___      | ___      |
| ___ ÷ 16 | ___      | ___      |

**Resultado:** ___ en decimal es `_____` en hexadecimal