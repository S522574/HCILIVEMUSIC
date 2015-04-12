/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import musicentities.RegistrationEntityy;

/**
 *
 * @author S522617
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet RegistrationServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        
//        }
        String firstName=request.getParameter("firstname");
     String lastName=request.getParameter("lastname");
     String dob=request.getParameter("dob");
     String city=request.getParameter("city");
     String state=request.getParameter("street");
     String zip=request.getParameter("zip");
     String phone=request.getParameter("phone1")+request.getParameter("phone2")+request.getParameter("phone3");
     String email=request.getParameter("email");
     String pword=request.getParameter("password");
     String securityQuestion=request.getParameter("secques");
     String securityAnswer=request.getParameter("secanswer");
       
        RegistrationEntityy r=new RegistrationEntityy();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setDob(dob);
        r.setCity(city);
        r.setState(state);
        r.setZip(zip);
        r.setPhone(phone);
        r.setEmail(email);
        r.setPword(pword);
        r.setSecurityQuestion(securityQuestion);
        r.setSecurityAnswer(securityAnswer);
        
        try
      {
         FileOutputStream fileOut =
         new FileOutputStream(r.getEmail()+".ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(r);
         out.close();
         fileOut.close();
//         System.out.printf("Serialized data is saved in ");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
        try
      {
          
//          String uname="S522617@mail.nwmissouri.edu";
         FileInputStream fileIn = new FileInputStream(email+".ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         r = (RegistrationEntityy) in.readObject();
          System.out.println("***********"+r.getFirstName());
          System.out.println("***********"+r.getCity());
          System.out.println("***********"+r.getEmail());
          System.out.println("***********"+r.getSecurityAnswer());
          System.out.println("***********"+r.getSecurityQuestion());
//          System.out.println("***********"+r.g);
          
         in.close();
         fileIn.close();
      }catch(Exception i)
      {
         i.printStackTrace();
         return;
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

}
