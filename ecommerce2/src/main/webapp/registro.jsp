<%--
  Created by IntelliJ IDEA.
  User: Us
  Date: 22/8/2023
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="head.jsp"></jsp:include>
    <jsp:include page="navbar.jsp"></jsp:include>
</head>
<body>
<section class="vh-100" style="background-color: #9A616D;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col col-xl-10">
                <div class="card" style="border-radius: 1rem;">
                    <div class="row g-0">
                        <div class="col-md-6 col-lg-5 d-none d-md-block">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
                                 alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
                        </div>
                        <div class="col-md-6 col-lg-7 d-flex align-items-center">
                            <div class="card-body p-4 p-lg-5 text-black">

                                <form method="post" action="registro">

                                    <div class="d-flex align-items-center mb-3 pb-1">
                                        <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                                        <span class="h1 fw-bold mb-0">REGISTRARSE</span>
                                    </div>


                                    <div class="form-outline mb-4">
                                        <input type="text" id="form2Example15" name="usuario"class="form-control form-control-lg" required />
                                        <label class="form-label" for="form2Example17">Usuario</label>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <input type="text" id="form2Example18" name="nombre" class="form-control form-control-lg" required />
                                        <label class="form-label" for="form2Example17"> Nombre</label>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <input type="text" id="form2Example25" name="apellido" class="form-control form-control-lg" required />
                                        <label class="form-label" for="form2Example17">Apellido</label>
                                    </div>


                                    <div class="form-outline mb-4">
                                        <input type="email" id="form2Example17" name="correo" class="form-control form-control-lg"required />
                                        <label class="form-label" for="form2Example17">Correo</label>


                                    </div>


                                    <div class="form-outline mb-4">
                                        <input type="password" name="password" class="form-control form-control-lg" required/>
                                        <label class="form-label" >Password</label>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <input type="password" name="password2" class="form-control form-control-lg" required/>
                                        <label class="form-label" >Ingrese nuevamente su Password</label>
                                    </div>




                                    <div class="pt-1 mb-4">
                                        <button class="btn btn-dark btn-lg btn-block" type="submit">SIGN UP</button>
                                    </div>

                                    <% if (request.getAttribute("errorRegistro")=="error"){ %>
                                        <a class="text" >Error Registro duplicado</a>
                                    <%}else{
                                        if (request.getAttribute("errorRegistro")=="errorPassword"){%>
                                            <a class="text" >Error contraseñas distintas</a>
                                    <%}} %>

                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
