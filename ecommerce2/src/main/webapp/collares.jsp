<%--
  Created by IntelliJ IDEA.
  User: Us
  Date: 28/8/2023
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="head.jsp"></jsp:include>
    <jsp:include page="navbar.jsp"></jsp:include>
    <jsp:include page="carrusel.jsp"></jsp:include>
</head>
<html>

<body>
<div class="container">
    <h6 style="text-align: center; font-weight: lighter; margin-top: 3%;" class="">Lucite a tu manera con nuestros</h6>
    <h1 style="text-align: center;"><a id="convierteteenorador">COLLARES</a></h1>
    <div class="row row-cols-1 row-cols-md-3 g-4" style="margin-top: 4%;">
        <div class="col">
            <div class="card h-100">
                <img src="img/collar1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title" style="margin-top: 1%;">Collar 1</h5>
                    <p class="card-text"></p>
                    <a type="button" class="btn btn-success" href="login.jsp">Comprar</a>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card h-100">
                <img src="img/collar2.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title" style="margin-top: 1%;">Collar 2</h5>
                    <p class="card-text"></p>
                    <a type="button" class="btn btn-success" href="login.jsp">Comprar</a>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card h-100">
                <img src="img/collar3.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title" style="margin-top: 1%;">Collar 3</h5>
                    <p class="card-text"> </p>
                    <a type="button" class="btn btn-success" href="login.jsp">Comprar</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>