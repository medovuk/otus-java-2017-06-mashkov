package ru.otus.simplecache.cache;

public enum  MemoryManagement{
    FIFO((elements) -> elements.keySet().iterator().next()),
    LIFO((elements -> elements.keySet().toArray()[elements.size()-1]));

    MemoryManager manager;

    MemoryManagement(MemoryManager manager){
        this.manager = manager;
    }




}
