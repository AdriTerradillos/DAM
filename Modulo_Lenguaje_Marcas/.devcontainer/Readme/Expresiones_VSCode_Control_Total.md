# 🧭 Expresiones y Variables en Visual Studio Code — Guía Completa (Markdown)

> Guía extensa, limpia y ordenada sobre la mayoría de las *expresiones* (variables, patrones, snippets, glob, regex y comandos) que aparecen en VSCode, con ejemplos simples para controlar el editor de forma impecable. Orientado a estudiantes y desarrolladores que quieren dominar la configuración y automatización en VSCode.

---

## 📌 Introducción
VSCode usa muchas **expresiones** y **variables** para parametrizar tareas, depuración, snippets, keybindings, configuraciones y extensiones. Aprenderlas te permite crear flujos de trabajo reproducibles, automatizar compilaciones, depurar con precisión y personalizar el editor a tu gusto.

Esta guía cubre:
- Variables integradas (`${workspaceFolder}`, `${file}`, `${env:...}`, ...)
- Uso en `tasks.json` y `launch.json`
- Snippets: tabstops, placeholders, transformaciones
- Búsqueda avanzada: regex y reemplazos con grupos
- Glob patterns (patrones de archivos)
- Keybindings y ejecución de comandos (`command:`)
- Ejemplos prácticos y buenas prácticas

---

## 🔑 Variables integradas (sustitución de variables)
Estas variables se usan frecuentemente en `tasks.json`, `launch.json`, `settings.json` (en algunos contextos) y en configuraciones de extensiones.

| Variable | Qué representa | Ejemplo de uso |
|---|---:|---|
| `${workspaceFolder}` | Ruta absoluta de la carpeta raíz del workspace | `"cwd": "${workspaceFolder}"` |
| `${workspaceFolderBasename}` | Nombre de la carpeta raíz del workspace | `"label": "${workspaceFolderBasename}"` |
| `${file}` | Ruta absoluta del archivo abierto actualmente | `"args": ["${file}"]` |
| `${fileWorkspaceFolder}` | La carpeta de workspace que contiene el archivo actualmente abierto | útil en multi-root workspaces |
| `${relativeFile}` | Ruta relativa del archivo respecto al workspace | `"args": ["${relativeFile}"]` |
| `${relativeFileDirname}` | Directorio relativo del archivo | |
| `${fileBasename}` | Nombre del archivo con extensión | `"args": ["${fileBasename}"]` |
| `${fileBasenameNoExtension}` | Nombre del archivo sin extensión | `"program": "${fileBasenameNoExtension}"` |
| `${fileDirname}` | Directorio del archivo (abosluto) | |
| `${fileExtname}` | Extensión del archivo (por ejemplo `.js`) | |
| `${cwd}` | Current working directory (directorio de trabajo actual) | `"cwd": "${workspaceFolder}"` |
| `${lineNumber}` | Número de línea activa (útil en tareas o plantillas) | `"args": ["${lineNumber}"]` |
| `${pathSeparator}` | Separador de rutas del SO (`/` o `\`) | |
| `${selectedText}` | Texto seleccionado actualmente en el editor | `"args": ["${selectedText}"]` |
| `${env:VAR}` | Valor de la variable de entorno `VAR` del sistema | `"args": ["${env:HOME}"]` o `"${env:PATH}"` |
| `${config:seccion.propiedad}` | Valor de una configuración de `settings.json` | `"args": ["${config:editor.tabSize}"]` |
| `${command:commandId}` | Resultado que devuelve la ejecución de un comando (ID) | `"args": ["${command:extension.getSomething}"]` |
| `${input:inputId}` | Valor definido en `inputs` dentro de `tasks.json` (pide al usuario) | ver sección de `inputs` abajo |

> Nota: No todas las variables funcionan en **todos** los contextos; las más seguras en `tasks.json` y `launch.json` son las de `workspace`, `file`, `env`, `config` y `input`.

---

## ⚙️ Ejemplos prácticos de uso en `tasks.json`
### 1) Compilar el archivo Java activo
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Compilar Java (archivo activo)",
      "type": "shell",
      "command": "javac",
      "args": ["${file}"],
      "group": "build",
      "presentation": {
        "reveal": "always"
      }
    }
  ]
}
```
Ejecución: `Terminal → Run Task → Compilar Java (archivo activo)`

### 2) Ejecutar comando usando variable de entorno y workspace
```json
{
  "label": " ejecutar script con env ",
  "type": "shell",
  "command": "${env:HOME}/scripts/mi_script.sh",
  "args": ["${workspaceFolder}", "${fileBasename}"]
}
```
Esto invoca un script del directorio del usuario pasando workspace y nombre de archivo.

### 3) Usar `inputs` para preguntar al usuario
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Ejecutar con argumento personalizado",
      "type": "shell",
      "command": "python",
      "args": ["script.py", "${input:miArgumento}"]
    }
  ],
  "inputs": [
    {
      "id": "miArgumento",
      "type": "promptString",
      "description": "Introduce un argumento para el script"
    }
  ]
}
```
Al ejecutar la tarea, VSCode pedirá el valor y lo insertará en `${input:miArgumento}`.

---

## 🐞 Ejemplos prácticos de `launch.json` (depuración)
### 1) Node.js – depurar el archivo actual
```json
{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "pwa-node",
      "request": "launch",
      "name": "Depurar archivo actual (Node)",
      "program": "${file}",
      "cwd": "${workspaceFolder}"
    }
  ]
}
```
### 2) Java – ejemplo básico
```json
{
  "configurations": [
    {
      "type": "java",
      "name": "Depurar clase Java",
      "request": "launch",
      "mainClass": "${fileBasenameNoExtension}",
      "cwd": "${workspaceFolder}"
    }
  ]
}
```
> Observación: en proyectos Java con `maven`/`gradle` es más frecuente depurar la *configuración del proyecto* en lugar de un solo archivo.

---

## ✂️ Snippets — placeholders y transformaciones
Los snippets permiten incluir variables y tabstops para acelerar la escritura. Sintaxis básica:
- `$1`, `$2`, ... : tabstops (posiciones para saltar con TAB)
- `$0` : cursor final
- `${1:valor}` : tabstop con valor por defecto
- `${TM_FILENAME_BASE}` y otras *TextMate* variables
- `${1/regex/replacement/flags}` : transformaciones

### Ejemplo: snippet para función JS
```json
"Function snippet": {
  "prefix": "fnc",
  "body": [
    "function ${1:name}(${2:params}) {",
    "  ${3:// cuerpo}",
    "}$0"
  ],
  "description": "Snippet de función JS"
}
```
Uso: Escribir `fnc` y pulsar TAB → rellenar `name`, `params`, `cuerpo`.

### Ejemplo: elección (choice) en snippet
```json
"Console or Return": {
  "prefix": "retc",
  "body": [
    "${1|console.log,return|} ${2:value};$0"
  ]
}
```
Al expandir, se ofrece una elección entre `console.log` o `return`.

---

## 🔍 Búsqueda avanzada (regex) y reemplazo
VSCode usa expresiones regulares basadas en JavaScript para buscar y reemplazar.

### Ejemplo 1: Eliminar espacios finales de cada línea
- Buscar: `\s+$`
- Reemplazar: `` (vacío)
- Activar `Use Regular Expression` (.*) en la caja de búsqueda

### Ejemplo 2: Intercambiar dos palabras
- Texto: `hola mundo`
- Buscar: `(\w+)\s+(\w+)`
- Reemplazar: `$2 $1`
Resultado: `mundo hola`

### Ejemplo 3: Añadir `console.log` con el nombre de la variable
- Buscar: `^(\s*)(let|const|var)\s+([A-Za-z_]\w*)`
- Reemplazar: `$1$2 $3
$1console.log('$3 =', $3)`
Inserta una línea de `console.log` debajo de cada declaración de variable.

> Consejo: en el campo de reemplazo se usan `$1`, `$2`, ... para referirse a los grupos capturados.

---

## 📁 Glob patterns (patrones de archivos)
Se usan en `files.exclude`, `search.exclude`, `search include`, `watcherExclude` y otras opciones.

- `*` → cualquier cadena en un solo segmento (no atraviesa `/`): `*.js`
- `**` → cualquier número de subdirectorios: `src/**/*.js`
- `?` → un carácter: `file?.txt`
- `{a,b}` → alternativas: `*.{js,ts,jsx,tsx}`
- `!` → negación en algunos contextos (p. ej. `gitignore`-like)

### Ejemplo: ignorar node_modules en búsqueda
```json
"search.exclude": {
  "**/node_modules": true,
  "**/dist": true
}
```
### Ejemplo: incluir solo JS y TS en búsqueda rápida
- Campo *files to include*: `**/*.{js,ts}`

---

## ⌨️ Keybindings y ejecución de comandos (command IDs)
VSCode permite asignar atajos a **comandos**; cada comando tiene un `commandId`. Además, en configuraciones se puede usar `${command:commandId}` para ejecutar un comando y usar su resultado en ciertas situaciones.

### Cómo obtener el `commandId`
1. Abre `Preferencias → Atajos de teclado` (Keyboard Shortcuts).
2. Busca un comando, haz clic derecho sobre él y selecciona **Copy Command ID** (o en la vista de lista habilita mostrar IDs).
3. Usa ese ID en `keybindings.json` o en otros lugares que acepten `command:`.

### Ejemplo: keybinding para abrir terminal nuevo
`keybindings.json`:
```json
[
  {
    "key": "ctrl+alt+t",
    "command": "workbench.action.terminal.new"
  }
]
```
### Ejemplo: usar `${command:...}` en `tasks.json`
Algunas extensiones registran comandos que devuelven valores; se pueden invocar con `${command:miExtension.miComando}` como argumento en tareas o launch (dependiendo de la extensión).

> Nota: no todos los comandos devuelven valor; algunos solo ejecutan acciones. `${command:...}` espera que exista un resultado textual (según la extensión que lo provea).

---

## 🧾 Uso de `${config:...}` y configuraciones por lenguaje
Puedes leer valores de `settings.json` con `${config:seccion.propiedad}` y aplicar configuraciones por lenguaje.

### Ejemplo: leer `editor.tabSize`
```json
"args": ["${config:editor.tabSize}"]
```
### Ejemplo: configuración por lenguaje en `settings.json`
```json
"[javascript]": {
  "editor.formatOnSave": true,
  "editor.tabSize": 2
},
"[python]": {
  "editor.formatOnSave": false,
  "editor.tabSize": 4
}
```

---

## 🧩 Emmet y abreviaciones útiles (HTML/CSS)
Emmet es un sistema de abreviaciones que se expande al HTML/CSS completo.

- Abreviación: `div.container>ul>li*3`
- Expande a:
```html
<div class="container">
  <ul>
    <li></li>
    <li></li>
    <li></li>
  </ul>
</div>
```
Para usar Emmet asegúrate de tener activado `emmet.triggerExpansionOnTab` si quieres expandir con TAB.

---

## 🔁 Transformaciones y placeholders avanzados en snippets
Ejemplo de transformación para convertir el nombre del archivo en mayúsculas:
```json
"Example transform": {
  "prefix": "tcase",
  "body": [
    "Archivo: ${TM_FILENAME}",
    "Nombre base en mayúsculas: ${TM_FILENAME_BASE/(.*)/${1:/upcase}/}"
  ]
}
```
> Estas transformaciones usan sintaxis de TextMate y pueden ser más complejas; son poderosas para plantillas automatizadas.

---

## 📌 Ejemplos prácticos completos (mini-flujos)
### A) Crear tarea para compilar y ejecutar archivos Java (archivo activo)
`tasks.json`:
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Compilar Java (archivo)",
      "type": "shell",
      "command": "javac",
      "args": ["${file}"],
      "group": "build"
    },
    {
      "label": "Ejecutar Java (archivo)",
      "type": "shell",
      "command": "java",
      "args": ["-cp", "${fileDirname}", "${fileBasenameNoExtension}"],
      "dependsOn": "Compilar Java (archivo)"
    }
  ]
}
```
Flujo: Ejecutar la tarea `Ejecutar Java (archivo)` compila y luego ejecuta el .class generado.

### B) Depurar un script Python y pasar un argumento definido por `input`
`tasks.json` (para preparar el argumento):
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Run Python con argumento",
      "type": "shell",
      "command": "python",
      "args": ["${file}", "${input:arg}"]
    }
  ],
  "inputs": [
    {
      "id": "arg",
      "type": "promptString",
      "description": "Argumento para el script Python"
    }
  ]
}
```
`launch.json` (si quieres lanzar el debug con argumentos predefinidos):
```json
{
  "configurations": [
    {
      "name": "Python: archivo actual con args",
      "type": "python",
      "request": "launch",
      "program": "${file}",
      "args": ["${input:arg}"]
    }
  ]
}
```
> Atención: no todos los `inputs` definidos en `tasks.json` pueden usarse directamente en `launch.json`; su disponibilidad depende de la extensión y contexto.

---

## ✅ Buenas prácticas y consejos rápidos
- Prefiere `${workspaceFolder}` y `${file}` en lugar de rutas absolutas para mantener portabilidad.  
- Usa `inputs` para tareas interactivas que necesitan datos del usuario.  
- Guarda snippets y tareas en `.vscode/` del proyecto para que el equipo las reutilice.  
- Verifica que las variables existan en el contexto que las vas a usar (p. ej. `${selectedText}` sólo tiene sentido si hay texto seleccionado).  
- Para descubrir `commandId` usa **Preferencias → Atajos de teclado** (copy command ID).  
- Cuando uses regex en búsquedas grandes, prueba primero con una carpeta pequeña o `files to include` para evitar cambios no deseados.  
- Documenta los `tasks.json` y `launch.json` del proyecto con comentarios (donde sea posible) para que otros lo entiendan.

---

## 📎 Recursos útiles (breve)
- Paleta de comandos: `Ctrl+Shift+P` / `Cmd+Shift+P`
- Abrir Keybindings: `Ctrl+K Ctrl+S`
- Documentación oficial de variables: (consultar en la documentación oficial de VSCode para ver la lista completa y actualizada)

---

## 🏁 Conclusión
Dominar las expresiones y variables de VSCode multiplica tu productividad: desde ejecutar tareas y depurar con un click hasta crear snippets que evitan errores repetitivos. Usa los ejemplos como base y personalízalos para los flujos de trabajo de tu equipo o de tus asignaturas en DAM.

---

¿Quieres que cree este documento como archivo `.md` descargable en tu equipo con el nombre `Expresiones_VSCode_Control_Total.md`?
