public class ListString {
    private NodeString head;

    public NodeString getHead() {
        return head;
    }

    public void setHead(NodeString head) {
        this.head = head;
    }


    public ListString() {
        this.head = null;
    }

    public ListString(NodeString head) {
        this.head = head;
    }

    public void printList() {
        NodeString nodeTmp = this.head;
        while (nodeTmp != null) {
            System.out.println(nodeTmp.getValue());
            nodeTmp = nodeTmp.getNextNode();
        }
    }

    public void push(String value) {
        NodeString nodeTmp = this.head;
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        nodeTmp.setNextNode(new NodeString(value));
    }
}
