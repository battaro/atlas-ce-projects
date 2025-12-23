package com.saif.tr.w11.lab;

public class Week11Lab {
    public static void main(String[] args) {
        CustomHashMap myMap = new CustomHashMap(201);
        myMap.putLecture("seyf", 9);
        myMap.putLecture("saber", 8);
        myMap.putLecture("sila", 7);
        myMap.putLecture("sila", 6);
        myMap.putLecture("asli", 5);

        myMap.printlist();

    }

}

class CustomHashMap {
    private Entry table[];
    private int capacity;

    CustomHashMap(int capacity) {
        this.capacity = capacity;
        table = new Entry[capacity];
    }

    private int hash(String key)
    {
        int sum = 0;
        for (int i = 0; i < key.length(); i++)
        {
            sum += key.charAt(i);
        }
        return sum % capacity;
    }

    public void putMe(String key, int value) {
        int hash = hash(key);

        if (table[hash] == null) {
            table[hash] = new Entry(key, value);
            return;
        }

        Entry current = table[hash];

        while (true) {
            if (current.key.equals(key)) {
                current.hylym = value; // update
                return;
            }

            if (current.next == null) {
                current.next = new Entry(key, value); // add at end
                return;
            }

            current = current.next;
        }

    }

    public void putLecture(String key, int value) {
        int index = hash(key);
        Entry entry = table[index];
        while (entry != null) {
            if (key.equals(entry.key)) {
                entry.hylym = value;
                return;

            }
            entry = entry.next;
        }
        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }

    public void printlist() {
        for (int i = 0; i < capacity; i++) {
            Entry current = table[i];

            if (current != null) {
                System.out.print("Index " + i + ": ");

                while (current != null) {
                    System.out.print("(" + current.key + ", " + current.hylym + ") -> ");
                    current = current.next;
                }

                System.out.println("null");
            }
        }
    }

}

class Entry {
    String key;
    int hylym; // how much you like your major (out of 10)
    Entry next;

    Entry(String key, int value) {
        this.key = key;
        this.hylym = value;
        this.next = null;
    }
}
