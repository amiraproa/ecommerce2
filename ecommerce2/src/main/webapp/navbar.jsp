<%--
  Created by IntelliJ IDEA.
  User: Us
  Date: 22/8/2023
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>

        <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container">
        <a class="navbar-brand" href="#">Pandora</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
                <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Inicio</a>
                </li>
      <!--  <li class="nav-item">
        <a class="nav-link" href="login.jsp">Iniciar sesión</a>
        </li>
-->

                <li class="nav-item">
                        <% if (session.getAttribute("usuario") != null) { %>
                        <a class="nav-link" href="logout">Cerrar sesión</a>
                        <% } else { %>
                        <a class="nav-link" href="login.jsp">Iniciar sesión</a>
                        <% } %>
                </li>








        <li class="nav-item">

        <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Productos</a>
                <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="anillos.jsp">Anillos</a></li>
                        <li><a class="dropdown-item" href="collares.jsp">Collares</a></li>
                        <li><a class="dropdown-item" href="pulseras.jsp">Pulseras</a></li>
                </ul>
        </li>
        </ul>
        </div>
        </div>
        </nav>
</div>
