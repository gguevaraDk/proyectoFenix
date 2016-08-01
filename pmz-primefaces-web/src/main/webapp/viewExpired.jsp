<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Sesion Expirada</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/pmz_icefaces_estilos.css" />

</head>
<body>
	<div>
		<img src="<%=request.getContextPath()%>/images/trazabilidad/headerJio.png" alt="header"
				width="100%" align="top" />
	</div>
	<div id="logo" xmlns:ui="http://java.sun.com/jsf/facelets">
		<table width="100%" align="center" cellspacing="8" cellpadding="0"
			border="0">
			<tr>
				<td width="30%"></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;</td>
			</tr>
			<tr>
				<td width="40%"></td>
				<td>
					<h1 class="welcomeUser">Sesión Expirada</h1>
				</td>
				<td></td>
			</tr>
			<tr>
				<td width="30%">&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;</td>
			</tr>
			<tr>
				<td width="30%"></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td></td>
			</tr>
		</table>
	</div>
	<div align="center">
		<br />
		<p>
			<br />
		<h2 class="texto2">
			Su sesión de usuario ha expirado<br /> 
		</h2>
		</p>
		<br />

		<table>
			<tr>
				<td>
					<h2>
						<a href="<%=request.getContextPath() + "/j_spring_security_logout"%>">[Login]</a>
					</h2>
				</td>
				<td></td>
				<!-- <td>
					<h2>
						<a href="javascript:history.back();">[Back]</a>
					</h2>
				</td> -->
			</tr>
		</table>
	</div>
</body>
</html>
