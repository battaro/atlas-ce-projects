package com.saif.tr.w12.lec;


public class Lecture12
{
    public static void main(String[] args)
    {

    }
}
class HMap
{
    private MNode htable[];
    private int capacity;
    HMap(int capacity)
    {
        this.capacity = capacity;
        htable = new MNode[this.capacity];
    }

    //get the hash of a certain key
    int hash(String key)
    {
        int sum = 0;
        for (int i = 0; i < key.length(); i++)
        {
            sum += key.charAt(i);
        }
        return sum % this.capacity;
    }

    void put(String key, int value)
    {
        int index = hash(key);
        MNode entry = htable[index];
        while (entry != null) {
            if (key.equals(entry.key)) {
                entry.hylym = value;
                return;

            }
            entry = entry.next;
        }
        MNode newEntry = new MNode(key, value);
        newEntry.next = htable[index];
        htable[index] = newEntry;
    }
}

class MNode
{
    String key;
    int hylym; // how much you like your major (out of 10)
    MNode next;

    MNode(String key, int value) {
        this.key = key;
        this.hylym = value;
        this.next = null;
    }
}
