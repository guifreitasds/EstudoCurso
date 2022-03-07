#Aero Model



plane = float(input("Digite 1 para acelerar o avião: "))

if plane == 1:
  print('O avião está acelerando')
  continue1 = float(input("Digite 2 para decolar o avião: "))
else:
  print('O avião está parado')

if continue1 == 2:
  print('O avião decolou')
  continue2 = float(input('Digite 3 para ligar o piloto automático: '))

if continue2 == 3:
  print('Você ligou o piloto automático!')


  