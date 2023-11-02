package exercise.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    // BEGIN
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(req.getLocalAddr());
        Object input = req.getParameter("name");
        if (input != null) {
            resp.getWriter().write("Hello, " + input.toString() + "!");
        } else {
            resp.getWriter().write("Hello, Guest!");
        }
    }
    // END
}
