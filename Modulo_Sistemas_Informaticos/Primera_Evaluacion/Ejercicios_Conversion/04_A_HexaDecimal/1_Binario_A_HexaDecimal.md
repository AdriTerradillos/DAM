# Conversión de Binario a Hexadecimal

El sistema **binario** utiliza base 2, con dígitos 0 y 1.  
El sistema **hexadecimal** utiliza base 16, con dígitos 0–9 y letras A–F.  

Para convertir de **binario a hexadecimal**, se agrupan los bits en **grupos de 4 bits**, empezando desde la derecha (rellenando con ceros a la izquierda si es necesario).  
Luego, cada grupo de 4 bits se reemplaza por su equivalente hexadecimal.

Ejemplo rápido:  
- Binario `1010` → Hexadecimal `A`  
- Binario `11110010` → Se agrupa como `1111 0010` → Hexadecimal `F2`  

---

## Ejercicios prácticos

### Ejercicio 1: Binario 101101 a Hexadecimal

| Grupo de 4 bits | Hexadecimal |
|-----------------|-------------|
| 0010            | 2           |
| 1101            | D           |

**Resultado:** 101101 en binario es `2D` en hexadecimal

---

### Ejercicio 2: Binario 11011110 a Hexadecimal

| Grupo de 4 bits | Hexadecimal |
|-----------------|-------------|
| 1101            | D           |
| 1110            | E           |

**Resultado:** 11011110 en binario es `DE` en hexadecimal

---

### Ejercicio 3: Binario 1001011 a Hexadecimal

| Grupo de 4 bits | Hexadecimal |
|-----------------|-------------|
| 0100            | 4           |
| 1011            | B           |

**Resultado:** 1001011 en binario es `4B` en hexadecimal


<br><br>


---


**En esta estructura:**

- La primera columna muestra cada grupo de 4 bits (rellenando con ceros a la izquierda si hace falta).

- La segunda columna indica el dígito hexadecimal equivalente.

- El número hexadecimal final se obtiene leyendo los dígitos de izquierda a derecha.


<br><br>


---


# Plantilla para Conversión Binario a Hexadecimal

## Ejercicio: Binario ___ a Hexadecimal

| Grupo de 4 bits | Hexadecimal |
|-----------------|-------------|
| ___             | ___         |
| ___             | ___         |
| ___             | ___         |
| ___             | ___         |
| ___             | ___         |

**Resultado:** ___ en binario es `_____` en hexadecimal

