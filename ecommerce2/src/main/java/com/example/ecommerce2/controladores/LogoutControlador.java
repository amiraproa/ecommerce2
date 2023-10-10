package com.example.ecommerce2.controladores;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.ServletException;
import java.io.IOException;


@WebServlet (name="logout", value="/logout")
public class LogoutControlador extends HttpServlet {

    @Override
    protected void doGet  (HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException{
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect( "index.jsp");
    }
}


