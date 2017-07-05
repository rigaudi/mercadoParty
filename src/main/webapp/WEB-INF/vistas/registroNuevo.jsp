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

<script>window.setTimeout(function() {
                    $(".alert").fadeTo(500, 0).slideUp(500, function(){
                    $(this).remove(); 
                    }); }, 2400);
            </script>
    <div class="bs-example">
          <div class="alert alert-warning">
            <span class="close" data-dismiss="alert">&times;</span>
            <strong>Atencion! </strong> Debes estar registrado para contactar esta persona</div>
        </div>
			<div class="row main">
			
				<div class="main-login main-center">

				 <ul class="nav nav-tabs">

				<li class="active" ><a data-toggle="tab" href="#menu1">Registrate</a></li>
				    </ul>



				<div class="col-sm-4 col-sm-offset-4">    


					  <div class="tab-content">
    					<div id="menu1" class="tab-pane fade in active">
    					
     					 <h3>Comenzá ahora, registrate y oferta tu servicio!</h3>

						<form:form action="/mercadoParty/agregarConsumidor" method="POST" modelAttribute="usuario">
						<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
							<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre Empresa" aria-describedby="basic-addon1" required>
						</div>
						</div>			
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">@</span>
									  <input type="email" class="form-control" name="email" id="email" placeholder="Correo Electrónico" aria-describedby="basic-addon1" required>
									</div>
								
						</div>
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-phone-alt"></i></span>
									  <input type="tel" class="form-control" name="telefono" id="telefono" placeholder="Teléfono" aria-describedby="basic-addon1" required>
									</div>
								
						</div>
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
									  <input type="text" class="form-control" name="direccion" id="direccion" placeholder="Dirección" aria-describedby="basic-addon1" required>
									</div>
								
						</div>
													<div class="form-group">
								
								<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
									<select class="form-control" id="zona" name="zona" required>
                                        <option value="Capital Federal">Capital Federal</option>
                                        <option value="Zona Sur">Zona Sur</option>
                                        <option value="Zona Oeste">Zona Oeste</option>
                                        <option value="Zona Norte">Zona Norte</option>
                                    </select>
								</div>
									
									<!-- <div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-globe"></i></span>

									</div> -->
								
						</div>
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
									  <input type="password" class="form-control" name="password" id="password" placeholder="Contraseña" aria-describedby="basic-addon1" required>
									</div>
								
						</div>

							<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-repeat"></i></span>
									  <input type="password" class="form-control" name="confirm" id="confirm_password" placeholder="Confirme Contraseña" aria-describedby="basic-addon1" required>
									</div>
									<script>
									var pass = document.getElementById("password")
									  , confirm_pass = document.getElementById("confirm_password");

									function validatePassword(){
									  if(pass.value != confirm_pass.value) {
									    confirm_pass.setCustomValidity("No son iguales");
									  } else {
									    confirm_pass.setCustomValidity('');
									  }
									}

									pass.onchange = validatePassword;
									confirm_pass.onkeyup = validatePassword;									
									</script>
								
						</div>
						<div class="form-group ">
						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
						</form:form> <!--
						</div>


							    <div id="menu2" class="tab-pane fade">
							      <h3>Sé parte de Mercado Party y obtené beneficios</h3>
							      <p>*Los datos que ingresará a continuación son propios de su Empresa/Comercio. Tenga en cuenta que estos datos pueden ser públicos dentro de sus publicaciones.</p>
				
			
							<form:form action="/mercadoParty/agregarOferente" method="POST" modelAttribute="oferente">
							    <div class="form-group">
								

								
						</div>

								
						<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon" id="basic-addon1">@</span>
									  <input type="email" class="form-control" name="emailOferente" id="emailOferente" placeholder="Correo Electrónico" aria-describedby="basic-addon1" required>
									</div>
								
						</div>


								<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
									  <input type="password" class="form-control" name="passwordOferente" id="passwordOferente" placeholder="Contraseña" aria-describedby="basic-addon1" required>
									</div>
								
						</div>


								<div class="form-group">
								
									<div class="input-group">
									  <span class="input-group-addon"><i class="glyphicon glyphicon-repeat"></i></span>
									  <input type="password" class="form-control" name="confirmEmp" id="confirmEmp" placeholder="Confirme Contraseña" aria-describedby="basic-addon1" required>
									</div>
								
								</div>
								<script>
									var password = document.getElementById("passwordOferente")
									  , confirm_password = document.getElementById("confirmEmp");

									function validatePassword(){
									  if(password.value != confirm_password.value) {
									    confirm_password.setCustomValidity("No son iguales");
									  } else {
									    confirm_password.setCustomValidity('');
									  }
									}

									password.onchange = validatePassword;
									confirm_password.onkeyup = validatePassword;									
									</script>
						<div class="form-group ">

						 <button type="submit" class="btn btn-success">Registrar</button>
						</div>
						</form:form> -->

						</div>

						</div>
				</div>	
				</div>
			</div>
		</div>





<jsp:include page="footer.jsp" />

</body>
</html>