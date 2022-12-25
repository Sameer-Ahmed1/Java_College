public class Test { 
    
        public static void main(String[] args){ 
        Employee e1= new Employee("Sam","5B9",50000);
        System.out.println(" Name : "+ e1.name() + " id : "+e1.id()+" Salary"+e1.salary()+" Organisation"+e1.organisation());
         Employee e2= new Employee("Ram","5C9",60000);
         System.out.println(" Name : "+ e2.name() + " id : "+e2.id()+" Salary"+e2.salary()+" Organisation"+e2.organisation());
         Account a1 = new Account("5B9",50000);
         Account a2 = new Account("5C9",60000);
         System.out.println("id : "+a1.getId()+" balance : "+a1.getBalance());
         System.out.println("id : "+a2.getId()+" balance : "+a2.getBalance());        
         a1.withdraw(5000);
         System.out.println("After withdrawal : ");
         System.out.println("id : "+a1.getId()+" balance : "+a1.getBalance());
         a2.withdraw(6000);
         System.out.println("id : "+a2.getId()+" balance : "+a2.getBalance());        
         System.out.println("After deposit : ");
         a1.deposit(440);
         a2.deposit(5000);
         System.out.println("id : "+a1.getId()+" balance : "+a1.getBalance());
         System.out.println("id : "+a2.getId()+" balance : "+a2.getBalance());        

    }
}