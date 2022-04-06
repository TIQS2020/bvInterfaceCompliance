/**
 * PerContrProdEstq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class PerContrProdEstq  implements java.io.Serializable { // VW_CSF_PER_CONTR_PROD_ESTQ - F55IJC7C
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.util.Date dtIni;

    private java.util.Date dtFin;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit[] estEscrit; //VW_CSF_ESTQ_ESCRIT - F55IJC51

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc[] outrMovtoInterMerc; // VW_CSF_OUTR_MOVTO_INTER_MERC - F55IJC52 

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz[] itemProduz; // VW_CSF_ITEM_PRODUZ - F55IJC53

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec[] industrPorTec; //VW_CSF_INDUSTR_POR_TERC - F55IJC55

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig[] desmonMercItemOrig; //N/A

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns[] reprRepaProdIns; // N/A

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg[] corrApontReg; // N/A

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst[] corrApontEst; // N/A

    public PerContrProdEstq() {
    }

    public PerContrProdEstq(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.util.Date dtIni,
           java.util.Date dtFin,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit[] estEscrit,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc[] outrMovtoInterMerc,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz[] itemProduz,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec[] industrPorTec,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig[] desmonMercItemOrig,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns[] reprRepaProdIns,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg[] corrApontReg,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst[] corrApontEst) {
           this.cpfCnpj = cpfCnpj;
           this.dtIni = dtIni;
           this.dtFin = dtFin;
           this.estEscrit = estEscrit;
           this.outrMovtoInterMerc = outrMovtoInterMerc;
           this.itemProduz = itemProduz;
           this.industrPorTec = industrPorTec;
           this.desmonMercItemOrig = desmonMercItemOrig;
           this.reprRepaProdIns = reprRepaProdIns;
           this.corrApontReg = corrApontReg;
           this.corrApontEst = corrApontEst;
    }


    /**
     * Gets the cpfCnpj value for this PerContrProdEstq.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this PerContrProdEstq.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dtIni value for this PerContrProdEstq.
     * 
     * @return dtIni
     */
    public java.util.Date getDtIni() {
        return dtIni;
    }


    /**
     * Sets the dtIni value for this PerContrProdEstq.
     * 
     * @param dtIni
     */
    public void setDtIni(java.util.Date dtIni) {
        this.dtIni = dtIni;
    }


    /**
     * Gets the dtFin value for this PerContrProdEstq.
     * 
     * @return dtFin
     */
    public java.util.Date getDtFin() {
        return dtFin;
    }


    /**
     * Sets the dtFin value for this PerContrProdEstq.
     * 
     * @param dtFin
     */
    public void setDtFin(java.util.Date dtFin) {
        this.dtFin = dtFin;
    }


    /**
     * Gets the estEscrit value for this PerContrProdEstq.
     * 
     * @return estEscrit
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit[] getEstEscrit() {
        return estEscrit;
    }


    /**
     * Sets the estEscrit value for this PerContrProdEstq.
     * 
     * @param estEscrit
     */
    public void setEstEscrit(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit[] estEscrit) {
        this.estEscrit = estEscrit;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit getEstEscrit(int i) {
        return this.estEscrit[i];
    }

    public void setEstEscrit(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpEstqEscrit _value) {
        this.estEscrit[i] = _value;
    }


    /**
     * Gets the outrMovtoInterMerc value for this PerContrProdEstq.
     * 
     * @return outrMovtoInterMerc
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc[] getOutrMovtoInterMerc() {
        return outrMovtoInterMerc;
    }


    /**
     * Sets the outrMovtoInterMerc value for this PerContrProdEstq.
     * 
     * @param outrMovtoInterMerc
     */
    public void setOutrMovtoInterMerc(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc[] outrMovtoInterMerc) {
        this.outrMovtoInterMerc = outrMovtoInterMerc;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc getOutrMovtoInterMerc(int i) {
        return this.outrMovtoInterMerc[i];
    }

    public void setOutrMovtoInterMerc(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpOutrMovtoInterMerc _value) {
        this.outrMovtoInterMerc[i] = _value;
    }


    /**
     * Gets the itemProduz value for this PerContrProdEstq.
     * 
     * @return itemProduz
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz[] getItemProduz() {
        return itemProduz;
    }


    /**
     * Sets the itemProduz value for this PerContrProdEstq.
     * 
     * @param itemProduz
     */
    public void setItemProduz(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz[] itemProduz) {
        this.itemProduz = itemProduz;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz getItemProduz(int i) {
        return this.itemProduz[i];
    }

    public void setItemProduz(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpItemProduz _value) {
        this.itemProduz[i] = _value;
    }


    /**
     * Gets the industrPorTec value for this PerContrProdEstq.
     * 
     * @return industrPorTec
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec[] getIndustrPorTec() {
        return industrPorTec;
    }


    /**
     * Sets the industrPorTec value for this PerContrProdEstq.
     * 
     * @param industrPorTec
     */
    public void setIndustrPorTec(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec[] industrPorTec) {
        this.industrPorTec = industrPorTec;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec getIndustrPorTec(int i) {
        return this.industrPorTec[i];
    }

    public void setIndustrPorTec(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrPorTec _value) {
        this.industrPorTec[i] = _value;
    }


    /**
     * Gets the desmonMercItemOrig value for this PerContrProdEstq.
     * 
     * @return desmonMercItemOrig
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig[] getDesmonMercItemOrig() {
        return desmonMercItemOrig;
    }


    /**
     * Sets the desmonMercItemOrig value for this PerContrProdEstq.
     * 
     * @param desmonMercItemOrig
     */
    public void setDesmonMercItemOrig(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig[] desmonMercItemOrig) {
        this.desmonMercItemOrig = desmonMercItemOrig;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig getDesmonMercItemOrig(int i) {
        return this.desmonMercItemOrig[i];
    }

    public void setDesmonMercItemOrig(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemOrig _value) {
        this.desmonMercItemOrig[i] = _value;
    }


    /**
     * Gets the reprRepaProdIns value for this PerContrProdEstq.
     * 
     * @return reprRepaProdIns
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns[] getReprRepaProdIns() {
        return reprRepaProdIns;
    }


    /**
     * Sets the reprRepaProdIns value for this PerContrProdEstq.
     * 
     * @param reprRepaProdIns
     */
    public void setReprRepaProdIns(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns[] reprRepaProdIns) {
        this.reprRepaProdIns = reprRepaProdIns;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns getReprRepaProdIns(int i) {
        return this.reprRepaProdIns[i];
    }

    public void setReprRepaProdIns(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaProdIns _value) {
        this.reprRepaProdIns[i] = _value;
    }


    /**
     * Gets the corrApontReg value for this PerContrProdEstq.
     * 
     * @return corrApontReg
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg[] getCorrApontReg() {
        return corrApontReg;
    }


    /**
     * Sets the corrApontReg value for this PerContrProdEstq.
     * 
     * @param corrApontReg
     */
    public void setCorrApontReg(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg[] corrApontReg) {
        this.corrApontReg = corrApontReg;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg getCorrApontReg(int i) {
        return this.corrApontReg[i];
    }

    public void setCorrApontReg(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontReg _value) {
        this.corrApontReg[i] = _value;
    }


    /**
     * Gets the corrApontEst value for this PerContrProdEstq.
     * 
     * @return corrApontEst
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst[] getCorrApontEst() {
        return corrApontEst;
    }


    /**
     * Sets the corrApontEst value for this PerContrProdEstq.
     * 
     * @param corrApontEst
     */
    public void setCorrApontEst(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst[] corrApontEst) {
        this.corrApontEst = corrApontEst;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst getCorrApontEst(int i) {
        return this.corrApontEst[i];
    }

    public void setCorrApontEst(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontEst _value) {
        this.corrApontEst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerContrProdEstq)) return false;
        PerContrProdEstq other = (PerContrProdEstq) obj;
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
            ((this.dtIni==null && other.getDtIni()==null) || 
             (this.dtIni!=null &&
              this.dtIni.equals(other.getDtIni()))) &&
            ((this.dtFin==null && other.getDtFin()==null) || 
             (this.dtFin!=null &&
              this.dtFin.equals(other.getDtFin()))) &&
            ((this.estEscrit==null && other.getEstEscrit()==null) || 
             (this.estEscrit!=null &&
              java.util.Arrays.equals(this.estEscrit, other.getEstEscrit()))) &&
            ((this.outrMovtoInterMerc==null && other.getOutrMovtoInterMerc()==null) || 
             (this.outrMovtoInterMerc!=null &&
              java.util.Arrays.equals(this.outrMovtoInterMerc, other.getOutrMovtoInterMerc()))) &&
            ((this.itemProduz==null && other.getItemProduz()==null) || 
             (this.itemProduz!=null &&
              java.util.Arrays.equals(this.itemProduz, other.getItemProduz()))) &&
            ((this.industrPorTec==null && other.getIndustrPorTec()==null) || 
             (this.industrPorTec!=null &&
              java.util.Arrays.equals(this.industrPorTec, other.getIndustrPorTec()))) &&
            ((this.desmonMercItemOrig==null && other.getDesmonMercItemOrig()==null) || 
             (this.desmonMercItemOrig!=null &&
              java.util.Arrays.equals(this.desmonMercItemOrig, other.getDesmonMercItemOrig()))) &&
            ((this.reprRepaProdIns==null && other.getReprRepaProdIns()==null) || 
             (this.reprRepaProdIns!=null &&
              java.util.Arrays.equals(this.reprRepaProdIns, other.getReprRepaProdIns()))) &&
            ((this.corrApontReg==null && other.getCorrApontReg()==null) || 
             (this.corrApontReg!=null &&
              java.util.Arrays.equals(this.corrApontReg, other.getCorrApontReg()))) &&
            ((this.corrApontEst==null && other.getCorrApontEst()==null) || 
             (this.corrApontEst!=null &&
              java.util.Arrays.equals(this.corrApontEst, other.getCorrApontEst())));
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
        if (getDtIni() != null) {
            _hashCode += getDtIni().hashCode();
        }
        if (getDtFin() != null) {
            _hashCode += getDtFin().hashCode();
        }
        if (getEstEscrit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstEscrit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstEscrit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutrMovtoInterMerc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutrMovtoInterMerc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutrMovtoInterMerc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemProduz() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemProduz());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemProduz(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndustrPorTec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustrPorTec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustrPorTec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDesmonMercItemOrig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesmonMercItemOrig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesmonMercItemOrig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReprRepaProdIns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReprRepaProdIns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReprRepaProdIns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrApontReg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrApontReg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrApontReg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorrApontEst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrApontEst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrApontEst(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerContrProdEstq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "perContrProdEstq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estEscrit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "estEscrit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpEstqEscrit"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outrMovtoInterMerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "outrMovtoInterMerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpOutrMovtoInterMerc"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProduz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "itemProduz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpItemProduz"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industrPorTec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "industrPorTec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpIndustrPorTec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desmonMercItemOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "desmonMercItemOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpDesmonMercItemOrig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reprRepaProdIns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "reprRepaProdIns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpReprRepaProdIns"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrApontReg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "corrApontReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontReg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrApontEst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "corrApontEst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontEst"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
