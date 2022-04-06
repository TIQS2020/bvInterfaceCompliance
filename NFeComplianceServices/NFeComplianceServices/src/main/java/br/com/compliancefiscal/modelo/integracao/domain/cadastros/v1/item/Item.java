/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item;

public class Item implements java.io.Serializable {
	private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

	private Long numeroItem;

	private String codigoItem;

	private String descricao;

	private String cfop;

	private java.lang.String siglaUnidade;

	private java.math.BigInteger indicacaoOrigem;

	private java.lang.String tipoItem;

	private java.lang.String codNCM;

	private java.lang.String exTipi;

	private java.lang.String codigoBarras;

	private java.lang.String codigoAnterior;

	private java.lang.String tipoServico;

	private java.math.BigDecimal aliquotaIcms;

	private java.math.BigDecimal codProdAnp;

	private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade[] conversaoUnidade;

	private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial[] marcaComercial;

	private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpComplementos complementos;

	private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos[] insumos;

	private java.lang.String cest;

	public Item() {
	}

	public Item(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
			java.lang.Long numeroItem, java.lang.String codigoItem, java.lang.String descricao, java.lang.String cfop,
			java.lang.String siglaUnidade, java.math.BigInteger indicacaoOrigem, java.lang.String tipoItem,
			java.lang.String codNCM, java.lang.String exTipi, java.lang.String codigoBarras,
			java.lang.String codigoAnterior, java.lang.String tipoServico, java.math.BigDecimal aliquotaIcms,
			java.math.BigDecimal codProdAnp,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade[] conversaoUnidade,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial[] marcaComercial,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpComplementos complementos,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos[] insumos,
			java.lang.String cest) {
		this.cpfCnpj = cpfCnpj;
		this.numeroItem = numeroItem;
		this.codigoItem = codigoItem;
		this.descricao = descricao;
		this.cfop = cfop;
		this.siglaUnidade = siglaUnidade;
		this.indicacaoOrigem = indicacaoOrigem;
		this.tipoItem = tipoItem;
		this.codNCM = codNCM;
		this.exTipi = exTipi;
		this.codigoBarras = codigoBarras;
		this.codigoAnterior = codigoAnterior;
		this.tipoServico = tipoServico;
		this.aliquotaIcms = aliquotaIcms;
		this.codProdAnp = codProdAnp;
		this.conversaoUnidade = conversaoUnidade;
		this.marcaComercial = marcaComercial;
		this.complementos = complementos;
		this.insumos = insumos;
		this.cest = cest;
	}

	/**
	 * Gets the cpfCnpj value for this Item.
	 * 
	 * @return cpfCnpj
	 */
	public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * Sets the cpfCnpj value for this Item.
	 * 
	 * @param cpfCnpj
	 */
	public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public java.lang.Long getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(java.lang.Long numeroItem) {
		this.numeroItem = numeroItem;
	}

	/**
	 * Gets the codigoItem value for this Item.
	 * 
	 * @return codigoItem
	 */
	public java.lang.String getCodigoItem() {
		return codigoItem;
	}

	/**
	 * Sets the codigoItem value for this Item.
	 * 
	 * @param codigoItem
	 */
	public void setCodigoItem(java.lang.String codigoItem) {
		this.codigoItem = codigoItem;
	}

	/**
	 * Gets the descricao value for this Item.
	 * 
	 * @return descricao
	 */
	public java.lang.String getDescricao() {
		return descricao;
	}

	/**
	 * Sets the descricao value for this Item.
	 * 
	 * @param descricao
	 */
	public void setDescricao(java.lang.String descricao) {
		this.descricao = descricao;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	/**
	 * Gets the siglaUnidade value for this Item.
	 * 
	 * @return siglaUnidade
	 */
	public java.lang.String getSiglaUnidade() {
		return siglaUnidade;
	}

	/**
	 * Sets the siglaUnidade value for this Item.
	 * 
	 * @param siglaUnidade
	 */
	public void setSiglaUnidade(java.lang.String siglaUnidade) {
		this.siglaUnidade = siglaUnidade;
	}

	/**
	 * Gets the indicacaoOrigem value for this Item.
	 * 
	 * @return indicacaoOrigem
	 */
	public java.math.BigInteger getIndicacaoOrigem() {
		return indicacaoOrigem;
	}

	/**
	 * Sets the indicacaoOrigem value for this Item.
	 * 
	 * @param indicacaoOrigem
	 */
	public void setIndicacaoOrigem(java.math.BigInteger indicacaoOrigem) {
		this.indicacaoOrigem = indicacaoOrigem;
	}

	/**
	 * Gets the tipoItem value for this Item.
	 * 
	 * @return tipoItem
	 */
	public java.lang.String getTipoItem() {
		return tipoItem;
	}

	/**
	 * Sets the tipoItem value for this Item.
	 * 
	 * @param tipoItem
	 */
	public void setTipoItem(java.lang.String tipoItem) {
		this.tipoItem = tipoItem;
	}

	/**
	 * Gets the codNCM value for this Item.
	 * 
	 * @return codNCM
	 */
	public java.lang.String getCodNCM() {
		return codNCM;
	}

	/**
	 * Sets the codNCM value for this Item.
	 * 
	 * @param codNCM
	 */
	public void setCodNCM(java.lang.String codNCM) {
		this.codNCM = codNCM;
	}

	/**
	 * Gets the exTipi value for this Item.
	 * 
	 * @return exTipi
	 */
	public java.lang.String getExTipi() {
		return exTipi;
	}

	/**
	 * Sets the exTipi value for this Item.
	 * 
	 * @param exTipi
	 */
	public void setExTipi(java.lang.String exTipi) {
		this.exTipi = exTipi;
	}

	/**
	 * Gets the codigoBarras value for this Item.
	 * 
	 * @return codigoBarras
	 */
	public java.lang.String getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * Sets the codigoBarras value for this Item.
	 * 
	 * @param codigoBarras
	 */
	public void setCodigoBarras(java.lang.String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	/**
	 * Gets the codigoAnterior value for this Item.
	 * 
	 * @return codigoAnterior
	 */
	public java.lang.String getCodigoAnterior() {
		return codigoAnterior;
	}

	/**
	 * Sets the codigoAnterior value for this Item.
	 * 
	 * @param codigoAnterior
	 */
	public void setCodigoAnterior(java.lang.String codigoAnterior) {
		this.codigoAnterior = codigoAnterior;
	}

	/**
	 * Gets the tipoServico value for this Item.
	 * 
	 * @return tipoServico
	 */
	public java.lang.String getTipoServico() {
		return tipoServico;
	}

	/**
	 * Sets the tipoServico value for this Item.
	 * 
	 * @param tipoServico
	 */
	public void setTipoServico(java.lang.String tipoServico) {
		this.tipoServico = tipoServico;
	}

	/**
	 * Gets the aliquotaIcms value for this Item.
	 * 
	 * @return aliquotaIcms
	 */
	public java.math.BigDecimal getAliquotaIcms() {
		return aliquotaIcms;
	}

	/**
	 * Sets the aliquotaIcms value for this Item.
	 * 
	 * @param aliquotaIcms
	 */
	public void setAliquotaIcms(java.math.BigDecimal aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	/**
	 * Gets the codProdAnp value for this Item.
	 * 
	 * @return codProdAnp
	 */
	public java.math.BigDecimal getCodProdAnp() {
		return codProdAnp;
	}

	/**
	 * Sets the codProdAnp value for this Item.
	 * 
	 * @param codProdAnp
	 */
	public void setCodProdAnp(java.math.BigDecimal codProdAnp) {
		this.codProdAnp = codProdAnp;
	}

	/**
	 * Gets the conversaoUnidade value for this Item.
	 * 
	 * @return conversaoUnidade
	 */
	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade[] getConversaoUnidade() {
		return conversaoUnidade;
	}

	/**
	 * Sets the conversaoUnidade value for this Item.
	 * 
	 * @param conversaoUnidade
	 */
	public void setConversaoUnidade(
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade[] conversaoUnidade) {
		this.conversaoUnidade = conversaoUnidade;
	}

	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade getConversaoUnidade(
			int i) {
		return this.conversaoUnidade[i];
	}

	public void setConversaoUnidade(int i,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpConversaoUnidade _value) {
		this.conversaoUnidade[i] = _value;
	}

	/**
	 * Gets the marcaComercial value for this Item.
	 * 
	 * @return marcaComercial
	 */
	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial[] getMarcaComercial() {
		return marcaComercial;
	}

	/**
	 * Sets the marcaComercial value for this Item.
	 * 
	 * @param marcaComercial
	 */
	public void setMarcaComercial(
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial[] marcaComercial) {
		this.marcaComercial = marcaComercial;
	}

	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial getMarcaComercial(
			int i) {
		return this.marcaComercial[i];
	}

	public void setMarcaComercial(int i,
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpMarcaComercial _value) {
		this.marcaComercial[i] = _value;
	}

	/**
	 * Gets the complementos value for this Item.
	 * 
	 * @return complementos
	 */
	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpComplementos getComplementos() {
		return complementos;
	}

	/**
	 * Sets the complementos value for this Item.
	 * 
	 * @param complementos
	 */
	public void setComplementos(
			br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpComplementos complementos) {
		this.complementos = complementos;
	}

	/**
	 * Gets the insumos value for this Item.
	 * 
	 * @return insumos
	 */
	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos[] getInsumos() {
		return insumos;
	}

	/**
	 * Sets the insumos value for this Item.
	 * 
	 * @param insumos
	 */
	public void setInsumos(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos[] insumos) {
		this.insumos = insumos;
	}

	public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos getInsumos(int i) {
		return this.insumos[i];
	}

	public void setInsumos(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.TpInsumos _value) {
		this.insumos[i] = _value;
	}

	/**
	 * Gets the cest value for this Item.
	 * 
	 * @return cest
	 */
	public java.lang.String getCest() {
		return cest;
	}

	/**
	 * Sets the cest value for this Item.
	 * 
	 * @param cest
	 */
	public void setCest(java.lang.String cest) {
		this.cest = cest;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Item))
			return false;
		Item other = (Item) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.cpfCnpj == null && other.getCpfCnpj() == null)
						|| (this.cpfCnpj != null && this.cpfCnpj.equals(other.getCpfCnpj())))
				&& ((this.codigoItem == null && other.getCodigoItem() == null)
						|| (this.codigoItem != null && this.codigoItem.equals(other.getCodigoItem())))
				&& ((this.descricao == null && other.getDescricao() == null)
						|| (this.descricao != null && this.descricao.equals(other.getDescricao())))
				&& ((this.siglaUnidade == null && other.getSiglaUnidade() == null)
						|| (this.siglaUnidade != null && this.siglaUnidade.equals(other.getSiglaUnidade())))
				&& ((this.indicacaoOrigem == null && other.getIndicacaoOrigem() == null)
						|| (this.indicacaoOrigem != null && this.indicacaoOrigem.equals(other.getIndicacaoOrigem())))
				&& ((this.tipoItem == null && other.getTipoItem() == null)
						|| (this.tipoItem != null && this.tipoItem.equals(other.getTipoItem())))
				&& ((this.codNCM == null && other.getCodNCM() == null)
						|| (this.codNCM != null && this.codNCM.equals(other.getCodNCM())))
				&& ((this.exTipi == null && other.getExTipi() == null)
						|| (this.exTipi != null && this.exTipi.equals(other.getExTipi())))
				&& ((this.codigoBarras == null && other.getCodigoBarras() == null)
						|| (this.codigoBarras != null && this.codigoBarras.equals(other.getCodigoBarras())))
				&& ((this.codigoAnterior == null && other.getCodigoAnterior() == null)
						|| (this.codigoAnterior != null && this.codigoAnterior.equals(other.getCodigoAnterior())))
				&& ((this.tipoServico == null && other.getTipoServico() == null)
						|| (this.tipoServico != null && this.tipoServico.equals(other.getTipoServico())))
				&& ((this.aliquotaIcms == null && other.getAliquotaIcms() == null)
						|| (this.aliquotaIcms != null && this.aliquotaIcms.equals(other.getAliquotaIcms())))
				&& ((this.codProdAnp == null && other.getCodProdAnp() == null)
						|| (this.codProdAnp != null && this.codProdAnp.equals(other.getCodProdAnp())))
				&& ((this.conversaoUnidade == null && other.getConversaoUnidade() == null)
						|| (this.conversaoUnidade != null
								&& java.util.Arrays.equals(this.conversaoUnidade, other.getConversaoUnidade())))
				&& ((this.marcaComercial == null && other.getMarcaComercial() == null) || (this.marcaComercial != null
						&& java.util.Arrays.equals(this.marcaComercial, other.getMarcaComercial())))
				&& ((this.complementos == null && other.getComplementos() == null)
						|| (this.complementos != null && this.complementos.equals(other.getComplementos())))
				&& ((this.insumos == null && other.getInsumos() == null)
						|| (this.insumos != null && java.util.Arrays.equals(this.insumos, other.getInsumos())))
				&& ((this.cest == null && other.getCest() == null)
						|| (this.cest != null && this.cest.equals(other.getCest())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getCpfCnpj() != null) {
			_hashCode += getCpfCnpj().hashCode();
		}
		if (getCodigoItem() != null) {
			_hashCode += getCodigoItem().hashCode();
		}
		if (getDescricao() != null) {
			_hashCode += getDescricao().hashCode();
		}
		if (getSiglaUnidade() != null) {
			_hashCode += getSiglaUnidade().hashCode();
		}
		if (getIndicacaoOrigem() != null) {
			_hashCode += getIndicacaoOrigem().hashCode();
		}
		if (getTipoItem() != null) {
			_hashCode += getTipoItem().hashCode();
		}
		if (getCodNCM() != null) {
			_hashCode += getCodNCM().hashCode();
		}
		if (getExTipi() != null) {
			_hashCode += getExTipi().hashCode();
		}
		if (getCodigoBarras() != null) {
			_hashCode += getCodigoBarras().hashCode();
		}
		if (getCodigoAnterior() != null) {
			_hashCode += getCodigoAnterior().hashCode();
		}
		if (getTipoServico() != null) {
			_hashCode += getTipoServico().hashCode();
		}
		if (getAliquotaIcms() != null) {
			_hashCode += getAliquotaIcms().hashCode();
		}
		if (getCodProdAnp() != null) {
			_hashCode += getCodProdAnp().hashCode();
		}
		if (getConversaoUnidade() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getConversaoUnidade()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getConversaoUnidade(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMarcaComercial() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getMarcaComercial()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getMarcaComercial(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getComplementos() != null) {
			_hashCode += getComplementos().hashCode();
		}
		if (getInsumos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getInsumos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getInsumos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCest() != null) {
			_hashCode += getCest().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(Item.class,
			true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "item"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpfCnpj");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "cpfCnpj"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codigoItem");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codigoItem"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descricao");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "descricao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("siglaUnidade");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "siglaUnidade"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("indicacaoOrigem");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "indicacaoOrigem"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoItem");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tipoItem"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item",
				"tpStringSizeTwoComplementos"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codNCM");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codNCM"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exTipi");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "exTipi"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codigoBarras");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codigoBarras"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codigoAnterior");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codigoAnterior"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tipoServico");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tipoServico"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("aliquotaIcms");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "aliquotaIcms"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("codProdAnp");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codProdAnp"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conversaoUnidade");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "conversaoUnidade"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpConversaoUnidade"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("marcaComercial");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "marcaComercial"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpMarcaComercial"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("complementos");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "complementos"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpComplementos"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("insumos");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "insumos"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpInsumos"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cest");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "cest"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
