/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.2.v20170220
 * Generated at: 2019-09-28 08:37:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movie_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/e:/repo/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
    _jspx_dependants.put("jar:file:/e:/repo/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/e:/repo/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1564850243689L));
    _jspx_dependants.put("file:/e:/repo/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1567773193419L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>电影列表</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t电影名称：\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"searchBtn\" class=\"btn btn-primary\">搜索</button>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"/toAdd\"><button type=\"button\" class=\"btn btn-primary\">添加</button></a>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button id=\"batchRemoveBtn\" type=\"button\" class=\"btn btn-primary\">批量删除</button>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><input type=\"checkbox\" id=\"selectAllBox\">全选&nbsp;&nbsp;<a href=\"javascript:\" id=\"reverse-select\">反选</a></th>\r\n");
      out.write("\t\t\t\t<th>电影名称</th>\r\n");
      out.write("\t\t\t\t<th>剧情介绍</th>\r\n");
      out.write("\t\t\t\t<th>导演</th>\r\n");
      out.write("\t\t\t\t<th>电影分类</th>\r\n");
      out.write("\t\t\t\t<th>发行日期</th>\r\n");
      out.write("\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<tr><td colspan=\"7\"><button id=\"firstBtn\" type=\"button\" class=\"btn btn-primary\">首页</button>&nbsp;&nbsp;<button type=\"button\" id=\"preBtn\" class=\"btn btn-primary\">上一页</button>&nbsp;&nbsp;<button type=\"button\" id=\"nextBtn\" class=\"btn btn-primary\">下一页</button>&nbsp;&nbsp;<button type=\"button\" id=\"lastBtn\" class=\"btn btn-primary\">末页</button></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar currentPage = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\tvar last = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\t\t$('#selectAllBox').click(function(){\r\n");
      out.write("\t\t\tif($(this).is(\":checked\")){\r\n");
      out.write("\t\t\t\t$('.idSearchBox').prop('checked',true);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('.idSearchBox').prop('checked',false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('#reverse-select').click(function(){\r\n");
      out.write("\t\t\t$('.idSearchBox').each(function(){\r\n");
      out.write("\t\t\t\t$(this).is(\":checked\")?$(this).prop('checked',false):$(this).prop('checked',true);\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('#searchBtn').click(function(){\r\n");
      out.write("\t\tvar name = $('#name').val();\r\n");
      out.write("\t\tlocation=\"/?name=\"+name;\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#firstBtn').click(function() {\r\n");
      out.write("\t\t\t\tlocation = \"/?pageNo=1\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t$('#preBtn').click(function(){\r\n");
      out.write("\t\t\tif(currentPage ==1){\r\n");
      out.write("\t\t\t\tlocation=\"/?pageNo=1\";\r\n");
      out.write("\t\t\t}else if(currentPage<=last){\r\n");
      out.write("\t\t\t\tlocation=\"/?pageNo=\"+(currentPage-1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#nextBtn').click(function(){\r\n");
      out.write("\t\t\tif(last == 1){\r\n");
      out.write("\t\t\t\tlocation=\"/?pageNo=1\";\r\n");
      out.write("\t\t\t}else if(currentPage <last){\r\n");
      out.write("\t\t\t\tlocation=\"/?pageNo=\"+(currentPage+1);\r\n");
      out.write("\t\t\t}else if(currentPage==last){\r\n");
      out.write("\t\t\t\tlocation=\"/?pageNo=\"+currentPage;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('#lastBtn').click(function(){\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=\"+last;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('#batchRemoveBtn').click(function(){\r\n");
      out.write("\t\t\tvar checkedList = $('.idSearchBox:checked');\r\n");
      out.write("\t\t\tif(checkedList.length==0){\r\n");
      out.write("\t\t\t\talert(\"请选择要删除的影片信息\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar removeUrl = \"/remove?\"\r\n");
      out.write("\t\t\t\t\tcheckedList.each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar id = $(this).val();\r\n");
      out.write("\t\t\t\t\t\tremoveUrl+=\"id=\"+id+\"&\"\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\tremoveUrl = removeUrl.substring(0,removeUrl.length-1);\r\n");
      out.write("\t\t\t\tif(confirm(\"您是否要删除这些影片？\")){\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl:removeUrl,\r\n");
      out.write("\t\t\t\t\t\ttype:'get',\r\n");
      out.write("\t\t\t\t\t\ttimeout:3000,\r\n");
      out.write("\t\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t\talert(data.message);\r\n");
      out.write("\t\t\t\t\t\tlocation=\"/\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tfunction remove(id){\r\n");
      out.write("\t\t\tvar removeUrl = \"/remove?id=\"+id;\r\n");
      out.write("\t\t\tif(confirm(\"您是否要删除此影片？\")){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:removeUrl,\r\n");
      out.write("\t\t\t\t\ttype:'get',\r\n");
      out.write("\t\t\t\t\ttimeout:3000,\r\n");
      out.write("\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\talert(data.message);\r\n");
      out.write("\t\t\t\t\t\tlocation=\"/\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
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
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/movie-list.jsp(35,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/movie-list.jsp(35,3) '${movies }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${movies }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/movie-list.jsp(35,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("movie");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><input type=\"checkbox\" class=\"idSearchBox\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"></td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.director }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.categoryNames }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.issuingDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td><a href=\"/toUpdate?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">编辑</a>&nbsp;&nbsp;<a href=\"javascript:void(0)\" onclick=\"remove(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${movie.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">删除</a></td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t");
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
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
