<%@ include file="top.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-4">
			<form class="form" method="post" action="contagemCedulas">

				<div class="form-group">
					<label for="valor">Valor a sacar:</label> 
					
					<input maxlength="8" size="8" type="number" class="form-control" id="valor" name="valor" 
					    required="required" placeholder="Informe a valor a ser sacado" 
						onkeypress='return SomenteNumero(event)' /> <br />
					
					<input type="submit" class="btn btn-primary" value="Sacar" /> <input
						type="hidden" name="acao" value="1" />
				</div>

			</form>
		</div>
	</div>
</div>



<%@ include file="footer.jsp"%>