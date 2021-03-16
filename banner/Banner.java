/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;
import banner.*;
//import  banner.MyCharacter;

/**
 *
 * @author grupo 3
 */
public class Banner {
  private String message;

  /**
   * constructor
   * @param message mensage a dibujar
   */
    public Banner(String message) {
        this.message = message;
    }

  /**
   * administra la creacion de nuevas letras
   * @param size tama�o de la matriz
   * @param symbol caracter con el cual se va a llenar
   * @return
   */
    public Matrix[] matrix () {
      char characterr = ' ';
      char[] characterAux = message.toCharArray();
      Matrix[] matrix = new Matrix[characterAux.length];
      for (int i = 0; i < characterAux.length; i++) {

        characterr = characterAux[i];
        switch (characterr) {
          case 'A':
            matrix[i] = new Matrix((new LetterA('A', new Size(9, 9), '*').generate()));
              /**char[][] aux = matrix[i].getCharacterI();
              for (int k = 0; k < matrix[i].getCharacterI().length; k++) {
                for (int j = 0; j < matrix[i].getCharacterI()[i].length; j++) {
                  System.out.print(aux[i][j]);
                }
                System.out.println("");
              }*/

            break;
          case 'B':
            matrix[i] = new Matrix(new LetterB('A', new Size(9, 9), '*').generate());
            break;
          case 'C':
            break;
          case 'D':
            break;
          case 'E':
            break;
          case 'F':
            break;
          case 'G':
            break;
          case 'H':
            break;
          case 'I':
            break;
          case 'J':
            break;
          case 'K':
            break;
          case 'L':
            break;
          case 'M':
            break;
          case 'N':
            break;
          case 'Ñ':
            break;
          case 'O':
            break;
          case 'P':
            break;
          case 'Q':
            break;
          case 'R':
            break;
          case 'S':
            break;
          case 'T':
            break;
          case 'U':
            break;
          case 'V':
            break;
          case 'W':
            break;
          case 'X':
            break;
          case 'Y':
            break;
          case 'Z':
            break;
          case '1':
            break;
          case '2':
            break;
          case '3':
            break;
          case '4':
            break;
          case '5':
            break;
          case '6':
            break;
          case '7':
            break;
          case '8':
            break;
          case '9':
            break;
          case '0':
        }
      }
      return matrix;
    }
}











    
   

