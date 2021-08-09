//19000561
// Implemention of Encryption and Decryption functions of Caesar cipher

import java.util.Scanner
import scala.io.StdIn.readLine

package org.recursiveActivity{
  object CaesarChiper {
    def encryption(shf:Int, messg:String, s:String): Unit ={
      val EncryptMessage = messg.map( (c: Char) => {
        val x = s.indexOf(c.toUpper);

        if (x == -1)
          c
        else
          s((x + shf) % s.size);
      });
      println(EncryptMessage);
    }

    def decryption(shf:Int, messg:String, s:String): Unit ={
      val DecryptMessage = messg.map( (c: Char) => {
        val x = s.indexOf(c.toUpper);

        if (x == -1)
          c
        else
          s((x - shf) % s.size);
      });
      println(DecryptMessage);
    }

    def main(args: Array[String]): Unit = {

      var input = new Scanner(System.in);

      val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      println("1. Encryption");
      println("2. Decryption\n ");
      print("Enter your choice : ");
      val choice = input.nextLine().toInt;

      if(choice == 1){
        print("Enter number of shifts : ");
        val shf = (input.nextLine().toInt + characters.size) % characters.size;
        print("Enter message to encrypt :");
        val messg = input.nextLine();

        encryption(shf, messg,characters );
      }
      else if(choice == 2){
        print("Enter number of shifts : ");
        val shf = (input.nextLine().toInt + characters.size) % characters.size;
        print("Enter message to decrypt :");
        val messg = input.nextLine();
        decryption(shf, messg,characters);
      }
      else{
        println("Wrong choice");
      }
    }
  }
}


