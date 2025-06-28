#Bitacora de GitBash

### Clase 3: registro de cambios

-cd tecnicaturagit #Ingresamos al direcotorio donde están nuestras carpetas de trabajo
-ls #Vemos los archivos y directorios que ya tenemos
-cd git #No hay nada
-cd .. #Salimos
-rm historia.txt #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica
-rm Git #rm: cannot remove 'Git': Is a directory
-rm --recursive -R Git #By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments
-option to remove each listed directory, too, along with all of its contents. Esto es para practica
-rm --help #Nos muestra lo que les puse arriba como documentación en Inglés.
-mkdir class-git #Creamos la carpeta o directorio para trabajar en Git local por ahora.

### Clase 4: Registro de cambios y uso de Vim en Git

Durante esta clase aprendimos a:

- Crear archivos desde la terminal con `touch`
- Editar archivos con VS Code y guardar con `Ctrl + S`
- Usar comandos como `git status`, `git add`, `git commit`
- Realizar commits desde el editor Vim
- Ver los cambios con `git show`
- Consultar historial con `git log`
- Comparar versiones con `git diff`
- Salir de Vim correctamente (`Esc + :wq!` o `Esc + Shift + Z + Z`)