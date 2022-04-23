package org.example;

import org.example.customList.CustomLinkedList;
import org.example.customList.CustomListNode;

import java.util.Date;

public class ExecutionFacade {
    public static void executeByBinaryTree() {
        Date today = new Date();
        Date lastYear = new Date();
        lastYear.setYear(2021);
        Date january = new Date();
        january.setMonth(1);

        File firstFile = new File("First file", today);
        File secondFile = new File("Second file", lastYear);
        File thirdFile = new File("Third file", january);

        System.out.println(firstFile.getName());

        BinaryTree tree = new BinaryTree();
        tree.add(firstFile);
        tree.add(secondFile);
        tree.add(thirdFile);

        tree.printTree();

        File foundFile = tree.get("Second file", lastYear);
        System.out.println("File name: " + foundFile.getName());
        System.out.println("Quantity of views: " + foundFile.getViewsQuantity());

        tree.delete(foundFile);

        tree.printTree();
    }

    public static void executeByLinkedList() {
        CustomLinkedList list = new CustomLinkedList();

        Date today = new Date();
        Date lastYear = new Date();
        lastYear.setYear(2021);
        Date january = new Date();
        january.setMonth(1);

        File firstFile = new File("First file", today);
        File secondFile = new File("Second file", lastYear);
        File thirdFile = new File("Third file", january);

        list.addElement(firstFile);
        list.addElement(secondFile);
        list.addElement(thirdFile);

        list.printList();

    }

}
