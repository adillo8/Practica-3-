package aplicacion;
import dominio.*;

public class Principal{
    public static void main (String[]args){
        System.out.println("La aproximacion a pi es: "+Aproximacion.aproximarPi(100000));
    }
}