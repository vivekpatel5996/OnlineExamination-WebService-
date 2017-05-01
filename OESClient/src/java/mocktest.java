/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import clientservice.ArrayOfcategory;
import clientservice.ArrayOfmocktest;
import clientservice.Mocktest;
import clientservice.Service1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author VIVEK
 */
public class mocktest extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) 
        {
            
           int categoryid=Integer.parseInt(request.getParameter("catid"));
            ArrayOfmocktest am=getMocktest(categoryid);
         
         
           
            if(am.getMocktest().isEmpty())
           {     
              out.println("Sorry No Mocktest available. Visit later !");
           } 
           else
           {
            
              out.println("<h1>Available Mocktests</h1></br></br>");
              out.println("<table border='1'><tr>");
              out.println("<th>Mockid</th>"+""+"<th>TotalQuestion</th>"+""+"<th>Totalmarks</th>"+""+
                      "<th>MarksPerQues</th>"+""+"<th>Negitave Mraks</th>"+""+"<th>TimeLimiy</th></tr>");
              for(int i=0;i<am.getMocktest().size();i++)
                  out.println("<tr><td>"+am.getMocktest().get(i).getMockid().intValue()+"</td><td>"+
                          am.getMocktest().get(i).getTotalquestion().intValue()+"</td><td>"+
                          am.getMocktest().get(i).getTotalmark().intValue() +"</td><td>"+
                          am.getMocktest().get(i).getMarkperque().intValue()+"</td><td>"+
                          am.getMocktest().get(i).getNegperque().intValue()+"  </td><td>"+
                          am.getMocktest().get(i).getTimelimit().intValue()+"</td><td>"+
                          "<a href='question?catid="+am.getMocktest().get(i).getCatid().getValue().toString()+"'>getquestion</a>"+"</td></tr>");
                             
            //  out.println(as2.getCategory().get(i).getCatId().intValue()+as2.getCategory().get(i).getCatName().getValue()+"</br>");
           }
            out.println("</table>");
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

    private ArrayOfmocktest getMocktest(java.lang.Integer categoryid) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.getMocktest(categoryid);
    }

}
