package co.book.exam;

import java.util.List;
import java.util.Scanner;

import co.book.access.BookList;
import co.book.model.Book;

public class BookServiceFind implements BookService {

	public BookServiceFind() {
	}

	Scanner scanner = new Scanner(System.in);

	@Override
	public void execute(BookList books) {
		System.out.println("검색할 이름>");
		String content = scanner.next();

		List<Book> list = books.findName(content);

		for (Book l : list) {
			System.out.println(l);
		}
	}
}
