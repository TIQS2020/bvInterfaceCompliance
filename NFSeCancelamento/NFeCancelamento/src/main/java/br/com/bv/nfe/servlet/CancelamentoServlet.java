package br.com.bv.nfe.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bv.nfe.controle.CancelamentoControle;
import br.com.bv.nfe.vo.ServicesVO;

/**
 * Servlet implementation class CancelamentoServlet
 */
public class CancelamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelamentoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CancelamentoControle cancelCtrl = new CancelamentoControle();
		String consultaServiceURL = request.getParameter("consultaServiceURL");
		String cancelamentoServiceURL = request.getParameter("cancelamentoServiceURL");
		
		ServicesVO servicesVO = new ServicesVO();
		servicesVO.setCancelamentoServiceURL(cancelamentoServiceURL);
		servicesVO.setConsultaServiceURL(consultaServiceURL);
		
		cancelCtrl.inicializaProcesso(servicesVO);
		
	}

}
