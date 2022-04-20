public class NodeString {
    private String value;
    private NodeString nextNode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodeString getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeString nextNode) {
        this.nextNode = nextNode;
    }

    public NodeString() {
        this.value = "";
        this.nextNode = null;
    }

    public NodeString(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public NodeString(String value, NodeString nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
