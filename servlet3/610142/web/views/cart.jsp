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
        <th>Amount</th>

        </thead>
        <tbody>
        <c:forEach items="${cart.products}" var="product">
            <tr>
                <td>${product.productName}</td>
                <td>${product.detailInformation}</td>
                <td>${product.price}</td>
                <td><input type="text" ></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <c:if test="${not empty sessionScope['cart'].products}">
            <a href="/checkout.do" id="checkoutBtn">Checkout</a>
        </c:if>
    </div>

</div>
<%@ include file="../common/footer.jspf" %>