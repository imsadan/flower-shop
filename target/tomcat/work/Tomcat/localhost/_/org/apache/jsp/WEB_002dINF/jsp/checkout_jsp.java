/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-01 10:45:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title> Check Out, Web Store</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"free template,  ecommerce, online shopping, store\" />\r\n");
      out.write("<meta name=\"description\" content=\" Check Out, free template for ecommerce websites.\" />\r\n");
      out.write("<link href=\"../css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/orman.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/ddsmoothmenu.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/ddsmoothmenu.js\"></script>\r\n");
      out.write("\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_wrapper_sp\">\r\n");
      out.write("<div id=\"templatemo_header_wsp\">\r\n");
      out.write("\t<div id=\"templatemo_header\" class=\"header_subpage\">\r\n");
      out.write("    \t<div id=\"site_title\"><a href=\"/\" rel=\"nofollow\">Free CSS Templates</a></div>\r\n");
      out.write("        <div id=\"templatemo_menu\" class=\"ddsmoothmenu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"/\">首页</a></li>\r\n");
      out.write("                <li><a href=\"/about\">关于</a></li>\r\n");
      out.write("                <li><a href=\"/page/products\">花种</a>\r\n");
      out.write("                    \r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"/checkout\" class=\"selected\">付款</a></li>\r\n");
      out.write("                <li><a href=\"/contact\">相关</a></li>\r\n");
      out.write("                <li><a href=\"faqs.jsp\">联系</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div id=\"templatemo_search\">\r\n");
      out.write("                <form action=\"#\" method=\"get\">\r\n");
      out.write("                  \t<input type=\"text\" value=\"Site Search\" name=\"keyword\" id=\"keyword\" title=\"keyword\" \r\n");
      out.write("                  \t\t\tonfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("                  \t<input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br style=\"clear: left\" />\r\n");
      out.write("        </div> \r\n");
      out.write("</div> <!-- END of header wrapper -->\r\n");
      out.write("<div id=\"templatemo_main_wrapper\">\r\n");
      out.write("<div id=\"templatemo_main\">\r\n");
      out.write("\t<div id=\"sidebar\" class=\"left\">\r\n");
      out.write("    \t<div class=\"sidebar_box\"><span class=\"bottom\"></span>\r\n");
      out.write("            <h3>Categories</h3>   \r\n");
      out.write("            <div class=\"content\"> \r\n");
      out.write("                <ul class=\"sidebar_list\">\r\n");
      out.write("                  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/formLogin.jsp", out, false);
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar_box\"><span class=\"bottom\"></span>\r\n");
      out.write("            <h3>Weekly Special</h3>   \r\n");
      out.write("            <div class=\"content special\"> \r\n");
      out.write("                <img src=\"../images/templatemo_image_01.jpg\" alt=\"Flowers\" />\r\n");
      out.write("                <a href=\"#\">Citrus Burst Bouquet</a>\r\n");
      out.write("                <p>\r\n");
      out.write("                \tPrice:\r\n");
      out.write("                    <span class=\"price normal_price\">$160</span>&nbsp;&nbsp;\r\n");
      out.write("                    <span class=\"price special_price\">$100</span>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"content\" class=\"right\">\r\n");
      out.write("    \t<h2>Checkout</h2>\r\n");
      out.write("        \r\n");
      out.write("\t\t<h3>BILLING DETAILS</h3>\r\n");
      out.write("          <form action=\"/order/create\" method=\"post\">\r\n");
      out.write("            <div class=\"content_half left form_field\">     \r\n");
      out.write("\t\t\t\t<p>用户昵称：</p>\r\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.get('userLogin').username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p> \r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.get('userLogin').username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"username\"/>\r\n");
      out.write("                <p>地址:</p>\r\n");
      out.write("      \t\t\t <input name=\"address\" type=\"text\" id=\"address\" maxlength=\"40\" />\r\n");
      out.write("                 <p>  城市:</p> \r\n");
      out.write("               <input name=\"city\" type=\"text\" id=\"city\" maxlength=\"40\" /> \r\n");
      out.write("                 <p>国籍:</p>\r\n");
      out.write("                <input name=\"country\" type=\"text\" id=\"country\" maxlength=\"40\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"content_half right form_field\">\r\n");
      out.write("            \t<p>Email:</p>\r\n");
      out.write("\t\t\t  <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.get('userLogin').email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p> \r\n");
      out.write("\t\t\t  <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.get('userLogin').email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"email\"/>\r\n");
      out.write("                Phone:<br />\r\n");
      out.write("                <input name=\"phone\" type=\"text\" id=\"phone\" maxlength=\"40\" />\r\n");
      out.write("                <span>Please, specify your reachable phone number to call you for a verification.</span>\r\n");
      out.write("            </div>\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <div class=\"cleaner h40\"></div>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t<p><input type=\"submit\" value=\"付款\"/>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"blank_box\">\r\n");
      out.write("        \t    <a href=\"#\"><img src=\"../images/free_shipping.jpg\" alt=\"Free Shipping\" /></a>\r\n");
      out.write("        \t</div>    \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"cleaner\"></div>\r\n");
      out.write("</div> <!-- END of main -->\r\n");
      out.write("</div> <!-- END of main wrapper -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"templatemo_footer_wrapper\">\r\n");
      out.write("<div id=\"templatemo_footer\">\r\n");
      out.write("\t<div class=\"footer_left\">\r\n");
      out.write("    \t<a href=\"#\"><img src=\"../images/1311260370_paypal-straight.png\" alt=\"Paypal\" /></a>\r\n");
      out.write("        <a href=\"#\"><img src=\"../images/1311260374_mastercard-straight.png\" alt=\"Master\" /></a>\r\n");
      out.write("        <a href=\"#\"><img src=\"../images/1311260374_visa-straight.png\" alt=\"Visa\" /></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"footer_right\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tCopyright &copy; 2017.Company name All rights reserved.<a\r\n");
      out.write("\t\t\t\t\t\t\ttarget=\"_blank\" href=\"classpath:index.jsp\">毕业设计</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"cleaner\"></div>\r\n");
      out.write("</div> <!-- END of footer -->\r\n");
      out.write("</div> <!-- END of footer wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript' src='../js/logging.js'></script>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/checkout.jsp(123,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("totalprice");
    // /WEB-INF/jsp/checkout.jsp(123,10) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/checkout.jsp(123,10) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/jsp/checkout.jsp(124,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("number");
    // /WEB-INF/jsp/checkout.jsp(124,10) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/checkout.jsp(124,10) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/checkout.jsp(125,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/checkout.jsp(125,11) '${Itemcart}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${Itemcart}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/checkout.jsp(125,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("cart");
    // /WEB-INF/jsp/checkout.jsp(125,11) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("               ");
          if (_jspx_meth_c_005fset_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("               ");
          out.write("\r\n");
          out.write("               <input type=\"hidden\" name=\"orderitemsLists[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("].flowername\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.flowername }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"/>  \r\n");
          out.write("               <input type=\"hidden\" name=\"orderitemsLists[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("].number\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"/>  \r\n");
          out.write("               <input type=\"hidden\" name=\"orderitemsLists[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("].totalprice\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalprice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"/>     \r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/checkout.jsp(126,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("totalprice");
    // /WEB-INF/jsp/checkout.jsp(126,15) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/checkout.jsp(126,15) '${ (cart.flowerprice * cart.num)}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ (cart.flowerprice * cart.num)}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }
}
