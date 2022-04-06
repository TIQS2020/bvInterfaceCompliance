package br.com.bv.nfe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bv.nfe.controle.EmissaoEFDControle;
import br.com.bv.nfe.vo.ServicesVO;

/**
 * Servlet implementation class EnvioServlet
 */
public class EmissaoEFDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmissaoEFDServlet() {
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
		EmissaoEFDControle eCtrl = new EmissaoEFDControle();		
		String consultaServiceURL = request.getParameter("consultaServiceURL");
		String envioNFeServiceURL = request.getParameter("envioNFeServiceURL");
		String participanteServiceURL = request.getParameter("participanteServiceURL");
		String itemServiceURL = request.getParameter("itemServiceURL");
		String unidadeServiceURL = request.getParameter("unidadeServiceURL");
		String natOpServiceURL = request.getParameter("natOpServiceURL");
		String paramIcmsServiceURL = request.getParameter("paramIcmsServiceURL");
		String infoComplDocServiceURL = request.getParameter("infoComplDocServiceURL");
		String emissaoEntradaServiceURL = request.getParameter("emissaoEntradaServiceURL");
		
		ServicesVO servicesVO = new ServicesVO();
		servicesVO.setConsultaServiceURL(consultaServiceURL);
		servicesVO.setEnvioNFeServiceURL(envioNFeServiceURL);
		servicesVO.setInfoComplDocServiceURL(infoComplDocServiceURL);
		servicesVO.setItemServiceURL(itemServiceURL);
		servicesVO.setNatOpServiceURL(natOpServiceURL);
		servicesVO.setParamIcmsServiceURL(paramIcmsServiceURL);
		servicesVO.setParticipanteServiceURL(participanteServiceURL);
		servicesVO.setUnidadeServiceURL(unidadeServiceURL);
		servicesVO.setEmissaoEntradaServiceURL(emissaoEntradaServiceURL);
		
		eCtrl.inicializaProcesso(servicesVO);
	}

}
