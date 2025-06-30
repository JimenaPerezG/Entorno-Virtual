# Calcular estacion del año
mes = int(input("Ingrese el número del mes (1 al 12): "))
if mes == 1 or mes == 2 or mes == 3:
    print("Estás en Verano")
elif mes == 4 or mes == 5 or mes == 6:
    print("Estás en Otoño")
elif mes == 7 or mes == 8 or mes == 9:
    print("Estás en Invierno")
elif mes == 10 or mes == 11 or mes == 12:
    print("Estás en Primavera")
else:
    print("Mes inválido. Debe ser entre 1 y 12.")
'''
mes = int(input('Digite un mes del años (1 - 12): '))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = 'Verano'
elif mes == 4 or mes == 5 or mes == 6:
    estacion = 'Otoño'
elif mes == 7 or mes == 8 or mes == 9:
    estacion = 'Invierno'
elif mes == 10 or mes == 11 or mes == 12:
    estacion = 'Primavera'
else:
   estacion = 'Error, no hay numero para ese mes'
print(f'Para el mes {mes} la estacion es: {estacion}')
'''