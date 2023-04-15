 • Todo el comportamiento del sistema se mostrará gráficamente por pantalla mediante una interfaz de usuario de Java. Además, se deberá incluir un botón para pausar/reanudar el sistema, de forma que sea sencillo hacer el seguimiento de la ejecución del programa. Un posible ejemplo de interfaz del sistema se muestra más abajo.
 
  • Se debe implementar un botón en la interfaz de usuario que genere un insecto invasor que amenace a la colonia, de tal manera que se genere una amenaza de insecto invasor, en el que las hormigas soldado deberán salir de la colonia a repeler la amenaza. Esta amenaza de insecto invasor durará hasta que sea repelido por las hormigas soldado. Una vez una amenaza esté activa no será posible generar una nueva hasta que ésta haya finalizado. 
  
  • El funcionamiento de todas las hormigas no finaliza nunca.
  
  • El comportamiento histórico del sistema se guardará en un fichero log (un fichero de texto llamado “evolucionColonia.txt”), de forma que sea sencillo analizar lo sucedido. El log guardará todos los eventos que van teniendo lugar, por ejemplo: “La hormiga obrera HO0002 sale a buscar comida”, “La hormiga soldado HS0010 comienza a hacer instrucción”, etc. En cada línea de dicho log deberá constar la marca de tiempo (fecha y hora, incluyendo el segundo determinado en el que tuvo lugar el evento) y el evento en sí. 
  
  • El sistema de log deberá implementarse como un recurso compartido a utilizar por todo el sistema concurrente y deberá protegerse adecuadamente.