public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.next = item;
        return this.next;
    }

    @Override
    ListItem previous() {
        return this.previous;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
