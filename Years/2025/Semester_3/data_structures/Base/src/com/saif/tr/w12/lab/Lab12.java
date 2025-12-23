package com.saif.tr.w12.lab;
public class Lab12
{
    public static void main(String[] args)
    {
        HMap myMap = new HMap(10);
        myMap.put("sude", 9);
        myMap.put("saif",10);
        myMap.put("fais", 1);

        myMap.printList();
        System.out.println();

        myMap.remove("sude");

        myMap.printList();



    }

}

class HMap
{
    private MNode table[];
    private int capacity;

    HMap(int capacity)
    {
        this.capacity = capacity;
        table = new MNode[capacity];
    }

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
        MNode entry = table[index];
        while (entry != null)
        {
            if (key.equals(entry.key))
            {
                entry.hylym = value;
                return;

            }
            entry = entry.next;
        }
        MNode newEntry = new MNode(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }

    MNode remove(String key)
    {
        if (containKey(key))
        {
            System.out.println("A data with this " + key + " not found");
            return null;
        }
        int index = hash(key);
        MNode current = table[index];
        MNode prev = null;

        while (current != null)
        {
            if (current.key.equals(key))
            {
                if (prev == null)
                    table[index] = current.next;
                else
                    prev.next = current.next;
                return current;
            }

            prev = current;
            current = current.next;
        }

        return null;
    }

    int get(String key)
    {
        if (containKey(key))
        {
            System.out.println("A data with this " + key + " not found");
            return -1;
        }
        int index = hash(key);
        MNode current = table[index];
        while (current != null)
        {
            if(current.key.equals(key))
            {
                return current.hylym;
            }
            current = current.next;
        }
        return -1;
    }

    boolean containKey(String key)
    {
        int index = hash(key);
        MNode current = table[index];
        while(current != null)
        {
            if(current.key.equals(key))
                return true;
            current = current.next;
        }
        System.out.println("A data with this " + key + " not found");
        return false;
    }




    void printList()
    {
        for (int i = 0; i < capacity; i++)
        {
            MNode current = table[i];

            if (current != null)
            {
                System.out.print("Index " + i + ": ");
                while (current != null)
                {
                    System.out.print("(" + current.key + ", " + current.hylym + ") -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }

}

class MNode
{
    String key;
    int hylym; // how much you like your major (out of 10)
    MNode next;

    MNode(String key, int value)
    {
        this.key = key;
        this.hylym = value;
        this.next = null;
    }
}

