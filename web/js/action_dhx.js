/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function action_newWindow(name,title,url,x,y,w,h) {
    var dhxWins = new dhtmlXWindows();
    dhxWins.enableAutoViewport(false);
    dhxWins.attachViewportTo("vp");
    dhxWins.setImagePath("http://200.78.237.214:8080/lib-dhtmlx/dhtmlxWindows/codebase/imgs/");
    var w1 = dhxWins.createWindow(name, x, y, w, h);
    w1.setText(title);
    w1.attachURL(url);    
}
