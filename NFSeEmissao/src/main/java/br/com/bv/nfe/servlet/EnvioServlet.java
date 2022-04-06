package br.com.bv.nfe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bv.nfe.controle.EnvioControle;
import br.com.bv.vo.ServicesVO;

/**
 * Servlet implementation class EnvioServlet
 */
public class EnvioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnvioServlet() {
        super();
        // TODO Auto-generated constructor stub       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		EnvioControle eCtrl = new EnvioControle();		
		String consultaServiceURL = request.getParameter("consultaServiceURL");
		String envioNFeServiceURL = request.getParameter("envioNFeServiceURL");
		String participanteServiceURL = request.getParameter("participanteServiceURL");
		String itemServiceURL = request.getParameter("itemServiceURL");
		String unidadeServiceURL = request.getParameter("unidadeServiceURL");
		String natOpServiceURL = request.getParameter("natOpServiceURL");
		String paramIcmsServiceURL = request.getParameter("paramIcmsServiceURL");
		String infoComplDocServiceURL = request.getParameter("infoComplDocServiceURL");
		
		ServicesVO servicesVO = new ServicesVO();
		servicesVO.setConsultaServiceURL(consultaServiceURL);
		servicesVO.setEnvioNFeServiceURL(envioNFeServiceURL);
		servicesVO.setInfoComplDocServiceURL(infoComplDocServiceURL);
		servicesVO.setItemServiceURL(itemServiceURL);
		servicesVO.setNatOpServiceURL(natOpServiceURL);
		servicesVO.setParamIcmsServiceURL(paramIcmsServiceURL);
		servicesVO.setParticipanteServiceURL(participanteServiceURL);
		servicesVO.setUnidadeServiceURL(unidadeServiceURL);
		
		eCtrl.inicializaProcesso(servicesVO);
	}

}
