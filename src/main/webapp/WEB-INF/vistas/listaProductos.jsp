<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>
	
<jsp:include page="navegador.jsp" />

<div class="container">
<script type="text/javascript">
	$(document).ready(function() {
    $('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});
    $('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});
});
	</script>
    <div class="well well-sm">
        <strong>Mostrar Productos</strong>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
            </span>En Lista</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="glyphicon glyphicon-th"></span>En Grilla</a>
        </div>
    </div>
    <div id="products" class="row list-group">
    
    <c:forEach var = "i" begin = "1" end = "6">
         <div class="item  col-xs-4 col-lg-4">
            <div class="thumbnail">
                <img class="group list-group-image" src="img/nadialogo.png" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Fotografias Nadia</h4>
                    <p class="group inner list-group-item-text">
                        Product description... Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                        sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                $1.000</p>
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