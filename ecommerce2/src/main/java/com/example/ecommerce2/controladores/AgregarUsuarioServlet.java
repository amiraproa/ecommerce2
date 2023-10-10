package com.example.ecommerce2.controladores;

import com.example.ecommerce2.DAO.UsuarioDAO;
import com.example.ecommerce2.UsuarioDAOImplem.UsuarioDAOImplem;
import com.example.ecommerce2.entidades.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "registro", value = "/registro")
public class AgregarUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession Session = req.getSession();
        RequestDispatcher disp = null;
        System.out.println(req.getParameter("password") );
        System.out.println(req.getParameter("password2") );
            if (req.getParameter("password").equals(req.getParameter("password2"))){
                Usuario nuevoUsuario = new Usuario();
                nuevoUsuario.setNombre(req.getParameter("nombre"));
                nuevoUsuario.setUsuario(req.getParameter("usuario"));
                nuevoUsuario.setApellido(req.getParameter("apellido"));
                nuevoUsuario.setCorreo(req.getParameter("correo"));
                nuevoUsuario.setPassword(req.getParameter("password"));
                UsuarioDAO usuarioDAO = new UsuarioDAOImplem();
                if (usuarioDAO.agregarUsuario(nuevoUsuario)) {
                    //  resp.sendRedirect("login.jsp");
                    disp = req.getRequestDispatcher("login.jsp"); //página a la que queremos volver
                }
                else {
                    req.setAttribute("errorRegistro", "error");
                    disp = req.getRequestDispatcher("registro.jsp");   //página a la que queremos volver
                }
            }
            else{
                req.setAttribute("errorRegistro", "errorPassword");
                disp = req.getRequestDispatcher("registro.jsp");   //página a la que queremos volver
            }





       disp.forward(req,resp);

    }

}
