/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serv;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Wang Qichen
 */
public class changeinfoserv extends HttpServlet{
    public void init(ServletConfig servletconfig) throws ServletException {
        super.init(servletconfig);
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        doPost(httpservletrequest, httpservletresponse);
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        String action = httpservletrequest.getParameter("action");
        HttpSession httpsession = httpservletrequest.getSession(true);
        PrintWriter printwriter = httpservletresponse.getWriter();
        String msg = "";
        if (action.equals("changeinfo")) {
            String username=(String)httpsession.getAttribute("username");
			String realname = httpservletrequest.getParameter("realname").trim();
			String gender = httpservletrequest.getParameter("gender").trim();
			String email = httpservletrequest.getParameter("email");
			String telephone = httpservletrequest.getParameter("telephone").trim();
			String sql="update user set realname ='"+realname+"',gender='"+gender+
			   "',email='"+email+"',telephone='"+telephone+"'where username='"+username+"'";
			if(database.update(sql)==1){
				msg = "Success! Your profile has been changed.<br>";
				httpservletrequest.setAttribute("msg",msg);
				httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest,httpservletresponse);
        }    } }
}