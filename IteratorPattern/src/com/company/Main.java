package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("网络是怎样连接的"));
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("算法新解"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
