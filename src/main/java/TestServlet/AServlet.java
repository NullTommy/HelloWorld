package TestServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.OutputStream;

public class AServlet implements Servlet {

    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("destory");
    }

    public void init(ServletConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("init");
    }

    public void service(ServletRequest arg0, ServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        OutputStream ops= arg1.getOutputStream();
        ops.write("hellow 庞海臣".getBytes());

        System.out.println("hello--service");
    }

    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

}