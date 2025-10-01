/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.pkg456;
import java.util.*;
public class CuentaBancaria {
    private String titular;
    private int nroCuenta, saldo;
    
    public CuentaBancaria(){
        titular="xxxxxxxx";
        nroCuenta=12345;
        saldo=4000;
        
    }

    public CuentaBancaria(String t, int nro, int s) {
        this.titular = t;
        this.nroCuenta = nro;
        this.saldo = s;
    }
    public void mostrar(){
        System.out.println("DATOS=============");
        System.out.println("titulat: "+titular);
        System.out.println("nrocuenta: "+nroCuenta);
        System.out.println("saldo: "+saldo);
        
        
    }
    //insiso a)
    public void depositar(int x){
       if(x<=0){
           System.out.println("error de deposito... ");
       }else{
           System.out.println("usted deposito: "+ x);
           saldo=saldo+x;
           System.out.println("saldo actual; "+saldo);
       }
        
        
    }
    public void retitar(int y){
            
        if(y > saldo){
            System.out.println("error ");
        }else{
            System.out.println("usted esta retirando: "+y);
            saldo= saldo - y;
            System.out.println("saldo actual: "+saldo);
        }
    }
}
