/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-12-19 03:52:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1576725690634L));
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
  }

  public void _jspDestroy() {
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

      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>re:flex</title>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\"> <!-- 부트스트랩 -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("   \r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.4.1.js\"></script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/header.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("        <header class=\"container-fluid navbar-fixed-top\">\r\n");
      out.write("            \r\n");
      out.write("                <!-- first line -->\r\n");
      out.write("                <div id=\"header-first\" class=\"row\">\r\n");
      out.write("                    <div id=\"logo\" class=\"col-md-4\">\r\n");
      out.write("                        <h1><a href=\"");
      out.print(request.getContextPath() );
      out.write("\">re:flex</a></h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"search\" class=\"col-md-4\">\r\n");
      out.write("                        <h2 class=\"sr-only\">상품 검색</h2>\r\n");
      out.write("                        <form action=\"\">\r\n");
      out.write("                            <button type=\"submit\" id=\"btn-search\" aria-label=\"search products\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <input type=\"search\" name=\"search\" placeholder=\"검색\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"header-first-menu\" class=\"col-md-4\">\r\n");
      out.write("                        <ul class=\"list-unstyled list-inline text-right\">\r\n");
      out.write("                            <li><a href=\"#\">관리인</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <h2 class=\"sr-only\">장바구니</h2>\r\n");
      out.write("                                <a href=\"#\" aria-label=\"cart\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <!-- side menu -->\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h2 class=\"sr-only\">사이드메뉴</h2>\r\n");
      out.write("                            <button type=\"button\"  id=\"btn-sidemenu\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-list\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul id=\"level1-sidemenu\" class=\"list-unstyled sidemenu\">\r\n");
      out.write("                                <li></li>\r\n");
      out.write("                                <li id=\"recommended\" data-target=\"#level2-recommended\"><a href=\"#\">이럴 때 빌려봐<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">패션<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">뷰티<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">리빙<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">키즈<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">레저<span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a></li>\r\n");
      out.write("                                <li><a href=\"#\">고객서비스</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul id=\"level2-recommended\" class=\"list-unstyled sidemenu\">\r\n");
      out.write("                                <li class=\"go-back text-center\"><a href=\"#\"><span class=\"glyphicon glyphicon-menu-left\" aria-hidden=\"true\"></span>이럴 때 빌려봐</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                                <li><a href=\"#\">바캉스 갈 때</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        \r\n");
      out.write("               <!-- second line -->\r\n");
      out.write("               <nav id=\"header-second\" class=\"line-style\">\r\n");
      out.write("                    <h2 class=\"sr-only\">메인메뉴</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled list-inline\">\r\n");
      out.write("                        <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/admin/productManager\">상품관리</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/admin/orderManager\">주문관리</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/admin/memberManager\">회원관리</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("                <!-- 3 line -->\r\n");
      out.write("                <nav id=\"header-second\" class=\"line-style-notop\">\r\n");
      out.write("                        \r\n");
      out.write("                    <ul class=\"list-unstyled list-inline\">\r\n");
      out.write("                        <li><a href=\"admin_item.html\">상품등록</a></li>\r\n");
      out.write("                        <li><a href=\"admin_itme_srch.html\">상품조회</a></li>\r\n");
      out.write("                        <li><a href=\"admin_item_review.html\">이용후기 관리</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("        \r\n");
      out.write("                  <div>상품관리 !!!!!! 페이지 !</div>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                  </table>\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
