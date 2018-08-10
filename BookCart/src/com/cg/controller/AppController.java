package com.cg.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.book.Book;
import com.cg.bookService.BookService;
import com.cg.bookService.BookServiceImpl;
import com.cg.cartlist.CartList;


@WebServlet("*.app")
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CartList cart;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		cart = new CartList();
	}
	private BookService service = new BookServiceImpl();
	//private CartList cart = new CartList();
   
    public AppController() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		
		System.out.println(action);
//		session.setAttribute("cartCount", cart.getCartCount());
//		session.setAttribute("cartView", cart.viewCart());
		
		switch(action) {
		
		case "/refresh.app":
			
			service.addBooks();
			
			Collection<Book> book = service.viewAllBooks();
			request.setAttribute("books", book);
//			session.setAttribute("cartCount", cart.getCartCount());
			request.setAttribute("cartView", service.viewCart());
			request.setAttribute("cartCount", service.getCartCount());
			System.out.println(cart);
			System.out.println("cart count="+service.getCartCount());
			System.out.println(request.getAttribute("cartCount"));
			System.out.println(request.getAttribute("cartView"));
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
			dispatcher.forward(request, response);
			
			break;
			
		case "/addtocart.app":
			int bookId = Integer.parseInt(request.getParameter("bookId"));
			service.addToCart(bookId);
			book = service.viewAllBooks();
			request.setAttribute("books", book);
			request.setAttribute("cartCount", service.getCartCount());
			request.setAttribute("cartView", service.viewCart());
			response.sendRedirect("refresh.app");
			
			break;
			
		case "/viewAll.app":
//			Collection<Book> books = service.viewCart();
//
//			request.setAttribute("books", books);
//			System.out.println(books);
			System.out.println("-------");
			response.sendRedirect("cartDetails.jsp");
			System.out.println("cart list is "+ service.viewCart());
			//dispatcher.forward(request, response);
			System.out.println("++++++++++");
			break;
			
		case "/remove.app":
			bookId = Integer.parseInt(request.getParameter("bookId"));
			service.deleteFromCart(bookId);
			response.sendRedirect("cartDetails.jsp");
			break;
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
