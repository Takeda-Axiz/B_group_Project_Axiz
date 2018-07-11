package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		SelectService selectService = new SelectService();

		List<Comic> idComicList = selectService.findForId(comicId);

		String comicTitle = idComicList.get(0).getComic_title();
		Integer numberOfTurns = idComicList.get(0).getNumber_of_turns();
		double comprehensiveEvaluation = idComicList.get(0).getComprehensive_evaluation();
		String authorName = idComicList.get(0).getAuthor_name();
		String imageData = idComicList.get(0).getImage_data();

		Integer basePrice = idComicList.get(0).getBaseprice();
		double tax = idComicList.get(0).getTax_id.getTax();
		Integer price = (int) (basePrice * tax);

		String releaseDate = (String)idComicList.get(0).getRelease_date();
		String category = idComicList.get(0).getCategory_id.getCategory();
		String introduction = idComicList.get(0).getIntroduction();

		session.setAttribute("comicId", comicId);
		session.setAttribute("comicTitle", comicTitle);
		session.setAttribute("numberOfTurns", numberOfTurns);
		session.setAttribute("comprehensiveEvaluation", comprehensiveEvaluation);
		session.setAttribute("authorName", authorName);
		session.setAttribute("imageData", imageData);
		session.setAttribute("price", price);
		session.setAttribute("releaseDate", releaseDate);
		session.setAttribute("category", category);
		session.setAttribute("introduction", introduction);

		request.getRequestDispatcher("selectResultInfo.jsp").forward(request, response);
	}
}
