package linkedlist.singly;

public class MyLinkedList<T> {
    private Node<T> headNode;
    private long size;

    public void add(T element) {
        if(headNode == null) {
            Node<T> headNode = new Node<>(element,null);
            this.headNode = headNode;
        } else {
            Node<T> tempNodeVisitor = headNode;
            while(tempNodeVisitor.getNextNode() != null) {
                tempNodeVisitor = tempNodeVisitor.getNextNode();
            }
            tempNodeVisitor.setNextNode(new Node<>(element,null));
        }
        size++;
    }

    public T remove(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size || this.size == 0) throw new IndexOutOfBoundsException();

        return (index == 0 ? removeFirstElementFromList() :
                (index == size-1) ? removeLastElementFromList() :
                        removeElementFromList(index));
    }
    public void printMyLinkedList() {
        Node<T> tempNodeVisitor = headNode;
        if(tempNodeVisitor != null) {
            while(tempNodeVisitor.getNextNode() != null) {
                System.out.println(tempNodeVisitor.getData());
                tempNodeVisitor = tempNodeVisitor.getNextNode();
            }
            System.out.println(tempNodeVisitor.getData());
        }
    }

    public Long size() {
        return this.size;
    }

    private T removeFirstElementFromList() {
        Node<T> tempNode = headNode;

        Node<T> deletedNode = headNode;
        tempNode = tempNode.getNextNode();
        headNode = tempNode;

        size--;
        return deletedNode.getData();
    }

    private T removeLastElementFromList() {
        Node<T> tempNodeVisitor = headNode;
        Node<T> deletedNode = null;
        while(tempNodeVisitor.getNextNode() != null) {
            tempNodeVisitor = tempNodeVisitor.getNextNode();
            if(isRemoveOperationApplicable(tempNodeVisitor)) {
                deletedNode = tempNodeVisitor.getNextNode();
                tempNodeVisitor.setNextNode(null);
                break;
            }
        }
        size--;
        return deletedNode.getData();
    }

    private T removeElementFromList(int index) {
        Node<T> tempNodeVisitor = headNode;
        Node<T> deletedNode = null;

        int tempCounter = 0;
        while(tempNodeVisitor.getNextNode() != null) {
            if(tempCounter == (index-1)) {
                deletedNode = tempNodeVisitor.getNextNode();
                tempNodeVisitor.setNextNode(tempNodeVisitor.getNextNode().getNextNode());
                break;
            }
            tempNodeVisitor = tempNodeVisitor.getNextNode();
            tempCounter++;

        }
        size--;
        return deletedNode.getData();
    }

    private boolean isRemoveOperationApplicable(Node<T> node) {
        return (node.getNextNode() != null && node.getNextNode().getNextNode() == null);
    }
}
