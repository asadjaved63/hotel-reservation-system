package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminroomgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>groupmanage</title>\r\n");
      out.write("   <link href=\"CSS/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\">\r\n");
      out.write("    <br>\r\n");
      out.write("    ");
 Vector<String []> vgroup = serv.database.getGroup();
     
      out.write("\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("     <tr bgcolor=\"#999999\">\r\n");
      out.write("       <th id=\"thlabel\">groupname</th>\r\n");
      out.write("       <th id=\"thlabel\">pic</th>\r\n");
      out.write("       <th id=\"thlabel\">groupdetails</th>\r\n");
      out.write("       <th id=\"thlabel\">grouprules</th>\r\n");
      out.write("       <th id=\"thlabel\">Edit/Del</th>\r\n");
      out.write("     </tr>\r\n");
      out.write("      ");
for(String []s:vgroup){
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>");
      out.print( s[1] );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( s[0] );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( s[2] );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( s[3] );
      out.write("</td>\r\n");
      out.write("        <td>\r\n");
      out.write("         <a href=listserv?action=editGroup&&groupid=");
      out.print( s[0] );
      out.write(">edit/del</a>\r\n");
      out.write("        </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     ");
}
      out.write("\r\n");
      out.write("    </table><br>\r\n");
      out.write("    <center><a href=adminaddroomgroup.jsp>addgroup</a></center></div>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}