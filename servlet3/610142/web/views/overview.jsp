<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
<link rel="stylesheet" href="resources/overview.css">

<div class="container">
    <table class="table table-striped">
        <thead>
        <th>Name</th>
        <th>Detail Information</th>
        <th>Price</th>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.productName}</td>
                <td>${product.detailInformation}</td>
                <td>${product.price}</td>

                <td>&nbsp;&nbsp;<a class="btn"
                                   href="/overview.do?addCart=${product.productId}">Add Cart</a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<%@ include file="../common/footer.jspf" %>