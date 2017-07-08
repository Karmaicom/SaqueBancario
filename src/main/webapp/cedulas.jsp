<%@ include file="top.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h3>Contagem de cédulas</h3> 
			
			<br /><br />

			<div>
				<table class="table">
					<tr>
						<td><img src="imagens\cedula100.png"></td>
						<td><font size="16" face="georgia, arial, verdana">${notas100}</font></td>
					</tr>
					<tr>
						<td><img src="imagens\cedula50.png"></td>
						<td><font size="16" face="georgia, arial, verdana">${notas50}</font></td>
					</tr>
					<tr>
						<td><img src="imagens\cedula20.png"></td>
						<td><font size="16" face="georgia, arial, verdana">${notas20}</font></td>
					</tr>
					<tr>
						<td><img src="imagens\cedula10.png"></td>
						<td><font size="16" face="georgia, arial, verdana">${notas10}</font></td>
					</tr>
					<tr>
						<td></td>
						<td>
							<a href="index.jsp">
								<button class="btn btn-primary"> Voltar</button>
							</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</div>



<%@ include file="footer.jsp"%>