package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/BookSelect")
public class BoughtComicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoughtComicServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		String title = request.getParameter("title");
//		String authorName = request.getParameter("authorName");
//		String introduction = request.getParameter("introduction");
//		String categoryId =request.getParameter("categoryId");
//		Timestamp purchaseTimestamp = (Timestamp) request.getAttribute("purchaseTimestamp");
//		String imageDate = request.getParameter("imageDate");
		String comicId = request.getParameter("comicId");

		CommonMethod.changeInteger(comicId);

//		CommonMethod.changeInteger(categoryId);


		ComicInfoService cis = new ComicInfoService();
		ComicInfo comicInfo = cis.findComicInfo(CommonMethod.changeInteger(comicId));

		request.setAttribute("bookhelf", comicInfo);


		//		ComicInfo cond = new ComicInfo();
		//		try {
		//			cond.setId(Integer.parseInt(comicId));
		//			cond.setId(Integer.parseInt(categoryId));
		//		} catch (NumberFormatException e) {
		//			// do nothing
		//		}
		//		cond.setName(name);
		//		cond.setTelephone(tel);
		//
		//		ComicInfoDao comicInfoDao = new ComicInfoDao();
		//		List<ComicInfo> list = comicInfoDao.find(cond);
		//
		//		if (list.isEmpty()) {
		//			request.setAttribute("errmsg", "入力されたデータはありませんでした");
		//			request.getRequestDispatcher("select.jsp").forward(request, response);
		//		} else {
		//			request.setAttribute("userlist", list);
		//			request.getRequestDispatcher("Book001.jsp").forward(request, response);
	}
}

