Las hormigas soldado deben ser modeladas como hilos y se identificarán como **“HSXXXX”**, donde X es un número (id) único como, por ejemplo, HS0001, HS0023, HS1234, etc.

Cada hormiga soldado, una vez se ha unido a la colonia, repetirá iterativamente el siguiente comportamiento:
	• Hace instrucción en la ZONA DE INSTRUCCIÓN, tardando un tiempo aleatorio de entre 2 y 8 segundos en hacer esta operación. 
	• A continuación, descansa 2 segundos en la ZONA DE DESCANSO.

Otras consideraciones:
	• Todas las hormigas soldado, tras realizar 6 iteraciones completas de su acción principal, pasan por la ZONA PARA COMER a reponer fuerzas y comer, consumiendo 1 unidad de alimento. Esta operación tarda 3 segundos en realizarse.
	• Las hormigas soldado deben estar atentas, porque, en caso de que un insecto invasor amenace la colonia, deben dejar lo que estén haciendo en ese momento y salir inmediatamente de la colonia a repeler al insecto invasor. Cuando todas las hormigas soldado de la colonia se encuentren en el exterior (únicamente aquellas que estaban creadas de forma previa a la generación de la amenaza. Las hormigas soldado creadas durante el intento de invasión realizarán la instrucción normalmente), estarán listas para repeler al insecto.
	• A partir de dicho momento se producirá una lucha entre las hormigas y el insecto, consumiendo 20 segundos. 
	• El evento finaliza con la huida del insecto sin causar bajas de ninguna hormiga soldado. 
	•A continuación, continúan con el comportamiento previamente definido (ya sea ir a la ZONA DE INSTRUCCIÓN o la ZONA PARA COMER), es decir, no se altera el contador de iteraciones al realizar esta acción
