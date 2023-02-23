package as;

import java.util.*;

class details {
    long ph;
    String Emailid;

    details(long phno, String id) {
        ph = phno;
        Emailid = id;
    }
    public String toString() {
        return "  Phone Number : " + ph + " Email ID : " + Emailid;
    }
}

class hstable {
    public static void main(String args[]) {
        int ch = 0;
        String name =" ";
        Hashtable<String, details> hstable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t ----- Contact List Using Hashmap ----- \n");

        while (ch != 5) {
            System.out.println("\n 1. Add a Contact \n 2. Delete \n 3. Search \n 4. Display \n 5. Exit ");
            System.out.printf("\n Enter Your Choice : ");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1: {
                    System.out.printf(" Enter the Name : ");
                    name = sc.next();
                    System.out.printf(" Enter the Phone Number : ");
                    Long phoneno = sc.nextLong();
                    System.out.printf(" Enter the Email Id : ");
                    String emailid = sc.next();
                    details info = new details(phoneno, emailid);
                    hstable.put(name, info);
                }
                    break;

                case 2: {
                    System.out.printf(" Enter the Name of the Contact to be deleted : ");
                    name = sc.next();
                    if (hstable.containsKey(name)) {
                        hstable.remove(name);
                        System.out.println(" Contact Deleted \n ");
                    } else {
                        System.out.println(" Contact Not Found ...");
                    }
                }
                    break;
                case 3: 
                {
                    System.out.printf(" Enter the Name of the Contact to be searched : ");
                    name = sc.next();
                    if (hstable.containsKey(name)) 
                    {
                        System.out.println(" Contact Found ");
                        System.out.println(" Name: "+name +" "+ hstable.get(name)+"\n");
                    }       
                    else 
                    {
                        System.out.println(" Contact  not Found ....");
                    }
                }
                break;
                case 4:
                    System.out.println(hstable);
                break;
                default:
                {
                    System.out.println(" Invalid Choice");
                }
                break;
        }
    }
}
}
