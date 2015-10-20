package boletin.pkg5.ejercicio.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrián
 */
public class Almacen{
        private int pulpo ;
        private int patatas ;
        private int comensales;
        private int materiaprima;
     
     //Constructores   
        public Almacen(){   
}
    public Almacen(int npul, int npat){
        pulpo=npul;
        patatas=npat;
        
    }
          public void setAlmacen(int npul){
              pulpo=npul;
          }
          public int getAlmacen(){
              return pulpo;
              
          }
//Puntos de acceso
public int getañadirAlmacen(){
return comensales ;
}

public int añadirAlmacen(){
    return (pulpo+comensales);
    
  }
public int getpatatas(){
    return patatas ;
}
public int getañadirpatatas(){
    return materiaprima;
    
}
public int añadirpatatas(){
    return (patatas+materiaprima);
}
public int getmostrarpulpo(){
        return (pulpo);        
    }
    public int getmostrarpatatas(){
        return (patatas);
        
    }
    public int numerocomensalespulpo(){
    int comensalespulpo = 3*pulpo/2;
     return comensalespulpo ;
    }
    public int numerocomensalespatatas(){
    int comensalespatatas = 3*patatas/1;
    return comensalespatatas ;
    
}

    }
  
