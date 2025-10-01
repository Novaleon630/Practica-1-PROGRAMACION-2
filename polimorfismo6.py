class Auto:
    def __init__(self, a="nissan", b="sentra", c="blanco", d=40):
        self.marca = a
        self.modelo = b
        self.color = c
        self.gasolina = d

    def mostrar(self):
        print("marca:", self.marca)
        print("modelo:", self.modelo)
        print("color:", self.color)
        print("gasolina:", self.gasolina)
        print("===============================")
    def __pos__(self):
        self.gasolina = self.gasolina + 5
        return self
    def __add__(self, x):
        self.color = x
        return self
    #sobrecargar el operador - para sumar el total de gasolina entre dos autos
    def __sub__(self, x):
        self.gasolina = self.gasolina + x.gasolina
        return self
        

#begin
c1 = Auto("Toyota", "Corolla", "Rojo", 50)    
c1.mostrar()

c2 = Auto()   
c2.mostrar()
#c
+c1
c1.mostrar()
#d
c2 = c2 + "verde"
c2.mostrar
#e
c2 = c1 - c2
c2.mostrar()