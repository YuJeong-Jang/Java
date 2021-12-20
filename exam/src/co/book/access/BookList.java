package co.book.access;

import java.util.ArrayList;
import java.util.List;

import co.book.model.Book;

public class BookList extends BookAccess {

	public ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public List<Book> findName(String name) {
		List<Book> list = new ArrayList<Book>();
		for (Book b : books) {
			if (b.getName().contains(name)) {
				list.add(b);
			}
		}
		return list;
	}

	public void insert(Book friend) {
		books.add(friend);

	}
}
