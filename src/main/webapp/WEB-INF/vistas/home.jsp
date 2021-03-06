<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>


   <jsp:include page="etiquetasHead.jsp" />


	</head>

<body>
<c:if test="${session == null}" > 	
	<jsp:include page="navegador.jsp" />
</c:if>

<c:if test="${session != null}" > 	
	<jsp:include page="navegadorlogueado.jsp" />
</c:if>
<div id="myCarousel" class="carousel slide" data-ride="carousel">

    <!-- Imagenes del slider -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img/publicidad01.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad02.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad03.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

      <div class="item">
        <img src="img/publicidad05.png" alt="Image">
        <div class="carousel-caption">
        </div>      
      </div>

    </div>


    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>



<jsp:include page="footer.jsp" />

</body>
</html>