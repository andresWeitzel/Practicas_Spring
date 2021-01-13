# Practicas_Spring
**Ejercitación Práctica en varios Proyectos de Prueba sobre el Framework Spring Java**


</br>

<hr>

## Más Información

## Implementación de Git desde Spring Tool Suite 4
#### 1)Descargar Git
#### 2)En Eclipse seleccionar el proyecto a implementar git->click derecho->Show in Local Terminal->Git Bash
#### 3)Si trabajas con Windows se te va a mostrar en el output del bash algo parecido a esto..
``` andre@DESKTOP-7BN69K1 MINGW64 /c/Users/andre/Documents/workspace-spring-tool-suite-4-4.9.0.RELEASE/ProyectoTest01 (master)$ ```
#### 4)Comenzar con git

## Subir el proyecto al repositorio con git desde el bash de visual studio Code 

#### 1)Creamos un nuevo repositorio en GitHub

#### 2)Inicializamos nuestro repositorio local .git
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/Practicas_Spring.git

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización del repositorio del proyecto con git desde el bash de visual studio code

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (Desconozco porqué tengo que ejecutar este comando, supongo que será porque no estoy trabajando con branchs en mi proyecto, el main por defecto de gitHub ahora es mi master(Yo realicé esa modificación para mejor visualización)).
* git pull https://github.com/andresWeitzel/Practicas_Spring.git

#### 5)Enviamos todos los cambios al repo en github
* git push https://github.com/andresWeitzel/Practicas_Spring.git

</br>
