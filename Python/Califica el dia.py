# Califica el dia

calificacion=int(input("¿Como estuvo tu dia del 1 al 10?"))
if 1<=calificacion<=10:
    print("Tu dia fue de: ",calificacion,)
    if calificacion == 10:
        print("Fue excelente!")
    elif calificacion >= 7:
        print("fue un buen dia")
    elif calificacion >= 4:
        print("no siempre son buenos")
else:
    print("Por favor, ingresa un número entre 1 y 10.")