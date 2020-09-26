
package portiappp;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class Crepa {
    public String Nombre;
    public String Fondo;
    public String Elemento1;
    public String Elemento2;
    public String env;

    public Crepa(String Nombre, String Fondo, String Elemento1, String Elemento2, String env) {
        this.Nombre = Nombre;
        this.Fondo = Fondo;
        this.Elemento1 = Elemento1;
        this.Elemento2 = Elemento2;
        this.env = env;
    }
    
    public Crepa(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     public String getFondo() {
        return Fondo;
    }

    public void setFondo(String Fondo) {
        this.Fondo = Fondo;
    }

     public String getElemento1() {
        return Elemento1;
    }

    public void setElemento1(String Elemento1) {
        this.Elemento1 = Elemento1;
    }
     public String getElemento2() {
        return Elemento2;
    }
    public void setElemento2(String Elemento2) {
        this.Elemento2 = Elemento2;
    }

     public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    void guardar(PrintWriter Escribe) {
        Escribe.print(Nombre + ",");
        Escribe.print(Fondo + ",");
        Escribe.print(Elemento1 + ",");
         Escribe.print(Elemento2 + ",");
        Escribe.println(env);
    }

    public Crepa cargar(BufferedReader Almacen) {
        String Nom, Fon, El1,El2,en;
        try {
            Nom = Almacen.readLine();
            Fon = Almacen.readLine();
        El1 = Almacen.readLine();
            El2 = Almacen.readLine();
             en = Almacen.readLine();
  
            return new Crepa(Nom, Fon, El1, El2, en);
        } catch (Exception e) {
        }
        return null;
    }

    
}

