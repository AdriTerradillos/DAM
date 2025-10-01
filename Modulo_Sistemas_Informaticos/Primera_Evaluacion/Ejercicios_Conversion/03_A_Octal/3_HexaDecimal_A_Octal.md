# Conversión de Hexadecimal a Octal

El sistema **hexadecimal** utiliza base 16, con dígitos del 0 al 9 y A–F (A=10, B=11, ..., F=15).  
El sistema **octal** utiliza base 8, con dígitos del 0 al 7.  

Para convertir de **hexadecimal a octal**, se recomienda primero convertir el número hexadecimal a **binario**, y luego agrupar los bits en **grupos de 3 bits** para obtener el número octal.

Pasos:  
1. Convertir cada dígito hexadecimal a su equivalente en **4 bits binarios**.  
2. Agrupar todos los bits en **grupos de 3 bits** desde la derecha.  
3. Reemplazar cada grupo de 3 bits por su equivalente en **octal**.  

---

## Ejercicios prácticos

### Ejercicio 1: Hexadecimal 1F a Octal

| Dígito Hex | Binario (4 bits) | Grupo de 3 bits | Octal |
|------------|-----------------|----------------|-------|
| 1          | 0001            | 001            | 1     |
| F          | 1111            | 111            | 7     |
|            |                 | 1              | 1     |

**Resultado:** 1F en hexadecimal es `37` en octal

---

### Ejercicio 2: Hexadecimal 2A3 a Octal

| Dígito Hex | Binario (4 bits) | Grupo de 3 bits | Octal |
|------------|-----------------|----------------|-------|
| 2          | 0010            | 000            | 0     |
| A          | 1010            | 101            | 5     |
| 3          | 0011            | 011            | 3     |

**Resultado:** 2A3 en hexadecimal es `1253` en octal

---

### Ejercicio 3: Hexadecimal 7D a Octal

| Dígito Hex | Binario (4 bits) | Grupo de 3 bits | Octal |
|------------|-----------------|----------------|-------|
| 7          | 0111            | 111            | 7     |
| D          | 1101            | 101            | 5     |
|            |                 | 1              | 1     |

**Resultado:** 7D en hexadecimal es `175` en octal


<br><br>


---


**En esta estructura:**

- Primero se convierte cada dígito Hex a 4 bits binarios.

- Luego se agrupan los bits en grupos de 3 para formar los dígitos octales.

- La columna final indica el resultado octal de cada grupo.


<br><br>


---


# Plantilla para Conversión Hexadecimal a Octal

## Ejercicio: Hexadecimal ___ a Octal

| Dígito Hex | Binario (4 bits) | Grupo de 3 bits | Octal |
|------------|-----------------|----------------|-------|
| ___        | ___             | ___            | ___   |
| ___        | ___             | ___            | ___   |
| ___        | ___             | ___            | ___   |
| ___        | ___             | ___            | ___   |
| ___        | ___             | ___            | ___   |

**Resultado:** ___ en hexadecimal es `_____` en octal