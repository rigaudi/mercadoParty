<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="etiquetasHead.jsp" />
	</head>

<body>

	<jsp:include page="navegador.jsp" />
	<br/>
<!-- Inicio Form-->


<div class="container ">
			<div class="row main">
				<div class="main-login main-center">

				 <ul class="nav nav-tabs">

				<li class="active" ><a data-toggle="tab" href="#menu1">Registrate</a></li>
				    <li><a data-toggle="tab" href="#menu2">Registrate como Empresa</a></li>
				    </ul>


				<div class="col-sm-4 col-sm-offset-4">    

					

			
					
					  <div class="tab-content">
    					<div id="menu1" class="tab-pane fade in active">
    					
     					 <h3>Comenz� ahora, miles de servicios te estan esperando!</h3>

						<form:form action="/mercadoParty/agregarConsumidor" method="POST" modelAttribute="usuario">
		
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">@</span>
									  <input type="text" class="form-control" name="email" id="email" placeholder="Correo Electr�nico" aria-describedby="basic-addon1">
									</div>
								
						</div>

						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
									  <input type="text" class="form-control" name="password" id="password" placeholder="Contrase�a" aria-describedby="basic-addon1">
									</div>
								
						</div>

							<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-repeat"></i></span>
									  <input type="text" class="form-control" name="confirm" id="confirm" placeholder="Confirme Contrase�a" aria-describedby="basic-addon1">
									</div>
								
						</div>
						<div class="form-group ">
						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
						</form:form> 
						</div>

<!--
							    <div id="menu2" class="tab-pane fade">
							      <h3>S� parte de Mercado Party y obten� beneficios</h3>
							      <p>*Los datos que ingresar� a continuaci�n son propios de su Empresa/Comercio. Tenga en cuenta que estos datos pueden ser p�blicos dentro de sus publicaciones.</p>
				
			
							<form:form action="/mercadoParty/home" method="POST" modelAttribute="consumidor">
							    <div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
									  <input type="text" class="form-control" name="nombreEmp" id="nombreEmp" placeholder="Nombre" aria-describedby="basic-addon1">
									</div>
								
						</div>

								
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">@</span>
									  <input type="text" class="form-control" name="emailEmp" id="emailEmp" placeholder="Correo Electr�nico" aria-describedby="basic-addon1">
									</div>
								
						</div>

		
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-phone-alt"></i></span>
									  <input type="text" class="form-control" name="tel" id="tel" placeholder="Tel�fono" aria-describedby="basic-addon1">
									</div>
								
						</div>

						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
									  <input type="text" class="form-control" name="direccion" id="direccion" placeholder="Direcci�n" aria-describedby="basic-addon1">
									</div>
								
						</div>

							<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-globe"></i></span>
									    <select class="form-control" >
									   <option default>�En qu� zona se encuentra?</option>
                                        <option value="0">Capital Federal</option>
                                        <option value="1">Zona Sur</option>
                                        <option value="2">Zona Oeste</option>
                                        <option value="3">Zona Norte</option>
                                    </select>
									</div>
								
						</div>

								<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
									  <input type="text" class="form-control" name="passwordEmp" id="passwordEmp" placeholder="Contrase�a" aria-describedby="basic-addon1">
									</div>
								
						</div>


								<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-repeat"></i></span>
									  <input type="text" class="form-control" name="confirmEmp" id="confirmEmp" placeholder="Confirme Contrase�a" aria-describedby="basic-addon1">
									</div>
								
						</div>
						<div class="form-group ">

						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
						</form:form>  -->

						</div>

						</div>
				</div>	
				</div>
			</div>
		</div>





<jsp:include page="footer.jsp" />

</body>
</html>