/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-17 14:48:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fuser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fuser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fshiro_005fuser.release();
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/bk.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/lbt_bk.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/js/carousel.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/js/bk.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap-paginator.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--   导航栏下图片-->\r\n");
      out.write("\t<div class=\"dhl_tp\"></div>\r\n");
      out.write("\t<div class=\"fgh\"></div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!--    路径-->\r\n");
      out.write("\t\t<div class=\"lj\">\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb row\">\r\n");
      out.write("\t\t\t\t<li><a href=\"http://localhost:8080/itjl/\">主页</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"http://localhost:8080/itjl/bk\">博客</a></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--        主体-->\r\n");
      out.write("\t\t<div class=\"zt\">\r\n");
      out.write("\t\t\t<div class=\"zt_l\">\r\n");
      out.write("\t\t\t\t<div class=\"zt_l_top\">\r\n");
      out.write("\t\t\t\t\t<!--           轮播图-->\r\n");
      out.write("\t\t\t\t\t<div class=\"lbt\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a1.png\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a2.png\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a3.png\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a4.png\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a5.png\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"img-index\"></ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--                图组-->\r\n");
      out.write("\t\t\t\t\t<div class=\"tz\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tz_1\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\" background-image:url(");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a6.png);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tz_wz text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://localhost:8080/itjl/showBk/41\">庖丁解---idea妞</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tz_1\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\" background-image:url(");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a7.png);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tz_wz text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://localhost:8080/itjl/showBk/37\">如何在linux环境下调试...</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tz_2\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\" background-image:url(");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a8.png);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tz_wz text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://localhost:8080/itjl/showBk/32\">数据可视化-Tableau-故事</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tz_2\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\" background-image:url(");
      out.print(request.getContextPath());
      out.write("/images/bk/images/a9.png);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tz_wz text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"http://localhost:8080/itjl/showBk/38\">Maven环境隔离</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\t\t\t\t<!--                消息更新提示-->\r\n");
      out.write("\t\t\t\t<input id=\"total\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qPage.total }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" hidden> <input\r\n");
      out.write("\t\t\t\t\tid=\"cpage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qPage.cpage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" hidden>\r\n");
      out.write("\t\t\t\t<div class=\"zt_l_body\">\r\n");
      out.write("\t\t\t\t\t<!--                   信息展示-->\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"example\" style=\"text-align: center\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"pageLimit\"></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"zt_r\">\r\n");
      out.write("\t\t\t\t<!-- 搜索栏-->\r\n");
      out.write("\t\t\t\t<div class=\"ssl\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"请输入关键字\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"ssltext\"> <span class=\"input-group-btn\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-default\" value=\"查询\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"sslclick()\" /></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\t\t\t\t\t<!--            个人信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"grxx\">\r\n");
      out.write("\t\t\t\t\t\t<!--               头像行-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grxx_tx row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/images/bk/images/left_btn1.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\" class=\"grxx_tx_tp\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"grxx_tx_id\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"grxx_tx_ch\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-warning btn-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlv&nbsp;<span class=\"grxx_lv\">0</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fgx\"></div>\r\n");
      out.write("\t\t\t\t\t\t<!--                数据行-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sjh row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"conteiner text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">文章</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">粉丝</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">关注</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">收藏</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 grxx_wz\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 grxx_fs\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 grxx_gz\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 grxx_sc\">无</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fgx\"></div>\r\n");
      out.write("\t\t\t\t\t\t<!--                       徽章 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"hz row\">\r\n");
      out.write("\t\t\t\t\t\t\t签名:&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"grxx_gxqm\">无</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!--                       等级-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"jf row \">\r\n");
      out.write("\t\t\t\t\t\t\t经验:&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"grxx_jy\">无</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--                    发表文章-->\r\n");
      out.write("\t\t\t\t\t<div class=\"fbwz\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fbwz_an text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-info\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"window.location.href = 'http://localhost:8080/itjl/bx';\">发表文章</button>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp; <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"http://localhost:8080/itjl/my_home\"><button\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"button\" class=\"btn btn-info\">我的主页</button></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\t\t\t\t\t<!--                    博客分类-->\r\n");
      out.write("\t\t\t\t\t<div class=\"bkfl\">\r\n");
      out.write("\t\t\t\t\t\t<h4>分类</h4>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bkfl_kj\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\t\t\t\t\t<!--                    热门博客-->\r\n");
      out.write("\t\t\t\t\t<div class=\"rmbk\">\r\n");
      out.write("\t\t\t\t\t\t<h4>热门博客</h4>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rmbk_kj\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/html/bk.jsp(215,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/html/bk.jsp(215,7) '${bkTjl }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${bkTjl }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/html/bk.jsp(215,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("bkTjl");
      // /WEB-INF/html/bk.jsp(215,7) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setBegin(0);
      // /WEB-INF/html/bk.jsp(215,7) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setEnd(8);
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<div class='rmbk_a'>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class='rmbk_a_l'>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<img src='");
            out.print(request.getContextPath());
            out.write('/');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bkTjl.user.user_tx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("' alt='' class='rmbk_a_l_tp'>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class='rmbk_a_r'>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class='rmbk_a_r_bt'>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<b><a href='http://localhost:8080/itjl/showBk/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkTjl.bk_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("' title=''>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bkTjl.bk_bt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</a></b>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class='rmbk_a_r_nr'>标签:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bkTjl.bk_bq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fgh\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fuser_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar userid = $(\"#user_id\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\".zt_l_body\").append(\"\");\r\n");
      out.write("\t\t\tvar a = document.getElementsByClassName(\"zsk_tj_xx\");\r\n");
      out.write("\t\t\tfor (var i = 0; i < a.length; i++) {\r\n");
      out.write("\t\t\t\tvar tj_count = parseInt($(\".tj_count\").eq(i).text());\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (tj_count <= 100) {\r\n");
      out.write("\t\t\t\t\t$(\".zsk_tj_xx\").eq(i).addClass(\"blue\");\r\n");
      out.write("\t\t\t\t} else if (tj_count >= 100 && tj_count <= 1000) {\r\n");
      out.write("\t\t\t\t\t$(\".zsk_tj_xx\").eq(i).addClass(\"yellow\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\".zsk_tj_xx\").eq(i).addClass(\"red\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\turl : \"http://localhost:8080/itjl/selectUserxx/\" + userid,\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t$(\".grxx_tx_id\").text(data.user_name);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_tx_ch\").text(data.ch);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_tx_tp\").attr('src', \"/itjl/\" + data.user_tx);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_fs\").text(data.fs_count);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_sc\").text(data.sc_count);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_wz\").text(data.wz_count);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_gz\").text(data.gz_count);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_gxqm\").text(data.gxqm);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_jy\").text(data.jy);\r\n");
      out.write("\t\t\t\t\t$(\".grxx_lv\").text(data.dj);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\turl : \"http://localhost:8080/itjl/selectfl\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < data.length-1; i++) {\r\n");
      out.write("\t\t\t\t\t\t$(\".bkfl_kj\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\"<a href='http://localhost:8080/itjl/bk?str=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ data[i]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ \"'><div class='bkfl_a text-center'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ data[i] + \"</div></a>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\".carousel-content\").carousel({\r\n");
      out.write("\t\t\t\tcarousel : \".carousel\", //轮播图容器\r\n");
      out.write("\t\t\t\tindexContainer : \".img-index\", //下标容器\r\n");
      out.write("\t\t\t\ttiming : 5000, //自动播放间隔\r\n");
      out.write("\t\t\t\tanimateTime : 800, //动画时间\r\n");
      out.write("\t\t\t\tauto : true, //是否自动播放\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tvar total = $(\"#total\").val();\r\n");
      out.write("\t\tvar cpage = $(\"#cpage\").val();\r\n");
      out.write("\r\n");
      out.write("\t\tif (total % 10 == 0) {\r\n");
      out.write("\t\t\ttotal = total / 10;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\ttotal = total / 10 + 1\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('#pageLimit').bootstrapPaginator({\r\n");
      out.write("\t\t\tcurrentPage : cpage,\r\n");
      out.write("\t\t\ttotalPages : total,\r\n");
      out.write("\t\t\tsize : \"normal\",\r\n");
      out.write("\t\t\tbootstrapMajorVersion : 3,\r\n");
      out.write("\t\t\talignment : \"right\",\r\n");
      out.write("\t\t\tnumberOfPages : 5,\r\n");
      out.write("\t\t\titemTexts : function(type, page, current) {\r\n");
      out.write("\t\t\t\tswitch (type) {\r\n");
      out.write("\t\t\t\tcase \"first\":\r\n");
      out.write("\t\t\t\t\treturn \"首页\";\r\n");
      out.write("\t\t\t\tcase \"prev\":\r\n");
      out.write("\t\t\t\t\treturn \"上一页\";\r\n");
      out.write("\t\t\t\tcase \"next\":\r\n");
      out.write("\t\t\t\t\treturn \"下一页\";\r\n");
      out.write("\t\t\t\tcase \"last\":\r\n");
      out.write("\t\t\t\t\treturn \"末页\";\r\n");
      out.write("\t\t\t\tcase \"page\":\r\n");
      out.write("\t\t\t\t\treturn page;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//点击事件\r\n");
      out.write("\t\t\tonPageClicked : function(event, originalEvent, type, page) {\r\n");
      out.write("\t\t\t\tlocation.href = \"http://localhost:8080/itjl/bk?page=\" + page;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction sslclick() {\r\n");
      out.write("\t\t\tlocation.href = \"http://localhost:8080/itjl/bk?ssl=\"+$(\"#ssltext\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/html/bk.jsp(108,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/html/bk.jsp(108,5) '${ bkList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ bkList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/html/bk.jsp(108,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("bkList");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class='zsk'>\r\n");
          out.write("\t\t\t\t\t\t\t<div class='zsk_tj'>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class='zsk_tj_xx text-center'>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<h4 class='zsk_tj_xx_sj tj_count'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.bk_tjl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<h5 class='zsk_tj_xx_sj'>推荐</h5>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<a href='http://localhost:8080/itjl/showBk/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.bk_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("'><div\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass='zsk_bt h'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.bk_bt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div></a>\r\n");
          out.write("\t\t\t\t\t\t\t<div class='zsk_nr'>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class='zsk_nr_lb h'>类别:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.bk_bq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass='zsk_nr_zz h'>作者:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.user.user_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass='zsk_nr_rq h'>日期:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass='zsk_nr_lll h'>浏览量:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ bkList.bk_ll}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class='fgx'></div>\r\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_005fuser_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:user
    org.apache.shiro.web.tags.UserTag _jspx_th_shiro_005fuser_005f0 = (org.apache.shiro.web.tags.UserTag) _005fjspx_005ftagPool_005fshiro_005fuser.get(org.apache.shiro.web.tags.UserTag.class);
    _jspx_th_shiro_005fuser_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fuser_005f0.setParent(null);
    int _jspx_eval_shiro_005fuser_005f0 = _jspx_th_shiro_005fuser_005f0.doStartTag();
    if (_jspx_eval_shiro_005fuser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<input type=\"text\" id=\"user_id\"\r\n");
        out.write("\t\t\tvalue=\"");
        if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_th_shiro_005fuser_005f0, _jspx_page_context))
          return true;
        out.write("\" hidden />\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fuser_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fuser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fuser.reuse(_jspx_th_shiro_005fuser_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fuser.reuse(_jspx_th_shiro_005fuser_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005fuser_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005fuser_005f0);
    // /WEB-INF/html/bk.jsp(240,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("user_id");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }
}
