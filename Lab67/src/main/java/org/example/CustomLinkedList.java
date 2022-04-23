package org.example;

public class CustomLinkedList {
    private CustomNode head;

    public CustomNode getHead() {
        return head;
    }

    public void setHead(CustomNode head) {
        this.head = head;
    }

    public void addElement(int newData) {
        CustomNode newCustomNode = new CustomNode(newData);
        newCustomNode.setNext(head);
        head = newCustomNode;
    }

    public void addAll(String[] data) {
        for(String val : data) {
            CustomNode newCustomNode = new CustomNode(Integer.parseInt(val));
            newCustomNode.setNext(head);
            head = newCustomNode;
        }
    }

    public void addAll(int[] data) {
        for(int val : data) {
            CustomNode newCustomNode = new CustomNode(val);
            newCustomNode.setNext(head);
            head = newCustomNode;
        }
    }

    public void changeAllOccurrences(int numberToChange, int changeVal){
        CustomNode temp = head;
        while (temp != null) {
            if(temp.getData() == numberToChange) {
                temp.setData(changeVal);
            }
            temp = temp.getNext();
        }
    }

    public Boolean compare(CustomLinkedList list){
        Boolean isListsIdentical = true;

        CustomNode headListToCompare = list.getHead();
        CustomNode temp = head;

        while (temp != null) {
            if(isListsIdentical && temp.getData() != headListToCompare.getData()) {
                isListsIdentical = false;
            }
            temp = temp.getNext();
            if(headListToCompare.getNext() != null) {
                headListToCompare = headListToCompare.getNext();
            }
        }
        return isListsIdentical;
    }

    public CustomLinkedList getCompareList(CustomLinkedList list){
        CustomLinkedList listToReturn = new CustomLinkedList();

        CustomNode headListToCompare = list.getHead();
        CustomNode temp = head;

        while (temp != null) {
            if(temp.getData() != headListToCompare.getData()) {
                listToReturn.addElement(temp.getData());
                listToReturn.addElement(headListToCompare.getData());
            }else{
                listToReturn.addElement(temp.getData());
            }

            temp = temp.getNext();
            if(headListToCompare.getNext() != null) {
                headListToCompare = headListToCompare.getNext();
            }
        }
        return listToReturn;
    }

    public void printList() {
        CustomNode tCustomNode = head;
        while (tCustomNode != null){
            System.out.print(tCustomNode.getData() + " ");
            tCustomNode = tCustomNode.getNext();
        }
        System.out.println();
    }
}
