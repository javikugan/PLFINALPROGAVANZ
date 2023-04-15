Las hormigas obreras deben ser modeladas como hilos y se identificarán como **“HOXXXX”** donde X es un número (id) único como, por ejemplo, HO0001, HO0023, HO1234, etc.

Cada hormiga obrera cuyo identificador sea **impar** (sólo la parte numérica) repetirá iterativamente el siguiente comportamiento una vez se ha unido a la colonia:
	• Acude a la zona exterior de la colonia a coger cinco elementos de comida y lo lleva al interior       de la colonia, tardando 4 segundos. 
	•A continuación, lo deposita en el ALMACÉN DE COMIDA, tardando un tiempo aleatorio de entre 2 y 4 segundos. A este ALMACÉN DE COMIDA sólo pueden acceder simultáneamente 10 hormigas.
	
Cada hormiga obrera, con un identificador **par**, se encargará de ir sirviendo comida entre el ALMACÉN DE COMIDA y la ZONA PARA COMER. Así, una vez se haya unido a la colonia, repetirá iterativamente el siguiente comportamiento: 
	• Accede al ALMACÉN DE COMIDA para coger cinco elementos de comida requiriendo entre 1 y 2 segundos. 
	• Entonces, viaja hacia la ZONA PARA COMER, tardando un tiempo aleatorio de entre 1 y 3 segundos.
	• A continuación, accede a la ZONA PARA COMER y deposita el elemento de comida, consumiendo entre 1 y 2 segundos. Desde este momento, elemento de comida está disponible para ser ingerido por cualquier hormiga de la colonia. 
Otras consideraciones:
	• Todas las hormigas obreras, pares o impares, tras realizar 10 iteraciones completas de su acción principal, pasan por la ZONA PARA COMER para reponer fuerzas y comer, consumiendo 1 unidad de alimento y tardando 3 segundos.
	• A continuación, acceden a la ZONA DE DESCANSO, consumiendo allí 1 segundo, para, a continuación, volver a retomar su actividad habitual.