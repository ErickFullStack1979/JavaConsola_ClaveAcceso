package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      String claveReg;
      String claveIng;
      int intentos = 1;
      Scanner asignar = new Scanner(System.in);

      System.out.println("============================== ============================== ==============================");
      System.out.println("*** Registro y verificacion de clave de acceso ***");

      System.out.println("============================== ============================== ==============================");
      System.out.println("Ingrese una clave de 6 caracteres que contenga letras y numeros sin espacios ni simbolos:");
      claveReg = asignar.nextLine();
      while (claveReg.length() != 6 ||
            !claveReg.substring(0).matches("[a-zA-Z0-9]*") ||
            !claveReg.substring(0).matches(".*[a-zA-Z].*") ||
            !claveReg.substring(0).matches(".*[0-9].*")) {
         System.out.println("La clave ingresada no cumple con las restricciones indicadas.");
         System.out.println("Ingrese una clave de 6 caracteres que contenga letras y numeros sin espacios ni simbolos:");
         claveReg = asignar.nextLine();
      }
      System.out.println("============================== ============================== ==============================");
      System.out.println("*** Clave registrada exitosamente ***");

      System.out.println("============================== ============================== ==============================");
      System.out.println("Ingrese nuevamente su clave para verificarla:");
      claveIng = asignar.nextLine();
      while (!claveIng.equals(claveReg) && intentos < 3) {
         System.out.println("Clave incorrecta, ingresela nuevamente:");
         claveIng = asignar.nextLine();
         intentos++;
      }

      System.out.println("============================== ============================== ==============================");
      if (claveIng.equals(claveReg)) {
         System.out.println("*** Clave verificada exitosamente ***");
      } else {
         System.out.println("Clave bloqueada, inicie nuevamente el proceso de registro.");
      }
      System.out.println("============================== ============================== ==============================");

   }
}
