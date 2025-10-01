package ejercicios.pkg456;

public class Fecha {
    private int dia, mes, anio;
    
    public Fecha(){
        dia = 12;
        mes = 10;
        anio = 2025;
    }

    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
        return false;
    }
    
    // b) Calcular la fecha del día siguiente
    public void diaSiguiente() {
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (esBisiesto(anio)) {
            diasMeses[1] = 29;
        }
        
        dia++;
        
        if (dia > diasMeses[mes - 1]) {
            dia = 1;
            mes++;
            
            // Si el mes supera diciembre
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }
    
    public void mostrar() {
        System.out.println(dia + " /" + mes + " /" + anio);
    }
}