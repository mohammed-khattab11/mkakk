/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sc;

/**
 *
 * @author WAFAco
 */
import java.util.Scanner;
public class mainTest {
   
            

    public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//School1 cs = new School1();
//        while(true){
//        
//        System.out.println("******************** The Main page ********************");
//        System.out.println(" Choose number :- ");
//        System.out.println("1- Add item ");
//        System.out.println("2-Remove the last item");
//        System.out.println("3-Display the item");
//        System.out.println("4-Sorted the item");
//        System.out.println("5-Exit programme");
//       
//
//          int ch = in.nextInt();
//           // School1 cs = new School1();
//          cs.key = in.nextInt();
//          cs.name = in.nextLine();
//        
//          switch(ch){
//              case 1 :
//                  cs.push(cs.key, cs.name);
//                  break;
//              case 2:
//                  cs.display();
//                  break;
//                  
//              case 3:
//                  cs.pop();
//                 cs.disblay();
//                  break;
//              case 4:
//                  cs.sortList();
//                 cs.disblay();
//                 cs.disblay();

//                  break;
//              case 5:
//                  cs.searchNode(ch);
//                 cs.disblay();

//                  break;
//              case 6:
//                  cs.exit();
//                  break;
//          }
        
        
  //      }
 //   }

       
//        int z=6;
//       
//       
//        }
// 

//       School1 cs = new School1();
//
//        cs.push(111, "ssss");
//        cs.push(222,"sara");
//        cs.push(555, "ahmmad");
//       cs.push(444, "ali");
//        cs.push(333, "mohammad");
//       cs.display();
//        
//        System.out.println("//////////////////////////////");
//      cs.pop();
//       cs.sortList();
//      cs.display();
//        System.out.println("////////////////////////////////");
//       cs.searchNode(222);
//      cs.display();
//        System.out.println("//////////////////////////////////");
//        System.exit(0) ;
//       cs.exit();
//    
//       cs.display();


Scanner in = new Scanner(System.in);
School1 cs = new School1();
        while(true){
        
        System.out.println("******************** The Main page ********************");
        System.out.println(" Choose number :- ");
        System.out.println("1- Add item ");
        System.out.println("2-Remove the last item");
        System.out.println("3-Display the item");
        System.out.println("4-Sorted the item");
        System.out.println("5-Exit programme");
       

        

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
        
        
        System.out.println("Enter your choice ??");
        int choose = in.nextInt();
        if(choose == 1){
        int id= in.nextInt();
        String name=in.nextLine();
        cs.key=id;
        cs.name=name;
        cs.push(cs.key ,cs. name);
       }else if(choose == 2){           
                cs.display();
            
       }else if(choose == 3){
         cs.pop() ;
         cs.display();
    }else if(choose == 4){
        cs.sortList();
        cs.display();}else if(choose == 5){
          int key1 = in.nextInt();
          cs.num = key1;
       cs.searchNode(key1);
       cs.display();
      
    }else if(choose == 6){
        System.exit(0);
    }
        
   }
    }}

 
  


    
    

    
    

    
    

