## Introducción a Sistemas Informáticos

--> **Memoria RAM:**

- Almacenamiento de las aplicaciones
- *Ejecución de la instrucción:* De forma secuencial.
- *Ejecución de la instrucción:* De forma inmediata.
- Volatiliza las aplicaciones ejecutadas (al apagar)


<br>


### Fases

> **FASE 1** -> *De búsqueda*

> **FASE 2** -> *De ejecución*

--

$Desarrollo-Fases$

> **FASE 1** -> *De búsqueda* =>  Búsqueda de la instrucción

**1º-** Contador de Programa -> Recibe la orden de la Unidad Control para enviar el contenido al Registro de Dirección de Memoria. <br>

**2º-** *Registro de Dirección de Memoria* (**RDM**) (**M**emory **A**dress **R**egister) -> Su función es seleccionar la posición, elevando el contenido al **RIM**.  <br>

**3º-** **R**egistro de **I**ntercambio de **M**emoria* -> Recibe la información del Registro de Dirección de Memoria. Su función es leer y escribir los operandos de la memoria principal.  <br>

**4º-** Decodificador -> Su función es interpretar la instrucción del paso anterior.

**5º-** Contador del Programa (Actualizado) -> Incrementa. Si la instrucción se ejecuta => (ruptura de secuencia) <br>

**4º-** **R**egistro de **I**nstrucción **M**emoria (**RIM**) (Memory Intrucction Register)* -> Recibe la información del Registro de Intercambio de memoria y su función es elaborar los operandos correspondientes, aportando una estructura.  <br>
 

<br>

$Proceso-Visual$ <br>

> **FASE 1** -> *De búsqueda* <br>

 **1º-** <code> Contador de Programa </code> <br>
 **2º-** <code> Registro de Dirección de Memoria* (**RDM**) </code> <br>
 **3º-** <code> **R**egistro de **I**ntercambio de **M**emoria (**RIM**) </code> <br>
 **4º-** <code> Decodificador </code> <br>
 **5º-** <code> Contador del Programa (**CP** Actualizado) </code> <br> 
 

 <br>

 __



> **FASE 2** -> *De ejecución* <br>

**1º-** **R**egistro de **I**nstrucción* (**RI**) -> Su función ahora es transladar el primer operando al **RMD**. <br>

**2º-** **R**egistro de **D**irección de **M**emoria (**RDM**)-> Su función es seleccionar la posición de memoria en el **RDM** y realiza una lectura. Transfiere el contenido en el  **RIM**. <br>

**3º-** **U**nidad de **C**ontrol -> Su función es ordenar transferir el contenido del **RIM** a la entrada de la **ALU**. <br>

**4º-** **R**egistro de **I**nstrucción -> Su función es transferir el segundo operando al **RDM**. <br>

**5º-** **R**egistro de **D**irección **M**emoria -> Su función es seleccionar la posición de memoria y realizar una lectura. Deja el contenido en el **RIM**. <br>

**6º-** **U**nidad **Control** -> Su función es trasnferir contenido a otra entrada de la **ALU**. <br>

**7º-** Secuenciador -> Envía una microorden a la **ALU**. Esta realiza la operación de suma. <br>

**8º-** Resultado de **ALU** -> Se transfiere al **RIM**. <br>

**9º-** **R**egistro de **I**nstrucción -> Transfiere la información desde el **RI** al **RDM**. <br>

**10-** **R**egistro **D**irección **M**emoria -> Se selecciona la posición de memoria donde se va a
almacenar el resultado. <br>


<br> <br>


$Proceso-Visual$ <br>

> **FASE 2** -> *De ejecución* <br>

**1º-** <code> **R**egistro de **I**nstrucción </code> > <code> **RDM** </code> <br>

 **2º-** <code> **RDM** </code> > <code> **RIM** </code> <br>

 **3º-** <code> **RIM** </code> > **entradas ALU** </code> <br>

 **4º-** <code> **RI** </code> > **RDM** </code> <br>

 **5º-** <code> **RDM** </code> > <code> **RIM** </code> <br> 

 **6º-** <code> **RIM** </code> > <code> **otra entrada ALU** </code> <br>

 **7º-** <code> *Secuenciador* </code> > <code> **microorden ALU** </code> <br> 

**8º-** <code> **Resultado ALU** </code> > <code> **RIM** </code> <br>

**9º-** Dirección Resultado <code> **RI** </code> > <code> **RDM** </code> <br>

**10º-** Selección posición Memoria (**Resultado**) > Escribir información <code> **RIM** </code> <br>

<br>

---

<br>


*EJERCICIO A PRUEBA...* <br><br>

SUMAR 033 992 993 <br>

Sumar los contenidos de las posiciones de memoria 033 y
992. <br> 
Almacenar el resultado en la posición 993 <br><br>

-> **C**ódigo de **O**peración (CO) -> Sumar. <br>
-> Dirección Primer Comando (OP1) -> 033 <br>
-> Dirección Segundo COmando (OP2) -> 992 <br>

->**CP** = 8 <br> <br>

* **FASE 1: DE BÚSQUEDA** <br>

1º- Se envía la microorden (8) a **RDM** = 8 <br>
2º- Del **RDM**, Sumar (033, 992, 993) --> **RIM** <br>
3º- Del **RIM**, al **RI** = Sumar 033 992 993 <br>
4º- Decodificador <br>
5º- **CP** = 9 <br>


<br><br>


* **FASE 2: DE EJECUCIÓN** <br>

1º- 




**EJERCICIO 2** <br>

RI = SUMAR 033 992 993 <br>

1º- **RI** -> **RDM** = 033 <br>
2º- **RDM** -> **RIM**= 3 <br>
3º- **RIM** -> *RE1* = 3 <br>
4º- **RI** -> **RDM** = 092 <br>
5º- **RDM** -> **RIM** = 4 <br>
6º- **RIM** -> *RE2* = 4 <br>
7º- **SUMA** -> AC = 7 <br>
8º- **AC** -> **RIM** (4 + 3) = 7 <br>


> **Importante** --> Únicamente hay que colocar los datos que otorga el ejercicio y encajarlos dentro de los procesos correspondientes <br><br>
Repaso de cada proceso en orden, para después asociar los datos.

<br>


 

