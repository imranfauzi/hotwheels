
package hotwheels;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class HotWheels {
    
    static HashMap <String,String> car = new HashMap <String,String>();
    static HashMap <String,String> customer = new HashMap <String,String>();
    static Scanner input = new Scanner(System.in);
    
    //TREEMAP FOR SORTING CAR NAME
   public static void sortbykey(){
       
    //Create TreeMap to store values from HashMap
       TreeMap<String, String> sorted = new TreeMap<>();
     
    //Copy all data from hashmap into TreeMap
        sorted.putAll(car);
        
        //Display the TreeMap which is naturally sorted
        sorted.entrySet().forEach((Map.Entry<String, String> entry) -> {
            System.out.println("CAR NAME: "+ entry.getKey()+", PRICE: "+ entry.getValue());
        });
   }
   //TREEMAP FOR SORTING CUSTOMER
   public static void customersorting(){
       
       
     //TreeMap to store values of Map
     TreeMap<String, String> sorted1 = new TreeMap<>();
     
     
     //Copy all data from Map into TreeMap
     sorted1.putAll(customer);
     
        //Display the TreeMap which is naturally sorted
        sorted1.entrySet().forEach((Map.Entry<String, String> entry) -> {
            System.out.println("CUSTOMER'S NAME: "+ entry.getKey()+", NO.PHONE: "+ entry.getValue());
        });
  }
   
   public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
           LinkedList<String> usernamelist = new LinkedList<>();
           
           usernamelist.add(0,"Farhan");
           usernamelist.add(1,"Haziq");
           usernamelist.add(2,"Imran");
           usernamelist.add(3,"Saifullah");
           usernamelist.add(4,"Ahmed");
//add complexity is 0(1)
     int b;
        do{  System.out.println("Id: ");
             int id = input.nextInt();
             System.out.println("Username: ");
            //admin input username
            String username = new String(input.next());
            System.out.println("Password: ");
            String password = input.next();
            
          //get complexity is 0(n)
           if(username.equals(usernamelist.get(id))&&password.equals("admin123")){
            b=1;
         }else{
           System.out.println("***You may entered wrong id,username or password****");    
           b=7;
           }
      }while(b!=1);
   HashMap();  
   }    
      
 
      private static void HashMap() {
           
            int a;
             do{     
               System.out.println("****WELCOME TO HOT WHEELS STORE****");
               System.out.println("\n1. Add Car\n2. Sort Car\n3. Delete Car\n4. Add Customers\n5. Delete Customers\n"
                       + "6. Customer Sort"
                       + "\n7. Exit"
                       + "\nENTER YOUR OPTION:");
               int option = input.nextInt();
               
               switch(option){
                   
                   case 1:
                       System.out.println("_______INSERT YOUR HOT WHEELS CARS______");
                       System.out.println("Car name: ");
                       String carname = input.next();
                       System.out.println("Price: ");
                       String price = input.next();
                       
                        car.put("Green Open Fire", "200"); 
                        car.put("Red Olds", "250"); 
                        car.put("Pink Beatnik Bandit", "230");
                        car.put("Red Ferrari","300"); 
                        car.put("Spectraflame", "500"); 
                       //for user input will be stored here
                        car.put(carname, price);
                       
                       System.out.println("CAR NAME: "+ carname);
                       System.out.println("PRICE: $"+price);
                       System.out.println("Updated System\n"+car);
                     break;
                   case 2:
                       
                   System.out.println("_______HOT WHEEL CARS LIST______");
                   sortbykey();
                   
                   
                    break;
                   case 3:
                 
                   System.out.println("_______DELETE ALL CARS_______");
                   car.clear();
                       
                       
                       break;
                       
                   case 4:
                   
                    System.out.println("_______ADD CUSTOMERS_______");
                
                       System.out.println("Customer name: ");
                       String customername = input.next();
                       System.out.println("No. Phone: ");
                       String nophone = input.next();
                       
                        customer.put("Hadi Awang", "019-3937569"); 
                        customer.put("Aziz", "019-3514524"); 
                        customer.put("Abduh", "018-994487");
                        customer.put("Rahim","013-4482472"); 
                        customer.put("Khairi", "014-5435253"); 
                        
                        
                        customer.put(customername, nophone);
                       
                       System.out.println("CUSTOMER'S NAME: "+ customername);
                       System.out.println("NO.PHONE: "+nophone);
                       
                       System.out.println("Updated System\n"+customer);
                       break;
                   case 5:
                       customer.clear();
                       break;
                   case 6:
                       System.out.println("_______CUSTOMERS LIST______");
                       customersorting();
                       break;
                   case 7:
                       break;
               default:
                   
             }
               a=option;
      }while(a!=7);
}}    
    
    

