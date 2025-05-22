"""
miVariable = 3
print(miVariable)
miVariable="hola a todos los estudiantes de la tecnitura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x=10
y=2
z= x+y
print(id(x))
#las literales se escriben x528, la variable y= x272, la variable z= x592
print(id(y))
print(id(z))

a=10.78
print(type(a))

#Tipos int, float, string, bool
x=10
print(x)
print(type(x))
x=14.5
print(x)
print(type(x))
x="Hola alumnos"
print(x)
print(type(x))
x=True
print(x)
print(type(x))
x=False
print(x)
print(type(x))

#Manejo de cadenas (string)
miGrupoFavorito = "The Letter Black"
caracteristicas ="The best rock band"
print("Mi grupo favorito es: "+miGrupoFavorito+" "+caracteristicas)
print("Mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1= "7"
numero2= "8"
print(int(numero1)+int(numero2))

#Tipos Boleanos (bool)
miBoleano = True
print(miBoleano)
#miBoleanno = False
#print(miBoleano)
#miBoleanno = 3<1
#print(miBoleano)

if miBoleano:
print("El resultado es verdadero")
else:
print("El resultado es falso")

#Procesar la entrada del usuario
#funcion input
resultado= input("Digite un numero")
print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
"""
"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma: ",suma)
print(f"El resultado de la suma es: {suma}")

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
# quitando decimal
print(f"El resultado de la division (int) es: {division}")

modulo = operandoA % operandoB
print(f"El resultado de la division o residuo (modulo) es: {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")

"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -=2
print(miVariable3)

#miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)
"""
""""
# Operadpres de Comparacion
d = 4
b = 2
resultado = d ==b #comprobacion de igualdad
print (resultado)

# Operador diferente
resultado = d != b
print (resultado)

# Operador Mayor que
resultado = d > b
print (resultado)

# Operador menor que
resultado = d < b
print (resultado)

#Operador menor o igual que
resultado = d <= b
print(resultado)

#Operador mayor o igual que 
resultado = d >= b
print (resultado)
"""

#Operadores Logicos

a = True
b = True
resultado = a and b
print (resultado)

#Operador or
resultado = a or b
print(resultado)

#Operador not
resultado = not a
print(resultado)

# If else
condicion = True
if condicion == True:
    print('Condicion verdadera')
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')
