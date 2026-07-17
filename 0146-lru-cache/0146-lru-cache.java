class LRUCache {

    private int capacity;
    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node (0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.val;

        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            Node node = new Node(key, value);
            if(map.size()< this.capacity){
            insertAfterHead(node);
            
            } else {
                Node lru = tail.prev;
                deleteNode(lru);
                insertAfterHead(node);
                map.remove(lru.key);
            }
            map.put(key, node);
        } else {
            Node node = map.get(key);
            node.val = value;
            deleteNode(node);
            insertAfterHead(node);
        }
        
    }

    private void deleteNode(Node node){

        Node preNode = node.prev;
        Node nextNode = node.next;
        preNode.next = nextNode;
        nextNode.prev = preNode;

    }

    private void insertAfterHead(Node node){
        Node curr = head.next;
        head.next = node;
        node.next = curr;
        node.prev = head;
        curr.prev = node;
    }
}
class Node {
    int key;
    int val;

    Node prev;
    Node next;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
    }

}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */