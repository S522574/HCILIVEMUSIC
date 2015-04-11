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
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import musicentities.EventEntity;
import musicentities.RegistrationEntityy;

/**
 *
 * @author S522617
 */
@WebServlet(name = "LoginVerificationServlet", urlPatterns = {"/LoginVerificationServlet"})
public class LoginVerificationServlet extends HttpServlet {

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
            try {

//          String uname="S522617@mail.nwmissouri.edu";
                String uname = request.getParameter("uname");
                String pword = request.getParameter("password");
                FileInputStream fileIn = new FileInputStream(uname + ".ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                RegistrationEntityy r = (RegistrationEntityy) in.readObject();
                if (pword.equals(r.getPword()) && uname.equals(r.getEmail())) {

                    ArrayList<EventEntity> events = new ArrayList<>();
                    EventEntity ep = new EventEntity();
                    ep.setEventName("Jazz & Blues");
                    ep.setEventDate("April 28,2015");
                    ep.setEventDesc("The jazz & blues genre has created a sound that grabs the attention of "
                            + "all who hear it. While the genre has traditionally focused on intimate settings, "
                            + "front-runners of the genre today like Michael Buble and John Mayer have been able "
                            + "to bring a following back to the jazz & blues genre selling out arenas across the globe.");
                    ep.setEventTime("12:15PM 4:00PM 7:10PM");
                    EventEntity ep1 = new EventEntity();
                    ep1.setEventName("Rock & Pop");
                    ep1.setEventDate("April 29,2015");
                    ep1.setEventDesc("The diversity found in the audience at a rock & pop concert has become just as "
                            + "standard as the production. Combine emerging artists like Sam Smith and established "
                            + "acts like Jimmy Buffet all in the same mix and you get a playlist that has something "
                            + "for every fan with one of the largest followings of all the genres in the music industry.");
                    ep.setEventTime("1:00PM 4:00PM 8:00PM");
                    EventEntity ep2 = new EventEntity();
                    ep2.setEventName("Country & Folk");
                    ep2.setEventDate("April 30,2015");
                    ep2.setEventDesc("The country & folk genre has long been one of the music industryâ€™s most "
                            + "popular, creating some of the largest names in show-biz to date. the country music "
                            + "stars of today such as George Strait and Alan Jackson have kept a more than stable "
                            + "following around.\n");
                    ep.setEventTime("12:15PM 4:00PM 7:10PM");
                    
                    events.add(ep);
                    events.add(ep1);
                    events.add(ep2);
                    FileOutputStream fileOut = new FileOutputStream("event.ser");
                    ObjectOutputStream out1 = new ObjectOutputStream(fileOut);
                    out1.writeObject(events);
                    out1.close();
                    fileOut.close();
                    request.setAttribute("events", events);
                    RequestDispatcher view = request.getRequestDispatcher("/events.jsp");
                    view.forward(request, response);
//                    response.sendRedirect("events.jsp");
                } else {
                    response.sendRedirect("index1.html");
                }
                System.out.println("successsssssssssss");
                System.out.println("***********nnnnnnnnn" + r.getFirstName());
                System.out.println("***********" + r.getCity());
                System.out.println("***********" + r.getEmail());
//          System.out.println("***********"+r.g);

                in.close();
                fileIn.close();
            } catch (Exception i) {
                i.printStackTrace();
                return;
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

}
