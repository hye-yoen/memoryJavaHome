package ch6.test;
//18 
public class ShopService {
   private static ShopService singleton = new ShopService();

   private ShopService() {}
   
   static ShopService getInstance(){
    return singleton;
   }

   public static void main(String[] args) {
    
       ShopService obj1 = ShopService.getInstance();
       ShopService obj2 = ShopService.getInstance();
   
       if(obj1 == obj2){
           System.out.println("같은 ShopService 객체임");
       }
       else{
           System.out.println("다른 ShopService 객체임");
       }
   }
}
