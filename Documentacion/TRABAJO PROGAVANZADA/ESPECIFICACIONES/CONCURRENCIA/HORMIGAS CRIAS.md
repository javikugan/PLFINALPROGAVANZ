Las hormigas crías deben ser modeladas como hilos y se identificarán como  *“HCXXXX”*, donde X es un número (id) único como, por ejemplo, HC0001, HC0023, HC1234, etc.

Cada hormiga cría repetirá iterativamente el siguiente comportamiento una vez se ha unido a la colonia: 
	 • Accede a la ZONA PARA COMER, tardando un tiempo aleatorio de entre 3 y 5 segundos en alimentarse. A continuación, descansan 4 segundos en la ZONA DE DESCANSO.
	 
Otras consideraciones:
	• Dado que las hormigas cría son muy débiles, en caso de que exista la amenaza de un insecto invasor, todas ellas (tanto las creadas de forma previa a la amenaza como las generadas durante la amenaza) deben dejar lo que estén haciendo en ese momento y acudir rápidamente a la zona de REFUGIO, hasta que la amenaza haya desaparecido, volviendo entonces a su comportamiento habitual (iniciando su alimentación en la ZONA PARA COMER).