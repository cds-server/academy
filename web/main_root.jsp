<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edcore - Academy</title>
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/skins/dhtmlxlayout_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxMenu/codebase/skins/dhtmlxmenu_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxToolbar/codebase/skins/dhtmlxtoolbar_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/dhtmlxwindows.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/skins/dhtmlxwindows_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="css/skin_dhx.css" >
        <script src="http://200.78.237.214:8080/lib-dhtmlx/libCompiler/dhtmlxcommon.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/dhtmlxwindows.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/libCompiler/dhtmlxcontainer.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxMenu/codebase/dhtmlxmenu.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxToolbar/codebase/dhtmlxtoolbar.js"></script>
        <script src="js/action_dhx.js"></script>
    </head>
    <div id="vp" style="width: 100%; height: 100%;background-image: url('img/logo_CDS_2.0.png'); background-repeat: no-repeat; background-position-x: 45%; background-position-y: 35%"></div>
    <body>
        <script>
            var layout = new dhtmlXLayoutObject(document.body,"1C","dhx_skyblue");
            var menu = layout.attachMenu();
            var tool = layout.attachToolbar();
            var sb = layout.attachStatusBar();
            
            layout.cells("a").hideHeader();
            layout.cells("a").attachObject("vp");
            menu.setSkin("dhx_skyblue");
            menu.loadXML("getMnu00");
            menu.attachEvent("onClick",
                function (id){
                    switch(id){
                        case "mnu00_file" : action_newWindow("w1","Nueva ventana","index.jsp",5,10,700,500);break
                    }
                }
            );
            
            tool.setIconsPath("icon/");
            tool.setIconSize(32);
            tool.setSkin("dhx_skyblue");
            tool.loadXML("getTool00");
            tool.attachEvent("onClick",
                function (id){
                    switch(id){
                        case "tool00_file" : action_newWindow("w1","Nueva ventana","addressbook/towns/index.jsp",5,10,700,500);break
                    }
                }
            );
        </script>
    </body>
</html>
