# Conversión de Octal a Hexadecimal

El sistema **octal** utiliza base 8, con dígitos del 0 al 7.  
El sistema **hexadecimal** utiliza base 16, con dígitos del 0–9 y A–F.  

Para convertir de **octal a hexadecimal**, se recomienda primero convertir el número octal a **binario**, y luego agrupar los bits en **grupos de 4 bits** para obtener el número hexadecimal.

Pasos:  
1. Convertir cada dígito octal a su equivalente en **3 bits binarios**.  
2. Agrupar todos los bits en **grupos de 4 bits** desde la derecha (agregando ceros a la izquierda si es necesario).  
3. Reemplazar cada grupo de 4 bits por su equivalente en **hexadecimal**.  

---

## Ejercicios prácticos

### Ejercicio 1: Octal 157 a Hexadecimal

| Dígito Octal | Binario (3 bits) | Grupo de 4 bits | Hexadecimal |
|--------------|-----------------|----------------|-------------|
| 1            | 001             | 0001           | 1           |
| 5            | 101             | 0101           | 5           |
| 7            | 111             | 0111           | 7           |

**Resultado:** 157 en octal es `57` en hexadecimal

---

### Ejercicio 2: Octal 243 a Hexadecimal

| Dígito Octal | Binario (3 bits) | Grupo de 4 bits | Hexadecimal |
|--------------|-----------------|----------------|-------------|
| 2            | 010             | 0010           | 2           |
| 4            | 100             | 0100           | 4           |
| 3            | 011             | 0011           | 3           |

**Resultado:** 243 en octal es `A3` en hexadecimal

---

### Ejercicio 3: Octal 716 a Hexadecimal

| Dígito Octal | Binario (3 bits) | Grupo de 4 bits | Hexadecimal |
|--------------|-----------------|----------------|-------------|
| 7            | 111             | 0111           | 7           |
| 1            | 001             | 0001           | 1           |
| 6            | 110             | 0110           | 6           |

**Resultado:** 716 en octal es `1D6` en hexadecimal


<br><br>


---


**En esta estructura:**

- Primero se convierte cada dígito octal a 3 bits binarios.

- Luego se agrupan los bits en grupos de 4 para formar los dígitos hexadecimales.

- La columna final indica el resultado hexadecimal de cada grupo.


<br><br>


---


# Plantilla para Conversión Octal a Hexadecimal

## Ejercicio: Octal ___ a Hexadecimal

| Dígito Octal | Binario (3 bits) | Grupo de 4 bits | Hexadecimal |
|--------------|-----------------|----------------|-------------|
| ___          | ___             | ___            | ___         |
| ___          | ___             | ___            | ___         |
| ___          | ___             | ___            | ___         |
| ___          | ___             | ___            | ___         |
| ___          | ___             | ___            | ___         |

**Resultado:** ___ en octal es `_____` en hexadecimal

