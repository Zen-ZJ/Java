# 数据结构和算法基础

### 链表

##### 单链表
* 存储特点：可以用任意一组存储单元来存储单链表中的数据元素，除了存储元素值之外，还存储了后继元素的信息。
```java
class Node {
    Node next = null;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
```
* 链表最重要的操作就是向链表中插入和删除元素

* 如何实现单链表的增删排序操作
```java
/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */

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
```
* 如何从链表中删除重复数据
如何从链表中删除重复的数据，最容易想到的方法就是遍历链表，把遍历到的值存储到一个Hashtable中，在遍历过程中，
若当前访问的值在Hashtable中已经存在，则说明这个数据时重复的，因此就可以删除。
* 优点：时间复杂度较低
* 缺点：需要额外的存储空间
```java
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
```
* 方法二思路：对链表进行双重循环遍历，外循环正常遍历链表，假设外循环当前遍历的结点为cur，内循环从cur开始遍历
，若碰到与cur所指向结点值相同，则删除这个重复结点。
```java
public void deleteDuplecate(Node head) {
    Node p = head ;
    while( p != null ){
        Node q = p;
        while( q.next != null){
            if(p.data == q.next.data) {
                q.next = q.next.next;
            }else{
                q = q.next;
            }
           
        }
         p = p.next;
    }
}
```

* 如何找出单链表中的倒数第k个元素

* 思路一：先遍历链表 求出链表长度n，然后将倒数第k个，转换为倒数第n - k 个
* 思路二：遍历k个元素，看是否到达链尾，效率太低
* 思路三：设置两个指针，一个先行指针。
```java
public Node findElem(Node head, int k) {
    if( k < 1) {
        return null;
    }
    Node p1 = head;
    Node p2 = head;
    for(int i = 0; i < k-1 && p1!=null;i++){
        p1 = p1.next;
    }
    if(p1 == null) {
        System.out.println("k不合法");
        return null;
    }
    while(p1.next != null) {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p2;
}
```

* 如何实现链表的反转
* 如何从尾到头输出单链表
* 如何寻找单链表的中间结点
* 如何检测一个链表是否有环
* 如何在不知道头指针的情况下删除指定结点
* 如何判断两个链表是否相交
