
contador = 1
limite = 1
cadena = "{0}\t{1}\t{2}\t{3}\t{4}\n".format("Nombre", "nota1", "nota2", "nota3", "promedio")
while contador<=limite:
    nombrest = input("Ingrese su nombre: ")
    nota1 = float(input("Ingrese la nota 1 : "))
    nota2 = float(input("Ingrese la nota 2 : "))
    nota3 = float(input("Ingrese la nota 3 : "))
    promedio=float ((nota1+nota2+nota3)/3)
    cadena = "{0}{1}\t{2}\t{3}\t{4}\t{5}\n".format(cadena, nombrest, nota1, nota2, nota3, promedio)
    contador = contador + 1 # incremento contador

print(" ")
print("Reporte de notas\n")
print(cadena)