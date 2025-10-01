# Conversión de Octal a Decimal

El sistema **octal** utiliza base 8, con dígitos del 0 al 7.  
El sistema **decimal** utiliza base 10, con dígitos del 0 al 9.  

Para convertir de **octal a decimal**, se multiplica cada dígito del número octal por **8 elevado a la posición del dígito**, contando desde la **derecha empezando en 0**.  
La suma de todos estos productos da el número decimal equivalente.

Fórmula general: Decimal = d₀·8⁰ + d₁·8¹ + d₂·8² + ... + dₙ·8ⁿ 

<br>


---

## Ejercicios prácticos

### Ejercicio 1: Octal 157 a Decimal

| Dígito Octal | Potencia de 8 | Cálculo       | Resultado Parcial |
|--------------|---------------|---------------|-----------------|
| 1            | 8²            | 1 × 64        | 64              |
| 5            | 8¹            | 5 × 8         | 40              |
| 7            | 8⁰            | 7 × 1         | 7               |

**Resultado:** 157 en octal es `111` en decimal

---

### Ejercicio 2: Octal 243 a Decimal

| Dígito Octal | Potencia de 8 | Cálculo       | Resultado Parcial |
|--------------|---------------|---------------|-----------------|
| 2            | 8²            | 2 × 64        | 128             |
| 4            | 8¹            | 4 × 8         | 32              |
| 3            | 8⁰            | 3 × 1         | 3               |

**Resultado:** 243 en octal es `163` en decimal

---

### Ejercicio 3: Octal 716 a Decimal

| Dígito Octal | Potencia de 8 | Cálculo       | Resultado Parcial |
|--------------|---------------|---------------|-----------------|
| 7            | 8²            | 7 × 64        | 448             |
| 1            | 8¹            | 1 × 8         | 8               |
| 6            | 8⁰            | 6 × 1         | 6               |

**Resultado:** 716 en octal es `462` en decimal

<br><br>


**En esta estructura:**

- La primera columna indica el dígito octal.

- La segunda columna la potencia de 8 correspondiente.

- La tercera columna el cálculo parcial.

- La cuarta columna el resultado parcial.


<br><br>

---


# Plantilla para Conversión Octal a Decimal

## Ejercicio: Octal ___ a Decimal

| Dígito Octal | Potencia de 8 | Cálculo       | Resultado Parcial |
|--------------|---------------|---------------|-----------------|
| ___          | 8²            | ___ × 64      | ___             |
| ___          | 8¹            | ___ × 8       | ___             |
| ___          | 8⁰            | ___ × 1       | ___             |
| ___          | 8⁻¹           | ___ × 0.125   | ___             |
| ___          | 8⁻²           | ___ × 0.015625| ___             |

**Resultado:** ___ en decimal es `_____`


---

## Ejercicios prácticos

### Ejercicio 1: Hexadecimal 2B a Decimal

| Dígito Hex | Valor Decimal | Potencia de 16 | Cálculo       | Resultado Parcial |
|------------|---------------|----------------|---------------|-----------------|
| 2          | 2             | 16¹            | 2 × 16        | 32              |
| B          | 11            | 16⁰            | 11 × 1        | 11              |

**Resultado:** 2B en hexadecimal es `43` en decimal

---

### Ejercicio 2: Hexadecimal 7F4 a Decimal

| Dígito Hex | Valor Decimal | Potencia de 16 | Cálculo       | Resultado Parcial |
|------------|---------------|----------------|---------------|-----------------|
| 7          | 7             | 16²            | 7 × 256       | 1792            |
| F          | 15            | 16¹            | 15 × 16       | 240             |
| 4          | 4             | 16⁰            | 4 × 1         | 4               |

**Resultado:** 7F4 en hexadecimal es `2036` en decimal

---

### Ejercicio 3: Hexadecimal 1AC a Decimal

| Dígito Hex | Valor Decimal | Potencia de 16 | Cálculo       | Resultado Parcial |
|------------|---------------|----------------|---------------|-----------------|
| 1          | 1             | 16²            | 1 × 256       | 256             |
| A          | 10            | 16¹            | 10 × 16       | 160             |
| C          | 12            | 16⁰            | 12 × 1        | 12              |

**Resultado:** 1AC en hexadecimal es `428` en decimal

<br><br>

---


**En esta estructura:**

- La primera columna indica el dígito hexadecimal.

- La segunda columna convierte letras a su valor decimal.

- La tercera columna muestra la potencia de 16 correspondiente.

- La cuarta columna es el cálculo parcial.

- La quinta columna es el resultado parcial de cada dígito.


<br><br>


# Plantilla para Conversión Hexadecimal a Decimal

## Ejercicio: Hexadecimal ___ a Decimal

| Dígito Hex | Valor Decimal | Potencia de 16 | Cálculo       | Resultado Parcial |
|------------|---------------|----------------|---------------|-----------------|
| ___        | ___           | 16²            | ___ × 256     | ___             |
| ___        | ___           | 16¹            | ___ × 16      | ___             |
| ___        | ___           | 16⁰            | ___ × 1       | ___             |
| ___        | ___           | 16⁻¹           | ___ × 0.0625  | ___             |
| ___        | ___           | 16⁻²           | ___ × 0.00390625 | ___          |

**Resultado:** ___ en decimal es `_____`