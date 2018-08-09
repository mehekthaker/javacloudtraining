package com.cg.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.book.Book;
import com.cg.bookService.BookService;
import com.cg.bookService.BookServiceImpl;


@WebServlet("*.app")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookService service = new BookServiceImpl();
   
    public AppController() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		
		switch(action) {
		
		case "/refresh.app":
			
			service.addBooks();
			
			Collection<Book> book = service.viewAllBooks();
			request.setAttribute("books", book);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
			dispatcher.forward(request, response);
			
			break;
			
		case "addtocart.app":
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
