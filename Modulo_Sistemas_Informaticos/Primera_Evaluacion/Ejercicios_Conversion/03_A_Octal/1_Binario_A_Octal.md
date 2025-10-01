# Conversión de Binario a Octal

El sistema **binario** utiliza base 2, con dígitos 0 y 1.  
El sistema **octal** utiliza base 8, con dígitos del 0 al 7.  

Para convertir de **binario a octal**, se agrupan los bits del número binario en **grupos de 3 bits**, empezando desde la derecha (agregando ceros a la izquierda si es necesario).  
Luego, cada grupo de 3 bits se reemplaza por su equivalente en octal.

Ejemplo rápido:  
- Binario `101` → Octal `5`  
- Binario `110010` → Se agrupa como `110 010` → Octal `62`  

---

## Ejercicios prácticos

### Ejercicio 1: Binario 110101 a Octal

| Grupo de 3 bits | Octal |
|-----------------|-------|
| 110             | 6     |
| 101             | 5     |

**Resultado:** 110101 en binario es `65` en octal

---

### Ejercicio 2: Binario 1010111 a Octal

| Grupo de 3 bits | Octal |
|-----------------|-------|
| 001             | 1     |
| 010             | 2     |
| 111             | 7     |

**Resultado:** 1010111 en binario es `127` en octal

---

### Ejercicio 3: Binario 1110010 a Octal

| Grupo de 3 bits | Octal |
|-----------------|-------|
| 001             | 1     |
| 110             | 6     |
| 010             | 2     |

**Resultado:** 1110010 en binario es `162` en octal


<br><br>

---

**En esta estructura:**

- La primera columna indica cada grupo de 3 bits (rellenando con ceros a la izquierda si hace falta).

- La segunda columna indica el dígito octal equivalente.


<br><br>


---


# Plantilla para Conversión Binario a Octal

## Ejercicio: Binario ___ a Octal

| Grupo de 3 bits | Octal |
|-----------------|-------|
| ___             | ___   |
| ___             | ___   |
| ___             | ___   |
| ___             | ___   |
| ___             | ___   |

**Resultado:** ___ en binario es `_____` en octal