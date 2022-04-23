package com.company;

public class Main {

    public static void main(String[] args) {
        CustomTwoLinkedList list = new CustomTwoLinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(4);
        list.addElement(5);
        list.addElement(5);

        list.printNodes();

        CustomTwoLinkedList listToCheck = new CustomTwoLinkedList();
        listToCheck.addElement(1);
        listToCheck.addElement(1);
        listToCheck.addElement(2);
        listToCheck.addElement(3);
        listToCheck.addElement(4);
        listToCheck.addElement(4);
        listToCheck.addElement(5);
        listToCheck.addElement(5);

        listToCheck.printNodes();

        System.out.println();
        System.out.println("All elements are in the list: " + list.checkSimilarityOfLists(listToCheck));
        System.out.println();

        CustomTwoLinkedList duplicatesList = list.checkNearDuplicates();
        duplicatesList.printNodes();

        System.out.println();
        System.out.println("Recurcive way: ");
        CustomTwoLinkedList duplicatesListRec = list.checkNearDuplicatesRecursively();
        duplicatesListRec.printNodes();
    }
}
