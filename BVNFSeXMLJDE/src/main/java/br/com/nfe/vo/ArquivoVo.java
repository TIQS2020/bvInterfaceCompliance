package br.com.nfe.vo;

import java.util.List;

import br.com.nfe.xml.cancelamento.XmlFileCancelamentoRoot;
import br.com.nfe.xml.envio.XmlFileEnvioRoot;

public class ArquivoVo {

	private String path;
	private String nome;
	private XmlFileEnvioRoot xmlFileEnvioRoot;
	private XmlFileCancelamentoRoot xmlFileCancelamentoRoot;

	public ArquivoVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArquivoVo(String path, String nome, XmlFileEnvioRoot xmlFileEnvioRoot,
			XmlFileCancelamentoRoot xmlFileCancelamentoRoot) {
		super();
		this.path = path;
		this.nome = nome;
		this.xmlFileEnvioRoot = xmlFileEnvioRoot;
		this.xmlFileCancelamentoRoot = xmlFileCancelamentoRoot;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public XmlFileEnvioRoot getXmlFileEnvioRoot() {
		return xmlFileEnvioRoot;
	}

	public void setXmlFileEnvioRoot(XmlFileEnvioRoot xmlFileEnvioRoot) {
		this.xmlFileEnvioRoot = xmlFileEnvioRoot;
	}

	public XmlFileCancelamentoRoot getXmlFileCancelamentoRoot() {
		return xmlFileCancelamentoRoot;
	}

	public void setXmlFileCancelamentoRoot(XmlFileCancelamentoRoot xmlFileCancelamentoRoot) {
		this.xmlFileCancelamentoRoot = xmlFileCancelamentoRoot;
	}

	
}
