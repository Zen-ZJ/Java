# ���ݽṹ���㷨����

### ����

##### ������
* �洢�ص㣺����������һ��洢��Ԫ���洢�������е�����Ԫ�أ����˴洢Ԫ��ֵ֮�⣬���洢�˺��Ԫ�ص���Ϣ��
```java
class Node {
    Node next = null;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
```
* ��������Ҫ�Ĳ��������������в����ɾ��Ԫ��

* ���ʵ�ֵ��������ɾ�������
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
    //�����ڵ�
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
        //ɾ��Ԫ��λ�ò�����
        if(index <  1 || index > length()){
            return false;
        }
        //ɾ�������һ��Ԫ��
        if( index == 1){
            head = head.next;
            return true;
        }
        //ɾ�������е�����Ԫ��
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
    //���ؽ�㳤��
    public int length(){
        int length = 0;
        Node tmp = head;
        while(tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }

    //������������򣬷���������ͷ�ڵ�
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
* ��δ�������ɾ���ظ�����
��δ�������ɾ���ظ������ݣ��������뵽�ķ������Ǳ��������ѱ�������ֵ�洢��һ��Hashtable�У��ڱ��������У�
����ǰ���ʵ�ֵ��Hashtable���Ѿ����ڣ���˵���������ʱ�ظ��ģ���˾Ϳ���ɾ����
* �ŵ㣺ʱ�临�ӶȽϵ�
* ȱ�㣺��Ҫ����Ĵ洢�ռ�
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
* ������˼·�����������˫��ѭ����������ѭ��������������������ѭ����ǰ�����Ľ��Ϊcur����ѭ����cur��ʼ����
����������cur��ָ����ֵ��ͬ����ɾ������ظ���㡣
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

* ����ҳ��������еĵ�����k��Ԫ��

* ˼·һ���ȱ������� ���������n��Ȼ�󽫵�����k����ת��Ϊ������n - k ��
* ˼·��������k��Ԫ�أ����Ƿ񵽴���β��Ч��̫��
* ˼·������������ָ�룬һ������ָ�롣
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
        System.out.println("k���Ϸ�");
        return null;
    }
    while(p1.next != null) {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p2;
}
```

* ���ʵ������ķ�ת
* ��δ�β��ͷ���������
* ���Ѱ�ҵ�������м���
* ��μ��һ�������Ƿ��л�
* ����ڲ�֪��ͷָ��������ɾ��ָ�����
* ����ж����������Ƿ��ཻ
