/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-01 10:46:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Shopping Cart</title>\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"free template, shopping cart, floral, ecommerce, online, store\" />\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"Floral, Shopping Cart, free template for ecommerce websites.\" />\r\n");
      out.write("<link href=\"../css/templatemo_style.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/orman.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/nivo-slider.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/ddsmoothmenu.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/ddsmoothmenu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("ddsmoothmenu.init({\r\n");
      out.write("\tmainmenuid: \"templatemo_menu\", //menu DIV id\r\n");
      out.write("\torientation: 'h', //Horizontal or vertical menu: Set to \"h\" or \"v\"\r\n");
      out.write("\tclassname: 'ddsmoothmenu', //class added to menu's outer DIV\r\n");
      out.write("\t//customtheme: [\"#1c5a80\", \"#18374a\"],\r\n");
      out.write("\tcontentsource: \"markup\" //\"markup\" or [\"container_id\", \"path_to_menu_file\"]\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("function clearText(field)\r\n");
      out.write("{\r\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\r\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"templatemo_wrapper_sp\">\r\n");
      out.write("\t\t<div id=\"templatemo_header_wsp\">\r\n");
      out.write("\t\t\t<div id=\"templatemo_header\" class=\"header_subpage\">\r\n");
      out.write("\t\t\t\t<div id=\"site_title\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/\" rel=\"nofollow\">Free CSS Templates</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"templatemo_menu\" class=\"ddsmoothmenu\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/about\">关于</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/page/products\">花种</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/checkout\">付款</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/contact\">相关</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"faqs.jsp\">联系</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div id=\"templatemo_search\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Site Search\" name=\"keyword\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"clearText(this)\" class=\"txt_field\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" name=\"Search\" value=\"\" alt=\"Search\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br style=\"clear: left\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END of header wrapper -->\r\n");
      out.write("\t\t\t<div id=\"templatemo_main_wrapper\">\r\n");
      out.write("\t\t\t\t<div id=\"templatemo_main\">\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar\" class=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"bottom\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Categories</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sidebar_list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/formLogin.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sidebar_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"bottom\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Weekly Special</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"content special\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"../images/templatemo_image_01.jpg\" alt=\"Flowers\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"#\">Citrus Burst Bouquet</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPrice: <span class=\"price normal_price\">$160</span>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"price special_price\">$100</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"content\" class=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<h3>感谢您，订单提交成功！</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mc\" id=\"success_detail\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t欢迎再次光临&nbsp;&nbsp;&nbsp;<a href=\"/\">返回继续购物</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blank_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"../images/free_shipping.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Free Shipping\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"cleaner\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END of main -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END of main wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"templatemo_footer_wrapper\">\r\n");
      out.write("\t\t\t\t<div id=\"templatemo_footer\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer_left\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"../images/1311260370_paypal-straight.png\" alt=\"Paypal\" /></a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"../images/1311260374_mastercard-straight.png\" alt=\"Master\" /></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"../images/1311260374_visa-straight.png\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"Visa\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"footer_right\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tCopyright &copy; 2017.Company name All rights reserved.<a\r\n");
      out.write("\t\t\t\t\t\t\t\ttarget=\"_blank\" href=\"/\">毕业设计</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"cleaner\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- END of footer -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END of footer wrapper -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript' src='../js/logging.js'></script>\r\n");
      out.write("<div style=\"display:none\">\r\n");
      out.write("\t<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540'\r\n");
      out.write("\t\tlanguage='JavaScript' charset='gb2312'></script>\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
