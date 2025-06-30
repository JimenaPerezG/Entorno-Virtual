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

### Clase 8: Flujo de trabajo con un repositorio remoto

Cuando trabajamos en local, los cambios viven solo en nuestra computadora. Para colaborar con otros, usamos **repositorios remotos** (como GitHub, GitLab o Bitbucket) que permiten compartir el código a través de internet.

Un repositorio remoto es una copia de nuestro proyecto que vive en un servidor accesible por URL. Esto nos permite:

- Descargar el proyecto (`clone`)
- Subir cambios (`push`)
- Recibir actualizaciones (`pull`, `fetch`)
- Ver historial y colaborar en equipo

git clone <url>     # Clona un repositorio remoto en tu máquina (con historial incluido)
git push            # Sube tus commits al repositorio remoto (después de add y commit)
git fetch           # Trae los cambios remotos (pero NO los fusiona todavía)
git merge           # Combina los cambios traídos con fetch con tu rama local
git pull            # Equivale a 'fetch' + 'merge', trae y aplica cambios remotos

### Clase 9: distintas ramas y uso de Live Server
ctrl + s  #Guardamos la clase del portafolio
F5 #Actualizamos en el navegador para ver los cambios
git status #Veremos el archivo que modificamos
git add .
git commit
esc + i #Abrimos el editor vim, escribimos el mensaje del commit
esc
:wq! #En window
ctrl + x #En linux
s #Para un si 
enter #Terminado el mensaje del commit
git status #No hay mas nada para commitear y estamos en la rama segunda
git show #Vemos todo lo que cambiamos
q #Para salir
git log #Nos muestra donde estabamos con la rama master y el HEAD paso a la rama cabecera
q #Para salir
git checkout master #Volvemos a la rama master, desaparese lo que habíamos hecho
git log #No muestra lo que hicimos en el portafolio
q #para salir
git checkout segunda #Volvemos a ver todos los cambios que hicimos de nuevo

### Clase 9 parte 4:
Comandos básicos de GitHub:
git init # crear un repositorio, si ya esta en la nube traerlo sin hacer git init
git add . #agregar un archivo a staging.
git commit -m “mensaje” #guardar el archivo en git con un mensaje.
git branch nombre_rama #crear una nueva rama.
git checkout nombre_rama #moverse entre ramas.
git push origin rama #mandar cambios a un servidor remoto.
git fetch #traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local.
git merge rama #tiene dos usos. Uno es la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada. Su otro uso es guardar los cambios de un servidor remoto en nuestro directorio.
git pull origin rama #fetch y merge al mismo tiempo.
git checkout “codigo de version” “nombre del archivo” #volver a la última versión de la que se ha hecho commit.
git reset #vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones.
git reset --soft #vuelve a la versión en el repositorio, pero guarda los cambios en staging. Así, podemos aplicar actualizaciones a un nuevo commit.
git reset --hard #todo vuelve a su versión anterior
git reset HEAD #saca los cambios de staging, pero no los borra. Es lo opuesto a git add.
git rm #elimina los archivos, pero no su historial. Si queremos recuperar algo, solo hay que regresar. se utiliza así:
git rm --cached #elimina los archivos en staging pero los mantiene en el disco duro.
git rm --force #elimina los archivos de git y del disco duro.
git status #estado de archivos en el repositorio.
git log #historia entera del archivo.
git log --stat #cambios específicos en el archivo a partir de un commit.
git show #cambios históricos y específicos hechos en un archivo.
git diff “codigo de version 1” “codigo de version 2” #comparar cambios entre versiones.
git diff #comparar directorio con staging.
Comando en producción: TUVE QUE SOLUCIONAR UN CONFLICTO
git status #En rama segunda: hacemos cambios en el archivo y guardamos
git commit -am "Finalizado el cambio en rama segunda" #enter
git status
git checkout master #perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo parrafo y guardamos
git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"
git checkout segunda #vemos como desaparecen los cambios
git checkout master #Aquí es que vamos a hacer el merge
git merge segunda #En mi caso tuve algunos conflictos que solucione a través de VSC, aclaro que nunca debemos utilizar Fusionar los dos cambios
git commit -am "Arreglando conflicto" #Una vez solucionado debemos commitear
git status #Debemos revisar en el navegador y en el código si algo quedo mal y cambiarlo
git commit -am "Solucionado el conflicto 2"
git merge segunda #ahora todo va bien
git commit -am "Volvi a comentar en este caso de mi area laboral" #Añado información al archivo
git log
q #Para salir
git commit -am "Para guardar estos cambios en el README.md"
git checkout segunda
git merge master #Traemos todos los cambios
git commit -am "Cargamos esto ahora" #vamos a master y mergeamos
git checkout master
git merge segunda #y terminamos con esto

### Clase 10: resolucion de conflictos
#Hacemos cambios estando en la rama master, en el archivo de trabajo
ctrl  + s
git status
git add .
git commit -m"Aregando cambios nuevos al archivo de trabajo"
git push origin master
git log
q     #Para seguir en la línea decomandos
git checkout second #volvemos a la rama second
git merge master #traemos los cambios desde la master y tenemos las dos ramas actualizadas
git push origin second
CONFLICTO 
ctrl + s #Guardamos los cambios en la rama second, ponemos cambios en el archivo html
git commit -am "Modifique el html y el color del texto" es un ejemplo
git checkout master #Modificamos el html, ponemos código y ponemos texto blue
ctrl + s #Guardamos los cambios
git commit -am "Agregue información, cambie el código y puse todo el texto azul"
git merge second #Hacemos un merge estando en master y veremos el conflicto
Debemos ahora commitear estos cambios, abajo pongo los comandos.
git status
git commit -am "Solución de conflictos al mergear las ramas"
git checkout second #Seguiremos con la versión anterior, porque el merge fue en master
git merge master #Ahora pasamos los cambios a la rama second.

### Clase 10
Nueva linea

### Clase 10.2
-Las llaves públicas y privadas, conocidas también como cifrado asimétrico de un solo camino, sirven para mandar mensajes privados entre varios nodos con la lógica de que firmas tu mensaje con una llave pública vinculada con una llave privada que puede leer el mensaje.
-Las llaves públicas y privadas nos ayudan a cifrar y descifrar nuestros archivos de forma que los podamos compartir sin correr el riesgo de que sean interceptados por personas con malas intenciones.
-Cómo funciona un mensaje cifrado con llaves públicas y privadas Ambas personas deben crear su llave pública y privada.
-Ambas personas pueden compartir su llave pública a las otras partes (recuerda que esta llave es pública, no hay problema si la “interceptan”).
-La persona que quiere compartir un mensaje puede usar la llave pública de la otra persona para cifrar los archivos y asegurarse que solo puedan ser descifrados con la llave privada de la persona con la que queremos compartir el mensaje.
-El mensaje está cifrado y puede ser enviado a la otra persona sin problemas en caso de que los archivos sean interceptados.
-La persona a la que enviamos el mensaje cifrado puede emplear su llave privada para descifrar el mensaje y ver los archivos.
-Nota: puedes compartir tu llave pública, pero nunca tu llave privada.