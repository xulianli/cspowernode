package com.cspowernode.practice;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/31 11:12
 * @Description
 * 单链表的底层实现
 */
public class SingleNodeList {
    private static class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
    private Node headNode;
    private int nodeSize;

    /**
     * 要先对下标进行非法判断
     * 根据下标来获取对应的节点对象，我们可以通过首节点然后使用
     * 循环的方式来找到你指定下标的对应节点对象
     * @param index
     * @return
     */
    public Node get(int index){
        Node targetNode = headNode;
        if (index<0||index>nodeSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            targetNode=targetNode.next;
        }
        return targetNode;
    }

    /**
     * 删除指定下标的节点
     * 1.要对下标进行非法判断
     * 2.如果你要删除的index是0，那么直接修改首节点为原始首节点的下一个节点；
     * 3.如果你要删除的index是size-1，那么直接找到最后一个节点的上一个节点，修改其next为null即可；
     * 4.如果你要删除的是其他位置，那么找到删除位置的上一个节点和下一个节点，把上一个节点的next改为
     * 下一个节点即可
     * 记得size--
     * @param index
     * @return 返回被删掉的节点
     */
    public Node remove(int index){
        if (index<0||index>nodeSize){
            throw new ArrayIndexOutOfBoundsException();
        }else if(index==0){
            Node oldHeadNode = headNode;
            headNode = oldHeadNode.next;
            nodeSize--;
            return oldHeadNode;
        }else if(index == nodeSize-1){
            Node lastNode = get(index-1);
            lastNode.next = null;
            nodeSize--;
            return lastNode;
        }else {
            Node prevNode = get(index-1);
            prevNode.next = get(index+1);
            nodeSize--;
            return get(index);
        }
    }

    /**
     * 修改指定下标的节点的内容
     * @param index
     * @param obj
     */
    public void set(int index, Object obj){
        Node newNode = new Node(obj);
        if (index<0||index>nodeSize) {
            throw new ArrayIndexOutOfBoundsException();
        }else if(index==0){
            Node nextNode = get(1);
            headNode = newNode;
            headNode.next = nextNode;
        }else if (index == nodeSize-1){
            get(index-1).next = new Node(obj);
        }else if (index<nodeSize-1){
            Node prevNode = get(index-1);
            Node nextNode = get(index+1);
            prevNode.next = newNode;
            newNode.next = nextNode;
        }
    }
    //写出来的可以写这个
    public void add(int index, Object obj){
        Node newNode = new Node(obj);
        if (index<0||index>nodeSize) {
            throw new ArrayIndexOutOfBoundsException();
        }else if(index==0){
            newNode.next = headNode;
            headNode = newNode;
        }else {
            Node oldNode = get(index);
            Node preNode = get(index-1);
            preNode.next = newNode;
            newNode.next = oldNode;
        }
        nodeSize++;
    }

    /**
     * 添加元素到链表的最后一个位置，请注意，如果链表为空，那么该元素
     * 所包装的节点就是链表的唯一节点，设置其为首节点即可，长度加1；如果
     * 链表不为空，那么我们需要通过遍历的方式来找到最后一个节点，然后更新
     * 最后一个节点的next属性为新节点，然后长度加1
     * @param obj 添加的数据
     */
    public void add(Object obj){
        //0.把数据包装成Node节点
        Node newNode = new Node(obj);
        //1.当前链表为空,也就是第一次添加元素的时候
        if(nodeSize==0){
            //1.1.此时首节点就是你加进来的节点
            headNode = newNode;
        //2.如果链表不为空，就代表我需要拿到最后一个节点，然后设置其next属性为新节点
        }else{
            //2.1.定义当前节点为首节点
            Node currentNode = headNode;
            //2.2.通过循环来找到最后一个节点
            for (int i = 0; i < nodeSize-1; i++) {
                //2.3.不断通过循环来拿到后面的节点
                currentNode = currentNode.next;
            }
            //2.4.更新最后一个节点的next属性为新节点
            currentNode.next = newNode;
        }
        //3.长度加1
        nodeSize++;
    }

    public int size(){
        return nodeSize;
    }
    public Node getFirst(){
        return headNode;
    }

    @Override
    public String toString() {
        //1.定义一个和链表长度对等的数组
        String [] data = new String[nodeSize];
        //2.拿到首节点
        Node currentNode = headNode;
        //3.使用循环拿到所有的节点
        for (int i = 0; i < nodeSize; i++) {
            //4.把当前节点的数据放入到数组中去
            data[i] = currentNode.data.toString();
            //5.获取当前节点的下一个节点，然后赋值给当前节点变量名
            currentNode = currentNode.next;
        }
        return Arrays.toString(data);
    }
}
