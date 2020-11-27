<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
    prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<html>
<head>
<title><decorator:title default="T�tulo" /></title>
<link rel="stylesheet"
    href="${ pageContext.request.contextPath }/css/style.css">
<decorator:head />
</head>

<body>
    <table border="0" cellspacing="0" cellpadding="0" width="800">
        <tr>
            <td align="center" colspan="3" height="20">
          
            </td>
        </tr>
        <tr>
            <td align="center" valign="top" width="150" class="menu">
              
            </td>
            <td width="25"></td>
            <td valign="top" align="center" width="625">
                <div class="section">
                    <decorator:title />
                </div>
                <hr> <decorator:body />
            </td>
        </tr>
        <tr>
            <td align="center" colspan="3">
           
                    </td>
        </tr>
    </table>
</body>
</html>