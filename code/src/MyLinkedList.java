/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */

import java.util.Hashtable;

/**
 * @author Zen
 * @version 1.0: MyLinkedList.java, v 0.1 2019/09/03 13:53 Zen Exp $
 */
public  class MyLinkedList {
    Node head = null;
    //新增节点
    public void addNode(int d) {
        Node newNode = new  Node(d);
        if(head == null) {
            head = newNode;
            return ;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        //add node to end
        tmp.next = newNode;
    }
    public Boolean deleteNode(int index) {
        //删除元素位置不合理
        if(index <  1 || index > length()){
            return false;
        }
        //删除链表第一个元素
        if( index == 1){
            head = head.next;
            return true;
        }
        //删除链表中的其他元素
        int i = 2;
        Node preNode = head;
        Node curNode = preNode.next;
        while(curNode != null){
            if( i == index ) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return  true;
    }
    //返回结点长度
    public int length(){
        int length = 0;
        Node tmp = head;
        while(tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }

    //对链表进行排序，返回排序后的头节点
    public Node orderList(){
        Node nextNode = null;
        int tmp = 0;
        Node curNode = head;
        while( curNode.next != null) {
            nextNode = curNode.next;
            while( nextNode != null) {
                if(curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            curNode =curNode.next;
        }
        return head;
    }

    public void printList() {
        Node tmp = head;
        while( tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
    public void deleteDuplecate(Node head) {
        Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
        Node tmp = head;
        Node pre = null;
        while(tmp != null) {
            if(table.containsKey(tmp.data)) {
                pre.next = tmp.next;
            }
            else{
                table.put(tmp.data,1);
                pre = tmp;
            }
            tmp = tmp.next;
        }
    }

    public static void main(String args[]) {
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        System.out.println("listLen" + list.length());
        System.out.println("Before Order");
        list.printList();
        list.orderList();
        System.out.println("After Order");
        list.printList();
    }
}