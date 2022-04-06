/**
 * PagamentoImpRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PagamentoImpRet  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String codPart;

    private java.lang.String nroDoc;

    private java.util.Date dtVcto;

    private java.util.Date dtPgto;

    private org.apache.axis.types.NonNegativeInteger codImposto;

    private java.lang.String cdTipoRetImp;

    private java.math.BigDecimal vlBaseCalc;

    private java.math.BigDecimal vlPrincipal;

    private java.math.BigDecimal vlMulta;

    private java.math.BigDecimal vlJuros;

    private java.math.BigDecimal vlPgto;

    private java.math.BigDecimal aliq;

    private java.lang.String perdComp;

    private java.math.BigDecimal vlDeducao;

    private java.util.Date dtDocto;

    private java.lang.String codReceita;

    private java.lang.String dmIndSuspExig;

    private java.lang.String dmIndDecTerceiro;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed[] pirDetDed;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento[] pirRendIsento;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp[] pirDetComp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirCompJud pirCompJud;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA[] pirInfRRA;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf[] pirProcReinf;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfoExt pirInfoExt;

    public PagamentoImpRet() {
    }

    public PagamentoImpRet(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String codPart,
           java.lang.String nroDoc,
           java.util.Date dtVcto,
           java.util.Date dtPgto,
           org.apache.axis.types.NonNegativeInteger codImposto,
           java.lang.String cdTipoRetImp,
           java.math.BigDecimal vlBaseCalc,
           java.math.BigDecimal vlPrincipal,
           java.math.BigDecimal vlMulta,
           java.math.BigDecimal vlJuros,
           java.math.BigDecimal vlPgto,
           java.math.BigDecimal aliq,
           java.lang.String perdComp,
           java.math.BigDecimal vlDeducao,
           java.util.Date dtDocto,
           java.lang.String codReceita,
           java.lang.String dmIndSuspExig,
           java.lang.String dmIndDecTerceiro,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed[] pirDetDed,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento[] pirRendIsento,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp[] pirDetComp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirCompJud pirCompJud,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA[] pirInfRRA,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf[] pirProcReinf,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfoExt pirInfoExt) {
           this.cpfCnpj = cpfCnpj;
           this.codPart = codPart;
           this.nroDoc = nroDoc;
           this.dtVcto = dtVcto;
           this.dtPgto = dtPgto;
           this.codImposto = codImposto;
           this.cdTipoRetImp = cdTipoRetImp;
           this.vlBaseCalc = vlBaseCalc;
           this.vlPrincipal = vlPrincipal;
           this.vlMulta = vlMulta;
           this.vlJuros = vlJuros;
           this.vlPgto = vlPgto;
           this.aliq = aliq;
           this.perdComp = perdComp;
           this.vlDeducao = vlDeducao;
           this.dtDocto = dtDocto;
           this.codReceita = codReceita;
           this.dmIndSuspExig = dmIndSuspExig;
           this.dmIndDecTerceiro = dmIndDecTerceiro;
           this.pirDetDed = pirDetDed;
           this.pirRendIsento = pirRendIsento;
           this.pirDetComp = pirDetComp;
           this.pirCompJud = pirCompJud;
           this.pirInfRRA = pirInfRRA;
           this.pirProcReinf = pirProcReinf;
           this.pirInfoExt = pirInfoExt;
    }


    /**
     * Gets the cpfCnpj value for this PagamentoImpRet.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this PagamentoImpRet.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the codPart value for this PagamentoImpRet.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this PagamentoImpRet.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the nroDoc value for this PagamentoImpRet.
     * 
     * @return nroDoc
     */
    public java.lang.String getNroDoc() {
        return nroDoc;
    }


    /**
     * Sets the nroDoc value for this PagamentoImpRet.
     * 
     * @param nroDoc
     */
    public void setNroDoc(java.lang.String nroDoc) {
        this.nroDoc = nroDoc;
    }


    /**
     * Gets the dtVcto value for this PagamentoImpRet.
     * 
     * @return dtVcto
     */
    public java.util.Date getDtVcto() {
        return dtVcto;
    }


    /**
     * Sets the dtVcto value for this PagamentoImpRet.
     * 
     * @param dtVcto
     */
    public void setDtVcto(java.util.Date dtVcto) {
        this.dtVcto = dtVcto;
    }


    /**
     * Gets the dtPgto value for this PagamentoImpRet.
     * 
     * @return dtPgto
     */
    public java.util.Date getDtPgto() {
        return dtPgto;
    }


    /**
     * Sets the dtPgto value for this PagamentoImpRet.
     * 
     * @param dtPgto
     */
    public void setDtPgto(java.util.Date dtPgto) {
        this.dtPgto = dtPgto;
    }


    /**
     * Gets the codImposto value for this PagamentoImpRet.
     * 
     * @return codImposto
     */
    public org.apache.axis.types.NonNegativeInteger getCodImposto() {
        return codImposto;
    }


    /**
     * Sets the codImposto value for this PagamentoImpRet.
     * 
     * @param codImposto
     */
    public void setCodImposto(org.apache.axis.types.NonNegativeInteger codImposto) {
        this.codImposto = codImposto;
    }


    /**
     * Gets the cdTipoRetImp value for this PagamentoImpRet.
     * 
     * @return cdTipoRetImp
     */
    public java.lang.String getCdTipoRetImp() {
        return cdTipoRetImp;
    }


    /**
     * Sets the cdTipoRetImp value for this PagamentoImpRet.
     * 
     * @param cdTipoRetImp
     */
    public void setCdTipoRetImp(java.lang.String cdTipoRetImp) {
        this.cdTipoRetImp = cdTipoRetImp;
    }


    /**
     * Gets the vlBaseCalc value for this PagamentoImpRet.
     * 
     * @return vlBaseCalc
     */
    public java.math.BigDecimal getVlBaseCalc() {
        return vlBaseCalc;
    }


    /**
     * Sets the vlBaseCalc value for this PagamentoImpRet.
     * 
     * @param vlBaseCalc
     */
    public void setVlBaseCalc(java.math.BigDecimal vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }


    /**
     * Gets the vlPrincipal value for this PagamentoImpRet.
     * 
     * @return vlPrincipal
     */
    public java.math.BigDecimal getVlPrincipal() {
        return vlPrincipal;
    }


    /**
     * Sets the vlPrincipal value for this PagamentoImpRet.
     * 
     * @param vlPrincipal
     */
    public void setVlPrincipal(java.math.BigDecimal vlPrincipal) {
        this.vlPrincipal = vlPrincipal;
    }


    /**
     * Gets the vlMulta value for this PagamentoImpRet.
     * 
     * @return vlMulta
     */
    public java.math.BigDecimal getVlMulta() {
        return vlMulta;
    }


    /**
     * Sets the vlMulta value for this PagamentoImpRet.
     * 
     * @param vlMulta
     */
    public void setVlMulta(java.math.BigDecimal vlMulta) {
        this.vlMulta = vlMulta;
    }


    /**
     * Gets the vlJuros value for this PagamentoImpRet.
     * 
     * @return vlJuros
     */
    public java.math.BigDecimal getVlJuros() {
        return vlJuros;
    }


    /**
     * Sets the vlJuros value for this PagamentoImpRet.
     * 
     * @param vlJuros
     */
    public void setVlJuros(java.math.BigDecimal vlJuros) {
        this.vlJuros = vlJuros;
    }


    /**
     * Gets the vlPgto value for this PagamentoImpRet.
     * 
     * @return vlPgto
     */
    public java.math.BigDecimal getVlPgto() {
        return vlPgto;
    }


    /**
     * Sets the vlPgto value for this PagamentoImpRet.
     * 
     * @param vlPgto
     */
    public void setVlPgto(java.math.BigDecimal vlPgto) {
        this.vlPgto = vlPgto;
    }


    /**
     * Gets the aliq value for this PagamentoImpRet.
     * 
     * @return aliq
     */
    public java.math.BigDecimal getAliq() {
        return aliq;
    }


    /**
     * Sets the aliq value for this PagamentoImpRet.
     * 
     * @param aliq
     */
    public void setAliq(java.math.BigDecimal aliq) {
        this.aliq = aliq;
    }


    /**
     * Gets the perdComp value for this PagamentoImpRet.
     * 
     * @return perdComp
     */
    public java.lang.String getPerdComp() {
        return perdComp;
    }


    /**
     * Sets the perdComp value for this PagamentoImpRet.
     * 
     * @param perdComp
     */
    public void setPerdComp(java.lang.String perdComp) {
        this.perdComp = perdComp;
    }


    /**
     * Gets the vlDeducao value for this PagamentoImpRet.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this PagamentoImpRet.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the dtDocto value for this PagamentoImpRet.
     * 
     * @return dtDocto
     */
    public java.util.Date getDtDocto() {
        return dtDocto;
    }


    /**
     * Sets the dtDocto value for this PagamentoImpRet.
     * 
     * @param dtDocto
     */
    public void setDtDocto(java.util.Date dtDocto) {
        this.dtDocto = dtDocto;
    }


    /**
     * Gets the codReceita value for this PagamentoImpRet.
     * 
     * @return codReceita
     */
    public java.lang.String getCodReceita() {
        return codReceita;
    }


    /**
     * Sets the codReceita value for this PagamentoImpRet.
     * 
     * @param codReceita
     */
    public void setCodReceita(java.lang.String codReceita) {
        this.codReceita = codReceita;
    }


    /**
     * Gets the dmIndSuspExig value for this PagamentoImpRet.
     * 
     * @return dmIndSuspExig
     */
    public java.lang.String getDmIndSuspExig() {
        return dmIndSuspExig;
    }


    /**
     * Sets the dmIndSuspExig value for this PagamentoImpRet.
     * 
     * @param dmIndSuspExig
     */
    public void setDmIndSuspExig(java.lang.String dmIndSuspExig) {
        this.dmIndSuspExig = dmIndSuspExig;
    }


    /**
     * Gets the dmIndDecTerceiro value for this PagamentoImpRet.
     * 
     * @return dmIndDecTerceiro
     */
    public java.lang.String getDmIndDecTerceiro() {
        return dmIndDecTerceiro;
    }


    /**
     * Sets the dmIndDecTerceiro value for this PagamentoImpRet.
     * 
     * @param dmIndDecTerceiro
     */
    public void setDmIndDecTerceiro(java.lang.String dmIndDecTerceiro) {
        this.dmIndDecTerceiro = dmIndDecTerceiro;
    }


    /**
     * Gets the pirDetDed value for this PagamentoImpRet.
     * 
     * @return pirDetDed
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed[] getPirDetDed() {
        return pirDetDed;
    }


    /**
     * Sets the pirDetDed value for this PagamentoImpRet.
     * 
     * @param pirDetDed
     */
    public void setPirDetDed(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed[] pirDetDed) {
        this.pirDetDed = pirDetDed;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed getPirDetDed(int i) {
        return this.pirDetDed[i];
    }

    public void setPirDetDed(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetDed _value) {
        this.pirDetDed[i] = _value;
    }


    /**
     * Gets the pirRendIsento value for this PagamentoImpRet.
     * 
     * @return pirRendIsento
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento[] getPirRendIsento() {
        return pirRendIsento;
    }


    /**
     * Sets the pirRendIsento value for this PagamentoImpRet.
     * 
     * @param pirRendIsento
     */
    public void setPirRendIsento(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento[] pirRendIsento) {
        this.pirRendIsento = pirRendIsento;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento getPirRendIsento(int i) {
        return this.pirRendIsento[i];
    }

    public void setPirRendIsento(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirRendIsento _value) {
        this.pirRendIsento[i] = _value;
    }


    /**
     * Gets the pirDetComp value for this PagamentoImpRet.
     * 
     * @return pirDetComp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp[] getPirDetComp() {
        return pirDetComp;
    }


    /**
     * Sets the pirDetComp value for this PagamentoImpRet.
     * 
     * @param pirDetComp
     */
    public void setPirDetComp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp[] pirDetComp) {
        this.pirDetComp = pirDetComp;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp getPirDetComp(int i) {
        return this.pirDetComp[i];
    }

    public void setPirDetComp(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirDetComp _value) {
        this.pirDetComp[i] = _value;
    }


    /**
     * Gets the pirCompJud value for this PagamentoImpRet.
     * 
     * @return pirCompJud
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirCompJud getPirCompJud() {
        return pirCompJud;
    }


    /**
     * Sets the pirCompJud value for this PagamentoImpRet.
     * 
     * @param pirCompJud
     */
    public void setPirCompJud(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirCompJud pirCompJud) {
        this.pirCompJud = pirCompJud;
    }


    /**
     * Gets the pirInfRRA value for this PagamentoImpRet.
     * 
     * @return pirInfRRA
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA[] getPirInfRRA() {
        return pirInfRRA;
    }


    /**
     * Sets the pirInfRRA value for this PagamentoImpRet.
     * 
     * @param pirInfRRA
     */
    public void setPirInfRRA(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA[] pirInfRRA) {
        this.pirInfRRA = pirInfRRA;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA getPirInfRRA(int i) {
        return this.pirInfRRA[i];
    }

    public void setPirInfRRA(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRA _value) {
        this.pirInfRRA[i] = _value;
    }


    /**
     * Gets the pirProcReinf value for this PagamentoImpRet.
     * 
     * @return pirProcReinf
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf[] getPirProcReinf() {
        return pirProcReinf;
    }


    /**
     * Sets the pirProcReinf value for this PagamentoImpRet.
     * 
     * @param pirProcReinf
     */
    public void setPirProcReinf(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf[] pirProcReinf) {
        this.pirProcReinf = pirProcReinf;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf getPirProcReinf(int i) {
        return this.pirProcReinf[i];
    }

    public void setPirProcReinf(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinf _value) {
        this.pirProcReinf[i] = _value;
    }


    /**
     * Gets the pirInfoExt value for this PagamentoImpRet.
     * 
     * @return pirInfoExt
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfoExt getPirInfoExt() {
        return pirInfoExt;
    }


    /**
     * Sets the pirInfoExt value for this PagamentoImpRet.
     * 
     * @param pirInfoExt
     */
    public void setPirInfoExt(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfoExt pirInfoExt) {
        this.pirInfoExt = pirInfoExt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagamentoImpRet)) return false;
        PagamentoImpRet other = (PagamentoImpRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.nroDoc==null && other.getNroDoc()==null) || 
             (this.nroDoc!=null &&
              this.nroDoc.equals(other.getNroDoc()))) &&
            ((this.dtVcto==null && other.getDtVcto()==null) || 
             (this.dtVcto!=null &&
              this.dtVcto.equals(other.getDtVcto()))) &&
            ((this.dtPgto==null && other.getDtPgto()==null) || 
             (this.dtPgto!=null &&
              this.dtPgto.equals(other.getDtPgto()))) &&
            ((this.codImposto==null && other.getCodImposto()==null) || 
             (this.codImposto!=null &&
              this.codImposto.equals(other.getCodImposto()))) &&
            ((this.cdTipoRetImp==null && other.getCdTipoRetImp()==null) || 
             (this.cdTipoRetImp!=null &&
              this.cdTipoRetImp.equals(other.getCdTipoRetImp()))) &&
            ((this.vlBaseCalc==null && other.getVlBaseCalc()==null) || 
             (this.vlBaseCalc!=null &&
              this.vlBaseCalc.equals(other.getVlBaseCalc()))) &&
            ((this.vlPrincipal==null && other.getVlPrincipal()==null) || 
             (this.vlPrincipal!=null &&
              this.vlPrincipal.equals(other.getVlPrincipal()))) &&
            ((this.vlMulta==null && other.getVlMulta()==null) || 
             (this.vlMulta!=null &&
              this.vlMulta.equals(other.getVlMulta()))) &&
            ((this.vlJuros==null && other.getVlJuros()==null) || 
             (this.vlJuros!=null &&
              this.vlJuros.equals(other.getVlJuros()))) &&
            ((this.vlPgto==null && other.getVlPgto()==null) || 
             (this.vlPgto!=null &&
              this.vlPgto.equals(other.getVlPgto()))) &&
            ((this.aliq==null && other.getAliq()==null) || 
             (this.aliq!=null &&
              this.aliq.equals(other.getAliq()))) &&
            ((this.perdComp==null && other.getPerdComp()==null) || 
             (this.perdComp!=null &&
              this.perdComp.equals(other.getPerdComp()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao()))) &&
            ((this.dtDocto==null && other.getDtDocto()==null) || 
             (this.dtDocto!=null &&
              this.dtDocto.equals(other.getDtDocto()))) &&
            ((this.codReceita==null && other.getCodReceita()==null) || 
             (this.codReceita!=null &&
              this.codReceita.equals(other.getCodReceita()))) &&
            ((this.dmIndSuspExig==null && other.getDmIndSuspExig()==null) || 
             (this.dmIndSuspExig!=null &&
              this.dmIndSuspExig.equals(other.getDmIndSuspExig()))) &&
            ((this.dmIndDecTerceiro==null && other.getDmIndDecTerceiro()==null) || 
             (this.dmIndDecTerceiro!=null &&
              this.dmIndDecTerceiro.equals(other.getDmIndDecTerceiro()))) &&
            ((this.pirDetDed==null && other.getPirDetDed()==null) || 
             (this.pirDetDed!=null &&
              java.util.Arrays.equals(this.pirDetDed, other.getPirDetDed()))) &&
            ((this.pirRendIsento==null && other.getPirRendIsento()==null) || 
             (this.pirRendIsento!=null &&
              java.util.Arrays.equals(this.pirRendIsento, other.getPirRendIsento()))) &&
            ((this.pirDetComp==null && other.getPirDetComp()==null) || 
             (this.pirDetComp!=null &&
              java.util.Arrays.equals(this.pirDetComp, other.getPirDetComp()))) &&
            ((this.pirCompJud==null && other.getPirCompJud()==null) || 
             (this.pirCompJud!=null &&
              this.pirCompJud.equals(other.getPirCompJud()))) &&
            ((this.pirInfRRA==null && other.getPirInfRRA()==null) || 
             (this.pirInfRRA!=null &&
              java.util.Arrays.equals(this.pirInfRRA, other.getPirInfRRA()))) &&
            ((this.pirProcReinf==null && other.getPirProcReinf()==null) || 
             (this.pirProcReinf!=null &&
              java.util.Arrays.equals(this.pirProcReinf, other.getPirProcReinf()))) &&
            ((this.pirInfoExt==null && other.getPirInfoExt()==null) || 
             (this.pirInfoExt!=null &&
              this.pirInfoExt.equals(other.getPirInfoExt())));
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
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getNroDoc() != null) {
            _hashCode += getNroDoc().hashCode();
        }
        if (getDtVcto() != null) {
            _hashCode += getDtVcto().hashCode();
        }
        if (getDtPgto() != null) {
            _hashCode += getDtPgto().hashCode();
        }
        if (getCodImposto() != null) {
            _hashCode += getCodImposto().hashCode();
        }
        if (getCdTipoRetImp() != null) {
            _hashCode += getCdTipoRetImp().hashCode();
        }
        if (getVlBaseCalc() != null) {
            _hashCode += getVlBaseCalc().hashCode();
        }
        if (getVlPrincipal() != null) {
            _hashCode += getVlPrincipal().hashCode();
        }
        if (getVlMulta() != null) {
            _hashCode += getVlMulta().hashCode();
        }
        if (getVlJuros() != null) {
            _hashCode += getVlJuros().hashCode();
        }
        if (getVlPgto() != null) {
            _hashCode += getVlPgto().hashCode();
        }
        if (getAliq() != null) {
            _hashCode += getAliq().hashCode();
        }
        if (getPerdComp() != null) {
            _hashCode += getPerdComp().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        if (getDtDocto() != null) {
            _hashCode += getDtDocto().hashCode();
        }
        if (getCodReceita() != null) {
            _hashCode += getCodReceita().hashCode();
        }
        if (getDmIndSuspExig() != null) {
            _hashCode += getDmIndSuspExig().hashCode();
        }
        if (getDmIndDecTerceiro() != null) {
            _hashCode += getDmIndDecTerceiro().hashCode();
        }
        if (getPirDetDed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirDetDed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirDetDed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPirRendIsento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirRendIsento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirRendIsento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPirDetComp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirDetComp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirDetComp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPirCompJud() != null) {
            _hashCode += getPirCompJud().hashCode();
        }
        if (getPirInfRRA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirInfRRA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirInfRRA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPirProcReinf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirProcReinf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirProcReinf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPirInfoExt() != null) {
            _hashCode += getPirInfoExt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagamentoImpRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pagamentoImpRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "nroDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtVcto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dtVcto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dtPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTipoRetImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "cdTipoRetImp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlBaseCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlMulta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlMulta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlJuros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlJuros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "aliq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perdComp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "perdComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDeducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDeducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dtDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codReceita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codReceita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndSuspExig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndSuspExig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndDecTerceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndDecTerceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirDetDed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetDed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirRendIsento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirRendIsento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirRendIsento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirDetComp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetComp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirCompJud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirCompJud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirCompJud"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirInfRRA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirProcReinf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirInfoExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfoExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfoExt"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
