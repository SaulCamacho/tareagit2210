package javabasico;

public class JavaBasico {

    public static void main(String[] args) {

//        int edad = 15;
//        Integer numer = new Integer(15);
//        //    System.out.println(numer.intValue());
//        float x = numer.floatValue();
//        //    System.out.println(x);
//        //String number = "Pedro";
//        //    System.out.println(nombre);
//
//        Perro dog1 = new Perro("Poodle", 1);
//        Perro dog2 = new Perro("Poodle", 2);
//        Perro dog3 = new Perro("Poodle", 3);
//        System.out.println("Perro1: " + dog1.cola);
//        System.out.println("Perro2: " + dog2.cola);
//        System.out.println("Perro3: " + dog3.cola);
//        System.out.println("Perro1: " + dog1);
//        System.out.println("Perro2: " + dog2);
//        System.out.println("Perro3: " + dog3);
//
//        String cad1 = "Hola";
//        String cad2 = "Mundo";
//        String cad4 = " ";
//        String cad3 = cad1 + cad4 + cad2;
//        System.out.println("Edad: " + edad + " anios");
//        System.out.println(cad3);
//
//        String res = "";
//        if (edad >= 18) {
//            res = "Mayor de edad";
//        } else  {
//                res = "Menor de edad";
//                }
//        System.out.println(res);
//        System.out.println("-------");
//        res = (edad >= 18)?"Mayor de edad":"Menor de eada";
//        System.out.println(res);
//        System.out.println("-------");
//        
//      
// 2204/2020
//        int val1 = 7;
//        int val2 = 2;
//
//        System.out.println(val1 | val2);
//        System.out.println(val1 & val2);
//        int val3 = 1;
//        int val4 = val3<<1;
//        
//        System.out.println(val4);
//        val4 = val4<<1;
//        System.out.println(val4);
//        val4 = val4<<2;
//        System.out.println(val4);
        int[] edades;
        int[] edades2 = new int[5];
        int[] edades3 = {22, 21, 18, 19, 18};

        edades2[0] = 33;
        /* System.out.println(edades2 [0]);
          System.out.println(edades2 [2]);
          System.out.println("-----------");
          System.out.println(edades3 [0]);
          System.out.println(edades3 [1]);
          System.out.println(edades3 [2]);
          System.out.println(edades3 [3]);
          System.out.println(edades3 [4]);
         */

        // Esto miamo se puede hacer con un for así
        /* System.out.println("Automatizado");
          for (int i = 0; i < edades3.length; i++) {
              System.out.println(edades3 [i]); 
        }
          System.out.println("---------------------");
          for (int i = 0; i < edades3.length; i++) {
              System.out.println(edades3[2]);
        }
             System.out.println("---------------------");
          for (int j = 4; j>=0 ; j = j-1) {
              System.out.println(edades3[j]);
        }
         
        // FOR Each fore+ tab.
        System.out.println("Con FOR Each-----------");
        for (int ed : edades3) {
            System.out.println(ed);
        }*/
//        System.out.println("Arreglo de perro------------");
//        Perro [] lista = new Perro[3];
//        lista [0] = new Perro("Poodle", 1);
//        lista [1] = new Perro("San Bernardo", 3);
//        lista [2] = new Perro("Akita", 2);
//
//        for (Perro perro : lista) {
//            System.out.println("El perro de raza: "+ perro.getRaza());
//            perro.comer();
//        }
//
//        // AMPLIACION DE LISTA
//        System.out.println("--------------");
//        for (Perro perro : lista) {
//          perro.setRaza("Doverman");
//        }
//        for (Perro perro : lista) {
//            System.out.println(perro);
//        }
// TAREA 23/04/22
/*
Cuentahabiente Pedro = new Cuentahabiente(1, "Pedro", 52000.00f);
        System.out.println(Pedro);
        Pedro.retirarDinero(25000.00f);
        Pedro.evaluarNivelCliente();
        System.out.println("-----------------------");
Cuentahabiente Juan = new Cuentahabiente(2, "Pedro", 100000.00f);
        System.out.println(Juan);
        Juan.retirarDinero(2000.00f);
        Juan.evaluarNivelCliente();
        System.out.println("-------------------------------------------------");
         */
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente(1, "Merino", 52000.00f);
        lista[1] = new Cuentahabiente(3, "Karina", 30000.00f);
        lista[2] = new Cuentahabiente(2, "Fernando", 60000.00f);
        lista[3] = new Cuentahabiente(5, "Mariana", 2000.00f);
        lista[4] = new Cuentahabiente(4, "Ignacio", 35000.00f);

        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println("Nombre: " + cuentahabiente.getNombre());
        //    System.out.println("Saldo: "+cuentahabiente.getBalance());
            if (cuentahabiente.getBalance() >= 50000.00f) {
                System.out.println("Cliente Premium");
            } else {
                System.out.println("Cliente Regular");
            }
            System.out.println("------------------------");
        }
    }
}
