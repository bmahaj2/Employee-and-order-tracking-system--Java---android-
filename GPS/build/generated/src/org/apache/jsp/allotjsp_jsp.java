package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class allotjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/menu_afterlogin.html");
    _jspx_dependants.add("/footer.html");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"two.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var xmlhttp;\n");
      out.write("            function go()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                try\n");
      out.write("                {\n");
      out.write("                    xmlhttp = new ActiveXObject(\"Msxml2.XMLHTTP\"); //Old Microsoft Browsers\n");
      out.write("                }\n");
      out.write("                catch (e)\n");
      out.write("                {\n");
      out.write("                    try\n");
      out.write("                    {\n");
      out.write("                        xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\"); //For new Internet Explorer IE 6.0 \n");
      out.write("                    }\n");
      out.write("                    catch (e1)\n");
      out.write("                    {\n");
      out.write("                        xmlhttp = new XMLHttpRequest(); //For mozilla,Opera Browsers\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var text = document.getElementById(\"username\").value;\n");
      out.write("                xmlhttp.open(\"GET\", \"./allot?q=\" + text, true);\n");
      out.write("\n");
      out.write("                xmlhttp.onreadystatechange = go2;\n");
      out.write("                xmlhttp.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function go2()\n");
      out.write("            {\n");
      out.write("//                alert(xmlhttp.responseText);\n");
      out.write("                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    document.getElementById(\"dpt\").innerHTML = xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"all\">\n");
      out.write("            ");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>header</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- Save for Web Slices (header.psd) -->\r\n");
      out.write("<img src=\"images/header.png\" width=\"980\" height=\"300\" alt=\"\">\r\n");
      out.write("<!-- End Save for Web Slices -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("            ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />\n");
      out.write("\t<meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1' />\n");
      out.write("\t<link rel='stylesheet' type='text/css' href='styles.css' />\n");
      out.write("\t<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>\n");
      out.write("\t<script type='text/javascript' src='menu_jquery.js'></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id='cssmenu'>\n");
      out.write("     \n");
      out.write("<ul>\n");
      out.write("         <li><a href='home.jsp'><span>Home</span></a></li>\n");
      out.write("\n");
      out.write("   <li class='has-sub'><a href='#'><span>Employee</span></a>\n");
      out.write("      <ul>\n");
      out.write("         <li><a href='signup.jsp'><span>Add Employee</span></a></li>\n");
      out.write("       \n");
      out.write("         <li class='last'><a href='view_user.jsp'><span>View Employee</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("   <li class='has-sub'><a href='#'><span>Devices</span></a>\n");
      out.write("      <ul>\n");
      out.write("         <li><a href='add_device.jsp'><span>Add Device</span></a></li>\n");
      out.write("         <li><a href='allotjsp.jsp'><span>Allot Device</span></a></li>\n");
      out.write("         <li class='last'><a href='view_alloteddevices.jsp'><span>View Allotted Devices</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("   <li><a href='message_to_emp.jsp'><span>Send Message</span></a></li>\n");
      out.write("   <li class='has-sub'><a href='#'><span>Employee Tracking</span></a>\n");
      out.write("      <ul>\n");
      out.write("         <li class='last'><a href='tracking_viewemployee.jsp'><span>View and Track Employee</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("   <li class='has-sub last'><a href='#'><span>Courier Tracking</span></a>\n");
      out.write("      <ul>\n");
      out.write("         <li><a href='CourierAsssignment.jsp'><span>Assign Courier</span></a></li>\n");
      out.write("         <li class='last'><a href='view_courier_assignment.jsp'><span>View And Track Courier</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("      \n");
      out.write("    <li class='has-sub last'><a href='#'><span>More</span></a>\n");
      out.write("      <ul>\n");
      out.write("         <li><a href='contactus.jsp'><span>Contact Us</span></a></li>\n");
      out.write("         <li class='last'><a href='home.jsp'><span>Logout</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <h1 class=\"heading\" style=\"margin-top: -30px;\"><center>Allot Device</center></h1>\n");
      out.write("                <center>\n");
      out.write("                    <div style=\"border-radius: 10px;border:solid 3px saddlebrown;background: white; width:600px; box-shadow: 15px 15px#888888;\">\n");
      out.write("                        <center>\n");
      out.write("                            <!--                <span  style=\"margin-top: 50px; position: absolute; class:headingstyle\">Allot Device</span>-->\n");
      out.write("                            <!--<h1 class=\"headingstyle\"> Allot Device</h1>-->\n");
      out.write("\n");
      out.write("                            ");

                                Class.forName("com.mysql.jdbc.Driver");
                                System.out.println("Driver loaded successfully");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gps", "root", "SYSTEM");
                                System.out.println("connection build");
                                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                System.out.println("statemt");

                                ResultSet rs = stmt.executeQuery("select imei from gps.devices where imei not in (select imei from gps.device_allotment where releasedate is null)");
                            
      out.write("\n");
      out.write("                            <form action=\"allotjsp2.jsp\" method=\"POST\">\n");
      out.write("                                <table border=\"0\" class=\"tablestyle\" style=\"margin-top: 30px;\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>IMEI</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"IMEI\" class=\"tfield\">\n");
      out.write("                                                ");

                                                    while (rs.next()) {
                                                        String IMEI = rs.getString("IMEI");
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(IMEI);
      out.write("\" >");
      out.print(IMEI);
      out.write("</option>\n");
      out.write("                                                ");


                                                    }

                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
                               ResultSet rs1 = stmt.executeQuery("select * from signup");
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>EMPLOYEE</td>\n");
      out.write("                                        <td>\n");
      out.write("\n");
      out.write("                                            <select name=\"username\" id=\"username\" onchange=\"go()\" class=\"tfield\">\n");
      out.write("                                                ");

                                                    while (rs1.next()) {
                                                        String username = rs1.getString("username");
                                                        String firstname = rs1.getString("firstname");
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(username);
      out.write('"');
      out.write('>');
      out.print(firstname);
      out.write("</option>\n");
      out.write("                                                ");


                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"submit\" value=\"add\" class=\"submitsyle\"</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                <div id=\"dpt\">\n");
      out.write("\n");
      out.write("                                </div> \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            ");

                                String msg = request.getParameter("msg");
                                if (msg != null) {
                            
      out.write("\n");
      out.write("                            <label style=\"color:red\">");
      out.print(msg);
      out.write("\n");
      out.write("                            </label>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </center>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>3698</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- Save for Web Slices (3698.psd) -->\r\n");
      out.write("<img src=\"images/footer.png\" width=\"980\" height=\"52\" alt=\"\">\r\n");
      out.write("<!-- End Save for Web Slices -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
