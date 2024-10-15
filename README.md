<h1>Documentacion </h1>

![alt text](/imgs/image.png)
Se definen los archivos de entrada y salida, y se inicializan los lectores y escritores.
![alt text](/imgs/image2.png)

Se lee cada línea del archivo de entrada y se crea un ProcessBuilder para cada línea. También se crean archivos de salida para cada proceso.

![alt text](/imgs/image3.png)
Se inician todos los procesos y se almacenan en una lista.
![alt text](/imgs/image4.png)
Se espera a que cada proceso termine, se lee su salida y se escribe tanto en el archivo correspondiente como en el archivo de salida final.
![alt text](/imgs/image5.png)
Finalmente, se cierran todos los recursos y se imprime el contenido del archivo de salida final.

<h1>Replacer</h1>

![alt text](/imgs/image6.png)
recibimos un argumento que se espera sea el texto a modificar, comprobamos que se ha dado almenos un argumento, tomamos el primer argumento como linea a modificar, remplazamos todas las vocales con X e imprimimos el resultado o error