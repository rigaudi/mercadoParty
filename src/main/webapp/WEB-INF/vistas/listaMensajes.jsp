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

<div class="container">
<script type="text/javascript">
	$(document).ready(function() {
    $('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});
    $('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});
});
	</script>
    <div class="well well-sm">
        <strong>Mis Mensajes</strong>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
            </span>En Lista</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="glyphicon glyphicon-th"></span>En Grilla</a>
        </div>
    </div>
    <div id="products" class="row list-group">
    
    <c:forEach var = "i" begin = "1" end = "6">
         <div class="item  col-xs-3 col-lg-3">
            <div class="thumbnail">
                <img class="group list-group-image" src="img/nadialogo.png" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                      ${titulo}</h4>
                    <p class="group inner list-group-item-text">
                        ${descripcion}</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                A convenir</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="/mercadoParty/detalleProducto">Contactar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
      </c:forEach>
      
        
    </div>
</div>


<jsp:include page="footer.jsp" />

</body>
</html>