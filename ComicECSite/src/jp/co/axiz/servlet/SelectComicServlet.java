package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class SelectComicServlet
 */
@WebServlet("/SelectComic")
public class SelectComicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String comicId = request.getParameter("comicId");

		CommonMethod.changeInteger(comicId);

		ComicInfoService cIS = new ComicInfoService();

		JoinComicInfo jComicInfo = cIS.findComicCtPbInfo(CommonMethod.changeInteger(comicId));

		System.out.println(jComicInfo.getComicId());

		request.setAttribute("comic", jComicInfo);

		request.getRequestDispatcher("ComicDetail.jsp").forward(request, response);
	}
}
