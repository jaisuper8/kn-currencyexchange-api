//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.11.17 at 04:20:50 PM EST
//

package com.blumeglobal.currencyexchange.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for locale.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="locale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ar"/>
 *     &lt;enumeration value="ar_AE"/>
 *     &lt;enumeration value="ar_BH"/>
 *     &lt;enumeration value="ar_DZ"/>
 *     &lt;enumeration value="ar_EG"/>
 *     &lt;enumeration value="ar_IQ"/>
 *     &lt;enumeration value="ar_JO"/>
 *     &lt;enumeration value="ar_KW"/>
 *     &lt;enumeration value="ar_LB"/>
 *     &lt;enumeration value="ar_LY"/>
 *     &lt;enumeration value="ar_MA"/>
 *     &lt;enumeration value="ar_OM"/>
 *     &lt;enumeration value="ar_QA"/>
 *     &lt;enumeration value="ar_SA"/>
 *     &lt;enumeration value="ar_SD"/>
 *     &lt;enumeration value="ar_SY"/>
 *     &lt;enumeration value="ar_TN"/>
 *     &lt;enumeration value="ar_YE"/>
 *     &lt;enumeration value="be"/>
 *     &lt;enumeration value="be_BY"/>
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="bg_BG"/>
 *     &lt;enumeration value="ca"/>
 *     &lt;enumeration value="ca_ES"/>
 *     &lt;enumeration value="ca_ES_EURO"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="cs_CZ"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="da_DK"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="de_AT"/>
 *     &lt;enumeration value="de_AT_EURO"/>
 *     &lt;enumeration value="de_CH"/>
 *     &lt;enumeration value="de_DE"/>
 *     &lt;enumeration value="de_DE_EURO"/>
 *     &lt;enumeration value="de_LU"/>
 *     &lt;enumeration value="de_LU_EURO"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="el_GR"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="en_AU"/>
 *     &lt;enumeration value="en_BE"/>
 *     &lt;enumeration value="en_BE_EURO"/>
 *     &lt;enumeration value="en_CA"/>
 *     &lt;enumeration value="en_GB"/>
 *     &lt;enumeration value="en_IE"/>
 *     &lt;enumeration value="en_IE_EURO"/>
 *     &lt;enumeration value="en_NZ"/>
 *     &lt;enumeration value="en_US"/>
 *     &lt;enumeration value="en_ZA"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="es_AR"/>
 *     &lt;enumeration value="es_BO"/>
 *     &lt;enumeration value="es_CL"/>
 *     &lt;enumeration value="es_CO"/>
 *     &lt;enumeration value="es_CR"/>
 *     &lt;enumeration value="es_DO"/>
 *     &lt;enumeration value="es_EC"/>
 *     &lt;enumeration value="es_ES"/>
 *     &lt;enumeration value="es_ES_EURO"/>
 *     &lt;enumeration value="es_GT"/>
 *     &lt;enumeration value="es_HN"/>
 *     &lt;enumeration value="en_IN"/>
 *     &lt;enumeration value="es_MX"/>
 *     &lt;enumeration value="es_NI"/>
 *     &lt;enumeration value="es_PA"/>
 *     &lt;enumeration value="es_PE"/>
 *     &lt;enumeration value="es_PR"/>
 *     &lt;enumeration value="es_PY"/>
 *     &lt;enumeration value="es_SV"/>
 *     &lt;enumeration value="es_US"/>
 *     &lt;enumeration value="es_UY"/>
 *     &lt;enumeration value="es_VE"/>
 *     &lt;enumeration value="et"/>
 *     &lt;enumeration value="et_EE"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fi_FI"/>
 *     &lt;enumeration value="fi_FI_EURO"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="fr_BE"/>
 *     &lt;enumeration value="fr_BE_EURO"/>
 *     &lt;enumeration value="fr_CA"/>
 *     &lt;enumeration value="fr_CH"/>
 *     &lt;enumeration value="fr_FR"/>
 *     &lt;enumeration value="fr_FR_EURO"/>
 *     &lt;enumeration value="fr_LU"/>
 *     &lt;enumeration value="fr_LU_EURO"/>
 *     &lt;enumeration value="hi_IN"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="hr_HR"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="hu_HU"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="is_IS"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="it_CH"/>
 *     &lt;enumeration value="it_IT"/>
 *     &lt;enumeration value="it_IT_EURO"/>
 *     &lt;enumeration value="iw"/>
 *     &lt;enumeration value="iw_IL"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="ja_JP"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="ko_KR"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="lt_LT"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="lv_LV"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="mk_MK"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="nl_BE"/>
 *     &lt;enumeration value="nl_BE_EURO"/>
 *     &lt;enumeration value="nl_NL"/>
 *     &lt;enumeration value="nl_NL_EURO"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="no_NO"/>
 *     &lt;enumeration value="no_NO_NY"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pl_PL"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="pt_BR"/>
 *     &lt;enumeration value="pt_PT"/>
 *     &lt;enumeration value="pt_PT_EURO"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="ro_RO"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="ru_RU"/>
 *     &lt;enumeration value="sh"/>
 *     &lt;enumeration value="sh_YU"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sk_SK"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="sl_SI"/>
 *     &lt;enumeration value="sq"/>
 *     &lt;enumeration value="sq_AL"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="sr_YU"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="sv_SE"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="th_TH"/>
 *     &lt;enumeration value="th_TH_TH"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="tr_TR"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="uk_UA"/>
 *     &lt;enumeration value="vi"/>
 *     &lt;enumeration value="vi_VN"/>
 *     &lt;enumeration value="zh"/>
 *     &lt;enumeration value="zh_CN"/>
 *     &lt;enumeration value="zh_HK"/>
 *     &lt;enumeration value="zh_TW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "locale", namespace = "urn:ebx-schemas:common_1.0")
@XmlEnum
public enum Locale {
  @XmlEnumValue("ar")
  AR("ar"),
  @XmlEnumValue("ar_AE")
  AR_AE("ar_AE"),
  @XmlEnumValue("ar_BH")
  AR_BH("ar_BH"),
  @XmlEnumValue("ar_DZ")
  AR_DZ("ar_DZ"),
  @XmlEnumValue("ar_EG")
  AR_EG("ar_EG"),
  @XmlEnumValue("ar_IQ")
  AR_IQ("ar_IQ"),
  @XmlEnumValue("ar_JO")
  AR_JO("ar_JO"),
  @XmlEnumValue("ar_KW")
  AR_KW("ar_KW"),
  @XmlEnumValue("ar_LB")
  AR_LB("ar_LB"),
  @XmlEnumValue("ar_LY")
  AR_LY("ar_LY"),
  @XmlEnumValue("ar_MA")
  AR_MA("ar_MA"),
  @XmlEnumValue("ar_OM")
  AR_OM("ar_OM"),
  @XmlEnumValue("ar_QA")
  AR_QA("ar_QA"),
  @XmlEnumValue("ar_SA")
  AR_SA("ar_SA"),
  @XmlEnumValue("ar_SD")
  AR_SD("ar_SD"),
  @XmlEnumValue("ar_SY")
  AR_SY("ar_SY"),
  @XmlEnumValue("ar_TN")
  AR_TN("ar_TN"),
  @XmlEnumValue("ar_YE")
  AR_YE("ar_YE"),
  @XmlEnumValue("be")
  BE("be"),
  @XmlEnumValue("be_BY")
  BE_BY("be_BY"),
  @XmlEnumValue("bg")
  BG("bg"),
  @XmlEnumValue("bg_BG")
  BG_BG("bg_BG"),
  @XmlEnumValue("ca")
  CA("ca"),
  @XmlEnumValue("ca_ES")
  CA_ES("ca_ES"),
  @XmlEnumValue("ca_ES_EURO")
  CA_ES_EURO("ca_ES_EURO"),
  @XmlEnumValue("cs")
  CS("cs"),
  @XmlEnumValue("cs_CZ")
  CS_CZ("cs_CZ"),
  @XmlEnumValue("da")
  DA("da"),
  @XmlEnumValue("da_DK")
  DA_DK("da_DK"),
  @XmlEnumValue("de")
  DE("de"),
  @XmlEnumValue("de_AT")
  DE_AT("de_AT"),
  @XmlEnumValue("de_AT_EURO")
  DE_AT_EURO("de_AT_EURO"),
  @XmlEnumValue("de_CH")
  DE_CH("de_CH"),
  @XmlEnumValue("de_DE")
  DE_DE("de_DE"),
  @XmlEnumValue("de_DE_EURO")
  DE_DE_EURO("de_DE_EURO"),
  @XmlEnumValue("de_LU")
  DE_LU("de_LU"),
  @XmlEnumValue("de_LU_EURO")
  DE_LU_EURO("de_LU_EURO"),
  @XmlEnumValue("el")
  EL("el"),
  @XmlEnumValue("el_GR")
  EL_GR("el_GR"),
  @XmlEnumValue("en")
  EN("en"),
  @XmlEnumValue("en_AU")
  EN_AU("en_AU"),
  @XmlEnumValue("en_BE")
  EN_BE("en_BE"),
  @XmlEnumValue("en_BE_EURO")
  EN_BE_EURO("en_BE_EURO"),
  @XmlEnumValue("en_CA")
  EN_CA("en_CA"),
  @XmlEnumValue("en_GB")
  EN_GB("en_GB"),
  @XmlEnumValue("en_IE")
  EN_IE("en_IE"),
  @XmlEnumValue("en_IE_EURO")
  EN_IE_EURO("en_IE_EURO"),
  @XmlEnumValue("en_NZ")
  EN_NZ("en_NZ"),
  @XmlEnumValue("en_US")
  EN_US("en_US"),
  @XmlEnumValue("en_ZA")
  EN_ZA("en_ZA"),
  @XmlEnumValue("es")
  ES("es"),
  @XmlEnumValue("es_AR")
  ES_AR("es_AR"),
  @XmlEnumValue("es_BO")
  ES_BO("es_BO"),
  @XmlEnumValue("es_CL")
  ES_CL("es_CL"),
  @XmlEnumValue("es_CO")
  ES_CO("es_CO"),
  @XmlEnumValue("es_CR")
  ES_CR("es_CR"),
  @XmlEnumValue("es_DO")
  ES_DO("es_DO"),
  @XmlEnumValue("es_EC")
  ES_EC("es_EC"),
  @XmlEnumValue("es_ES")
  ES_ES("es_ES"),
  @XmlEnumValue("es_ES_EURO")
  ES_ES_EURO("es_ES_EURO"),
  @XmlEnumValue("es_GT")
  ES_GT("es_GT"),
  @XmlEnumValue("es_HN")
  ES_HN("es_HN"),
  @XmlEnumValue("en_IN")
  EN_IN("en_IN"),
  @XmlEnumValue("es_MX")
  ES_MX("es_MX"),
  @XmlEnumValue("es_NI")
  ES_NI("es_NI"),
  @XmlEnumValue("es_PA")
  ES_PA("es_PA"),
  @XmlEnumValue("es_PE")
  ES_PE("es_PE"),
  @XmlEnumValue("es_PR")
  ES_PR("es_PR"),
  @XmlEnumValue("es_PY")
  ES_PY("es_PY"),
  @XmlEnumValue("es_SV")
  ES_SV("es_SV"),
  @XmlEnumValue("es_US")
  ES_US("es_US"),
  @XmlEnumValue("es_UY")
  ES_UY("es_UY"),
  @XmlEnumValue("es_VE")
  ES_VE("es_VE"),
  @XmlEnumValue("et")
  ET("et"),
  @XmlEnumValue("et_EE")
  ET_EE("et_EE"),
  @XmlEnumValue("fi")
  FI("fi"),
  @XmlEnumValue("fi_FI")
  FI_FI("fi_FI"),
  @XmlEnumValue("fi_FI_EURO")
  FI_FI_EURO("fi_FI_EURO"),
  @XmlEnumValue("fr")
  FR("fr"),
  @XmlEnumValue("fr_BE")
  FR_BE("fr_BE"),
  @XmlEnumValue("fr_BE_EURO")
  FR_BE_EURO("fr_BE_EURO"),
  @XmlEnumValue("fr_CA")
  FR_CA("fr_CA"),
  @XmlEnumValue("fr_CH")
  FR_CH("fr_CH"),
  @XmlEnumValue("fr_FR")
  FR_FR("fr_FR"),
  @XmlEnumValue("fr_FR_EURO")
  FR_FR_EURO("fr_FR_EURO"),
  @XmlEnumValue("fr_LU")
  FR_LU("fr_LU"),
  @XmlEnumValue("fr_LU_EURO")
  FR_LU_EURO("fr_LU_EURO"),
  @XmlEnumValue("hi_IN")
  HI_IN("hi_IN"),
  @XmlEnumValue("hr")
  HR("hr"),
  @XmlEnumValue("hr_HR")
  HR_HR("hr_HR"),
  @XmlEnumValue("hu")
  HU("hu"),
  @XmlEnumValue("hu_HU")
  HU_HU("hu_HU"),
  @XmlEnumValue("is")
  IS("is"),
  @XmlEnumValue("is_IS")
  IS_IS("is_IS"),
  @XmlEnumValue("it")
  IT("it"),
  @XmlEnumValue("it_CH")
  IT_CH("it_CH"),
  @XmlEnumValue("it_IT")
  IT_IT("it_IT"),
  @XmlEnumValue("it_IT_EURO")
  IT_IT_EURO("it_IT_EURO"),
  @XmlEnumValue("iw")
  IW("iw"),
  @XmlEnumValue("iw_IL")
  IW_IL("iw_IL"),
  @XmlEnumValue("ja")
  JA("ja"),
  @XmlEnumValue("ja_JP")
  JA_JP("ja_JP"),
  @XmlEnumValue("ko")
  KO("ko"),
  @XmlEnumValue("ko_KR")
  KO_KR("ko_KR"),
  @XmlEnumValue("lt")
  LT("lt"),
  @XmlEnumValue("lt_LT")
  LT_LT("lt_LT"),
  @XmlEnumValue("lv")
  LV("lv"),
  @XmlEnumValue("lv_LV")
  LV_LV("lv_LV"),
  @XmlEnumValue("mk")
  MK("mk"),
  @XmlEnumValue("mk_MK")
  MK_MK("mk_MK"),
  @XmlEnumValue("nl")
  NL("nl"),
  @XmlEnumValue("nl_BE")
  NL_BE("nl_BE"),
  @XmlEnumValue("nl_BE_EURO")
  NL_BE_EURO("nl_BE_EURO"),
  @XmlEnumValue("nl_NL")
  NL_NL("nl_NL"),
  @XmlEnumValue("nl_NL_EURO")
  NL_NL_EURO("nl_NL_EURO"),
  @XmlEnumValue("no")
  NO("no"),
  @XmlEnumValue("no_NO")
  NO_NO("no_NO"),
  @XmlEnumValue("no_NO_NY")
  NO_NO_NY("no_NO_NY"),
  @XmlEnumValue("pl")
  PL("pl"),
  @XmlEnumValue("pl_PL")
  PL_PL("pl_PL"),
  @XmlEnumValue("pt")
  PT("pt"),
  @XmlEnumValue("pt_BR")
  PT_BR("pt_BR"),
  @XmlEnumValue("pt_PT")
  PT_PT("pt_PT"),
  @XmlEnumValue("pt_PT_EURO")
  PT_PT_EURO("pt_PT_EURO"),
  @XmlEnumValue("ro")
  RO("ro"),
  @XmlEnumValue("ro_RO")
  RO_RO("ro_RO"),
  @XmlEnumValue("ru")
  RU("ru"),
  @XmlEnumValue("ru_RU")
  RU_RU("ru_RU"),
  @XmlEnumValue("sh")
  SH("sh"),
  @XmlEnumValue("sh_YU")
  SH_YU("sh_YU"),
  @XmlEnumValue("sk")
  SK("sk"),
  @XmlEnumValue("sk_SK")
  SK_SK("sk_SK"),
  @XmlEnumValue("sl")
  SL("sl"),
  @XmlEnumValue("sl_SI")
  SL_SI("sl_SI"),
  @XmlEnumValue("sq")
  SQ("sq"),
  @XmlEnumValue("sq_AL")
  SQ_AL("sq_AL"),
  @XmlEnumValue("sr")
  SR("sr"),
  @XmlEnumValue("sr_YU")
  SR_YU("sr_YU"),
  @XmlEnumValue("sv")
  SV("sv"),
  @XmlEnumValue("sv_SE")
  SV_SE("sv_SE"),
  @XmlEnumValue("th")
  TH("th"),
  @XmlEnumValue("th_TH")
  TH_TH("th_TH"),
  @XmlEnumValue("th_TH_TH")
  TH_TH_TH("th_TH_TH"),
  @XmlEnumValue("tr")
  TR("tr"),
  @XmlEnumValue("tr_TR")
  TR_TR("tr_TR"),
  @XmlEnumValue("uk")
  UK("uk"),
  @XmlEnumValue("uk_UA")
  UK_UA("uk_UA"),
  @XmlEnumValue("vi")
  VI("vi"),
  @XmlEnumValue("vi_VN")
  VI_VN("vi_VN"),
  @XmlEnumValue("zh")
  ZH("zh"),
  @XmlEnumValue("zh_CN")
  ZH_CN("zh_CN"),
  @XmlEnumValue("zh_HK")
  ZH_HK("zh_HK"),
  @XmlEnumValue("zh_TW")
  ZH_TW("zh_TW");
  private final String value;

  Locale(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static Locale fromValue(String v) {
    for (Locale c : Locale.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}