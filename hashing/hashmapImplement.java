package hashing;

import java.util.*;
public class hashmapImplement {
    static class HashMap<K,V>{ //generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private LinkedList<Node> buckets[] ; // HashMap
        private int N; //number of buckets

        public HashMap(){
            n = 0;
            N = 4;
            buckets = new LinkedList[4];

            for(int i = 0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashValue(K key){
            int bi = key.hashCode();
            return (Math.abs(bi)) % N;
        }

        private int searchKey(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> old[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node n = ll.get(j);
                    put(n.key, n.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashValue(key);
            int di = searchKey(key,bi);

            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node n = buckets[bi].get(di);
                n.value = value;
            }

            double lambda = (double) n/N; //threshold value
            if(lambda > 2.0){
                rehash();
            }
        }
        public V get(K key){
            int bi = hashValue(key);
            int di = searchKey(key,bi);
            if(di == -1){
                return null;
            }else{
                Node n = buckets[bi].get(di);
                return n.value;
            }
        }
        public boolean contains(K key){
            int bi = hashValue(key);
            int di = searchKey(key,bi);

            if(di == -1){
                return false;
            }else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashValue(key);
            int di = searchKey(key,bi);

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                this.n -=1;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }

            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("Japan", 100);
        map.put("USA", 90);
        map.put("China", 240);
        ArrayList<String> k = map.keySet();
        System.out.println(k);

        System.out.println(map.get("Japan"));
        System.out.println(map.contains("India"));
        System.out.println(map.remove("USA"));

        k = map.keySet();
        System.out.println(k);
    }
}
