package com.company;

public class Main {

    public static void main(String[] args) {
	    CustomQueue queue = new CustomQueue();
        queue.push(new CellularUser("Drapak", "+38(066)823-23-22"));
        queue.push(new CellularUser("Selin", "+38(065)324-76-96"));
        queue.push(new CellularUser("Didulh", "+38(068)455-32-16"));

        queue.printData();

        CellularUser user = queue.search("Drapak", "+38(066)823-23-22");
        System.out.println(user.toString());
        
    }
}
