import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FutureCalculator", urlPatterns = "/cal")
public class ServletFutureValueCal extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        double investmentAmount = Double.parseDouble(request.getParameter("investmentAmount"));
        double yearlyRate = Double.parseDouble(request.getParameter("yearlyRate"));
        int year = Integer.parseInt(request.getParameter("year"));

        double result = investmentAmount;
        for (int i = 0; i < year; i++) {
            result = result + (result * yearlyRate * 0.01);
        }
        request.setAttribute("investmentAmount", investmentAmount);
        request.setAttribute("yearlyRate", yearlyRate);
        request.setAttribute("year", year);
        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
