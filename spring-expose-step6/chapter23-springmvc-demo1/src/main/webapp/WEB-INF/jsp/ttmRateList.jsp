<%--
  Created by IntelliJ IDEA.
  User: lpzh
  Date: 2021/11/19
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ttmRateList</title>
</head>
<body>
<table width="517" border="1" align="center" cellpadding="0" cellspacing="0"
       bordercolor="#33FFFF">
    <CAPTION>当日评价汇率</CAPTION>
    <tr bgcolor="#999900">
        <td width="250">
            <div align="center">Currency
                Pair
            </div>
        </td>
        <td width="261">
            <div align="center">TTM RATE</div>
        </td>
    </tr>
    <c:forEach items="${ttmRates}" var="ttmRate">
        <tr>
            <td>
                <div align="center">${ttmRate.currencyPair}</div>
            </td>


            <td>
                <div align="center">${ttmRate.value}</div>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
