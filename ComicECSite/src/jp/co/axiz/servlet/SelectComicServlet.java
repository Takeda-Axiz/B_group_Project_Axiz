package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class SelectComicServlet
 */
@WebServlet("/selectComic")
public class SelectComicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		Integer comicId = (Integer) session.getAttribute("comic_id");

		ComicInfoService cIS = new ComicInfoService();

		ComicInfo comicInfo = cIS.findComicInfo(comicId);

		String comicTitle = comicInfo.getComicTitle();
		Integer numberOfTurns = comicInfo.getNumberOfTurns();
		double comprehensiveEvaluation = comicInfo.getComprehensiveEvaluation();
		String authorName = comicInfo.getAuthorName();
		String imageData = comicInfo.getImageData();

		Integer basePrice = comicInfo.getBasePrice();
//		double tax = comicInfo.getTaxId.getTax();
//		Integer price = (int) (basePrice * tax);

		String releaseDate = (String)comicInfo.getReleaseDate();
		String category = comicInfo.getCategory_id.getCategory();
		String introduction = comicInfo.getIntroduction();

		session.setAttribute("comicId", comicId);
		session.setAttribute("comicTitle", comicTitle);
		session.setAttribute("numberOfTurns", numberOfTurns);
		session.setAttribute("comprehensiveEvaluation", comprehensiveEvaluation);
		session.setAttribute("authorName", authorName);
		session.setAttribute("imageData", imageData);
//		session.setAttribute("price", price);
		session.setAttribute("releaseDate", releaseDate);
		session.setAttribute("category", category);
		session.setAttribute("introduction", introduction);

		request.getRequestDispatcher("selectResultInfo.jsp").forward(request, response);
	}
}
