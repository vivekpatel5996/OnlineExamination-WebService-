/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import AdminService.Admin;
import AdminService.ArrayOfstring;
import clientservice.ArrayOfcategory;
import clientservice.ArrayOftest;
import clientservice.Service1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

        





/**
 *
 * @author dell pc
 */
public class signin extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/noesservices2.cloudapp.net/Admin.svc.wsdl")
    private Admin service_1;
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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String un = request.getParameter("uname");
        String pwd = request.getParameter("password");
        if(validate(un,pwd))
        {
            out.println("Welcome !</br>");
            
             ArrayOfcategory as2=getCategory_1();
         
      
            if(as2.getCategory().isEmpty())
           {     
              out.println("Sorry No category Available.Please visit later.");
           } 
           else
           {
              out.println("Available Exam categories:</br>");
              for(int i=0;i<as2.getCategory().size();i++)
                  out.println("<a href='mocktest?catid="+as2.getCategory().get(i).getCatId().intValue()+"'>"+as2.getCategory().get(i).getCatName().getValue()+"</a>");
            //  out.println(as2.getCategory().get(i).getCatId().intValue()+as2.getCategory().get(i).getCatName().getValue()+"</br>");
           }
        }
        else
        {
            out.println("First Register yourself !"+"<a href='signup.jsp'>Click Here.</a>");
            
        }
        
        
       
       /*ArrayOfstring as=getCategory();
         
      
          if(as.getString().isEmpty())
          {     
              out.println("Sorry No category Available.Please visit later.");
          } 
          else
          {
              out.println("Available Exam categories:</br>");
              for(int i=0;i<as.getString().size();i++)
              out.println(as.getString().get(i)+"</br>");
          }
       */
          
        /*ArrayOftest as1=gettest();
         
      
          if(as1.getTest().isEmpty())
          {     
              out.println("Sorry No category Available.Please visit later.");
          } 
          else
          {
              out.println("Available Exam categories:</br>");
              for(int i=0;i<as1.getTest().size();i++)
              out.println(as1.getTest().get(i).getN().getValue()+as1.getTest().get(i).getR().getValue()+"</br>");
          }
         */ 
           
         
       
       //  for(String st:ls)
          //   out.println(st);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try 
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private Boolean validate(java.lang.String username, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.validate(username, password);
    }

    private ArrayOftest gettest() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.gettest();
    }

    private ArrayOfstring getCategory() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        AdminService.IAdmin port = service_1.getBasicHttpBindingIAdmin();
        return port.getCategory();
    }

    private ArrayOfcategory getCategory_1() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientservice.IService1 port = service.getBasicHttpBindingIService1();
        return port.getCategory();
    }

   
   
   
   

   

   
  

    

    

    

    

   
    

}
