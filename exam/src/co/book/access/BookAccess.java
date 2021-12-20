package co.book.access;

import java.util.List;

import co.book.model.Book;

public abstract class BookAccess {

	public abstract void insert(Book book);

	public abstract List<Book> findName(String name);
}
