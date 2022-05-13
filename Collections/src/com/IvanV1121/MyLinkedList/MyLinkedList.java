package com.IvanV1121.MyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    int size = 0;
    Node<E> first = null;
    Node<E> last = null;

    public MyLinkedList() {}

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> findNode(int index) {
        Node<E> fNode;
        if (index < size / 2) {
            fNode = first;
            for (int i = 0; i < index; i++) {
                fNode = fNode.next;
            }
        } else {
            fNode = last;
            for (int i = size - 1; i > index; i--) {
                fNode = fNode.prev;
            }
        }
        return fNode;
    }

    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node<>(element);
            last = first;
        } else {
            last.next = new Node<>(element, last, null);
            last = last.next;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Out of range!");
        }
        if (size == 0) {
            first = new Node<E>(element);
            last = new Node<E>(element);
        } else if (index == size) {
            add(element);
        } else {
            if (index == 0) {
                first = new Node<>(element, null, first);
            } else {
                Node<E> fNode = findNode(index).prev;
                fNode.next.prev = new Node<>(element, fNode, fNode.next);
                fNode.next = new Node<>(element, fNode, fNode.next);
            }
            size++;
        }
    }

    @Override
    public void clear() {
        for (Node<E> currNode = first; currNode != null; ) {
            Node<E> next = currNode.next;
            currNode.element = null;
            currNode.next = null;
            currNode.prev = null;
            currNode = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        boolean isElementIndex = (index >= 0 || index < size);
        if (!isElementIndex) {
            throw new IndexOutOfBoundsException("Out of range!");
        }
        return findNode(index).element;
    }

    @Override
    public int indexOf(E currElement) {
        int index = 0;
        if (currElement == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (currElement.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Out of range!");
        }
        E removeElem;
        if (index == 0) {
            removeElem = first.element;
            Node<E> newFirstNode = first.next;
            first.next.prev = null;
            first.element = null;
            first.next = null;
            first = newFirstNode;
        } else if (index == size - 1) {
            removeElem = last.element;
            Node<E> newLastNode = last.prev;
            last.prev.next = null;
            last.element = null;
            last.prev = null;
            last = newLastNode;
        } else {
            Node<E> currentNode = findNode(index);
            removeElem = currentNode.element;
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            currentNode.element = null;
            currentNode.prev = null;
            currentNode.next = null;
        }
        size--;
        return removeElem;
    }

    @Override
    public E set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Out of range!");
        }
        E replacedValue = findNode(index).element;
        Node<E> currentNode = findNode(index);
        currentNode.element = element;
        return replacedValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.element;
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.element;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> currentNode = first;
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stringBuilder.append((currentNode.element) + ", ");
            } else {
                stringBuilder.append(currentNode.element);
            }
            currentNode = currentNode.next;
        }
        return stringBuilder.toString()+ "]";
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private Node<E> node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Node<E> currentNode = node;
                node = node.next;
                return currentNode.element;
            }
        };
        return iterator;
    }
}


