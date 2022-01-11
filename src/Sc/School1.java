
package Sc;

import java.*;

import java.util.Scanner;
public class School1 {
  int key;
    School1 next;
    School1 top,cur;
    String name ;
    int num;
  int size;
 
    public School1( int item,School1 next,String name ,int num){
        this.key = item;
        this.next = null;
        this.name = name;
        this.num=num;
        
    }
    public School1(){
        top = null;
       size =0;
    //   arry = new String[x];
    }
     public void push(int key , String name){
        
        School1 newItemprt =new School1();
        if(newItemprt == null){
            System.out.println("the top is null");
        }else{
             newItemprt.key = key;
             newItemprt.name =name;
         newItemprt.next = top;
         top = newItemprt;
          }
     size++;
        }
      
 public boolean isEmpty(){
        return (top == null);
    }       
             public void pop(){
            if(isEmpty()){
            System.out.println("The stack is empty");
       }else{
              School1 temp = top;
              top = top .next;
              
              temp = temp.next = null;
              
               
            }
            
    }

   
  public void display(){
        cur = top ;
      System.out.print("[");
      while(cur!= null){
                  
          System.out.println("the employee Scholl name is"+""+"("+cur.key +")"+"the employee number is"+""+"("+cur.name+")");
           cur = cur.next;
      }
       System.out.print("]\n");
  }

   public void sortList()
    {
        School1 sorting = top,index=null;
 
        int temp;
 
        if (top == null) {
            return;
        }
        else  {
            while (sorting != null) {
                // Node index will point to node next to
                // sorting
                index = sorting.next;
 
                while (index != null) {
                    // If sorting node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (sorting.key > index.key) {
                        temp = sorting.key;
                        sorting.key = index.key;
                        index.key = temp;
                    }
 
                    index = index.next;
                }
                sorting = sorting.next;
            }
        }
    }
    public void searchNode(int num) { 
        this.num=num;
        School1 serthing = top;  
        int counter = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(top == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(serthing != null) {  
                 //Compares node to be found with each node present in the list  
                if(serthing.key == num) 
               {  
                    boolean ff = serthing.key ==  num;
                    flag = true;  
                    break;  
                }  
              counter++;  
                serthing = serthing.next;  
            }  
        }  
        if(flag)  {
             System.out.println("Element is present in the list at the position : " + counter);  
        } else  {
             System.out.println("Element is not present in the list");  
        }
       }
    public void exit(){
        System.exit(0) ;
    }
    
    }