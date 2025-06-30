# Etapa de vida
edad = int(input('Digite su edad'))
mensaje = None
if 0 <= edad < 10:
    mensaje = 'La infancia es increible y bella'
elif 10 <= edad < 20:
    mensaje = 'Tienes muchos cambios, mucho que estudiar'
elif 20 <= edad < 30:
    mensaje = 'Amor y comienza el trabajo'
elif 30 <= edad <= 40:
    mensaje = 'Consolidación profesional y crecimiento personal'
elif 40 <= edad <= 50:
    mensaje = 'Trabajo arduo'
elif 50 <= edad <= 60:
    mensaje = 'Falta poco para jubilarse'
elif 60 <= edad <= 70:
    mensaje = 'Retiro y más tiempo para si mismo'
elif 70 <= edad <= 80:
    mensaje = 'Tiempo para los hijos y nietos'
elif 80 <= edad <= 90:
    mensaje = 'Recuerdos valiosos y tranquilidad'
elif 90 <= edad <= 100:
    mensaje = 'Vida plena y digna de admirar'
elif edad >= 100:
    mensaje = '¡Premio a la longevidad!'
else:
    mensaje = 'Edad no válida'
print(f'Tu edad es: {edad}, {mensaje}')