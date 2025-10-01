# ejercicio de polimorfismo poo
class celular:
    def __init__(self, a, b,c,d,e):
        self.nrotel = a
        self.duenio =b
        self.espacio =c
        self.ram = d
        self.nroApp =e
    def mostrar(self):
        print("nro. de telefono:", self.nrotel)
        print("duenio:", self.duenio)
        print("espacio:", self.espacio)
        print("ram:", self.ram)
        print("numero de aplicaiones", self.nroApp)
    def __pos__(self):
        self.nroApp=self.nroApp+10
        return self
    def __neg__(self):
        self.espacio=self.espacio-5
        return self
    
#begin

c1=celular(987654321, "Juan Perez", 125, 8, 45)
c1.mostrar()
+c1
-c1
c1.mostrar()