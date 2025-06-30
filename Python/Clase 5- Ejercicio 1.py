 # Ejercicio Valor dentro de un rango
valor = int(input("Ingrese un numero: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} esta fuera de rango")

