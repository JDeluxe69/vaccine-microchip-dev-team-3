package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Records</title>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"patientRecords\" align=\"center\">\n");
      out.write("            <h1>Patient Records</h1>\n");
      out.write("            <div class=\"admin-card\">\n");
      out.write("                <h5 class=\"card-header\">Admin:>> ADMIN USERNAME GOES HERE<<<</h5>\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                        <thead class=\"thead-light\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">NHS Number</th>\n");
      out.write("                                <th scope=\"col\">Full name</th>\n");
      out.write("                                <th scope=\"col\">Email</th>\n");
      out.write("                                <th scope=\"col\">Time</th>\n");
      out.write("                                <th scope=\"col\">Date</th>\n");
      out.write("                                <th scope=\"col\">NHS/Private</th>\n");
      out.write("                                <th scope=\"col\">Service</th>\n");
      out.write("                                <th scope=\"col\">Cost</th>\n");
      out.write("                                <th scope=\"col\">Prescribed</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <th scope=\"col\">Delete</th>\n");
      out.write("                                <th scope=\"col\">Update</th>\n");
      out.write("                                <th scope=\"col\">Issue Prescription</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\">1</th>\n");
      out.write("                                <td>Mark Otto</td>\n");
      out.write("                                <td>@mdopolol.com</td>\n");
      out.write("                                <td>11:00</td>\n");
      out.write("                                <td>17.12.2020</td>\n");
      out.write("                                <td>NHS</td>\n");
      out.write("                                <td>Surgery</td>\n");
      out.write("                                <td>1000</td>\n");
      out.write("                                <td>No</td>\n");
      out.write("\n");
      out.write("                                <td><a href=\"deletePatient.jsp?id=>\">Delete</a></td>                             \n");
      out.write("                                <td><a href=\"updatePatient.jsp?id=>\">Update</a></td>\n");
      out.write("                                <td><a href=\"issuePerscription.jsp?id=>\">Issue</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"addPatient.jsp?id=>\" class=\"btn btn-primary btn-lg active\"  role=\"button\" aria-pressed=\"true\">Add Patient</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
