package sx.java.www.servlet;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RewriteDispatcherServlet extends DispatcherServlet {
    @Override
    protected void noHandlerFound(HttpServletRequest request,
                                  HttpServletResponse response) throws Exception {
        String path = request.getServletPath();
        String method = request.getMethod();
        response.sendRedirect(request.getContextPath() + "/demo/notFound?path="+path+"&method="+method);
    }
}
