/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-10-21 02:36:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.briup.app.estore.service.impl.LineServiceImp;
import java.util.Set;
import com.briup.app.estore.bean.Orderline;
import com.briup.app.estore.service.impl.OrderServiceImp;
import com.briup.app.estore.bean.Order;
import java.util.List;
import com.briup.app.estore.bean.Customer;

public final class orderinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1571361566883L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1571378569249L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--文件头开始-->\r\n");

	Customer customer = (Customer) session.getAttribute("Customer");
	List<Order> list = new OrderServiceImp().getOrderByCustomer(customer);
	int id = Integer.parseInt(request.getParameter("id"))-1;
	Order order = list.get(id);	
	Set<Orderline> lines = new LineServiceImp().getLinesByOrder(order);
	out.println(lines.size());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write('\r');
      out.write('\n');

	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath );
      out.write("\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Language\" content=\"zh-cn\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("\t<meta name=\"description\" content=\"杰普电子商务门户\">\r\n");
      out.write("\t<title>杰普电子商务门户</title>\r\n");
      out.write("\t<LINK href=\"css/main.css\" rel=stylesheet>\r\n");
      out.write("\t<script language = \"JavaScript\" src = \"js/main.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"165\" height=\"60\"></td>\r\n");
      out.write("\t    <td width=\"62%\" background=\"images/top_bg.gif\">　</td>\r\n");
      out.write("\t    <td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\">\r\n");
      out.write("\t\t<img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">\r\n");
      out.write("\t      <table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t          <td width=\"5%\">　</td>\r\n");
      out.write("\t          <td width=\"10%\"><a href=\"index.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image1','','images/index_on.gif',1)\">\r\n");
      out.write("\t\t\t\t<img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>\r\n");
      out.write("\t          <td width=\"10%\"><a href=\"user/userinfo.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image2','','images/reg_on.gif',1)\">\r\n");
      out.write("\t\t\t\t<img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>\r\n");
      out.write("\t          <td width=\"10%\"><a href=\"user/shoppingCart.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image4','','images/carts_on.gif',1)\">\r\n");
      out.write("\t\t\t\t<img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>\r\n");
      out.write("\t          <td width=\"10%\"><a href=\"user/order.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image5','','images/order_on.gif',1)\">\r\n");
      out.write("\t\t\t\t<img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>\r\n");
      out.write("\t          <td width=\"10%\"><a href=\"logout\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image6','','images/exit_on.gif',1)\">\r\n");
      out.write("\t\t\t\t<img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t      </table>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td width=\"15%\"><BR>\r\n");
      out.write("\t>> 欢迎访问 <b>杰普电子商务门户</b> </td><td align=\"left\" style=\"font-family: 隶书; font-weight: bold;\"><BR> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer['name']}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t<td width=\"35%\" align=\"right\">\r\n");
      out.write("\t</td></tr></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--文件体开始-->\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td height=25 valign=middle><img src=\"images/Forum_nav.gif\"\r\n");
      out.write("\t\t\talign=\"middle\"> <a href=index.html>杰普电子商务门户</a> → <a\r\n");
      out.write("\t\t\thref=\"order.html\">定单列表</a> → 定单明细</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<form name=\"order\" method=\"post\" action=\"saveOrder.action\">\r\n");
      out.write("\t<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\"\r\n");
      out.write("\t\tclass=\"tableborder1\" id=\"table1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td valign=\"middle\" colspan=\"2\" align=\"center\" height=\"25\"\r\n");
      out.write("\t\t\t\tbackground=\"images/bg2.gif\"><font color=\"#ffffff\"><b>用户信息</b></font><input\r\n");
      out.write("\t\t\t\ttype=\"button\" value=\"修改\"\r\n");
      out.write("\t\t\t\tonclick=\"javascript:window.location='user/userinfo.jsp';\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"40%\" class=\"tablebody2\" align=\"right\"><b>用户名</b>：</td>\r\n");
      out.write("\t\t\t<td width=\"60%\" class=\"tablebody1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tablebody2\" align=\"right\"><b>联系地址</b>：</td>\r\n");
      out.write("\t\t\t<td class=\"tablebody1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tablebody2\" align=\"right\"><b>邮编</b>：</td>\r\n");
      out.write("\t\t\t<td class=\"tablebody1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer.zip}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tablebody2\" align=\"right\"><b>手机</b>：</td>\r\n");
      out.write("\t\t\t<td class=\"tablebody1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer.telephone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"tablebody2\" align=\"right\"><b>Email地址</b>：</td>\r\n");
      out.write("\t\t\t<td class=\"tablebody1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Customer.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<!--文件尾开始-->\r\n");
      out.write("\t<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\"\r\n");
      out.write("\t\tclass=\"tableborder1\" id=\"table2\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td valign=\"middle\" colspan=\"2\" align=\"center\" height=\"25\"\r\n");
      out.write("\t\t\t\tbackground=\"images/bg2.gif\"><font color=\"#FFFFFF\"><b>付款方式</b></font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"40%\" class=\"tablebody2\" align=\"right\"></td>\r\n");
      out.write("\t\t\t<td width=\"60%\" class=\"tablebody1\">货到付款</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<table cellpadding=3 cellspacing=1 align=center class=tableborder1\r\n");
      out.write("\t\tid=\"table3\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td valign=middle align=center height=25 background=\"images/bg2.gif\"\r\n");
      out.write("\t\t\t\tcolspan=\"5\"><font color=\"#ffffff\"><b>商品购物清单</b></font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /user/orderinfo.jsp(87,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("line");
      // /user/orderinfo.jsp(87,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(lines );
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td class=tablebody2 valign=middle align=center width=\"\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td class=tablebody1 valign=middle width=\"\">&nbsp;&nbsp;<a\r\n");
            out.write("\t\t\t\t\thref=\"user/productDetail.jsp?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" target=\"_blank\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.book.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</a></td>\r\n");
            out.write("\t\t\t\t<td class=tablebody2 valign=middle align=center width=\"\">价格：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t<td class=tablebody1 valign=middle align=center width=\"\">数量：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td class=tablebody2 valign=middle align=left width=\"\">小计：￥");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${line.num * line.book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=tablebody1 valign=middle align=center colspan=\"4\"></td>\r\n");
      out.write("\t\t\t<td class=tablebody1 valign=middle align=left width=\"\">合计：<font\r\n");
      out.write("\t\t\t\tcolor=\"#ff0000\"><b>￥");
      out.print(order.getCost() );
      out.write("</b></font></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\talign=\"center\" height=\"28\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td height=\"17\" background=\"images/bot_bg.gif\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\talign=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"middle\">\r\n");
      out.write("\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\tCopyright &copy;2010 - 2019 <a href=\"http://www.briup.com\"></a><b><font\r\n");
      out.write("\t\t\t\t\tface=\"Verdana,\">briup</font></b><b><font color=#CC0000>.com</font></b><br>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
