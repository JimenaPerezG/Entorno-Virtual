#Ejercicio: Rango de edad
edad = int(input("Ingrese su edad: "))
'''veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)
if veinte or treinta:
    if veinte:
        print('Estas dentro del rango de los (20\'0) años')
    elif treinta:
        print('Estas dentro del rango de los (30\'0) años')
    else:
        print('No esta dentro del rango')
else:
    print('No esta dentro del rango de los 20s a 30s')
'''
# if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):
    print('Estas dentro del rango de los 20 a 30 años')
