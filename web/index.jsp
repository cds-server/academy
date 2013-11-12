<%-- 
    Document   : login
    Created on : 9/11/2013, 07:59:04 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Edocore - academy</title>
<link href="css/skin_login.css" rel="stylesheet" type="text/css" />
<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js?ver=1.3.2'></script>
<script type="text/javascript">
        $(document).ready(function() {
		
            $(document).mouseup(function() {
				$("#loginform").mouseup(function() {
					return false
				});
				
				$("a.close").click(function(e){
					e.preventDefault();
					$("#loginform").hide();
                    $(".lock").fadeIn();
				});
				
                if ($("#loginform").is(":hidden"))
                {
                    $(".lock").fadeOut();
                } else {
                    $(".lock").fadeIn();
                }				
				$("#loginform").toggle();
            });
			
		
			
			// This is example of other button
			$("input#cancel_submit").click(function(e) {
					$("#loginform").hide();
                    $(".lock").fadeIn();
			});			
			
			
        });
</script>
</head>
<body id="bod1" style="background-color: #666666">
<div id="cont">
  <div class="box lock"> </div>
  <div id="loginform" class="box form">
    <h2>Se requiere autorizacion <a href="" class="close">Cerrar</a></h2>
    <div class="formcont">
      <fieldset id="signin_menu">
      <span class="message">Porfavor verifique sus datos</span>
      <form method="post" id="signin" action="main.jsp">
        <label for="username">Usuario</label>
        <input id="username" name="username" value="" title="username" class="required" tabindex="4" type="text">
        </p>
        <p>
          <label for="password">Password</label>
          <input id="password" name="password" value="" title="password" class="required" tabindex="5" type="password">
        </p>
        <p class="clear"></p>
        <p class="remember">
          <input id="signin_submit" value="Iniciar sesion" tabindex="6" type="submit">
          <input id="cancel_submit" value="Cancelar" tabindex="7" type="button">
        </p>
      </form>
      </fieldset>
    </div>
    <div class="formfooter"></div>
  </div>
</div>
<!-- Begin Full page background technique -->
<div id="bg">
  <div>
    <table cellspacing="0" cellpadding="0">
      <tr>
          <td><img style="max-height: 100%; max-width: 100%"  src="img/login_bg.png" alt=""/> </td>
      </tr>
    </table>
  </div>
</div>
<!-- End Full page background technique -->
</body>
</html>
