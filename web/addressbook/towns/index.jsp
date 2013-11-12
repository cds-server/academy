<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Directorio - Municipios</title>
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/skins/dhtmlxlayout_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxToolbar/codebase/skins/dhtmlxtoolbar_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/dhtmlxwindows.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/skins/dhtmlxwindows_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxGrid/codebase/dhtmlxgrid.css" >
        <link rel="stylesheet" type="text/css" href="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxGrid/codebase/skins/dhtmlxgrid_dhx_skyblue.css" >
        <link rel="stylesheet" type="text/css" href="../../css/skin_dhx.css" >
        <script src="http://200.78.237.214:8080/lib-dhtmlx/libCompiler/dhtmlxcommon.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/dhtmlxwindows.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/libCompiler/dhtmlxcontainer.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxToolbar/codebase/dhtmlxtoolbar.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxGrid/codebase/dhtmlxgrid.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxGrid/codebase/dhtmlxgridcell.js"></script>
        <script src="http://200.78.237.214:8080/lib-dhtmlx/dhtmlxGrid/codebase/ext/dhtmlxgrid_filter.js"></script>
        <script src="../../js/action_dhx.js"></script>
    </head>
    <div id="vp" style="width: 100%; height: 100%;"></div>
    <body>
        <script>
            var layout = new dhtmlXLayoutObject(document.body,"1C","dhx_skyblue");
            var tool = layout.attachToolbar();
            var sb = layout.attachStatusBar();
            var grid = layout.cells("a").attachGrid();
            
            layout.cells("a").hideHeader();
            //layout.cells("a").attachObject("vp");
            
            tool.setIconsPath("../../icon/");
            tool.setSkin("dhx_skyblue");
            tool.setIconSize(32);
            tool.loadXML("GetTool_AC_P12");
            tool.attachEvent("onClick",
                function (id){
                    switch(id){
                        case "newTown" : action_newWindow("w1","Nueva ventana","index.jsp",5,10,700,500);break
                    }
                }
            );
    
   
            grid.setHeader("NO,ESTADO,MUNICIPIO,STATUS");
            grid.setInitWidths("200,200,200,200");
            grid.setColAlign("left,left,left,left");
            grid.setEditable(false);
            grid.init();
            //grid.setSkin("ligth");
            //grid.loadXML("GetTowns");
    
        </script>
    </body>
</html>
