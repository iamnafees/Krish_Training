package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Calculate", value = "/Calculate")
public class Calculate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String answer = null;
        int number1=Integer.parseInt(request.getParameter("number1"));
        int number2=Integer.parseInt(request.getParameter("number2"));
        String sign=request.getParameter("sign");

       try {

           if(sign.equals("+")){

              answer=String.valueOf(number1+number2);
           }

           if(sign.equals("-")){

               answer=String.valueOf(number1-number2);
           }
           if(sign.equals("*")){

               answer=String.valueOf(number1*number2);
           }
           if(sign.equals("/")){

               answer=String.valueOf(number1/number2);
           }

       }catch (Exception e){
answer="Exception Occured";


       }
       request.setAttribute("answer", answer);

       request.getRequestDispatcher("display.jsp").forward(request,response);
    }


}
