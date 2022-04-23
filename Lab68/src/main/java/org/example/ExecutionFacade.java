package org.example;

public class ExecutionFacade {
    public static void processData(){
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        list.addElement(2);
        list.addElement(8);
        list.addElement(77);
        list.addElement(5);
        list.addElement(35);
        list.addElement(48);
        list.addElement(48);
        list.addElement(48);
        list.addElement(15);

        list.printNodes();

        CustomTwoLinkedList listToClone = list.clone();
        listToClone.printNodes();

        listToClone.deleteMinimalVal();
        listToClone.printNodes();

        CustomTwoLinkedList listToCheck = list.getSimilarElements();
        listToCheck.printNodes();
    }
}
