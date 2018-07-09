package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminComicRegisterServlet
 */
@WebServlet("/AdminComicRegister")
public class AdminComicRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminComicRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		doGet(request, response);
//
//		//リクエスト、レスポンス時の文字化け防止
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("index.jsp; charset=UTF-8");
//		HttpSession session = request.getSession();
//
//		//フォームから入力された値を取得
//				String title = request.getParameter("name");
//				String numberOfTurns = request.getParameter("numberOfTurns");
//				String category = request.getParameter("category");
//				String price = request.getParameter("price");
//				String publisher = request.getParameter("publisher");
//				String release_date = request.getParameter("release_date");
//				String front = request.getParameter("front");
//				String URL = request.getParameter("URL");
//				String author = request.getParameter("author");
//				String summary = request.getParameter("summary");
//
//					Integer Price =parseInt(price);
//
//					        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//			            Date date = (Date) sdf.parse(release_date);
//
//			            System.out.println(date.toString());
//
//
//				if((title==null || numberOfTurns==null || category==null|| price==null || publisher==null|| front==null|| URL==null || date==null|| author==null )
//						||("".equals(title))||("".equals(numberOfTurns))||("".equals(category))||("".equals(price))||("".equals(publisher))||("".equals(front)) ||("".equals(URL))
//						||("".equals(date))||("".equals(author))) {
//					request.setAttribute("msg", "必須項目が未入力です。");
//					request.getRequestDispatcher("ComicInsert.jsp").forward(request, response);
//					return;
//
//				}else {
//
////					session.setAttribute("newtitle", title);
////					session.setAttribute("newcategory", category);
////					session.setAttribute("newprice", price);
////					session.setAttribute("newpublisher", publisher);
////					session.setAttribute("newfront", front);
////					session.setAttribute("newfront", URL);
////					session.setAttribute("newrelease_date", release_date);
////					session.setAttribute("newauthor", author);
////					session.setAttribute("newsummary", summary);
//
//
//
//
//					//Daoの登録メソッド呼び出し
//					Connection con=DbUtil.getConnection();
//					ComicInfoDao cid =new ComicInfoDao();
//					cid.insert(title,numberOfTurns,category,Price,publisher,front,URL,date,author,summary);
//
//					request.getRequestDispatcher("taskinsertResult.jsp").forward(request, response);
//				}
//
//
//
//
//
//	}
}
