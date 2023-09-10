# CalculadoraRomano
Convertir números arábigos a números romanos
Para poder convertir a números romanos, tenemos que fragmentar el número introducido en 4 partes, unidades, decenas, centenas y millares.
Para cada una, tenemos que escribir un arrays, que contenga los 10 primeros números de las unidades, las 10 primeras decenas ...
Para entender el código, primero tenemos que recoger un Int, que va a introducir el usuario, y nosotros lo queremos convertir en un string ( recordar que los números romanos son letras) por lo que el int será el número que nosotros introduzcamos y el string será el número romano ya convertido.
Para el string tenemos que crear un método con 4 arrays uno para cada unidad,decena,centena y millar.
Introducimos los parámetros hasta el 3999 aunque nosotros limitaremos para el ejercicio entre el 1-3000 con un If.
Despues para que el arrays seleccione el número adecuado para cada string, tenemos que dividir para que se quede un número del 0-9 (recordar que los arrays empiezan en el elemento 0)

