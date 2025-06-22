//Scenario 8: Mobile Application Development
//Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

abstract class App{
    private String name;
    private int size;

    public App(String name , int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    abstract void open();
    abstract void close();
}

class ChatApp extends App{
    public ChatApp(String name , int size){
        super(name, size);
    }

    @Override
    public void open(){
        System.out.println("The name of this app is :- "+super.getName());
        System.out.println("The size of this app is :- "+super.getSize()+" Mbs.");
        System.out.println("This app is open now.");
    }

    @Override
    public void close(){
        System.out.println("This app is close now.");
        System.out.println("---------------------------------------------------------------");
    }
}

class PhotoEditingApp extends App{
    public PhotoEditingApp(String name , int size){
        super(name, size);
    }

    @Override
    public void open(){
        System.out.println("The name of this app is :- "+super.getName());
        System.out.println("The size of this app is :- "+super.getSize()+" Mbs.");
        System.out.println("This app is open now.");
    }

    @Override
    public void close(){
        System.out.println("This app is close now.");
        System.out.println("---------------------------------------------------------------");
    }
}

public class Task8 {
    public static void main(String[] args) {
        ChatApp whattApp = new ChatApp("WhattsApp", 67);
        PhotoEditingApp picArt = new PhotoEditingApp("PicsArt", 45);
        whattApp.open();
        whattApp.close();

        picArt.open();
        picArt.close();
    }
}