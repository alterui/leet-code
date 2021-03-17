package com.lr.leetcode.number146;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liurui
 * @date 2021/2/26 9:22 上午
 */
class LRUCache {
    private final int capacity;
    private final LRULinkList<Integer,Integer> linkList;
    private final Map<Integer, Node<Integer,Integer>> map;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.linkList = new LRULinkList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            Node<Integer,Integer> node = map.get(key);
            linkList.removeNode(node);
            linkList.addHead(node);

            return node.value;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node<Integer,Integer> node = map.get(key);
            node.value = value;
            map.put(key, node);
            linkList.removeNode(node);
            linkList.addHead(node);
        } else {
            if (capacity == map.size()) {
                Node<Integer,Integer> node = linkList.tail.prev;
                linkList.removeNode(node);
                map.remove(node.key);
            }

            Node<Integer,Integer> curNode = new Node<>(key, value);
            linkList.addHead(curNode);
            map.put(key, curNode);


        }
    }


    static class LRULinkList<K,V>{
        private final Node<K,V> head;
        private final Node<K,V> tail;

        public LRULinkList() {
            head = new Node<>();
            tail = new Node<>();
            head.next = tail;
            tail.prev = head;
        }

        public void addHead(Node<K,V> node) {
            node.next = head.next;
            head.next.prev = node;
            node.prev = head;
            head.next = node;
        }

        public void removeNode(Node<K,V> node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node.next = null;
            node.prev = null;
        }


    }

    static class Node<K,V> {
        private K key;
        private V value;
        private Node<K,V> next;
        private Node<K,V> prev;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public Node(){

        }
    }
}

