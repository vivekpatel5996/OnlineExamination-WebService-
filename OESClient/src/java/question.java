/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import clientservice.ArrayOfquestion;
import clientservice.Service1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author VIVEK
 */
@WebServlet(urlPatterns = {"/question"})
public class question extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/noesservices.cloudapp.net/Service1.svc.wsdl")
    private Service1 service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            ArrayOfquestion aq=getQuestions(Integer.parseInt(request.getParameter("catid")));
            if(aq.getQuestion().isEmpty())
            {
                out.println("Sorry Questions not available ! visit later.");
            }
            else
            {
                out.println("<html><body>");
                  for(int i=0;i<aq.getQuestion().size();i++)
                  {
                    out.println("<tr><td>"+aq.getQuestion().get(i).getQuestiontext().getValue()+"</td></tr>");
            
                    out.println("<tr><td><input type=radio name=op1 >"+aq.getQuestion().get(i).getOption1().getValue()+"</td>"+
                            "<td><input type=radio name=op2 >"+aq.getQuestion().get(i).getOption2().getValue()+"</td>"+
                            "<td><input type=radio name=op3 >"+aq.getQuestion().get(i).getOption3().getValue()+"</td>"+
                            "<td><input type=radio name=op1 >"+aq.getQuestion().get(i).getOption1().getValue()+"</td></tr><br><br>");
                    out.println("</body></html>");
            }
                
        }
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private ArrayOfquestion getQuestions(java.lang.Integer catid) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.getQuestions(catid);
    }

}
