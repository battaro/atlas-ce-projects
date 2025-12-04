package com.saif.tr.w10.lec;

public class LectureExamplel10 {
    public static void main(String[] args) {

        Heap h = new Heap(10);
        h.add(40);
        h.add(20);
        h.add(60);
        h.add(10);
        h.add(50);

        h.printHeap();

        System.out.println("Removed: " + h.remove());
        h.printHeap();
    }
}

class Heap {

    private int[] heap;
    private int size;
    private int caps;

    Heap(int capacity) {
        this.caps = capacity;
        this.size = 0;
        heap = new int[caps];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int data) {
        heap[size] = data;
        heapifyUp(size);
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }

        int value = heap[0];
        size--;
        heap[0] = heap[size];
        heapifyDown(0);

        return value;
    }

    //Heapify UP and Down.
    private void heapifyUp(int index) {
        if (index == 0)
            return; // base case

        int parent = (index - 1) / 2;

        if (heap[index] > heap[parent]) {
            swap(index, parent);
            heapifyUp(parent); // recursive call
        }
    }


    private void heapifyDown(int parent) {

        int left = parent * 2 + 1;
        int right = parent * 2 + 2;

        if (left >= size) {
            return; // no children
        }

        int maxChild = left;

        if (right < size && heap[right] > heap[left]) {
            maxChild = right;
        }

        if (heap[parent] < heap[maxChild]) {
            swap(parent, maxChild);
            heapifyDown(maxChild);
        }
    }

    //Helper methods
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
